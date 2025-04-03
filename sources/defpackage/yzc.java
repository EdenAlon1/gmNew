package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yzc extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ yzm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzc(String str, String str2, yzm yzmVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.c = str;
        this.d = str2;
        this.e = yzmVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        yzc yzcVar = new yzc(this.c, this.d, this.e, (ffgu) obj4);
        yzcVar.a = (ResolvedRecipient) obj;
        yzcVar.b = booleanValue;
        return yzcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final ?? r10 = this.a;
        if (!this.b) {
            return null;
        }
        String str = this.c;
        String str2 = this.d;
        final yzm yzmVar = this.e;
        return new doqo("RbmToolstoneId", str, dmzz.bx, ffdx.b(new dlto(dlus.h, str.length() - str2.length(), str.length(), str, new ffji() { // from class: yza
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ResolvedRecipient resolvedRecipient = r10;
                yzm yzmVar2 = yzm.this;
                yzmVar2.m.a(new tad(resolvedRecipient, yzmVar2.g, 4, 9));
                axol.k(yzmVar2.e, null, new yzg(yzmVar2, null), 3);
                return true;
            }
        })), new yzb(this.e));
    }
}
