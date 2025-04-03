package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgs implements cfyp {
    public static final /* synthetic */ int a = 0;
    private final errl e;
    private final adha f;

    public adgs(errl errlVar, adha adhaVar) {
        this.e = errlVar;
        this.f = adhaVar;
    }

    private static fbqp e(eooi eooiVar) {
        int ordinal = eooiVar.ordinal();
        return ordinal != 2 ? (ordinal == 4 || ordinal == 6 || ordinal == 8) ? fbqp.NOTIFICATION_VIEW : fbqp.UNKNOWN_SOURCE : fbqp.CONVERSATION_VIEW;
    }

    @Override // defpackage.cfyp
    public final elfl a(epjp epjpVar, fbqp fbqpVar, int i, List list, int i2, MessageIdType messageIdType) {
        return !((Boolean) b.e()).booleanValue() ? elfo.e(true) : this.f.a(eoqz.P2P_SUGGESTION_CLICK, epjpVar, fbqx.UNKNOWN_REJECTION_REASON, fbqpVar, i, i2, list, messageIdType).h(new emwl() { // from class: adgr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i3 = adgs.a;
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.e);
    }

    @Override // defpackage.cfyp
    public final elfl b(epjp epjpVar, eooi eooiVar, int i, List list, MessageIdType messageIdType) {
        if (!((Boolean) b.e()).booleanValue()) {
            return elfo.e(true);
        }
        return this.f.a(eoqz.P2P_SUGGESTION_RECEIVED_MESSAGE, epjpVar, fbqx.UNKNOWN_REJECTION_REASON, e(eooiVar), i, -1, list, messageIdType).h(new emwl() { // from class: adgo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = adgs.a;
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.e);
    }

    @Override // defpackage.cfyp
    public final elfl c(epjp epjpVar, int i, List list, fbqx fbqxVar, String str) {
        if (!((Boolean) b.e()).booleanValue()) {
            return elfo.e(true);
        }
        return this.f.a(eoqz.P2P_SUGGESTION_REQUEST, epjpVar, fbqxVar, fbqp.UNKNOWN_SOURCE, i, -1, list, bdhb.b(str)).h(new emwl() { // from class: adgp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = adgs.a;
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.e);
    }

    @Override // defpackage.cfyp
    public final elfl d(epjp epjpVar, eooi eooiVar, int i, List list, MessageIdType messageIdType) {
        if (!((Boolean) b.e()).booleanValue()) {
            return elfo.e(true);
        }
        return this.f.a(eoqz.P2P_SUGGESTION_SENT_MESSAGE, epjpVar, fbqx.UNKNOWN_REJECTION_REASON, e(eooiVar), i, -1, list, messageIdType).h(new emwl() { // from class: adgq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = adgs.a;
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }, this.e);
    }
}
