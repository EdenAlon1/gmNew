package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crzd {
    public static final cfup a = cfvl.i(cfvl.b, "use_hmac_participant_hash", false);
    public final ffbr b;
    private final ffbr c;
    private final dtuu d;

    public crzd(ffbr ffbrVar, ffbr ffbrVar2, dtuu dtuuVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = dtuuVar;
    }

    private final eyee e(eyee eyeeVar) {
        Mac mac = Mac.getInstance("HmacSHA256");
        byte[] bArr = (byte[]) this.d.c("CmsEncryptionUtility#generateHmac", new emyl() { // from class: crzb
            @Override // defpackage.emyl
            public final Object get() {
                crzd crzdVar = crzd.this;
                List d = ((cryg) crzdVar.b.b()).d(3);
                if (!d.isEmpty()) {
                    return ((bqvj) d.get(0)).q();
                }
                ffbr ffbrVar = crzdVar.b;
                byte[] b = cshi.b();
                ekzz f = eleg.f("CmsDatabaseOperations#upsertCmsKey");
                try {
                    String[] strArr = bqws.a;
                    bqvm bqvmVar = new bqvm();
                    bqvmVar.e(1);
                    bqvmVar.d(b);
                    bqvmVar.f(3);
                    final bqvj a2 = bqvmVar.a();
                    bqwr bqwrVar = new bqwr();
                    bqwrVar.e(3);
                    bqwrVar.c(1);
                    final bqwq bqwqVar = new bqwq(bqwrVar);
                    final dtve b2 = bqws.b();
                    ((Boolean) b2.q(new emyl() { // from class: bqve
                        @Override // defpackage.emyl
                        public final Object get() {
                            String[] strArr2 = bqws.a;
                            bqwp bqwpVar = new bqwp();
                            ContentValues contentValues = bqwpVar.a;
                            bqvj bqvjVar = bqvj.this;
                            contentValues.put("key_index", Integer.valueOf(bqvjVar.k()));
                            bqwpVar.a.put("encryption_key", bqvjVar.q());
                            bqwpVar.a.put("key_type", Integer.valueOf(bqvjVar.l()));
                            bqwpVar.c(bqvjVar.n());
                            bqwpVar.d(bqvjVar.o());
                            bqwpVar.al();
                            bqwpVar.af(bqwqVar);
                            bqwpVar.an(new dtui("cms", "-updateOrInsert-update"));
                            if (bqwpVar.a().e() != 0) {
                                return true;
                            }
                            final dtve dtveVar = b2;
                            return Boolean.valueOf(dtub.b(bqws.b(), "cms", bqvjVar, new Function() { // from class: bqvh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dtve.this.R("cms", (ContentValues) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: bqvi
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }) != -1);
                        }
                    })).booleanValue();
                    f.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        bArr.getClass();
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        mac.update(eyeeVar.I());
        byte[] doFinal = mac.doFinal();
        Arrays.fill(bArr, (byte) 0);
        return eyee.x(doFinal);
    }

    public final String a(eyee eyeeVar) {
        if (((Boolean) a.e()).booleanValue()) {
            try {
                return e(eyeeVar).E();
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new crvw("Unable to generate participant hash", e);
            }
        }
        int i = eodh.a;
        return eoeg.e.j(eodf.a.b(eyeeVar.I()).e());
    }

    public final String b(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return a(eyee.A("cms:self_participant"));
        }
        str.getClass();
        return a(eyee.A(str));
    }

    public final String c(String str) {
        try {
            return eoeg.e.j(e(eyee.A(str)).I());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new crvw("Unable to generate rcs message Cms ID", e);
        }
    }

    public final byte[] d(fcek fcekVar) {
        byte[] bArr = (byte[]) this.d.c("CmsEncryptionUtility#getCmsBackupKey", new emyl() { // from class: crzc
            @Override // defpackage.emyl
            public final Object get() {
                List d = ((cryg) crzd.this.b.b()).d(2);
                if (d.isEmpty()) {
                    return null;
                }
                return ((bqvj) d.get(0)).q();
            }
        });
        if (bArr == null) {
            throw new InvalidKeyException("Key is null");
        }
        eyee t = ((cgzv) this.c.b()).t(eyee.x(bArr), fcekVar);
        if (t != null) {
            return t.I();
        }
        throw new GeneralSecurityException("Encrypted data is null");
    }
}
