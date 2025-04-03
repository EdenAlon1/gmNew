package defpackage;

import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import java.io.ByteArrayOutputStream;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djav {
    private final dkou a;

    public djav(dkou dkouVar) {
        this.a = dkouVar;
    }

    public final byte[] a(String str, LocationInformation locationInformation) {
        String str2 = locationInformation.a;
        double d = locationInformation.d;
        double d2 = locationInformation.c;
        double d3 = locationInformation.e;
        long j = locationInformation.f;
        dkot dkotVar = (dkot) this.a.a.b();
        dkotVar.b = str;
        dkotVar.a().a().a().a().add(new dkxi(new dkxy(Double.valueOf(d), Double.valueOf(d2)), Double.valueOf(d3)));
        dkotVar.a().a().a.d = new Date(j);
        if (!dktk.d(str2)) {
            dkotVar.a().b = str2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dkou.b(dkotVar, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
