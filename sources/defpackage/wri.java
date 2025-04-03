package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wri extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ wrj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wri(wrj wrjVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = wrjVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        wri wriVar = new wri(this.d, (ffgu) obj4);
        wriVar.a = (engw) obj;
        wriVar.b = (alxj) obj2;
        wriVar.c = (zeo) obj3;
        return wriVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r15 = this.a;
        ?? r0 = this.b;
        Object obj2 = this.c;
        if (r0.u() || r0.b() != alxi.ONE_ON_ONE || r15.isEmpty() || ((ResolvedRecipient) ffdx.T(r15)).A() || obj2 == null) {
            return null;
        }
        wrj wrjVar = this.d;
        if (!wrjVar.c.e) {
            return null;
        }
        String string = wrjVar.a.getString(R.string.action_add_contact);
        string.getClass();
        final wrj wrjVar2 = this.d;
        final zeo zeoVar = (zeo) obj2;
        final engw engwVar = (engw) r15;
        return new dlsr(string, null, false, true, false, false, null, false, null, new ffix() { // from class: wrh
            @Override // defpackage.ffix
            public final Object invoke() {
                Object T = ffdx.T(engwVar);
                T.getClass();
                wrj.this.b.h(new aino((ResolvedRecipient) T, zeoVar));
                return ffcu.a;
            }
        }, 1014);
    }
}
