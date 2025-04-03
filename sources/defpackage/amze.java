package defpackage;

import j$.util.DesugarArrays;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class amze extends ffkh implements ffji {
    public static final amze a = new amze();

    public amze() {
        super(1, Arrays.class, "stream", "stream([Ljava/lang/Object;)Ljava/util/stream/Stream;", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        return DesugarArrays.stream((String[]) obj);
    }
}
