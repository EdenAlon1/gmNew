package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbng implements cetu {
    public int a = 0;
    private final Context b;
    private final dbiq c;
    private final Consumer d;
    private final BufferedWriter e;
    private final String f;

    public dbng(cqoh cqohVar, Context context, dbiq dbiqVar, Consumer consumer) {
        this.b = context;
        this.c = dbiqVar;
        this.d = consumer;
        String str = "pwq_state_" + cqohVar.f().toEpochMilli() + ".log";
        this.f = str;
        this.e = new BufferedWriter(new FileWriter(cflz.e(context, str)));
    }

    @Override // defpackage.cetu
    public final cett a() {
        this.a += 3;
        return new cett() { // from class: dbnf
            @Override // defpackage.cett, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                dbng dbngVar = dbng.this;
                dbngVar.a -= 3;
            }
        };
    }

    @Override // defpackage.cetu
    public final void b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = this.a; i > 0; i--) {
            sb.append(' ');
        }
        try {
            this.e.write(sb.toString() + str + "\n");
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.cetu
    public final void c() {
        try {
            this.e.close();
            Activity activity = this.c.a;
            knt kntVar = new knt(this.b);
            kntVar.c("Share pwq state log");
            kntVar.d("application/text");
            kntVar.b(cflz.d(this.b, this.f));
            Intent a = kntVar.a();
            a.setFlags(1);
            eldl.p(activity, a);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    @Override // defpackage.cetu
    public final void d(String str) {
        this.d.o(str);
    }
}
