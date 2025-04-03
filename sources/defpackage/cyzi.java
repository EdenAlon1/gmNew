package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyzi implements PointerInputEventHandler {
    final /* synthetic */ hho a;
    final /* synthetic */ hho b;

    public cyzi(hho hhoVar, hho hhoVar2) {
        this.a = hhoVar;
        this.b = hhoVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final ild ildVar, ffgu<? super ffcu> ffguVar) {
        final hho hhoVar = this.a;
        final hho hhoVar2 = this.b;
        Object f = duc.f(ildVar, new ffjo() { // from class: cyzh
            @Override // defpackage.ffjo
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                float floatValue = ((Float) obj3).floatValue();
                ((Float) obj4).floatValue();
                hho hhoVar3 = hhoVar;
                hhoVar3.b(Float.valueOf(ffmk.e(cyzk.b(hhoVar3) * floatValue, 1.0f, 4.0f)));
                imf imfVar = (imf) ild.this;
                long j = imfVar.i >> 32;
                float b = cyzk.b(hhoVar3) - 1.0f;
                long j2 = imfVar.i & 4294967295L;
                float b2 = cyzk.b(hhoVar3) - 1.0f;
                hho hhoVar4 = hhoVar2;
                long f2 = iak.f(cyzk.c(hhoVar4), iak.g(((iak) obj2).a, ffmk.e(cyzk.b(hhoVar3) / 3.0f, 1.0f, 2.0f)));
                float c = ffmk.c((((int) j) * b) / 2.0f, 0.0f);
                float e = ffmk.e(Float.intBitsToFloat((int) (f2 >> 32)), -c, c);
                float c2 = ffmk.c((((int) j2) * b2) / 2.0f, 0.0f);
                float e2 = ffmk.e(Float.intBitsToFloat((int) (f2 & 4294967295L)), -c2, c2);
                hhoVar4.b(new iak((Float.floatToRawIntBits(e2) & 4294967295L) | (Float.floatToRawIntBits(e) << 32)));
                return ffcu.a;
            }
        }, ffguVar);
        return f == ffhh.a ? f : ffcu.a;
    }
}
