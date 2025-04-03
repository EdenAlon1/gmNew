package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akuv {
    private final Intent a = new Intent();

    private akuv() {
    }

    public static akuv b(ComponentName componentName, String str) {
        akuv akuvVar = new akuv();
        akuvVar.a.setComponent(componentName);
        akuvVar.e(str);
        return akuvVar;
    }

    public static akuv c(Context context, Class cls, String str) {
        akuv akuvVar = new akuv();
        akuvVar.a.setClass(context, cls);
        akuvVar.e(str);
        return akuvVar;
    }

    public static akuv d(String str) {
        akuv akuvVar = new akuv();
        akuvVar.e(str);
        return akuvVar;
    }

    public final Intent a() {
        return (Intent) this.a.clone();
    }

    public final void e(String str) {
        emxf.b(!str.isEmpty(), "The action of intent should not be set to empty. (go/responsible-api-intent-issues)");
        this.a.setAction(str);
    }

    public final void f(String str) {
        emxf.b(!str.isEmpty(), "The package of intent should not be set to empty.");
        this.a.setPackage(str);
    }
}
