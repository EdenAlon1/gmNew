package defpackage;

import android.app.blob.BlobHandle;
import android.app.blob.BlobStoreManager;
import android.content.Context;
import android.net.Uri;
import android.os.LimitExceededException;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbw implements efef {
    private final BlobStoreManager a;

    public efbw(Context context) {
        this.a = aeb$$ExternalSyntheticApiModelOutline0.m61m(context.getSystemService("blob_store"));
    }

    private final ParcelFileDescriptor p(Uri uri) {
        BlobHandle createWithSha256;
        ParcelFileDescriptor openBlob;
        efby.a(uri);
        createWithSha256 = BlobHandle.createWithSha256(efby.d(uri.getPath()), "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
        openBlob = this.a.openBlob(createWithSha256);
        return openBlob;
    }

    private final void q(byte[] bArr) {
        BlobHandle createWithSha256;
        createWithSha256 = BlobHandle.createWithSha256(bArr, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
        try {
            this.a.releaseLease(createWithSha256);
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            throw new IOException("Failed to release the lease", e);
        }
    }

    @Override // defpackage.efef
    public final /* synthetic */ long a(Uri uri) {
        return efee.e(this);
    }

    @Override // defpackage.efef
    public final Pair b(Uri uri) {
        return efca.a(p(uri));
    }

    @Override // defpackage.efef
    public final /* synthetic */ efcu c() {
        throw new efcy("lockScope not supported by blobstore");
    }

    @Override // defpackage.efef
    public final /* synthetic */ File d(Uri uri) {
        return efee.a(this, uri);
    }

    @Override // defpackage.efef
    public final InputStream e(Uri uri) {
        return new ParcelFileDescriptor.AutoCloseInputStream(p(uri));
    }

    @Override // defpackage.efef
    public final /* synthetic */ OutputStream f(Uri uri) {
        return efee.f(this);
    }

    @Override // defpackage.efef
    public final OutputStream g(Uri uri) {
        BlobHandle createWithSha256;
        long createSession;
        BlobStoreManager.Session openSession;
        ParcelFileDescriptor openWrite;
        long remainingLeaseQuotaBytes;
        BlobHandle createWithSha2562;
        efby.a(uri);
        byte[] d = efby.d(uri.getPath());
        try {
            if (!efby.c(uri.getPath())) {
                createWithSha256 = BlobHandle.createWithSha256(d, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
                createSession = this.a.createSession(createWithSha256);
                openSession = this.a.openSession(createSession);
                openSession.allowPublicAccess();
                openWrite = openSession.openWrite(0L, -1L);
                return new efbv(openWrite, openSession);
            }
            remainingLeaseQuotaBytes = this.a.getRemainingLeaseQuotaBytes();
            if (remainingLeaseQuotaBytes <= 0) {
                throw new efcp((byte[]) null);
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String query = uri.getQuery();
            if (TextUtils.isEmpty(query)) {
                throw new efcv(String.format("The uri query is null or empty, expected %s", "expiryDateSecs=<expiryDateSecs>"));
            }
            String queryParameter = uri.getQueryParameter("expiryDateSecs");
            if (queryParameter == null) {
                throw new efcv(String.format("The uri query is malformed, expected %s but found %s", "expiryDateSecs=<expiryDateSecs>", query));
            }
            long millis = timeUnit.toMillis(Long.parseLong(queryParameter));
            createWithSha2562 = BlobHandle.createWithSha256(d, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
            this.a.acquireLease(createWithSha2562, "String description needed for providing a better user experience", millis);
            return null;
        } catch (LimitExceededException e) {
            throw new efcp(e);
        } catch (IllegalStateException e2) {
            throw new IOException("Failed to write into BlobStoreManager", e2);
        }
    }

    @Override // defpackage.efef
    public final /* synthetic */ Iterable h(Uri uri) {
        return efee.b(this);
    }

    @Override // defpackage.efef
    public final String i() {
        return "blobstore";
    }

    @Override // defpackage.efef
    public final /* synthetic */ void j(Uri uri) {
        efee.c(this);
    }

    @Override // defpackage.efef
    public final /* synthetic */ void k(Uri uri) {
        efee.d(this);
    }

    @Override // defpackage.efef
    public final void l(Uri uri) {
        List leasedBlobs;
        byte[] sha256Digest;
        efby.a(uri);
        if (!efby.b(uri.getPath())) {
            q(efby.d(uri.getPath()));
            return;
        }
        leasedBlobs = this.a.getLeasedBlobs();
        Iterator it = leasedBlobs.iterator();
        while (it.hasNext()) {
            sha256Digest = aeb$$ExternalSyntheticApiModelOutline0.m60m(it.next()).getSha256Digest();
            q(sha256Digest);
        }
    }

    @Override // defpackage.efef
    public final /* synthetic */ void m(Uri uri, Uri uri2) {
        throw new efcy("rename not supported by blobstore");
    }

    @Override // defpackage.efef
    public final boolean n(Uri uri) {
        boolean z = false;
        try {
            ParcelFileDescriptor p = p(uri);
            if (p != null) {
                try {
                    if (p.getFileDescriptor().valid()) {
                        z = true;
                    }
                } finally {
                }
            }
            if (p != null) {
                p.close();
            }
        } catch (SecurityException unused) {
        }
        return z;
    }

    @Override // defpackage.efef
    public final boolean o(Uri uri) {
        return false;
    }
}
