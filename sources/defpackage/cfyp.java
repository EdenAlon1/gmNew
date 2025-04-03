package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cfyp {
    public static final cfva b = cfvl.i(cfvl.b, "enable_federated_analytics_logging", false);
    public static final cfva c = cfvl.i(cfvl.b, "enable_federated_analytics_suggestion_text_logging", false);
    public static final cfva d = cfvl.f(cfvl.b, "federated_analytics_logging_events_ttl_millis", TimeUnit.DAYS.toMillis(7));

    elfl a(epjp epjpVar, fbqp fbqpVar, int i, List list, int i2, MessageIdType messageIdType);

    elfl b(epjp epjpVar, eooi eooiVar, int i, List list, MessageIdType messageIdType);

    elfl c(epjp epjpVar, int i, List list, fbqx fbqxVar, String str);

    elfl d(epjp epjpVar, eooi eooiVar, int i, List list, MessageIdType messageIdType);
}
