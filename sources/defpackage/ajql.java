package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajql {
    public static final entd a = entd.c("BugleReplies");
    public final ffhd b;
    public final ajqp c;
    public final aled d;
    public final emyv e;
    private final ffhd f;

    public ajql(ffhd ffhdVar, ffhd ffhdVar2, ajqp ajqpVar, aled aledVar, emyv emyvVar) {
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ajqpVar.getClass();
        aledVar.getClass();
        this.b = ffhdVar;
        this.f = ffhdVar2;
        this.c = ajqpVar;
        this.d = aledVar;
        this.e = emyvVar;
    }

    public static final ajqq b(cnq cnqVar, MessageIdType messageIdType) {
        ajqq ajqqVar = (ajqq) cnqVar.e(messageIdType);
        if (ajqqVar != null) {
            ajqqVar.a().g();
        } else {
            ajqqVar = null;
        }
        if (ajqqVar == null) {
            ensz enszVar = (ensz) a.j();
            ensn ensnVar = ajro.a;
            enszVar.Y(ajro.c, messageIdType.b());
            enszVar.q("LruCacheRepliesNavigationLogger.retrieveToken missing value");
        }
        return ajqqVar;
    }

    public static final eptm c(int i) {
        return i == 0 ? eptm.UNKNOWN_OPENING_SOURCE : i + (-1) != 0 ? eptm.MESSAGE_REPLY_SWIPE : eptm.MESSAGE_REPLY_BUTTON_CLICK;
    }

    public final Object a(MessageIdType messageIdType, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.f), new ajqi(null, messageIdType), ffguVar);
    }
}
