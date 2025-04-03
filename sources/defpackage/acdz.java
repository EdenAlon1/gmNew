package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdz implements acfk {
    private static final cskc a = cskc.f("BugleDiagnostics", acfk.class);
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);
    private final Context c;
    private final csxu d;
    private final cqoh e;
    private csjx f;
    private String g;

    public acdz(Context context, csxu csxuVar, cqoh cqohVar) {
        this.c = context;
        this.d = csxuVar;
        this.e = cqohVar;
    }

    @Override // defpackage.acfk
    public final Uri a() {
        String str = this.g;
        if (str == null) {
            a.p("no recent diagnostics logs");
            return null;
        }
        File e = cflz.e(this.c, str);
        if (!e.exists()) {
            try {
                PrintWriter printWriter = new PrintWriter(e);
                try {
                    this.f.a(printWriter, csjz.DIAGNOSTICS);
                    printWriter.close();
                } finally {
                }
            } catch (FileNotFoundException e2) {
                a.o("destination file not found", e2);
                return null;
            }
        }
        return cflz.d(this.c, this.g);
    }

    @Override // defpackage.acfk
    public final csjx b() {
        return this.f;
    }

    @Override // defpackage.acfk
    public final void c() {
        String concat = "AMDiagnostics".concat(String.valueOf(this.b.format(Long.valueOf(this.e.f().toEpochMilli()))));
        this.g = concat;
        this.f = csjx.c(this.c, this.d, concat, "BugleDiagnostics");
    }

    @Override // defpackage.acfk
    public final boolean d() {
        return this.g != null;
    }
}
