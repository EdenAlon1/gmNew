package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final /* synthetic */ class g4 implements IntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Integer[i];
            default:
                return new Object[i];
        }
    }
}
