package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.IMobStoreFileService;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhfb implements efef {
    public final emyl a;
    private final efcu b;

    public dhfb(Context context) {
        efcu efcuVar = new efcu();
        Context applicationContext = context.getApplicationContext();
        int i = dhfd.b;
        this.a = new emyr(new dhfl(applicationContext));
        this.b = efcuVar;
    }

    private final ParcelFileDescriptor p(final Uri uri, final int i) {
        return (ParcelFileDescriptor) q("open file", new Callable() { // from class: dhex
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhfl dhflVar = (dhfl) ((emyr) dhfb.this.a).a;
                Uri uri2 = uri;
                int i2 = i;
                final OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri2, i2);
                dfun dfunVar = new dfun();
                dfunVar.a = new dfuf() { // from class: dhfg
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        dhfp dhfpVar = (dhfp) obj;
                        dhri dhriVar = (dhri) obj2;
                        dhfh dhfhVar = new dhfh(dhriVar);
                        OpenFileDescriptorRequest openFileDescriptorRequest2 = OpenFileDescriptorRequest.this;
                        try {
                            IMobStoreFileService iMobStoreFileService = (IMobStoreFileService) dhfpVar.w();
                            Context context = dhfpVar.c;
                            iMobStoreFileService.openFileDescriptor(dhfhVar, openFileDescriptorRequest2, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                        } catch (RemoteException unused) {
                            dfup.b(Status.c, null, dhriVar);
                        }
                    }
                };
                dfunVar.b = i2 == 1 ? new Feature[]{dgox.f} : null;
                dfunVar.c = 7801;
                return ((OpenFileDescriptorResponse) dhrt.f(dhflVar.i(dfunVar.a()))).a;
            }
        });
    }

    private static final Object q(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof dfqu) {
                dfqu dfquVar = (dfqu) cause;
                String str2 = dfquVar.a.g;
                if (dfquVar.a() == 33500) {
                    throw new FileNotFoundException(a.m(str2, str, "Unable to ", " because "));
                }
                if (dfquVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new FileNotFoundException(a.m(str2, str, "Unable to ", " because "));
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.efef
    public final /* synthetic */ long a(Uri uri) {
        return efee.e(this);
    }

    @Override // defpackage.efef
    public final Pair b(Uri uri) {
        return efca.a(p(uri, 0));
    }

    @Override // defpackage.efef
    public final efcu c() {
        return this.b;
    }

    @Override // defpackage.efef
    public final /* synthetic */ File d(Uri uri) {
        return efee.a(this, uri);
    }

    @Override // defpackage.efef
    public final InputStream e(Uri uri) {
        return new dhez(p(uri, 0));
    }

    @Override // defpackage.efef
    public final /* synthetic */ OutputStream f(Uri uri) {
        return efee.f(this);
    }

    @Override // defpackage.efef
    public final OutputStream g(Uri uri) {
        return new dhfa(p(uri, 1));
    }

    @Override // defpackage.efef
    public final /* synthetic */ Iterable h(Uri uri) {
        return efee.b(this);
    }

    @Override // defpackage.efef
    public final String i() {
        return "android";
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
    public final void l(final Uri uri) {
        q("delete file", new Callable() { // from class: dhey
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhfl dhflVar = (dhfl) ((emyr) dhfb.this.a).a;
                final DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri);
                dfun dfunVar = new dfun();
                dfunVar.a = new dfuf() { // from class: dhff
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        dhfp dhfpVar = (dhfp) obj;
                        dhri dhriVar = (dhri) obj2;
                        dhfi dhfiVar = new dhfi(dhriVar);
                        DeleteFileRequest deleteFileRequest2 = DeleteFileRequest.this;
                        try {
                            IMobStoreFileService iMobStoreFileService = (IMobStoreFileService) dhfpVar.w();
                            Context context = dhfpVar.c;
                            iMobStoreFileService.deleteFile(dhfiVar, deleteFileRequest2, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                        } catch (RemoteException unused) {
                            dfup.b(Status.c, null, dhriVar);
                        }
                    }
                };
                dfunVar.b = new Feature[]{dgox.f};
                dfunVar.c = 7802;
                return (Void) dhrt.f(dhflVar.i(dfunVar.a()));
            }
        });
    }

    @Override // defpackage.efef
    public final void m(final Uri uri, final Uri uri2) {
        q("rename file", new Callable() { // from class: dhew
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhfl dhflVar = (dhfl) ((emyr) dhfb.this.a).a;
                final RenameRequest renameRequest = new RenameRequest(uri, uri2);
                dfun dfunVar = new dfun();
                dfunVar.a = new dfuf() { // from class: dhfe
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        dhfp dhfpVar = (dhfp) obj;
                        dhri dhriVar = (dhri) obj2;
                        dhfj dhfjVar = new dhfj(dhriVar);
                        RenameRequest renameRequest2 = RenameRequest.this;
                        try {
                            IMobStoreFileService iMobStoreFileService = (IMobStoreFileService) dhfpVar.w();
                            Context context = dhfpVar.c;
                            iMobStoreFileService.rename(dhfjVar, renameRequest2, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                        } catch (RemoteException unused) {
                            dfup.b(Status.c, null, dhriVar);
                        }
                    }
                };
                dfunVar.b = new Feature[]{dgox.g};
                dfunVar.b();
                dfunVar.c = 7803;
                return (Void) dhrt.f(dhflVar.i(dfunVar.a()));
            }
        });
    }

    @Override // defpackage.efef
    public final boolean n(Uri uri) {
        try {
            ParcelFileDescriptor p = p(uri, 0);
            if (p == null) {
                return true;
            }
            p.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.efef
    public final /* synthetic */ boolean o(Uri uri) {
        throw new efcy("isDirectory not supported by android");
    }
}
