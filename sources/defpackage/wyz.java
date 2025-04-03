package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wyz extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wza c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyz(wza wzaVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wzaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wyz wyzVar = new wyz(this.c, (ffgu) obj3);
        wyzVar.a = (alxj) obj;
        wyzVar.b = (Recipient) obj2;
        return wyzVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Context context = this.c.a;
        final ?? r0 = this.a;
        final ?? r1 = this.b;
        String string = context.getString(R.string.send_message);
        string.getClass();
        dmzz dmzzVar = dmzz.cf;
        final wza wzaVar = this.c;
        return new dlsr(string, dmzzVar, false, false, false, false, null, false, null, new ffix() { // from class: wyx
            @Override // defpackage.ffix
            public final Object invoke() {
                alxj alxjVar = r0;
                wza wzaVar2 = wza.this;
                axol.k(wzaVar2.b, null, new wyy(r1, alxjVar, wzaVar2, null), 3);
                return ffcu.a;
            }
        }, 996);
    }
}
