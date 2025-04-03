package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexe extends alhh {
    public static final /* synthetic */ int a = 0;

    static {
        cfvl.e(cfvl.b, "super_sort_conversation_bucket_size", 10);
        cfvl.e(cfvl.b, "super_sort_otp_conversation_bucket_size", 5);
    }

    public aexe(ffbr ffbrVar, aexz aexzVar, Executor executor) {
        super(ffbrVar, aexzVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aexb
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqio eqioVar = (eqio) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqioVar.getClass();
                eqhcVar.c = eqioVar;
                eqhcVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final akue akueVar) {
        if (((Boolean) aexw.a.e()).booleanValue()) {
            return;
        }
        o(new Supplier() { // from class: aexd
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = aexe.a;
                eqid eqidVar = (eqid) eqio.a.createBuilder();
                eqik eqikVar = (eqik) eqin.a.createBuilder();
                eqbw a2 = new cxkc(akue.this).a();
                eqikVar.copyOnWrite();
                eqin eqinVar = (eqin) eqikVar.instance;
                eqinVar.c = a2.f;
                eqinVar.b |= 1;
                eqidVar.copyOnWrite();
                eqio eqioVar = (eqio) eqidVar.instance;
                eqin eqinVar2 = (eqin) eqikVar.build();
                eqinVar2.getClass();
                eqioVar.c = eqinVar2;
                eqioVar.b = 3;
                return (eqio) eqidVar.build();
            }
        });
    }

    public final void c(final SuperSortLabel superSortLabel, final int i) {
        if (((Boolean) aexw.a.e()).booleanValue()) {
            return;
        }
        o(new Supplier() { // from class: aexc
            @Override // java.util.function.Supplier
            public final Object get() {
                int i2 = aexe.a;
                eqik eqikVar = (eqik) eqin.a.createBuilder();
                eqjv b = aeya.b(SuperSortLabel.this);
                eqikVar.copyOnWrite();
                eqin eqinVar = (eqin) eqikVar.instance;
                eqinVar.d = b.i;
                eqinVar.b |= 2;
                if (aewg.f()) {
                    int i3 = i;
                    eqikVar.copyOnWrite();
                    eqin eqinVar2 = (eqin) eqikVar.instance;
                    eqinVar2.e = i3 - 1;
                    eqinVar2.b |= 4;
                }
                eqid eqidVar = (eqid) eqio.a.createBuilder();
                eqin eqinVar3 = (eqin) eqikVar.build();
                eqidVar.copyOnWrite();
                eqio eqioVar = (eqio) eqidVar.instance;
                eqinVar3.getClass();
                eqioVar.c = eqinVar3;
                eqioVar.b = 3;
                return (eqio) eqidVar.build();
            }
        });
    }
}
