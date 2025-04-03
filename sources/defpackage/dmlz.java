package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmlz implements ffjn {
    final /* synthetic */ dlwk a;
    final /* synthetic */ dmmk b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dmpg e;
    final /* synthetic */ float f;

    public dmlz(dlwk dlwkVar, dmmk dmmkVar, int i, boolean z, dmpg dmpgVar, float f) {
        this.a = dlwkVar;
        this.b = dmmkVar;
        this.c = i;
        this.d = z;
        this.e = dmpgVar;
        this.f = f;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String format = String.format(jii.a(R.string.compose_remove_button_content_description, hfdVar), Arrays.copyOf(new Object[]{this.a.e()}, 1));
            format.getClass();
            hfdVar.v(-597588014);
            boolean D = hfdVar.D(this.b) | hfdVar.B(this.c);
            final dmmk dmmkVar = this.b;
            final int i = this.c;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffix() { // from class: dmlv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmmk.this.c.invoke(Integer.valueOf(i));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dlsf dlsfVar = new dlsf(format, (ffix) f);
            hfdVar.v(-597577935);
            boolean D2 = hfdVar.D(this.b) | hfdVar.B(this.c);
            final dmmk dmmkVar2 = this.b;
            final int i2 = this.c;
            Object f2 = hfdVar.f();
            if (D2 || f2 == hfc.a) {
                f2 = new ffix() { // from class: dmlw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmmk.this.b.invoke(Integer.valueOf(i2));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            ffix ffixVar = (ffix) f2;
            hfdVar.o();
            hfdVar.v(-597575851);
            boolean D3 = hfdVar.D(this.b) | hfdVar.B(this.c);
            final dmmk dmmkVar3 = this.b;
            final int i3 = this.c;
            Object f3 = hfdVar.f();
            if (D3 || f3 == hfc.a) {
                f3 = new ffix() { // from class: dmlx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmmk.this.d.invoke(Integer.valueOf(i3));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            ffix ffixVar2 = (ffix) f3;
            hfdVar.o();
            dlzk.b(new dlzl(dlsfVar, ffixVar, ffixVar2, this.a instanceof dlwf ? this.d : false), null, new ibw(dmmi.m(this.e, this.f, hfdVar)), hpx.d(-1499047417, new dmly(this.a), hfdVar), hfdVar, 3072);
        }
        return ffcu.a;
    }
}
