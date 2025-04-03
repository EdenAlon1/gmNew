package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrs implements cfug {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public cjrs(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return true;
    }

    @Override // defpackage.cfug
    public final void gg() {
        if (!((Boolean) this.b.b()).booleanValue() || ((Boolean) this.c.b()).booleanValue()) {
            return;
        }
        Optional optional = (Optional) this.a.b();
        final cjrr cjrrVar = cjrr.a;
        optional.ifPresent(new Consumer() { // from class: cjrq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
