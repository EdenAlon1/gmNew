package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dugu implements GellerStorageOperationsCallback {
    public static final enru a = enru.c("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl");
    public final Geller b;
    private final errl c;

    public dugu(Geller geller, errl errlVar) {
        this.b = geller;
        this.c = errlVar;
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback
    public final void onDeletion(final String str, final byte[] bArr) {
        ((enrr) ((enrr) a.h()).h("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "onDeletion", 34, "GellerStorageOperationsCallbackImpl.java")).q("Scheduling deletion propagation for Geller data.");
        try {
            this.c.submit(eldl.l(new Runnable() { // from class: dugt
                @Override // java.lang.Runnable
                public final void run() {
                    ((enrr) ((enrr) dugu.a.h()).h("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "performDeletionPropagation", 49, "GellerStorageOperationsCallbackImpl.java")).q("Performing deletion propagation for Geller data.");
                    String str2 = str;
                    byte[] bArr2 = bArr;
                    Geller geller = dugu.this.b;
                    try {
                        geller.nativePropagateDeletion(geller.a(), geller.c.a(str2), bArr2);
                    } catch (GellerException e) {
                        ((enrr) ((enrr) ((enrr) Geller.a.j()).g(e)).h("com/google/android/libraries/geller/portable/Geller", "propagateDeletion", (char) 1784, "Geller.java")).q("propagateDeletion call failed.");
                    }
                    GellerDatabase b = geller.c.b(str2);
                    if (b == null) {
                        ((enrr) ((enrr) Geller.a.j()).h("com/google/android/libraries/geller/portable/Geller", "propagateDeletion", 1789, "Geller.java")).q("The GellerDatabase is null, skipping setting DELETION_PROCESSED status.");
                    } else {
                        b.setDeletionProcessed(bArr2);
                    }
                }
            }));
        } catch (RejectedExecutionException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "onDeletion", '*', "GellerStorageOperationsCallbackImpl.java")).q("Failed to schedule deletion propagation task.");
        }
    }
}
