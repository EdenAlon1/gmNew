package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfiv {
    public static final evhd a;
    public static final evhg b;

    static {
        Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
        creator.getClass();
        fegm fegmVar = new fegm(creator, false);
        int i = febj.d;
        febk febkVar = new febk("pfd-keys-bin", fegmVar);
        fdyn fdynVar = fdyn.d;
        evhd evhdVar = new evhd(febkVar, new fdyk("REQ-pfd-keys-bin"), new fdyk("RESH-pfd-keys-bin"), new fdyk("REST-pfd-keys-bin"));
        a = evhdVar;
        b = new evhg(evhdVar);
    }
}
