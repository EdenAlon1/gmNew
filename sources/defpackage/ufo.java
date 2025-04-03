package defpackage;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ufo implements ufd, apps {
    public static ufn n() {
        uet uetVar = new uet();
        uetVar.a = "application/vnd.gsma.rcspushlocation+xml";
        return uetVar;
    }

    public static ufn o(Intent intent) {
        Location location = (Location) intent.getParcelableExtra("location_extra");
        Uri data = intent.getData();
        if (location == null || data == null) {
            return null;
        }
        ufn n = n();
        n.e(data);
        n.c(location.getLatitude());
        n.d(location.getLongitude());
        n.b(eohh.b(intent.getIntExtra("location_source_extra", 1)));
        String stringExtra = intent.getStringExtra("location_url");
        if (stringExtra != null) {
            ((uet) n).c = stringExtra;
        }
        return n;
    }

    @Override // defpackage.apmq
    public abstract Uri c();

    @Override // defpackage.apmq
    public abstract apra fk();

    @Override // defpackage.apmq
    public final /* synthetic */ awap fl() {
        return null;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ doxr fm() {
        return ufc.a(this);
    }

    @Override // defpackage.doxs
    public final /* synthetic */ String fo() {
        return toString();
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    public abstract String k();

    @Override // defpackage.doxx
    public final /* synthetic */ Object fn() {
        return this;
    }
}
