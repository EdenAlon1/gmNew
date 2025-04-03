package defpackage;

import android.os.Trace;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duon implements dumu {
    @Override // defpackage.dumu
    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream) {
        int i = engw.d;
        engr engrVar = new engr();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return engrVar.g();
                }
                engrVar.h(readLine);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dumu
    public final /* synthetic */ void b(OutputStream outputStream, Object obj) {
        enru enruVar = duoo.a;
        ozg.a("BundledEmojiListLoader.saveToBinaryStringCacheFile");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            try {
                enqv it = ((engw) obj).iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }
}
