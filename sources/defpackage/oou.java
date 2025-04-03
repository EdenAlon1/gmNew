package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oou {
    public final AssetManager a;
    public final ope b;
    public final byte[] c;
    public final File d;
    public final String e;
    public oov[] i;
    public byte[] j;
    private final Executor k;
    public boolean h = false;
    public final String f = "dexopt/baseline.prof";
    public final String g = "dexopt/baseline.profm";

    public oou(AssetManager assetManager, Executor executor, ope opeVar, String str, File file) {
        byte[] bArr;
        this.a = assetManager;
        this.k = executor;
        this.b = opeVar;
        this.e = str;
        this.d = file;
        if (Build.VERSION.SDK_INT < 31) {
            switch (Build.VERSION.SDK_INT) {
                case 26:
                    bArr = opk.d;
                    break;
                case 27:
                    bArr = opk.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = opk.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = opk.a;
        }
        this.c = bArr;
    }

    public final void a() {
        if (!this.h) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public final void b(final int i, final Object obj) {
        this.k.execute(new Runnable() { // from class: oot
            @Override // java.lang.Runnable
            public final void run() {
                oou.this.b.a(i, obj);
            }
        });
    }
}
