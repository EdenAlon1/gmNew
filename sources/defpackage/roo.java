package defpackage;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class roo implements rps {
    private final rqe a;

    public roo(ror rorVar) {
        rpu rpuVar = new rpu();
        rpuVar.b(new rpt(), new ron(rorVar));
        this.a = new rqe(rpuVar);
    }

    @Override // defpackage.rps
    public final void a(rpr rprVar) {
        rpz rpzVar;
        rph rphVar = new rph(rprVar.a(), 1024);
        OutputStream b = rprVar.b();
        StringBuilder sb = new StringBuilder();
        rqb rqbVar = new rqb();
        byte[] bArr = rqd.a;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(b);
        rpz rpzVar2 = new rpz();
        rqa rqaVar = new rqa();
        while (true) {
            rpzVar2.b();
            String a = rqc.a(rphVar, sb, rqbVar);
            if (a == null) {
                rpzVar = null;
            } else {
                String[] split = a.split(" ", 3);
                if (split.length != 3) {
                    throw new IOException("Invalid request line: ".concat(a));
                }
                rpzVar2.c = split[0];
                rpzVar2.d = Uri.parse(split[1]);
                String str = split[2];
                while (true) {
                    String a2 = rqc.a(rphVar, sb, rqbVar);
                    if (a2 == null) {
                        throw new EOFException();
                    }
                    if ("".equals(a2)) {
                        rpzVar = rpzVar2;
                        break;
                    }
                    String[] split2 = a2.split(": ", 2);
                    if (split2.length != 2) {
                        throw new IOException("Malformed header: ".concat(a2));
                    }
                    String str2 = split2[0];
                    String str3 = split2[1];
                    rpzVar2.a.add(str2);
                    rpzVar2.b.add(str3);
                }
            }
            if (rpzVar == null) {
                return;
            }
            rqe rqeVar = this.a;
            rqaVar.b();
            rpv a3 = rqeVar.a.a(rpzVar.d.getPath());
            if (a3 == null) {
                rqaVar.c = 404;
                rqaVar.d = "Not found";
                rqaVar.e = rpx.a("No handler found\n");
            } else {
                try {
                    a3.a(rpzVar, rqaVar);
                } catch (RuntimeException e) {
                    rqaVar.c = 500;
                    rqaVar.d = "Internal Server Error";
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        e.printStackTrace(printWriter);
                        printWriter.close();
                        rqaVar.e = rpx.a(stringWriter.toString());
                    } catch (Throwable th) {
                        printWriter.close();
                        throw th;
                    }
                }
            }
            rpx rpxVar = rqaVar.e;
            if (rpxVar != null) {
                rqaVar.a(fhpi.a, ((rpw) rpxVar).a);
                rqaVar.a("Content-Length", String.valueOf(((rpw) rqaVar.e).b.length));
            }
            rqd.a("HTTP/1.1 " + rqaVar.c + " " + rqaVar.d, bufferedOutputStream);
            int size = rqaVar.a.size();
            for (int i = 0; i < size; i++) {
                rqd.a(((String) rqaVar.a.get(i)) + ": " + ((String) rqaVar.b.get(i)), bufferedOutputStream);
            }
            bufferedOutputStream.write(rqd.a);
            bufferedOutputStream.flush();
            rpx rpxVar2 = rqaVar.e;
            if (rpxVar2 != null) {
                b.write(((rpw) rpxVar2).b);
            }
        }
    }
}
