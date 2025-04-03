package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fhi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgx(fhi fhiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fhiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        jlm jlmVar;
        CharSequence text;
        CharSequence charSequence;
        byte b;
        byte b2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        byte b3 = 1;
        ffci.b(obj);
        if (i == 0) {
            iyj iyjVar = this.b.s;
            if (iyjVar != null) {
                this.a = 1;
                a = iyjVar.a();
                if (a == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        a = obj;
        jcq jcqVar = (jcq) a;
        if (jcqVar != null) {
            ClipData clipData = jcqVar.a;
            byte b4 = 0;
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                jlmVar = null;
            } else if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                int B = ffdo.B(annotationArr);
                byte b5 = 4;
                if (B >= 0) {
                    int i2 = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i2];
                        if (ffkj.e(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            Parcel obtain = Parcel.obtain();
                            byte[] decode = Base64.decode(value, b4);
                            obtain.unmarshall(decode, b4, decode.length);
                            obtain.setDataPosition(b4);
                            long j = ibw.h;
                            long j2 = kak.a;
                            long j3 = j2;
                            long j4 = ibw.h;
                            jsy jsyVar = null;
                            jss jssVar = null;
                            jst jstVar = null;
                            String str = null;
                            jxv jxvVar = null;
                            jys jysVar = null;
                            jyk jykVar = null;
                            idg idgVar = null;
                            while (obtain.dataAvail() > b3) {
                                byte readByte = obtain.readByte();
                                if (readByte != b3) {
                                    b = b4;
                                    byte b6 = 2;
                                    if (readByte == 2) {
                                        if (obtain.dataAvail() < 5) {
                                            charSequence = text;
                                            break;
                                        }
                                        j2 = dwt.a(obtain);
                                        b4 = b;
                                    } else if (readByte == 3) {
                                        if (obtain.dataAvail() < b5) {
                                            charSequence = text;
                                            break;
                                        }
                                        jsyVar = new jsy(obtain.readInt());
                                        b4 = b;
                                    } else if (readByte == b5) {
                                        if (obtain.dataAvail() <= 0) {
                                            charSequence = text;
                                            break;
                                        }
                                        byte readByte2 = obtain.readByte();
                                        jss jssVar2 = new jss((readByte2 != 0 && readByte2 == b3) ? b3 : b);
                                        b4 = b;
                                        jssVar = jssVar2;
                                    } else if (readByte != 5) {
                                        if (readByte == 6) {
                                            str = obtain.readString();
                                        } else if (readByte == 7) {
                                            if (obtain.dataAvail() < 5) {
                                                charSequence = text;
                                                break;
                                            }
                                            j3 = dwt.a(obtain);
                                        } else if (readByte == 8) {
                                            if (obtain.dataAvail() < b5) {
                                                charSequence = text;
                                                break;
                                            }
                                            b4 = b;
                                            jxvVar = new jxv(obtain.readFloat());
                                        } else if (readByte == 9) {
                                            if (obtain.dataAvail() < 8) {
                                                charSequence = text;
                                                break;
                                            }
                                            jysVar = new jys(obtain.readFloat(), obtain.readFloat());
                                        } else if (readByte == 10) {
                                            if (obtain.dataAvail() < 8) {
                                                charSequence = text;
                                                break;
                                            }
                                            j4 = obtain.readLong();
                                        } else if (readByte != 11) {
                                            b2 = b3;
                                            if (readByte == 12) {
                                                if (obtain.dataAvail() < 20) {
                                                    charSequence = text;
                                                    break;
                                                }
                                                b4 = b;
                                                text = text;
                                                b3 = b2;
                                                idgVar = new idg(obtain.readLong(), (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L), obtain.readFloat());
                                                b5 = 4;
                                            }
                                            b4 = b;
                                            b3 = b2;
                                            b5 = 4;
                                        } else {
                                            if (obtain.dataAvail() < b5) {
                                                b2 = b3;
                                                charSequence = text;
                                                break;
                                            }
                                            int readInt = obtain.readInt();
                                            jyk jykVar2 = jyk.c;
                                            int i3 = jykVar2.d & readInt;
                                            b2 = b3;
                                            jyk jykVar3 = jyk.b;
                                            int i4 = readInt & jykVar3.d;
                                            byte b7 = i3 != 0 ? b2 : b;
                                            byte b8 = i4 != 0 ? b2 : b;
                                            if (b7 != 0 && b8 != 0) {
                                                jyk[] jykVarArr = new jyk[2];
                                                jykVarArr[b] = jykVar2;
                                                jykVarArr[b2] = jykVar3;
                                                List g = ffdx.g(jykVarArr);
                                                Integer valueOf = Integer.valueOf(b);
                                                int size = g.size();
                                                for (int i5 = b; i5 < size; i5++) {
                                                    valueOf = Integer.valueOf(valueOf.intValue() | ((jyk) g.get(i5)).d);
                                                }
                                                jykVar3 = new jyk(valueOf.intValue());
                                            } else if (b7 != 0) {
                                                b4 = b;
                                                jykVar = jykVar2;
                                                b3 = b2;
                                                b5 = 4;
                                            } else if (b8 == 0) {
                                                jykVar = jyk.a;
                                                b4 = b;
                                                b3 = b2;
                                                b5 = 4;
                                            }
                                            b4 = b;
                                            jykVar = jykVar3;
                                            b3 = b2;
                                            b5 = 4;
                                        }
                                        b4 = b;
                                    } else {
                                        if (obtain.dataAvail() <= 0) {
                                            charSequence = text;
                                            break;
                                        }
                                        byte readByte3 = obtain.readByte();
                                        if (readByte3 != 0) {
                                            if (readByte3 == b3) {
                                                b6 = 65535;
                                            } else if (readByte3 != 3) {
                                                if (readByte3 == 2) {
                                                    b6 = b3;
                                                }
                                            }
                                            jstVar = new jst(b6);
                                            b4 = b;
                                        }
                                        b6 = b;
                                        jstVar = new jst(b6);
                                        b4 = b;
                                    }
                                } else {
                                    if (obtain.dataAvail() < 8) {
                                        break;
                                    }
                                    j = obtain.readLong();
                                }
                            }
                            charSequence = text;
                            b = b4;
                            b2 = b3;
                            arrayList.add(new jlk(new jou(j, j2, jsyVar, jssVar, jstVar, null, str, j3, jxvVar, jysVar, null, j4, jykVar, idgVar, 49152), spanStart, spanEnd));
                        } else {
                            charSequence = text;
                            b = b4;
                            b2 = b3;
                        }
                        if (i2 == B) {
                            break;
                        }
                        i2++;
                        b4 = b;
                        text = charSequence;
                        b3 = b2;
                        b5 = 4;
                    }
                } else {
                    charSequence = text;
                }
                jlmVar = new jlm(charSequence.toString(), arrayList, 4);
            } else {
                jlmVar = new jlm(text.toString());
            }
            if (jlmVar != null) {
                fhi fhiVar = this.b;
                jlm b9 = jvv.c(fhiVar.f(), fhiVar.f().a().length()).b(jlmVar);
                fhi fhiVar2 = this.b;
                jlm b10 = b9.b(jvv.b(fhiVar2.f(), fhiVar2.f().a().length()));
                int d = jpm.d(this.b.f().c) + jlmVar.a();
                this.b.c.invoke(new jvu(b10, jpn.a(d, d)));
                this.b.p(eug.a);
                eyo eyoVar = this.b.a;
                if (eyoVar != null) {
                    eyoVar.a();
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgx(this.b, ffguVar);
    }
}
