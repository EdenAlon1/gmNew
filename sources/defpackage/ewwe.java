package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewwe extends exas {
    public String a;
    private ParcelFileDescriptor b;
    private ParcelFileDescriptor c;
    private ParcelFileDescriptor d;
    private ParcelFileDescriptor e;

    @Override // defpackage.exas
    public final exat a() {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        String str = this.a;
        if (str != null && (parcelFileDescriptor = this.b) != null && (parcelFileDescriptor2 = this.c) != null) {
            return new ewwf(str, parcelFileDescriptor, parcelFileDescriptor2, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sliceId");
        }
        if (this.b == null) {
            sb.append(" namesTable");
        }
        if (this.c == null) {
            sb.append(" metadataTable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.exas
    public final void b(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            throw new NullPointerException("Null metadataTable");
        }
        this.c = parcelFileDescriptor;
    }

    @Override // defpackage.exas
    public final void c(ParcelFileDescriptor parcelFileDescriptor) {
        this.d = parcelFileDescriptor;
    }

    @Override // defpackage.exas
    public final void d(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            throw new NullPointerException("Null namesTable");
        }
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.exas
    public final void e(ParcelFileDescriptor parcelFileDescriptor) {
        this.e = parcelFileDescriptor;
    }

    @Override // defpackage.exas
    public final void f() {
        if (this.c == null) {
            throw new IllegalStateException("Property \"metadataTable\" has not been set");
        }
    }

    @Override // defpackage.exas
    public final void g() {
        if (this.b == null) {
            throw new IllegalStateException("Property \"namesTable\" has not been set");
        }
    }

    @Override // defpackage.exas
    public final void h() {
        if (this.a == null) {
            throw new IllegalStateException("Property \"sliceId\" has not been set");
        }
    }
}
