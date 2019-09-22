package io.github.hylexus.jt808.server.handler;

import io.github.hylexus.jt808.handler.AbstractMsgHandler;
import io.github.hylexus.jt808.msg.BuiltinMsgType;
import io.github.hylexus.jt808.msg.RequestMsgCommonProps;
import io.github.hylexus.jt808.msg.RespMsgBody;
import io.github.hylexus.jt808.server.msg.req.LocationUploadMsgBody;
import io.github.hylexus.jt808.session.Session;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * @author hylexus
 * Created At 2019-09-19 11:31 下午
 */
@Slf4j
public class LocationInfoUploadMsgHandler extends AbstractMsgHandler<LocationUploadMsgBody> {

    @Override
    protected Optional<RespMsgBody> doProcess(RequestMsgCommonProps commonProps, LocationUploadMsgBody body, Session session) {

        log.info("{}", body);
        return Optional.of(commonReply(commonProps, BuiltinMsgType.CLIENT_LOCATION_INFO_UPLOAD));
    }
}