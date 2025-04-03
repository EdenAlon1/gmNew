package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djau implements dvvv, djtm {
    public final Context a;
    public final dijk b;
    public final dkou c;
    final ditw d;
    private final Map e = new HashMap();
    private final dkjq f;
    private final dkrp g;
    private final dkrx h;
    private final djav i;

    public djau(Context context, dkjq dkjqVar, dkrp dkrpVar, dijk dijkVar, dkrx dkrxVar, dkou dkouVar, djav djavVar) {
        this.a = context;
        this.f = dkjqVar;
        this.g = dkrpVar;
        this.b = dijkVar;
        this.h = dkrxVar;
        this.c = dkouVar;
        this.i = djavVar;
        ditw ditwVar = new ditw() { // from class: djat
            /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[Catch: IOException -> 0x01a6, TryCatch #1 {IOException -> 0x01a6, blocks: (B:17:0x00a9, B:19:0x00b6, B:20:0x00bc, B:21:0x00cb, B:23:0x00cf, B:24:0x00d1, B:26:0x00dc, B:29:0x00e3, B:30:0x00e7, B:32:0x00ed, B:36:0x00fd, B:38:0x0101, B:39:0x010d, B:41:0x017e, B:42:0x0183, B:44:0x018b, B:46:0x0191, B:47:0x019c), top: B:16:0x00a9 }] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[Catch: IOException -> 0x01a6, TryCatch #1 {IOException -> 0x01a6, blocks: (B:17:0x00a9, B:19:0x00b6, B:20:0x00bc, B:21:0x00cb, B:23:0x00cf, B:24:0x00d1, B:26:0x00dc, B:29:0x00e3, B:30:0x00e7, B:32:0x00ed, B:36:0x00fd, B:38:0x0101, B:39:0x010d, B:41:0x017e, B:42:0x0183, B:44:0x018b, B:46:0x0191, B:47:0x019c), top: B:16:0x00a9 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0101 A[Catch: IOException -> 0x01a6, TryCatch #1 {IOException -> 0x01a6, blocks: (B:17:0x00a9, B:19:0x00b6, B:20:0x00bc, B:21:0x00cb, B:23:0x00cf, B:24:0x00d1, B:26:0x00dc, B:29:0x00e3, B:30:0x00e7, B:32:0x00ed, B:36:0x00fd, B:38:0x0101, B:39:0x010d, B:41:0x017e, B:42:0x0183, B:44:0x018b, B:46:0x0191, B:47:0x019c), top: B:16:0x00a9 }] */
            @Override // defpackage.ditw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.dkjt r18, long r19, java.lang.String r21) {
                /*
                    Method dump skipped, instructions count: 437
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.djat.a(dkjt, long, java.lang.String):void");
            }
        };
        this.d = ditwVar;
        dijkVar.w("application/vnd.gsma.rcspushlocation+xml", ditwVar);
    }

    @Override // defpackage.dvvv
    public final LocationSharingResult a(long j, String str, LocationInformation locationInformation, String str2) {
        String str3;
        String b;
        dkty.c("Pushing location via chat, request ID = %d", Long.valueOf(j));
        try {
            b = TextUtils.isEmpty(str2) ? dktj.b() : str2;
        } catch (IOException e) {
            e = e;
            str3 = str2;
        }
        try {
            return new LocationSharingResult(j, str, this.b.e(str, b(locationInformation), "application/vnd.gsma.rcspushlocation+xml", b).getCode(), null, b);
        } catch (IOException e2) {
            e = e2;
            str3 = b;
            dkty.i(e, "Error while pushing location information", new Object[0]);
            return new LocationSharingResult(j, str, 1, null, str3);
        }
    }

    final byte[] b(LocationInformation locationInformation) {
        return this.i.a(this.f.a(), locationInformation);
    }

    @Override // defpackage.dvvv
    public final long[] c() {
        return dkta.b(this.e.keySet());
    }

    @Override // defpackage.dvvv
    public final LocationSharingResult[] d(long j, LocationInformation locationInformation, String str) {
        dkty.c("Push location to group via chat, session ID = %d", Long.valueOf(j));
        if (this.g.a(j).isEmpty()) {
            return ditn.j(9, "Session does not exist or is not a group chat session");
        }
        try {
            String b = TextUtils.isEmpty(str) ? dktj.b() : str;
            return new LocationSharingResult[]{new LocationSharingResult(this.h.c(), " ", this.b.d(j, b, "application/vnd.gsma.rcspushlocation+xml", b(locationInformation)).getCode(), null, b)};
        } catch (IOException e) {
            dkty.i(e, "Error while pushing location information", new Object[0]);
            return ditn.j(1, e.getMessage());
        }
    }

    @Override // defpackage.djtm
    public final /* synthetic */ void u(djtp djtpVar) {
    }
}
