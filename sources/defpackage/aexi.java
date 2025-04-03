package defpackage;

import android.text.TextUtils;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexi extends alhh {
    public final ffbr a;
    public final ffbr b;
    public final Executor c;

    public aexi(ffbr ffbrVar, ffbr ffbrVar2, aexz aexzVar, ffbr ffbrVar3, Executor executor) {
        super(ffbrVar, aexzVar, executor);
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.c = executor;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        return TextUtils.equals(str, "Otp") ? 3 : 2;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aexf
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqjb eqjbVar = (eqjb) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqjbVar.getClass();
                eqhcVar.c = eqjbVar;
                eqhcVar.b = 8;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
