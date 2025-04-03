package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caqe extends ffhv implements ffjn {
    int a;
    final /* synthetic */ ffbr b;
    final /* synthetic */ ffbr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caqe(ffbr ffbrVar, ffbr ffbrVar2, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        caqe caqeVar = new caqe(this.b, this.c, (ffgu) obj3);
        caqeVar.d = (caqh) obj;
        return caqeVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ConversationIdType b = bdgq.b(((caqh) this.d).b);
            csjb a = caqf.a.a();
            a.I("Running TombstoneManagerOnRcsGroupE2eeStatusChangeHandler");
            a.c(b);
            a.r();
            if (((carb) this.b.b()).f(b)) {
                csjb a2 = caqf.a.a();
                a2.I("Skipping call to tombstone manager as conversation is already focused");
                a2.c(b);
                a2.r();
            } else {
                elfl e = ((cbut) this.c.b()).e(b);
                this.a = 1;
                if (fgfz.c(e, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ceyt.i();
    }
}
