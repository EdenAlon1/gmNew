package defpackage;

import android.R;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class evv {
    public static final evv a;
    public static final evv b;
    public static final evv c;
    public static final evv d;
    public static final evv e;
    private static final /* synthetic */ evv[] g;
    public final int f;

    static {
        evv evvVar = new evv("Cut", 0, R.string.cut);
        a = evvVar;
        evv evvVar2 = new evv("Copy", 1, R.string.copy);
        b = evvVar2;
        evv evvVar3 = new evv("Paste", 2, R.string.paste);
        c = evvVar3;
        evv evvVar4 = new evv("SelectAll", 3, R.string.selectAll);
        d = evvVar4;
        evv evvVar5 = new evv("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? com.google.android.apps.messaging.R.string.autofill : R.string.autofill);
        e = evvVar5;
        evv[] evvVarArr = {evvVar, evvVar2, evvVar3, evvVar4, evvVar5};
        g = evvVarArr;
        ffhw.a(evvVarArr);
    }

    private evv(String str, int i, int i2) {
        this.f = i2;
    }

    public static evv[] values() {
        return (evv[]) g.clone();
    }
}
