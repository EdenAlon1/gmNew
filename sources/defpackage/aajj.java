package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajj extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ aajq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajj(aajq aajqVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = aajqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aajj aajjVar = new aajj(this.c, (ffgu) obj3);
        aajjVar.a = booleanValue;
        aajjVar.b = (MessageId) obj2;
        return aajjVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        final ?? r0 = this.b;
        if (!z) {
            return ffel.a;
        }
        final aajq aajqVar = this.c;
        fffs fffsVar = new fffs((byte[]) null);
        if (!((askx) aajqVar.f.b()).a()) {
            fffsVar.add(new dnsn(null));
        }
        String string = aajqVar.b.getResources().getString(R.string.double_tap_to_react_promo, aajqVar.c());
        string.getClass();
        fffsVar.add(new dntl(string, null, new ffix() { // from class: aaji
            @Override // defpackage.ffix
            public final Object invoke() {
                aajq.this.h.d(aajq.a[0], r0);
                return ffcu.a;
            }
        }, false, null, null, false, false, 250));
        return ffdx.a(fffsVar);
    }
}
