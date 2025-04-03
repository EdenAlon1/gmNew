package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snw {
    public final bbhs a;
    public final entd b;
    private final Context c;
    private final String d;

    public snw(Context context, bbhs bbhsVar) {
        context.getClass();
        bbhsVar.getClass();
        this.c = context;
        this.a = bbhsVar;
        this.b = entd.c("BugleBackup");
        this.d = "com.android.providers.telephony";
    }

    public static final boolean c(Long l) {
        bwdf c = PartsTable.c();
        c.z("queryMinAttachmentId");
        c.h(new Function() { // from class: snv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                bwdmVar.getClass();
                bwdmVar.x();
                bwdmVar.z(Uri.parse(""));
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return l != null && l.longValue() == c.b().l(PartsTable.d.a);
    }

    public final ParcelFileDescriptor a(Uri uri, String str, eepm eepmVar) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = eepn.a(this.c, uri, "r", eepmVar).getParcelFileDescriptor();
            parcelFileDescriptor.getClass();
            return parcelFileDescriptor;
        } catch (FileNotFoundException e) {
            ensz enszVar = (ensz) this.b.j();
            enszVar.Y(csux.s, str);
            enszVar.Y(csux.X, uri);
            ((ensz) enszVar.g(e)).q("File not found when opening uri file descriptor");
            throw new sqq("File not found when opening uri file descriptor", e);
        }
    }

    public final eepm b(Uri uri) {
        String authority = uri.getAuthority();
        if (authority != null && ffpc.t(authority, "mms")) {
            return eepm.a(this.d);
        }
        eepm eepmVar = eepm.c;
        eepmVar.getClass();
        return eepmVar;
    }
}
