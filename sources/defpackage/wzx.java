package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzx extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    final /* synthetic */ xan c;
    final /* synthetic */ Context d;
    final /* synthetic */ xil e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzx(xan xanVar, Context context, xil xilVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = xanVar;
        this.d = context;
        this.e = xilVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        wzx wzxVar = new wzx(this.c, this.d, this.e, (ffgu) obj3);
        wzxVar.a = booleanValue;
        wzxVar.b = booleanValue2;
        return wzxVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        if (!((aspy) this.c.a.b()).a() && z2) {
            return null;
        }
        String string = this.d.getString(R.string.action_show_subject_field);
        string.getClass();
        final xil xilVar = this.e;
        return new dlsr(string, null, false, true, z, false, null, false, null, new ffix() { // from class: wzw
            @Override // defpackage.ffix
            public final Object invoke() {
                xil.this.fw();
                return ffcu.a;
            }
        }, 998);
    }
}
