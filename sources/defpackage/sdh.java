package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sdh {
    public abstract engw a();

    /* JADX WARN: Multi-variable type inference failed */
    public final ryj b() {
        int i = engw.d;
        engr engrVar = new engr();
        engw a = a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            engrVar.h(((sdg) a.get(i2)).a());
        }
        return new ryj(engrVar.g(), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ryv c() {
        int i = engw.d;
        engr engrVar = new engr();
        engw a = a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            sdg sdgVar = (sdg) a.get(i2);
            engrVar.h(new ryr(sdgVar.b(), sdgVar.a()));
        }
        return new ryv(engrVar.g(), 1);
    }
}
