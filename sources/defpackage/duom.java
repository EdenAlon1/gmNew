package defpackage;

import android.os.Trace;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duom implements dumu {
    @Override // defpackage.dumu
    public final /* synthetic */ Object a(InputStream inputStream) {
        return duoo.a(inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dumu
    public final /* synthetic */ void b(OutputStream outputStream, Object obj) {
        enru enruVar = duoo.a;
        ozg.a("BundledEmojiListLoader.saveToCacheFile");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            try {
                enqv it = ((engw) obj).iterator();
                while (it.hasNext()) {
                    duph duphVar = (duph) it.next();
                    bufferedWriter.write(duphVar.a);
                    enqv it2 = duphVar.b.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (str != null) {
                            bufferedWriter.write(44);
                            bufferedWriter.write(str);
                        }
                    }
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
