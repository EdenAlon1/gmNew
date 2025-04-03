package defpackage;

import j$.util.function.Consumer$CC;
import java.nio.ByteBuffer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class exoa {
    protected static final exoh h(exnp exnpVar) {
        final exoi exoiVar = (exoi) exoj.a.createBuilder();
        exoiVar.getClass();
        exng exngVar = (exng) exnpVar;
        exngVar.a.ifPresent(new Consumer() { // from class: exnw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                exoi exoiVar2 = exoi.this;
                String str = (String) obj;
                exoiVar2.copyOnWrite();
                exoj exojVar = (exoj) exoiVar2.instance;
                exoj exojVar2 = exoj.a;
                str.getClass();
                exojVar.b |= 2;
                exojVar.d = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        exngVar.b.ifPresent(new Consumer() { // from class: exnx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                exok exokVar = (exok) exol.a.createBuilder();
                int intValue = ((Integer) obj).intValue();
                exokVar.copyOnWrite();
                exol exolVar = (exol) exokVar.instance;
                exolVar.b |= 1;
                exolVar.c = intValue;
                exol exolVar2 = (exol) exokVar.build();
                exoi exoiVar2 = exoi.this;
                exoiVar2.copyOnWrite();
                exoj exojVar = (exoj) exoiVar2.instance;
                exoj exojVar2 = exoj.a;
                exolVar2.getClass();
                exojVar.e = exolVar2;
                exojVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        exngVar.c.ifPresent(new Consumer() { // from class: exny
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.rewind();
                eyee w = eyee.w(byteBuffer);
                exoi exoiVar2 = exoi.this;
                exoiVar2.copyOnWrite();
                exoj exojVar = (exoj) exoiVar2.instance;
                exoj exojVar2 = exoj.a;
                exojVar.b |= 1;
                exojVar.c = w;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final exoe exoeVar = (exoe) exof.a.createBuilder();
        eukw eukwVar = eukw.a;
        exoeVar.copyOnWrite();
        exof exofVar = (exof) exoeVar.instance;
        eukwVar.getClass();
        exofVar.c = eukwVar;
        exofVar.b = 4;
        exngVar.d.ifPresent(new Consumer() { // from class: exnz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                exnn exnnVar = (exnn) ((exno) obj);
                exoe exoeVar2 = exoe.this;
                eukw eukwVar2 = eukw.a;
                exoeVar2.copyOnWrite();
                exof exofVar2 = (exof) exoeVar2.instance;
                exof exofVar3 = exof.a;
                eukwVar2.getClass();
                exofVar2.c = eukwVar2;
                exofVar2.b = 4;
                if (exnnVar.b()) {
                    exoeVar2.copyOnWrite();
                    exof exofVar4 = (exof) exoeVar2.instance;
                    if (exofVar4.b == 4) {
                        exofVar4.b = 0;
                        exofVar4.c = null;
                    }
                    eukx eukxVar = (eukx) euky.a.createBuilder();
                    int a = exnnVar.a();
                    eukxVar.copyOnWrite();
                    euky eukyVar = (euky) eukxVar.instance;
                    eukyVar.b |= 1;
                    eukyVar.c = a;
                    exoeVar2.copyOnWrite();
                    exof exofVar5 = (exof) exoeVar2.instance;
                    euky eukyVar2 = (euky) eukxVar.build();
                    eukyVar2.getClass();
                    exofVar5.c = eukyVar2;
                    exofVar5.b = 1;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        exog exogVar = (exog) exoh.a.createBuilder();
        exoj exojVar = (exoj) exoiVar.build();
        exogVar.copyOnWrite();
        exoh exohVar = (exoh) exogVar.instance;
        exojVar.getClass();
        exohVar.c = exojVar;
        exohVar.b |= 1;
        exof exofVar2 = (exof) exoeVar.build();
        exogVar.copyOnWrite();
        exoh exohVar2 = (exoh) exogVar.instance;
        exofVar2.getClass();
        exohVar2.e = exofVar2;
        exohVar2.b |= 4;
        return (exoh) exogVar.build();
    }

    public eula g() {
        throw null;
    }
}
