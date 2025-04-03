package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shz implements bdns, bdnt {
    public static final entd a = entd.c("BugleVmt");
    public final sid b;
    public final ared c;
    private final ffsk d;

    public shz(ffsk ffskVar, sid sidVar, ared aredVar) {
        ffskVar.getClass();
        this.d = ffskVar;
        this.b = sidVar;
        this.c = aredVar;
    }

    private final void a(MessageCoreData messageCoreData) {
        if (((Boolean) ((cfup) shw.a.get()).e()).booleanValue() && ((Boolean) ((cfup) shw.b.get()).e()).booleanValue()) {
            axol.k(this.d, null, new shy(this, messageCoreData, null), 3);
        }
    }

    @Override // defpackage.bdnt
    public final void c(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
