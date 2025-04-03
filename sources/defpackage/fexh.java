package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexh implements Runnable {
    final /* synthetic */ fexk a;

    public fexh(fexk fexkVar) {
        this.a = fexkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            fexk fexkVar = this.a;
            fhnt fhntVar = fexkVar.f;
            if (fhntVar != null) {
                fhmt fhmtVar = fexkVar.b;
                long j = fhmtVar.b;
                if (j > 0) {
                    fhntVar.id(fhmtVar, j);
                }
            }
        } catch (IOException e) {
            this.a.c.a(e);
        }
        try {
            fhnt fhntVar2 = this.a.f;
            if (fhntVar2 != null) {
                fhntVar2.close();
            }
        } catch (IOException e2) {
            this.a.c.a(e2);
        }
        try {
            Socket socket = this.a.g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e3) {
            this.a.c.a(e3);
        }
    }
}
