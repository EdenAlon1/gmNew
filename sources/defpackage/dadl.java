package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import j$.util.function.Consumer$CC;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dadl implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ DebugGServiceKeysFragment b;

    public dadl(DebugGServiceKeysFragment debugGServiceKeysFragment, String str) {
        this.a = str;
        this.b = debugGServiceKeysFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final DebugGServiceKeysFragment debugGServiceKeysFragment = this.b;
        engw a = DebugGServiceKeysFragment.a((ersv) debugGServiceKeysFragment.ak.b());
        enou enouVar = (enou) a;
        final HashMap h = ennc.h(enouVar.c);
        int i = enouVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            DebugGServiceKeysFragment.b((String) a.get(i2)).ifPresent(new Consumer() { // from class: dadi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    DebugGServiceKeysFragment debugGServiceKeysFragment2 = DebugGServiceKeysFragment.this;
                    String str = (String) obj;
                    h.put(str, String.valueOf(((ersv) debugGServiceKeysFragment2.ak.b()).b(str).orElse(Boolean.valueOf(((ersv) debugGServiceKeysFragment2.ak.b()).d(str)))));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        final dado dadoVar = new dado(this.a, h, (errl) this.b.al.b());
        ((ejlq) this.b.ai.b()).g(ejlp.b(elfo.f(new Runnable() { // from class: dadn
            @Override // java.lang.Runnable
            public final void run() {
                dado dadoVar2 = dado.this;
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(dadoVar2.a)));
                    try {
                        for (String str : dadoVar2.b.keySet()) {
                            bufferedWriter.write(str);
                            bufferedWriter.write(" : ");
                            bufferedWriter.write((String) dadoVar2.b.get(str));
                            bufferedWriter.write("\n");
                        }
                        bufferedWriter.close();
                    } finally {
                    }
                } catch (IOException e) {
                    ensk j = DebugGServiceKeysFragment.a.j();
                    j.Y(ente.a, "BugleDiagnostics");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$AutorampFlagWriter", "writeAutorampFlagsToFile", (char) 361, "DebugGServiceKeysFragment.java")).q("Failed to dump autoramp flags to file");
                }
            }
        }, dadoVar.c)), this.b.c);
    }
}
