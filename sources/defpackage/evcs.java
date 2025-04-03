package defpackage;

import android.content.pm.PackageManager;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evcs extends feey {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ enip b;
    final /* synthetic */ dfqg c;

    public evcs(PackageManager packageManager, enip enipVar, dfqg dfqgVar) {
        this.a = packageManager;
        this.b = enipVar;
        this.c = dfqgVar;
    }

    @Override // defpackage.feey
    public final Status a(int i) {
        String[] packagesForUid = this.a.getPackagesForUid(i);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (this.b.contains(str)) {
                    return !this.c.d(i) ? Status.i.withDescription("Rejected by (1st-party only Allowlist) security policy. Not google-signed.") : Status.b;
                }
            }
        }
        return Status.i.withDescription("Rejected by (1st-party only Allowlist) security policy. Package not allowed.");
    }
}
