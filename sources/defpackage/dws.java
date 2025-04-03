package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dws {
    public static final jcq a(jlm jlmVar) {
        CharSequence charSequence;
        if (jlmVar == null) {
            return null;
        }
        if (jlmVar.d().isEmpty()) {
            charSequence = jlmVar.b;
        } else {
            SpannableString spannableString = new SpannableString(jlmVar.b);
            Parcel obtain = Parcel.obtain();
            List d = jlmVar.d();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                jlk jlkVar = (jlk) d.get(i);
                jou jouVar = (jou) jlkVar.a;
                int i2 = jlkVar.b;
                int i3 = jlkVar.c;
                obtain.recycle();
                obtain = Parcel.obtain();
                byte b = 1;
                if (!ffcp.a(jouVar.b(), ibw.h)) {
                    obtain.writeByte((byte) 1);
                    obtain.writeLong(jouVar.b());
                }
                if (!kak.e(jouVar.b, kak.a)) {
                    obtain.writeByte((byte) 2);
                    dwu.a(jouVar.b, obtain);
                }
                jsy jsyVar = jouVar.c;
                if (jsyVar != null) {
                    obtain.writeByte((byte) 3);
                    obtain.writeInt(jsyVar.i);
                }
                jss jssVar = jouVar.d;
                if (jssVar != null) {
                    obtain.writeByte((byte) 4);
                    int i4 = jssVar.a;
                    obtain.writeByte((!jss.b(i4, 0) && jss.b(i4, 1)) ? (byte) 1 : (byte) 0);
                }
                jst jstVar = jouVar.e;
                if (jstVar != null) {
                    obtain.writeByte((byte) 5);
                    int i5 = jstVar.a;
                    if (!jst.b(i5, 0)) {
                        if (!jst.b(i5, 65535)) {
                            if (jst.b(i5, 1)) {
                                b = 2;
                            } else if (jst.b(i5, 2)) {
                                b = 3;
                            }
                        }
                        obtain.writeByte(b);
                    }
                    b = 0;
                    obtain.writeByte(b);
                }
                String str = jouVar.g;
                if (str != null) {
                    obtain.writeByte((byte) 6);
                    obtain.writeString(str);
                }
                if (!kak.e(jouVar.h, kak.a)) {
                    obtain.writeByte((byte) 7);
                    dwu.a(jouVar.h, obtain);
                }
                jxv jxvVar = jouVar.i;
                if (jxvVar != null) {
                    obtain.writeByte((byte) 8);
                    obtain.writeFloat(jxvVar.a);
                }
                jys jysVar = jouVar.j;
                if (jysVar != null) {
                    obtain.writeByte((byte) 9);
                    obtain.writeFloat(jysVar.b);
                    obtain.writeFloat(jysVar.c);
                }
                if (!ffcp.a(jouVar.l, ibw.h)) {
                    obtain.writeByte((byte) 10);
                    obtain.writeLong(jouVar.l);
                }
                jyk jykVar = jouVar.m;
                if (jykVar != null) {
                    obtain.writeByte((byte) 11);
                    obtain.writeInt(jykVar.d);
                }
                idg idgVar = jouVar.n;
                if (idgVar != null) {
                    obtain.writeByte((byte) 12);
                    obtain.writeLong(idgVar.b);
                    obtain.writeFloat(Float.intBitsToFloat((int) (idgVar.c >> 32)));
                    obtain.writeFloat(Float.intBitsToFloat((int) (idgVar.c & 4294967295L)));
                    obtain.writeFloat(idgVar.d);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obtain.marshall(), 0)), i2, i3, 33);
            }
            charSequence = spannableString;
        }
        return new jcq(ClipData.newPlainText("plain text", charSequence));
    }

    public static final boolean b(jcq jcqVar) {
        return jcqVar.a.getDescription().hasMimeType("text/*");
    }
}
