package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dics extends dhzi implements dfri {
    private final dicm a;

    public dics(dicm dicmVar) {
        this.a = dicmVar;
    }

    @Override // defpackage.dhzi
    public final InputStream a() {
        dicm dicmVar = this.a;
        if (dicmVar.c) {
            throw new IllegalStateException("Cannot access the input stream after release().");
        }
        if (dicmVar.a == null) {
            return null;
        }
        if (dicmVar.b == null) {
            dicmVar.b = new ParcelFileDescriptor.AutoCloseInputStream(dicmVar.a);
        }
        return dicmVar.b;
    }

    @Override // defpackage.dfri
    public final void b() {
        this.a.b();
    }
}
