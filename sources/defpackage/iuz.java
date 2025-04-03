package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iuz extends ffkk implements ffix {
    final /* synthetic */ ivd a;
    final /* synthetic */ iuw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuz(ivd ivdVar, iuw iuwVar) {
        super(0);
        this.a = ivdVar;
        this.b = iuwVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        ivd ivdVar = this.a;
        ivdVar.f.g = 0;
        hne s = ivdVar.o().s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            ivd ivdVar2 = ((iui) objArr[i2]).y.p;
            ivdVar2.getClass();
            ivdVar2.h = ivdVar2.i;
            ivdVar2.i = Alert.DURATION_SHOW_INDEFINITELY;
            if (ivdVar2.w == 2) {
                ivdVar2.w = 3;
            }
        }
        this.a.j(iux.a);
        iuw iuwVar = ((ito) this.a.i()).g;
        if (iuwVar != null) {
            ivd ivdVar3 = this.a;
            boolean z = iuwVar.k;
            List G = ivdVar3.o().G();
            int size = G.size();
            for (int i3 = 0; i3 < size; i3++) {
                iuw C = ((iui) G.get(i3)).z().C();
                if (C != null) {
                    C.k = z;
                }
            }
        }
        this.b.K().o();
        if (((ito) this.a.i()).g != null) {
            List G2 = this.a.o().G();
            int size2 = G2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                iuw C2 = ((iui) G2.get(i4)).z().C();
                if (C2 != null) {
                    C2.k = false;
                }
            }
        }
        hne s2 = this.a.o().s();
        Object[] objArr2 = s2.a;
        int i5 = s2.b;
        for (int i6 = 0; i6 < i5; i6++) {
            ivd ivdVar4 = ((iui) objArr2[i6]).y.p;
            ivdVar4.getClass();
            int i7 = ivdVar4.h;
            int i8 = ivdVar4.i;
            if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                ivdVar4.r(true);
            }
        }
        this.a.j(iuy.a);
        return ffcu.a;
    }
}
