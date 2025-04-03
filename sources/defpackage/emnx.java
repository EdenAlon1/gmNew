package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class emnx extends exoa {
    public abstract exnp a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract List e();

    public abstract List f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.exoa
    public final eula g() {
        exog exogVar = (exog) h(a()).toBuilder();
        exoe exoeVar = (exoe) exof.a.createBuilder();
        eukw eukwVar = eukw.a;
        exoeVar.copyOnWrite();
        exof exofVar = (exof) exoeVar.instance;
        eukwVar.getClass();
        exofVar.c = eukwVar;
        exofVar.b = 4;
        exogVar.copyOnWrite();
        exoh exohVar = (exoh) exogVar.instance;
        exof exofVar2 = (exof) exoeVar.build();
        exofVar2.getClass();
        exohVar.e = exofVar2;
        exohVar.b |= 4;
        final exnd exndVar = (exnd) exne.a.createBuilder();
        Optional b = b();
        exndVar.getClass();
        b.ifPresent(new Consumer() { // from class: emnu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                exnd exndVar2 = exnd.this;
                String str = (String) obj;
                exndVar2.copyOnWrite();
                exne exneVar = (exne) exndVar2.instance;
                exne exneVar2 = exne.a;
                str.getClass();
                exneVar.b |= 1;
                exneVar.c = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        c().ifPresent(new Consumer() { // from class: emnv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int intValue = ((Integer) obj).intValue();
                exnd exndVar2 = exnd.this;
                exndVar2.copyOnWrite();
                exne exneVar = (exne) exndVar2.instance;
                exne exneVar2 = exne.a;
                exneVar.b |= 2;
                exneVar.d = intValue;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        d().ifPresent(new Consumer() { // from class: emnw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                float floatValue = ((Float) obj).floatValue();
                exnd exndVar2 = exnd.this;
                exndVar2.copyOnWrite();
                exne exneVar = (exne) exndVar2.instance;
                exne exneVar2 = exne.a;
                exneVar.b |= 4;
                exneVar.e = floatValue;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (!e().isEmpty()) {
            List e = e();
            exndVar.copyOnWrite();
            exne exneVar = (exne) exndVar.instance;
            eygr eygrVar = exneVar.f;
            if (!eygrVar.c()) {
                exneVar.f = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(e, exneVar.f);
        }
        if (!f().isEmpty()) {
            List f = f();
            exndVar.copyOnWrite();
            exne exneVar2 = (exne) exndVar.instance;
            eygr eygrVar2 = exneVar2.g;
            if (!eygrVar2.c()) {
                exneVar2.g = eyfy.mutableCopy(eygrVar2);
            }
            eydl.addAll(f, exneVar2.g);
        }
        exom exomVar = (exom) exon.a.createBuilder();
        exomVar.copyOnWrite();
        exon exonVar = (exon) exomVar.instance;
        exoh exohVar2 = (exoh) exogVar.build();
        exohVar2.getClass();
        exonVar.d = exohVar2;
        exonVar.c |= 1;
        exomVar.copyOnWrite();
        exon exonVar2 = (exon) exomVar.instance;
        exne exneVar3 = (exne) exndVar.build();
        exneVar3.getClass();
        exonVar2.e = exneVar3;
        exonVar2.c |= 2;
        exon exonVar3 = (exon) exomVar.build();
        eukz eukzVar = (eukz) eula.a.createBuilder();
        eukzVar.e(exon.b, exonVar3);
        return (eula) eukzVar.build();
    }
}
