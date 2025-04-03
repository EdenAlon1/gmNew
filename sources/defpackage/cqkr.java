package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqkr implements cpws {
    private final comc a;
    private final cqlc b;

    public cqkr(Context context, comy comyVar) {
        comu c = comv.c();
        c.d(comb.DRM_WIPEOUT_HEURISTIC);
        c.f(cqkt.a);
        comc a = comyVar.a(c.a());
        this.a = a;
        this.b = new cqlc(context, a);
    }

    private final void b() {
        this.b.a(Uri.parse("content://mms/drm"), new cqlb() { // from class: cqkq
            @Override // defpackage.cqlb
            public final Object a(Object obj, Uri uri, String str) {
                cqks cqksVar = (cqks) ((cqkt) obj).toBuilder();
                String uri2 = uri.toString();
                cqksVar.copyOnWrite();
                cqkt cqktVar = (cqkt) cqksVar.instance;
                uri2.getClass();
                cqktVar.b = uri2;
                cqksVar.copyOnWrite();
                cqkt cqktVar2 = (cqkt) cqksVar.instance;
                str.getClass();
                cqktVar2.c = str;
                return (cqkt) cqksVar.build();
            }
        });
    }

    @Override // defpackage.cpws
    public final Optional a() {
        try {
            cqkt cqktVar = (cqkt) this.a.l();
            if (TextUtils.isEmpty(cqktVar.b)) {
                b();
                return Optional.empty();
            }
            cqlc cqlcVar = this.b;
            Uri parse = Uri.parse(cqktVar.b);
            String str = cqktVar.c;
            Cursor query = cqlcVar.b.getContentResolver().query(parse, new String[]{"_data"}, null, null, null, null);
            try {
                emyw.e(query);
                boolean z = false;
                if (query.moveToNext() && query.getString(0).equals(str)) {
                    z = true;
                }
                if (!z) {
                    csjb c = cqlc.a.c();
                    c.I("Detected telephony wipeout. Clearing internal state of the table heuristic.");
                    c.r();
                    cqlcVar.c.n();
                }
                boolean z2 = !z;
                if (query != null) {
                    query.close();
                }
                if (!z) {
                    b();
                }
                return Optional.of(Boolean.valueOf(z2));
            } finally {
            }
        } catch (eygu e) {
            throw new RuntimeException("DrmTableBasedWipeoutDetectionHeuristic is unable to access data in the data store.", e);
        }
    }
}
