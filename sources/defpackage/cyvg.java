package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyvg extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ cyvh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyvg(cyvh cyvhVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = cyvhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dnym b;
        ffci.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        ?? r3 = this.c;
        boolean z = this.d;
        if (this.e.b.a()) {
            Uri a = r1.a();
            if (r3 == 0 && r1.b() == alxi.GROUP && a != null && csuu.C(crjm.n(a))) {
                final cyvh cyvhVar = this.e;
                Uri n = crjm.n(a);
                n.getClass();
                b = new dnyo(new dnwn(n, false, crps.a(((crjx) cyvhVar.a.b()).g()), null, crjm.m(a), 8), null, 0, dnyl.b, 0.01f, new ffix() { // from class: cyve
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        cyvh.this.c(null);
                        return ffcu.a;
                    }
                }, 6);
            } else {
                b = this.e.b((engw) obj2, r3, z);
            }
        } else {
            b = this.e.b((engw) obj2, r3, z);
        }
        if (b == null) {
            return null;
        }
        return new cyvj(b, new cyvi(false));
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        cyvg cyvgVar = new cyvg(this.e, (ffgu) obj5);
        cyvgVar.a = (alxj) obj;
        cyvgVar.b = (engw) obj2;
        cyvgVar.c = (Recipient) obj3;
        cyvgVar.d = booleanValue;
        return cyvgVar.b(ffcu.a);
    }
}
