package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apdy implements aptb {
    private final byyf a;
    private final apue b;

    public apdy(final dtuu dtuuVar, apuc apucVar) {
        dtuuVar.getClass();
        apucVar.getClass();
        String[] strArr = VmtTable.a;
        byyg byygVar = new byyg(VmtTable.a);
        byygVar.z("VoiceTranscriptionChangeObserver");
        byyf b = byygVar.b();
        this.a = b;
        this.b = apucVar.a("VoiceTranscriptionChangeObserver", b, new apud() { // from class: apdx
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new apel(dtuu.this, new ffji() { // from class: apdw
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

    @Override // defpackage.aptb
    public final apta a() {
        return this.b.a();
    }

    @Override // defpackage.aptb
    public final ctbx b(alyd alydVar) {
        return this.b.b(alydVar);
    }
}
