package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhg {
    public static final cskc a = cskc.g("Bugle", "SharedStorageInteractor");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;

    public cbhg(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.c = ffbrVar2;
        this.b = ffbrVar;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        cuav cuavVar = new cuav();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.UID_REMOVED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(cuavVar, intentFilter);
    }
}
