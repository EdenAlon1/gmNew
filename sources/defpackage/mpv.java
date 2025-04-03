package defpackage;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpv implements mps {
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private mpv(UUID uuid) {
        lti.b(!lpn.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(q(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (lpn.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static mpv o(UUID uuid) {
        try {
            return new mpv(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new mpz(e);
        } catch (Exception e2) {
            throw new mpz(e2);
        }
    }

    private static UUID q(UUID uuid) {
        return (lvf.a >= 27 || !lpn.c.equals(uuid)) ? uuid : lpn.b;
    }

    @Override // defpackage.mps
    public final int a() {
        return 2;
    }

    @Override // defpackage.mps
    public final /* bridge */ /* synthetic */ lxt b(byte[] bArr) {
        return new mpt(q(this.a), bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        if (j$.util.Objects.equals(r0, "aidl-1") == false) goto L98;
     */
    @Override // defpackage.mps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mpq c(byte[] r12, java.util.List r13, int r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpv.c(byte[], java.util.List, int, java.util.HashMap):mpq");
    }

    @Override // defpackage.mps
    public final mpr d() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new mpr(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.mps
    public final Map e(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.mps
    public final void f(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.mps
    public final void g(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // defpackage.mps
    public final synchronized void h() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.mps
    public final void i(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.mps
    public final void j(byte[] bArr, mlu mluVar) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        if (lvf.a >= 31) {
            try {
                MediaDrm mediaDrm = this.b;
                LogSessionId a = mluVar.a();
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a.equals(logSessionId);
                if (equals) {
                    return;
                }
                playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                lti.f(playbackComponent);
                playbackComponent.setLogSessionId(a);
            } catch (UnsupportedOperationException unused) {
                luj.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.startsWith("16.0") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r0 = r3.b;
        r4 = r0.getSecurityLevel(r4);
        r4 = r0.requiresSecureDecoder(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r3.a.equals(defpackage.lpn.c) == false) goto L20;
     */
    @Override // defpackage.mps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(byte[] r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = defpackage.lvf.a
            r1 = 31
            if (r0 < r1) goto L4b
            java.util.UUID r0 = r3.a
            java.util.UUID r1 = defpackage.lpn.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            java.lang.String r0 = r3.p()
            java.lang.String r1 = "v5."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "14."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "15."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "16.0"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L4b
            goto L40
        L35:
            java.util.UUID r0 = r3.a
            java.util.UUID r1 = defpackage.lpn.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L4b
        L40:
            android.media.MediaDrm r0 = r3.b
            int r4 = defpackage.od$$ExternalSyntheticApiModelOutline0.m(r0, r4)
            boolean r4 = defpackage.mll$$ExternalSyntheticApiModelOutline0.m(r0, r5, r4)
            return r4
        L4b:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L60 android.media.MediaCryptoException -> L67
            java.util.UUID r2 = r3.a     // Catch: java.lang.Throwable -> L60 android.media.MediaCryptoException -> L67
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L60 android.media.MediaCryptoException -> L67
            boolean r4 = r1.requiresSecureDecoderComponent(r5)     // Catch: java.lang.Throwable -> L5b android.media.MediaCryptoException -> L5e
            r1.release()
            return r4
        L5b:
            r4 = move-exception
            r0 = r1
            goto L61
        L5e:
            r0 = r1
            goto L67
        L60:
            r4 = move-exception
        L61:
            if (r0 == 0) goto L66
            r0.release()
        L66:
            throw r4
        L67:
            r4 = 1
            if (r0 != 0) goto L6b
            return r4
        L6b:
            r0.release()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpv.k(byte[], java.lang.String):boolean");
    }

    @Override // defpackage.mps
    public final byte[] l() {
        return this.b.openSession();
    }

    @Override // defpackage.mps
    public final byte[] m(byte[] bArr, byte[] bArr2) {
        if (lpn.c.equals(this.a) && lvf.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(lvf.H(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(mod.a(jSONObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(mod.a(jSONObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = lvf.ae(sb.toString());
            } catch (JSONException e) {
                luj.d("ClearKeyUtil", "Failed to adjust response data: ".concat(lvf.H(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.mps
    public final void n(final mon monVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: mpu
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                moo mooVar = mon.this.a.l;
                lti.f(mooVar);
                mooVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    public final String p() {
        return this.b.getPropertyString(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
    }
}
