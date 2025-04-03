package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apwf {
    public final apue a;
    private final bwdd b;

    public apwf(final dtuu dtuuVar, apuc apucVar) {
        dtuuVar.getClass();
        apucVar.getClass();
        bwdf c = PartsTable.c();
        c.z("MessagePartsChangeObserver");
        c.e(new Function() { // from class: apwd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwat bwatVar = (bwat) obj;
                fffs fffsVar = new fffs((byte[]) null);
                fffsVar.add(bwatVar.a);
                fffsVar.add(bwatVar.b);
                fffsVar.add(bwatVar.e);
                fffsVar.add(bwatVar.d);
                fffsVar.add(bwatVar.v);
                fffsVar.add(bwatVar.u);
                fffsVar.add(bwatVar.R);
                fffsVar.add(bwatVar.U);
                fffsVar.add(bwatVar.n);
                fffsVar.add(bwatVar.X);
                if (cubs.f()) {
                    fffsVar.add(bwatVar.Y);
                }
                bwau[] bwauVarArr = (bwau[]) ffdx.a(fffsVar).toArray(new bwau[0]);
                return (bwau[]) Arrays.copyOf(bwauVarArr, bwauVarArr.length);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwdd b = c.b();
        this.b = b;
        this.a = apucVar.a("SafeMessagePartsChangeObserver", b, new apud() { // from class: apwe
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new apwb(dtuu.this, new ffji() { // from class: apwc
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        engw engwVar = (engw) obj;
                        engwVar.getClass();
                        Consumer.this.o(engwVar);
                        return ffcu.a;
                    }
                });
            }
        });
    }
}
