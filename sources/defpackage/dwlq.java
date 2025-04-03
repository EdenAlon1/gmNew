package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlq extends ffhv implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ String d;
    final /* synthetic */ CancellationSignal e;
    final /* synthetic */ jrk f;
    final /* synthetic */ ffuf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwlq(boolean z, Context context, ContentResolver contentResolver, String str, CancellationSignal cancellationSignal, jrk jrkVar, ffuf ffufVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = z;
        this.b = context;
        this.c = contentResolver;
        this.d = str;
        this.e = cancellationSignal;
        this.f = jrkVar;
        this.g = ffufVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwlq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Typeface createFromFile;
        Typeface.CustomFallbackBuilder style;
        Typeface.CustomFallbackBuilder addCustomFallback;
        Typeface build;
        ffci.b(obj);
        try {
            int i = 1;
            if (this.a) {
                dwls dwlsVar = dwls.a;
                Context context = this.b;
                dwlg a = dwlf.a(this.c, "name=Google Sans Flex&weight=400", this.d, this.e);
                dwlg a2 = dwlf.a(this.c, ((dwlm) this.f).h, this.d, this.e);
                dwlm dwlmVar = (dwlm) this.f;
                CancellationSignal cancellationSignal = this.e;
                FontFamily.Builder a3 = dwlt.a(context, a, dwlmVar, cancellationSignal);
                FontFamily build2 = a3 != null ? a3.build() : null;
                FontFamily.Builder a4 = dwlt.a(context, a2, dwlmVar, cancellationSignal);
                FontFamily build3 = a4 != null ? a4.build() : null;
                build2.getClass();
                Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                int i2 = dwlmVar.d.i;
                int i3 = dwlmVar.e;
                style = customFallbackBuilder.setStyle(new FontStyle(i2, jss.b(0, 1) ? 1 : 0));
                build3.getClass();
                addCustomFallback = style.addCustomFallback(build3);
                build = addCustomFallback.build();
                dwls.b.setTypeface(build);
                dwls.b.setFontVariationSettings(dwll.a(this.f.b, this.b));
                createFromFile = dwls.b.getTypeface();
            } else {
                dwls dwlsVar2 = dwls.a;
                Context context2 = this.b;
                dwlg a5 = dwlf.a(this.c, ((dwlm) this.f).h, this.d, this.e);
                dwlm dwlmVar2 = (dwlm) this.f;
                ParcelFileDescriptor parcelFileDescriptor = eepn.e(context2, a5.a, this.e, ffkj.e(context2.getPackageName(), "com.google.android.gms") ? eepm.c : eepm.a("com.google.android.gms")).getParcelFileDescriptor();
                try {
                    if (parcelFileDescriptor == null) {
                        throw new IllegalStateException("Unable to open file");
                    }
                    File c = dwls.c(parcelFileDescriptor);
                    if (c != null && c.canRead()) {
                        Typeface createFromFile2 = Typeface.createFromFile(c);
                        int i4 = dwlmVar2.e;
                        boolean b = jss.b(0, 1);
                        Object[] objArr = dwlmVar2.d.compareTo(jsy.h) >= 0;
                        if (b) {
                            if (objArr == true) {
                                i = 3;
                                createFromFile = Typeface.create(createFromFile2, i);
                                ffig.a(parcelFileDescriptor, null);
                            } else {
                                objArr = false;
                            }
                        }
                        if (b) {
                            i = 2;
                        } else if (objArr == false) {
                            i = 0;
                        }
                        createFromFile = Typeface.create(createFromFile2, i);
                        ffig.a(parcelFileDescriptor, null);
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                    try {
                        context2.getClass();
                        File a6 = kqi.a(context2);
                        if (a6 != null) {
                            try {
                                if (kqi.c(a6, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(a6.getPath());
                                    ffig.a(fileInputStream, null);
                                    ffig.a(parcelFileDescriptor, null);
                                } else {
                                    a6.delete();
                                }
                            } finally {
                                a6.delete();
                            }
                        }
                        createFromFile = null;
                        ffig.a(fileInputStream, null);
                        ffig.a(parcelFileDescriptor, null);
                    } finally {
                    }
                } finally {
                }
            }
            return createFromFile;
        } finally {
            this.g.t(null);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dwlq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
