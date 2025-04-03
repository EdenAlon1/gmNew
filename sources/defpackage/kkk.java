package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkk {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = kko.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void l(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkk.l(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void m(kjz kjzVar, String str) {
        int i;
        int i2 = -1;
        float f = Float.NaN;
        if (str != null) {
            int indexOf = str.indexOf(44);
            int length = str.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                i = -1;
            } else {
                String substring = str.substring(0, indexOf);
                r5 = indexOf + 1;
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(r5);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
                i2 = i;
            } else {
                String substring3 = str.substring(r5, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                i2 = i;
            }
            i2 = i;
        }
        kjzVar.I = str;
        kjzVar.J = f;
        kjzVar.K = i2;
    }

    private static void o(kkf kkfVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        kke kkeVar = new kke();
        kkfVar.g = kkeVar;
        kkfVar.c.b = false;
        kkfVar.d.c = false;
        kkfVar.b.a = false;
        kkfVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (d.get(index)) {
                case 2:
                    kkeVar.b(2, typedArray.getDimensionPixelSize(index, kkfVar.d.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", a.e(index, "Unknown attribute 0x", c));
                    break;
                case 5:
                    kkeVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    kkeVar.b(6, typedArray.getDimensionPixelOffset(index, kkfVar.d.E));
                    break;
                case 7:
                    kkeVar.b(7, typedArray.getDimensionPixelOffset(index, kkfVar.d.F));
                    break;
                case 8:
                    kkeVar.b(8, typedArray.getDimensionPixelSize(index, kkfVar.d.L));
                    break;
                case 11:
                    kkeVar.b(11, typedArray.getDimensionPixelSize(index, kkfVar.d.R));
                    break;
                case 12:
                    kkeVar.b(12, typedArray.getDimensionPixelSize(index, kkfVar.d.S));
                    break;
                case 13:
                    kkeVar.b(13, typedArray.getDimensionPixelSize(index, kkfVar.d.O));
                    break;
                case 14:
                    kkeVar.b(14, typedArray.getDimensionPixelSize(index, kkfVar.d.Q));
                    break;
                case 15:
                    kkeVar.b(15, typedArray.getDimensionPixelSize(index, kkfVar.d.T));
                    break;
                case 16:
                    kkeVar.b(16, typedArray.getDimensionPixelSize(index, kkfVar.d.P));
                    break;
                case 17:
                    kkeVar.b(17, typedArray.getDimensionPixelOffset(index, kkfVar.d.f));
                    break;
                case 18:
                    kkeVar.b(18, typedArray.getDimensionPixelOffset(index, kkfVar.d.g));
                    break;
                case 19:
                    kkeVar.a(19, typedArray.getFloat(index, kkfVar.d.h));
                    break;
                case 20:
                    kkeVar.a(20, typedArray.getFloat(index, kkfVar.d.y));
                    break;
                case 21:
                    kkeVar.b(21, typedArray.getLayoutDimension(index, kkfVar.d.e));
                    break;
                case 22:
                    kkeVar.b(22, a[typedArray.getInt(index, kkfVar.b.b)]);
                    break;
                case 23:
                    kkeVar.b(23, typedArray.getLayoutDimension(index, kkfVar.d.d));
                    break;
                case 24:
                    kkeVar.b(24, typedArray.getDimensionPixelSize(index, kkfVar.d.H));
                    break;
                case 27:
                    kkeVar.b(27, typedArray.getInt(index, kkfVar.d.G));
                    break;
                case 28:
                    kkeVar.b(28, typedArray.getDimensionPixelSize(index, kkfVar.d.I));
                    break;
                case 31:
                    kkeVar.b(31, typedArray.getDimensionPixelSize(index, kkfVar.d.M));
                    break;
                case 34:
                    kkeVar.b(34, typedArray.getDimensionPixelSize(index, kkfVar.d.J));
                    break;
                case 37:
                    kkeVar.a(37, typedArray.getFloat(index, kkfVar.d.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, kkfVar.a);
                    kkfVar.a = resourceId;
                    kkeVar.b(38, resourceId);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    kkeVar.a(39, typedArray.getFloat(index, kkfVar.d.W));
                    break;
                case 40:
                    kkeVar.a(40, typedArray.getFloat(index, kkfVar.d.V));
                    break;
                case 41:
                    kkeVar.b(41, typedArray.getInt(index, kkfVar.d.X));
                    break;
                case 42:
                    kkeVar.b(42, typedArray.getInt(index, kkfVar.d.Y));
                    break;
                case 43:
                    kkeVar.a(43, typedArray.getFloat(index, kkfVar.b.d));
                    break;
                case 44:
                    kkeVar.d(44, true);
                    kkeVar.a(44, typedArray.getDimension(index, kkfVar.e.o));
                    break;
                case 45:
                    kkeVar.a(45, typedArray.getFloat(index, kkfVar.e.d));
                    break;
                case 46:
                    kkeVar.a(46, typedArray.getFloat(index, kkfVar.e.e));
                    break;
                case 47:
                    kkeVar.a(47, typedArray.getFloat(index, kkfVar.e.f));
                    break;
                case 48:
                    kkeVar.a(48, typedArray.getFloat(index, kkfVar.e.g));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    kkeVar.a(49, typedArray.getDimension(index, kkfVar.e.h));
                    break;
                case 50:
                    kkeVar.a(50, typedArray.getDimension(index, kkfVar.e.i));
                    break;
                case 51:
                    kkeVar.a(51, typedArray.getDimension(index, kkfVar.e.k));
                    break;
                case 52:
                    kkeVar.a(52, typedArray.getDimension(index, kkfVar.e.l));
                    break;
                case 53:
                    kkeVar.a(53, typedArray.getDimension(index, kkfVar.e.m));
                    break;
                case 54:
                    kkeVar.b(54, typedArray.getInt(index, kkfVar.d.Z));
                    break;
                case 55:
                    kkeVar.b(55, typedArray.getInt(index, kkfVar.d.aa));
                    break;
                case 56:
                    kkeVar.b(56, typedArray.getDimensionPixelSize(index, kkfVar.d.ab));
                    break;
                case 57:
                    kkeVar.b(57, typedArray.getDimensionPixelSize(index, kkfVar.d.ac));
                    break;
                case 58:
                    kkeVar.b(58, typedArray.getDimensionPixelSize(index, kkfVar.d.ad));
                    break;
                case 59:
                    kkeVar.b(59, typedArray.getDimensionPixelSize(index, kkfVar.d.ae));
                    break;
                case 60:
                    kkeVar.a(60, typedArray.getFloat(index, kkfVar.e.c));
                    break;
                case 62:
                    kkeVar.b(62, typedArray.getDimensionPixelSize(index, kkfVar.d.C));
                    break;
                case 63:
                    kkeVar.a(63, typedArray.getFloat(index, kkfVar.d.D));
                    break;
                case 64:
                    kkeVar.b(64, a(typedArray, index, kkfVar.c.c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        kkeVar.c(65, typedArray.getString(index));
                        break;
                    } else {
                        kkeVar.c(65, khg.a[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    kkeVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    kkeVar.a(67, typedArray.getFloat(index, kkfVar.c.j));
                    break;
                case 68:
                    kkeVar.a(68, typedArray.getFloat(index, kkfVar.b.e));
                    break;
                case 69:
                    kkeVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    kkeVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    kkeVar.b(72, typedArray.getInt(index, kkfVar.d.ah));
                    break;
                case 73:
                    kkeVar.b(73, typedArray.getDimensionPixelSize(index, kkfVar.d.ai));
                    break;
                case 74:
                    kkeVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    kkeVar.d(75, typedArray.getBoolean(index, kkfVar.d.ap));
                    break;
                case 76:
                    kkeVar.b(76, typedArray.getInt(index, kkfVar.c.f));
                    break;
                case 77:
                    kkeVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    kkeVar.b(78, typedArray.getInt(index, kkfVar.b.c));
                    break;
                case 79:
                    kkeVar.a(79, typedArray.getFloat(index, kkfVar.c.h));
                    break;
                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                    kkeVar.d(80, typedArray.getBoolean(index, kkfVar.d.an));
                    break;
                case 81:
                    kkeVar.d(81, typedArray.getBoolean(index, kkfVar.d.ao));
                    break;
                case 82:
                    kkeVar.b(82, typedArray.getInteger(index, kkfVar.c.d));
                    break;
                case 83:
                    kkeVar.b(83, a(typedArray, index, kkfVar.e.j));
                    break;
                case 84:
                    kkeVar.b(84, typedArray.getInteger(index, kkfVar.c.l));
                    break;
                case 85:
                    kkeVar.a(85, typedArray.getFloat(index, kkfVar.c.k));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        kkfVar.c.o = typedArray.getResourceId(index, -1);
                        kkeVar.b(89, kkfVar.c.o);
                        kkh kkhVar = kkfVar.c;
                        if (kkhVar.o != -1) {
                            kkhVar.n = -2;
                            kkeVar.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        kkfVar.c.m = typedArray.getString(index);
                        kkeVar.c(90, kkfVar.c.m);
                        if (kkfVar.c.m.indexOf("/") > 0) {
                            kkfVar.c.o = typedArray.getResourceId(index, -1);
                            kkeVar.b(89, kkfVar.c.o);
                            kkfVar.c.n = -2;
                            kkeVar.b(88, -2);
                            break;
                        } else {
                            kkfVar.c.n = -1;
                            kkeVar.b(88, -1);
                            break;
                        }
                    } else {
                        kkh kkhVar2 = kkfVar.c;
                        kkhVar2.n = typedArray.getInteger(index, kkhVar2.o);
                        kkeVar.b(88, kkfVar.c.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", a.e(index, "unused attribute 0x", c));
                    break;
                case 93:
                    kkeVar.b(93, typedArray.getDimensionPixelSize(index, kkfVar.d.N));
                    break;
                case 94:
                    kkeVar.b(94, typedArray.getDimensionPixelSize(index, kkfVar.d.U));
                    break;
                case 95:
                    l(kkeVar, typedArray, index, 0);
                    break;
                case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                    l(kkeVar, typedArray, index, 1);
                    break;
                case 97:
                    kkeVar.b(97, typedArray.getInt(index, kkfVar.d.aq));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        kkfVar.a = typedArray.getResourceId(index, kkfVar.a);
                        break;
                    }
                case 99:
                    kkeVar.d(99, typedArray.getBoolean(index, kkfVar.d.i));
                    break;
            }
        }
    }

    private static final int[] p(View view, String str) {
        int length;
        int i;
        Object d2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = split.length;
            if (i2 >= length) {
                break;
            }
            String trim = split[i2].trim();
            try {
                i = kkn.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0) {
                i = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (d2 = ((ConstraintLayout) view.getParent()).d(trim)) != null && (d2 instanceof Integer)) ? ((Integer) d2).intValue() : 0;
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private static final kkf q(Context context, AttributeSet attributeSet, boolean z) {
        kkf kkfVar = new kkf();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? kko.c : kko.a);
        if (z) {
            o(kkfVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    kkfVar.c.b = true;
                    kkfVar.d.c = true;
                    kkfVar.b.a = true;
                    kkfVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        kkg kkgVar = kkfVar.d;
                        kkgVar.r = a(obtainStyledAttributes, index, kkgVar.r);
                        break;
                    case 2:
                        kkg kkgVar2 = kkfVar.d;
                        kkgVar2.K = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar2.K);
                        break;
                    case 3:
                        kkg kkgVar3 = kkfVar.d;
                        kkgVar3.q = a(obtainStyledAttributes, index, kkgVar3.q);
                        break;
                    case 4:
                        kkg kkgVar4 = kkfVar.d;
                        kkgVar4.p = a(obtainStyledAttributes, index, kkgVar4.p);
                        break;
                    case 5:
                        kkfVar.d.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        kkg kkgVar5 = kkfVar.d;
                        kkgVar5.E = obtainStyledAttributes.getDimensionPixelOffset(index, kkgVar5.E);
                        break;
                    case 7:
                        kkg kkgVar6 = kkfVar.d;
                        kkgVar6.F = obtainStyledAttributes.getDimensionPixelOffset(index, kkgVar6.F);
                        break;
                    case 8:
                        kkg kkgVar7 = kkfVar.d;
                        kkgVar7.L = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar7.L);
                        break;
                    case 9:
                        kkg kkgVar8 = kkfVar.d;
                        kkgVar8.x = a(obtainStyledAttributes, index, kkgVar8.x);
                        break;
                    case 10:
                        kkg kkgVar9 = kkfVar.d;
                        kkgVar9.w = a(obtainStyledAttributes, index, kkgVar9.w);
                        break;
                    case 11:
                        kkg kkgVar10 = kkfVar.d;
                        kkgVar10.R = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar10.R);
                        break;
                    case 12:
                        kkg kkgVar11 = kkfVar.d;
                        kkgVar11.S = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar11.S);
                        break;
                    case 13:
                        kkg kkgVar12 = kkfVar.d;
                        kkgVar12.O = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar12.O);
                        break;
                    case 14:
                        kkg kkgVar13 = kkfVar.d;
                        kkgVar13.Q = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar13.Q);
                        break;
                    case 15:
                        kkg kkgVar14 = kkfVar.d;
                        kkgVar14.T = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar14.T);
                        break;
                    case 16:
                        kkg kkgVar15 = kkfVar.d;
                        kkgVar15.P = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar15.P);
                        break;
                    case 17:
                        kkg kkgVar16 = kkfVar.d;
                        kkgVar16.f = obtainStyledAttributes.getDimensionPixelOffset(index, kkgVar16.f);
                        break;
                    case 18:
                        kkg kkgVar17 = kkfVar.d;
                        kkgVar17.g = obtainStyledAttributes.getDimensionPixelOffset(index, kkgVar17.g);
                        break;
                    case 19:
                        kkg kkgVar18 = kkfVar.d;
                        kkgVar18.h = obtainStyledAttributes.getFloat(index, kkgVar18.h);
                        break;
                    case 20:
                        kkg kkgVar19 = kkfVar.d;
                        kkgVar19.y = obtainStyledAttributes.getFloat(index, kkgVar19.y);
                        break;
                    case 21:
                        kkg kkgVar20 = kkfVar.d;
                        kkgVar20.e = obtainStyledAttributes.getLayoutDimension(index, kkgVar20.e);
                        break;
                    case 22:
                        kki kkiVar = kkfVar.b;
                        kkiVar.b = obtainStyledAttributes.getInt(index, kkiVar.b);
                        kki kkiVar2 = kkfVar.b;
                        kkiVar2.b = a[kkiVar2.b];
                        break;
                    case 23:
                        kkg kkgVar21 = kkfVar.d;
                        kkgVar21.d = obtainStyledAttributes.getLayoutDimension(index, kkgVar21.d);
                        break;
                    case 24:
                        kkg kkgVar22 = kkfVar.d;
                        kkgVar22.H = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar22.H);
                        break;
                    case 25:
                        kkg kkgVar23 = kkfVar.d;
                        kkgVar23.j = a(obtainStyledAttributes, index, kkgVar23.j);
                        break;
                    case 26:
                        kkg kkgVar24 = kkfVar.d;
                        kkgVar24.k = a(obtainStyledAttributes, index, kkgVar24.k);
                        break;
                    case 27:
                        kkg kkgVar25 = kkfVar.d;
                        kkgVar25.G = obtainStyledAttributes.getInt(index, kkgVar25.G);
                        break;
                    case 28:
                        kkg kkgVar26 = kkfVar.d;
                        kkgVar26.I = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar26.I);
                        break;
                    case 29:
                        kkg kkgVar27 = kkfVar.d;
                        kkgVar27.l = a(obtainStyledAttributes, index, kkgVar27.l);
                        break;
                    case 30:
                        kkg kkgVar28 = kkfVar.d;
                        kkgVar28.m = a(obtainStyledAttributes, index, kkgVar28.m);
                        break;
                    case 31:
                        kkg kkgVar29 = kkfVar.d;
                        kkgVar29.M = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar29.M);
                        break;
                    case 32:
                        kkg kkgVar30 = kkfVar.d;
                        kkgVar30.u = a(obtainStyledAttributes, index, kkgVar30.u);
                        break;
                    case 33:
                        kkg kkgVar31 = kkfVar.d;
                        kkgVar31.v = a(obtainStyledAttributes, index, kkgVar31.v);
                        break;
                    case 34:
                        kkg kkgVar32 = kkfVar.d;
                        kkgVar32.J = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar32.J);
                        break;
                    case 35:
                        kkg kkgVar33 = kkfVar.d;
                        kkgVar33.o = a(obtainStyledAttributes, index, kkgVar33.o);
                        break;
                    case 36:
                        kkg kkgVar34 = kkfVar.d;
                        kkgVar34.n = a(obtainStyledAttributes, index, kkgVar34.n);
                        break;
                    case 37:
                        kkg kkgVar35 = kkfVar.d;
                        kkgVar35.z = obtainStyledAttributes.getFloat(index, kkgVar35.z);
                        break;
                    case 38:
                        kkfVar.a = obtainStyledAttributes.getResourceId(index, kkfVar.a);
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        kkg kkgVar36 = kkfVar.d;
                        kkgVar36.W = obtainStyledAttributes.getFloat(index, kkgVar36.W);
                        break;
                    case 40:
                        kkg kkgVar37 = kkfVar.d;
                        kkgVar37.V = obtainStyledAttributes.getFloat(index, kkgVar37.V);
                        break;
                    case 41:
                        kkg kkgVar38 = kkfVar.d;
                        kkgVar38.X = obtainStyledAttributes.getInt(index, kkgVar38.X);
                        break;
                    case 42:
                        kkg kkgVar39 = kkfVar.d;
                        kkgVar39.Y = obtainStyledAttributes.getInt(index, kkgVar39.Y);
                        break;
                    case 43:
                        kki kkiVar3 = kkfVar.b;
                        kkiVar3.d = obtainStyledAttributes.getFloat(index, kkiVar3.d);
                        break;
                    case 44:
                        kkj kkjVar = kkfVar.e;
                        kkjVar.n = true;
                        kkjVar.o = obtainStyledAttributes.getDimension(index, kkjVar.o);
                        break;
                    case 45:
                        kkj kkjVar2 = kkfVar.e;
                        kkjVar2.d = obtainStyledAttributes.getFloat(index, kkjVar2.d);
                        break;
                    case 46:
                        kkj kkjVar3 = kkfVar.e;
                        kkjVar3.e = obtainStyledAttributes.getFloat(index, kkjVar3.e);
                        break;
                    case 47:
                        kkj kkjVar4 = kkfVar.e;
                        kkjVar4.f = obtainStyledAttributes.getFloat(index, kkjVar4.f);
                        break;
                    case 48:
                        kkj kkjVar5 = kkfVar.e;
                        kkjVar5.g = obtainStyledAttributes.getFloat(index, kkjVar5.g);
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        kkj kkjVar6 = kkfVar.e;
                        kkjVar6.h = obtainStyledAttributes.getDimension(index, kkjVar6.h);
                        break;
                    case 50:
                        kkj kkjVar7 = kkfVar.e;
                        kkjVar7.i = obtainStyledAttributes.getDimension(index, kkjVar7.i);
                        break;
                    case 51:
                        kkj kkjVar8 = kkfVar.e;
                        kkjVar8.k = obtainStyledAttributes.getDimension(index, kkjVar8.k);
                        break;
                    case 52:
                        kkj kkjVar9 = kkfVar.e;
                        kkjVar9.l = obtainStyledAttributes.getDimension(index, kkjVar9.l);
                        break;
                    case 53:
                        kkj kkjVar10 = kkfVar.e;
                        kkjVar10.m = obtainStyledAttributes.getDimension(index, kkjVar10.m);
                        break;
                    case 54:
                        kkg kkgVar40 = kkfVar.d;
                        kkgVar40.Z = obtainStyledAttributes.getInt(index, kkgVar40.Z);
                        break;
                    case 55:
                        kkg kkgVar41 = kkfVar.d;
                        kkgVar41.aa = obtainStyledAttributes.getInt(index, kkgVar41.aa);
                        break;
                    case 56:
                        kkg kkgVar42 = kkfVar.d;
                        kkgVar42.ab = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar42.ab);
                        break;
                    case 57:
                        kkg kkgVar43 = kkfVar.d;
                        kkgVar43.ac = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar43.ac);
                        break;
                    case 58:
                        kkg kkgVar44 = kkfVar.d;
                        kkgVar44.ad = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar44.ad);
                        break;
                    case 59:
                        kkg kkgVar45 = kkfVar.d;
                        kkgVar45.ae = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar45.ae);
                        break;
                    case 60:
                        kkj kkjVar11 = kkfVar.e;
                        kkjVar11.c = obtainStyledAttributes.getFloat(index, kkjVar11.c);
                        break;
                    case 61:
                        kkg kkgVar46 = kkfVar.d;
                        kkgVar46.B = a(obtainStyledAttributes, index, kkgVar46.B);
                        break;
                    case 62:
                        kkg kkgVar47 = kkfVar.d;
                        kkgVar47.C = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar47.C);
                        break;
                    case 63:
                        kkg kkgVar48 = kkfVar.d;
                        kkgVar48.D = obtainStyledAttributes.getFloat(index, kkgVar48.D);
                        break;
                    case 64:
                        kkh kkhVar = kkfVar.c;
                        kkhVar.c = a(obtainStyledAttributes, index, kkhVar.c);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            kkfVar.c.e = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            kkfVar.c.e = khg.a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        kkfVar.c.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        kkh kkhVar2 = kkfVar.c;
                        kkhVar2.j = obtainStyledAttributes.getFloat(index, kkhVar2.j);
                        break;
                    case 68:
                        kki kkiVar4 = kkfVar.b;
                        kkiVar4.e = obtainStyledAttributes.getFloat(index, kkiVar4.e);
                        break;
                    case 69:
                        kkfVar.d.af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        kkfVar.d.ag = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        kkg kkgVar49 = kkfVar.d;
                        kkgVar49.ah = obtainStyledAttributes.getInt(index, kkgVar49.ah);
                        break;
                    case 73:
                        kkg kkgVar50 = kkfVar.d;
                        kkgVar50.ai = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar50.ai);
                        break;
                    case 74:
                        kkfVar.d.al = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        kkg kkgVar51 = kkfVar.d;
                        kkgVar51.ap = obtainStyledAttributes.getBoolean(index, kkgVar51.ap);
                        break;
                    case 76:
                        kkh kkhVar3 = kkfVar.c;
                        kkhVar3.f = obtainStyledAttributes.getInt(index, kkhVar3.f);
                        break;
                    case 77:
                        kkfVar.d.am = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        kki kkiVar5 = kkfVar.b;
                        kkiVar5.c = obtainStyledAttributes.getInt(index, kkiVar5.c);
                        break;
                    case 79:
                        kkh kkhVar4 = kkfVar.c;
                        kkhVar4.h = obtainStyledAttributes.getFloat(index, kkhVar4.h);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        kkg kkgVar52 = kkfVar.d;
                        kkgVar52.an = obtainStyledAttributes.getBoolean(index, kkgVar52.an);
                        break;
                    case 81:
                        kkg kkgVar53 = kkfVar.d;
                        kkgVar53.ao = obtainStyledAttributes.getBoolean(index, kkgVar53.ao);
                        break;
                    case 82:
                        kkh kkhVar5 = kkfVar.c;
                        kkhVar5.d = obtainStyledAttributes.getInteger(index, kkhVar5.d);
                        break;
                    case 83:
                        kkj kkjVar12 = kkfVar.e;
                        kkjVar12.j = a(obtainStyledAttributes, index, kkjVar12.j);
                        break;
                    case 84:
                        kkh kkhVar6 = kkfVar.c;
                        kkhVar6.l = obtainStyledAttributes.getInteger(index, kkhVar6.l);
                        break;
                    case 85:
                        kkh kkhVar7 = kkfVar.c;
                        kkhVar7.k = obtainStyledAttributes.getFloat(index, kkhVar7.k);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            kkfVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                            kkh kkhVar8 = kkfVar.c;
                            if (kkhVar8.o != -1) {
                                kkhVar8.n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            kkfVar.c.m = obtainStyledAttributes.getString(index);
                            if (kkfVar.c.m.indexOf("/") > 0) {
                                kkfVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                                kkfVar.c.n = -2;
                                break;
                            } else {
                                kkfVar.c.n = -1;
                                break;
                            }
                        } else {
                            kkh kkhVar9 = kkfVar.c;
                            kkhVar9.n = obtainStyledAttributes.getInteger(index, kkhVar9.o);
                            break;
                        }
                    case 87:
                        Log.w("ConstraintSet", a.e(index, "unused attribute 0x", sparseIntArray));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", a.e(index, "Unknown attribute 0x", sparseIntArray));
                        break;
                    case 91:
                        kkg kkgVar54 = kkfVar.d;
                        kkgVar54.s = a(obtainStyledAttributes, index, kkgVar54.s);
                        break;
                    case 92:
                        kkg kkgVar55 = kkfVar.d;
                        kkgVar55.t = a(obtainStyledAttributes, index, kkgVar55.t);
                        break;
                    case 93:
                        kkg kkgVar56 = kkfVar.d;
                        kkgVar56.N = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar56.N);
                        break;
                    case 94:
                        kkg kkgVar57 = kkfVar.d;
                        kkgVar57.U = obtainStyledAttributes.getDimensionPixelSize(index, kkgVar57.U);
                        break;
                    case 95:
                        l(kkfVar.d, obtainStyledAttributes, index, 0);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        l(kkfVar.d, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        kkg kkgVar58 = kkfVar.d;
                        kkgVar58.aq = obtainStyledAttributes.getInt(index, kkgVar58.aq);
                        break;
                }
            }
            kkg kkgVar59 = kkfVar.d;
            if (kkgVar59.al != null) {
                kkgVar59.ak = null;
            }
        }
        obtainStyledAttributes.recycle();
        return kkfVar;
    }

    private static final String r(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME : ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME : "baseline" : "bottom" : "top";
    }

    public final kkf b(int i) {
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.b.put(valueOf, new kkf());
        }
        return (kkf) this.b.get(valueOf);
    }

    public final void c(ConstraintLayout constraintLayout) {
        n(constraintLayout);
        constraintLayout.g = null;
        constraintLayout.requestLayout();
    }

    public final void d(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        int i3;
        int i4;
        kkk kkkVar = this;
        int childCount = constraintLayout.getChildCount();
        kkkVar.b.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            kjz kjzVar = (kjz) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap hashMap = kkkVar.b;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                kkkVar.b.put(valueOf, new kkf());
            }
            kkf kkfVar = (kkf) kkkVar.b.get(valueOf);
            if (kkfVar == null) {
                i = childCount;
                i2 = i5;
            } else {
                HashMap hashMap2 = kkkVar.e;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    kjw kjwVar = (kjw) hashMap2.get(str);
                    try {
                    } catch (IllegalAccessException e) {
                        e = e;
                        i3 = childCount;
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        i3 = childCount;
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        i3 = childCount;
                    }
                    if (str.equals("BackgroundColor")) {
                        i3 = childCount;
                        try {
                            hashMap3.put(str, new kjw(kjwVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } catch (IllegalAccessException e4) {
                            e = e4;
                            i4 = i5;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            i5 = i4;
                            childCount = i3;
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            i4 = i5;
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            i5 = i4;
                            childCount = i3;
                        } catch (InvocationTargetException e6) {
                            e = e6;
                            i4 = i5;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            i5 = i4;
                            childCount = i3;
                        }
                        childCount = i3;
                    } else {
                        i3 = childCount;
                        i4 = i5;
                        try {
                            hashMap3.put(str, new kjw(kjwVar, cls.getMethod(a.t(str, "getMap"), new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e7) {
                            e = e7;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            i5 = i4;
                            childCount = i3;
                        } catch (NoSuchMethodException e8) {
                            e = e8;
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            i5 = i4;
                            childCount = i3;
                        } catch (InvocationTargetException e9) {
                            e = e9;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            i5 = i4;
                            childCount = i3;
                        }
                        i5 = i4;
                        childCount = i3;
                    }
                }
                i = childCount;
                i2 = i5;
                kkfVar.f = hashMap3;
                kkfVar.a = id;
                int i6 = kjzVar.e;
                kkg kkgVar = kkfVar.d;
                kkgVar.j = i6;
                kkgVar.k = kjzVar.f;
                kkgVar.l = kjzVar.g;
                kkgVar.m = kjzVar.h;
                kkgVar.n = kjzVar.i;
                kkgVar.o = kjzVar.j;
                kkgVar.p = kjzVar.k;
                kkgVar.q = kjzVar.l;
                kkgVar.r = kjzVar.m;
                kkgVar.s = kjzVar.n;
                kkgVar.t = kjzVar.o;
                kkgVar.u = kjzVar.s;
                kkgVar.v = kjzVar.t;
                kkgVar.w = kjzVar.u;
                kkgVar.x = kjzVar.v;
                kkgVar.y = kjzVar.G;
                kkgVar.z = kjzVar.H;
                kkgVar.A = kjzVar.I;
                kkgVar.B = kjzVar.p;
                kkgVar.C = kjzVar.q;
                kkgVar.D = kjzVar.r;
                kkgVar.E = kjzVar.X;
                kkgVar.F = kjzVar.Y;
                kkgVar.G = kjzVar.Z;
                kkgVar.h = kjzVar.c;
                kkgVar.f = kjzVar.a;
                kkgVar.g = kjzVar.b;
                kkgVar.d = kjzVar.width;
                kkfVar.d.e = kjzVar.height;
                kkfVar.d.H = kjzVar.leftMargin;
                kkfVar.d.I = kjzVar.rightMargin;
                kkfVar.d.J = kjzVar.topMargin;
                kkfVar.d.K = kjzVar.bottomMargin;
                int i7 = kjzVar.D;
                kkg kkgVar2 = kkfVar.d;
                kkgVar2.N = i7;
                kkgVar2.V = kjzVar.M;
                kkgVar2.W = kjzVar.L;
                kkgVar2.Y = kjzVar.O;
                kkgVar2.X = kjzVar.N;
                kkgVar2.an = kjzVar.aa;
                kkgVar2.ao = kjzVar.ab;
                kkgVar2.Z = kjzVar.P;
                kkgVar2.aa = kjzVar.Q;
                kkgVar2.ab = kjzVar.T;
                kkgVar2.ac = kjzVar.U;
                kkgVar2.ad = kjzVar.R;
                kkgVar2.ae = kjzVar.S;
                kkgVar2.af = kjzVar.V;
                kkgVar2.ag = kjzVar.W;
                kkgVar2.am = kjzVar.ac;
                kkgVar2.P = kjzVar.x;
                kkgVar2.R = kjzVar.z;
                kkgVar2.O = kjzVar.w;
                kkgVar2.Q = kjzVar.y;
                kkgVar2.T = kjzVar.A;
                kkgVar2.S = kjzVar.B;
                kkgVar2.U = kjzVar.C;
                kkgVar2.aq = kjzVar.ad;
                kkgVar2.L = kjzVar.getMarginEnd();
                kkfVar.d.M = kjzVar.getMarginStart();
                kkfVar.b.b = childAt.getVisibility();
                kkfVar.b.d = childAt.getAlpha();
                kkfVar.e.c = childAt.getRotation();
                kkfVar.e.d = childAt.getRotationX();
                kkfVar.e.e = childAt.getRotationY();
                kkfVar.e.f = childAt.getScaleX();
                kkfVar.e.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != eobe.a || pivotY != eobe.a) {
                    kkj kkjVar = kkfVar.e;
                    kkjVar.h = pivotX;
                    kkjVar.i = pivotY;
                }
                kkfVar.e.k = childAt.getTranslationX();
                kkfVar.e.l = childAt.getTranslationY();
                kkfVar.e.m = childAt.getTranslationZ();
                kkj kkjVar2 = kkfVar.e;
                if (kkjVar2.n) {
                    kkjVar2.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    kkg kkgVar3 = kkfVar.d;
                    kkgVar3.ap = barrier.b.b;
                    kkgVar3.ak = Arrays.copyOf(barrier.c, barrier.d);
                    kkg kkgVar4 = kkfVar.d;
                    kkgVar4.ah = barrier.a;
                    kkgVar4.ai = barrier.b.c;
                }
            }
            i5 = i2 + 1;
            kkkVar = this;
            childCount = i;
        }
    }

    public final void e(Context context, int i) {
        d((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void f(int i, int i2, int i3, int i4) {
        kkg kkgVar;
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.b.put(valueOf, new kkf());
        }
        kkf kkfVar = (kkf) this.b.get(valueOf);
        if (kkfVar == null) {
            return;
        }
        if (i2 != 3) {
            kkgVar = kkfVar.d;
            if (i4 == 4) {
                kkgVar.q = i3;
                kkgVar.p = -1;
            } else {
                kkgVar.p = i3;
                kkgVar.q = -1;
            }
        } else {
            kkgVar = kkfVar.d;
            if (i4 == 3) {
                kkgVar.n = i3;
                kkgVar.o = -1;
            } else {
                kkgVar.o = i3;
                kkgVar.n = -1;
            }
        }
        kkgVar.r = -1;
        kkgVar.s = -1;
        kkgVar.t = -1;
    }

    public final void g(int i, int i2, int i3, int i4, int i5) {
        kkg kkgVar;
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.b.put(valueOf, new kkf());
        }
        kkf kkfVar = (kkf) this.b.get(valueOf);
        if (kkfVar == null) {
            return;
        }
        if (i2 == 3) {
            if (i4 == 3) {
                kkgVar = kkfVar.d;
                kkgVar.n = i3;
                kkgVar.o = -1;
            } else {
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + r(i4) + " undefined");
                }
                kkgVar = kkfVar.d;
                kkgVar.o = i3;
                kkgVar.n = -1;
            }
            kkgVar.r = -1;
            kkgVar.s = -1;
            kkgVar.t = -1;
            kkfVar.d.J = i5;
            return;
        }
        if (i2 == 4) {
            if (i4 == 4) {
                kkg kkgVar2 = kkfVar.d;
                kkgVar2.q = i3;
                kkgVar2.p = -1;
                kkgVar2.r = -1;
                kkgVar2.s = -1;
                kkgVar2.t = -1;
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + r(i4) + " undefined");
                }
                kkg kkgVar3 = kkfVar.d;
                kkgVar3.p = i3;
                kkgVar3.q = -1;
                kkgVar3.r = -1;
                kkgVar3.s = -1;
                kkgVar3.t = -1;
            }
            kkfVar.d.K = i5;
            return;
        }
        if (i2 == 5) {
            if (i4 == 5) {
                kkg kkgVar4 = kkfVar.d;
                kkgVar4.r = i3;
                kkgVar4.q = -1;
                kkgVar4.p = -1;
                kkgVar4.n = -1;
                kkgVar4.o = -1;
                return;
            }
            if (i4 == 3) {
                kkg kkgVar5 = kkfVar.d;
                kkgVar5.s = i3;
                kkgVar5.q = -1;
                kkgVar5.p = -1;
                kkgVar5.n = -1;
                kkgVar5.o = -1;
                return;
            }
            if (i4 != 4) {
                throw new IllegalArgumentException("right to " + r(i4) + " undefined");
            }
            kkg kkgVar6 = kkfVar.d;
            kkgVar6.t = i3;
            kkgVar6.q = -1;
            kkgVar6.p = -1;
            kkgVar6.n = -1;
            kkgVar6.o = -1;
            return;
        }
        if (i2 != 6) {
            if (i4 == 7) {
                kkg kkgVar7 = kkfVar.d;
                kkgVar7.x = i3;
                kkgVar7.w = -1;
            } else {
                if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + r(i4) + " undefined");
                }
                kkg kkgVar8 = kkfVar.d;
                kkgVar8.w = i3;
                kkgVar8.x = -1;
            }
            kkfVar.d.L = i5;
            return;
        }
        if (i4 == 6) {
            kkg kkgVar9 = kkfVar.d;
            kkgVar9.v = i3;
            kkgVar9.u = -1;
        } else {
            if (i4 != 7) {
                throw new IllegalArgumentException("right to " + r(i4) + " undefined");
            }
            kkg kkgVar10 = kkfVar.d;
            kkgVar10.u = i3;
            kkgVar10.v = -1;
        }
        kkfVar.d.M = i5;
    }

    public final void h(int i, float f) {
        b(i).d.af = f;
    }

    public final void i(int i, int i2) {
        b(i).d.d = i2;
    }

    public final void j(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    kkf q = q(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        q.d.b = true;
                    }
                    this.b.put(Integer.valueOf(q.a), q);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.h(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.h(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k(Context context, XmlPullParser xmlPullParser) {
        char c2;
        Object obj;
        char c3;
        try {
            int eventType = xmlPullParser.getEventType();
            kkf kkfVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i = 2;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                kkfVar = q(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case 1:
                                kkfVar = q(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case 2:
                                kkfVar = q(context, Xml.asAttributeSet(xmlPullParser), false);
                                kkg kkgVar = kkfVar.d;
                                kkgVar.b = true;
                                kkgVar.c = true;
                                break;
                            case 3:
                                kkfVar = q(context, Xml.asAttributeSet(xmlPullParser), false);
                                kkfVar.d.aj = 1;
                                break;
                            case 4:
                                if (kkfVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                kki kkiVar = kkfVar.b;
                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), kko.g);
                                kkiVar.a = true;
                                int indexCount = obtainStyledAttributes.getIndexCount();
                                for (int i2 = 0; i2 < indexCount; i2++) {
                                    int index = obtainStyledAttributes.getIndex(i2);
                                    if (index == 1) {
                                        kkiVar.d = obtainStyledAttributes.getFloat(1, kkiVar.d);
                                    } else if (index == 0) {
                                        int i3 = obtainStyledAttributes.getInt(0, kkiVar.b);
                                        kkiVar.b = i3;
                                        kkiVar.b = a[i3];
                                    } else {
                                        if (index == 4) {
                                            kkiVar.c = obtainStyledAttributes.getInt(4, kkiVar.c);
                                        } else if (index == 3) {
                                            kkiVar.e = obtainStyledAttributes.getFloat(3, kkiVar.e);
                                        }
                                    }
                                }
                                obtainStyledAttributes.recycle();
                                break;
                            case 5:
                                if (kkfVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                kkj kkjVar = kkfVar.e;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), kko.i);
                                kkjVar.b = true;
                                int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                for (int i4 = 0; i4 < indexCount2; i4++) {
                                    int index2 = obtainStyledAttributes2.getIndex(i4);
                                    switch (kkj.a.get(index2)) {
                                        case 1:
                                            kkjVar.c = obtainStyledAttributes2.getFloat(index2, kkjVar.c);
                                            break;
                                        case 2:
                                            kkjVar.d = obtainStyledAttributes2.getFloat(index2, kkjVar.d);
                                            break;
                                        case 3:
                                            kkjVar.e = obtainStyledAttributes2.getFloat(index2, kkjVar.e);
                                            break;
                                        case 4:
                                            kkjVar.f = obtainStyledAttributes2.getFloat(index2, kkjVar.f);
                                            break;
                                        case 5:
                                            kkjVar.g = obtainStyledAttributes2.getFloat(index2, kkjVar.g);
                                            break;
                                        case 6:
                                            kkjVar.h = obtainStyledAttributes2.getDimension(index2, kkjVar.h);
                                            break;
                                        case 7:
                                            kkjVar.i = obtainStyledAttributes2.getDimension(index2, kkjVar.i);
                                            break;
                                        case 8:
                                            kkjVar.k = obtainStyledAttributes2.getDimension(index2, kkjVar.k);
                                            break;
                                        case 9:
                                            kkjVar.l = obtainStyledAttributes2.getDimension(index2, kkjVar.l);
                                            break;
                                        case 10:
                                            kkjVar.m = obtainStyledAttributes2.getDimension(index2, kkjVar.m);
                                            break;
                                        case 11:
                                            kkjVar.n = true;
                                            kkjVar.o = obtainStyledAttributes2.getDimension(index2, kkjVar.o);
                                            break;
                                        case 12:
                                            kkjVar.j = a(obtainStyledAttributes2, index2, kkjVar.j);
                                            break;
                                    }
                                }
                                obtainStyledAttributes2.recycle();
                                break;
                            case 6:
                                if (kkfVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                kkg kkgVar2 = kkfVar.d;
                                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), kko.e);
                                kkgVar2.c = true;
                                int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                for (int i5 = 0; i5 < indexCount3; i5++) {
                                    int index3 = obtainStyledAttributes3.getIndex(i5);
                                    int i6 = kkg.a.get(index3);
                                    switch (i6) {
                                        case 1:
                                            kkgVar2.r = a(obtainStyledAttributes3, index3, kkgVar2.r);
                                            break;
                                        case 2:
                                            kkgVar2.K = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.K);
                                            break;
                                        case 3:
                                            kkgVar2.q = a(obtainStyledAttributes3, index3, kkgVar2.q);
                                            break;
                                        case 4:
                                            kkgVar2.p = a(obtainStyledAttributes3, index3, kkgVar2.p);
                                            break;
                                        case 5:
                                            kkgVar2.A = obtainStyledAttributes3.getString(index3);
                                            break;
                                        case 6:
                                            kkgVar2.E = obtainStyledAttributes3.getDimensionPixelOffset(index3, kkgVar2.E);
                                            break;
                                        case 7:
                                            kkgVar2.F = obtainStyledAttributes3.getDimensionPixelOffset(index3, kkgVar2.F);
                                            break;
                                        case 8:
                                            kkgVar2.L = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.L);
                                            break;
                                        case 9:
                                            kkgVar2.x = a(obtainStyledAttributes3, index3, kkgVar2.x);
                                            break;
                                        case 10:
                                            kkgVar2.w = a(obtainStyledAttributes3, index3, kkgVar2.w);
                                            break;
                                        case 11:
                                            kkgVar2.R = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.R);
                                            break;
                                        case 12:
                                            kkgVar2.S = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.S);
                                            break;
                                        case 13:
                                            kkgVar2.O = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.O);
                                            break;
                                        case 14:
                                            kkgVar2.Q = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.Q);
                                            break;
                                        case 15:
                                            kkgVar2.T = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.T);
                                            break;
                                        case 16:
                                            kkgVar2.P = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.P);
                                            break;
                                        case 17:
                                            kkgVar2.f = obtainStyledAttributes3.getDimensionPixelOffset(index3, kkgVar2.f);
                                            break;
                                        case 18:
                                            kkgVar2.g = obtainStyledAttributes3.getDimensionPixelOffset(index3, kkgVar2.g);
                                            break;
                                        case 19:
                                            kkgVar2.h = obtainStyledAttributes3.getFloat(index3, kkgVar2.h);
                                            break;
                                        case 20:
                                            kkgVar2.y = obtainStyledAttributes3.getFloat(index3, kkgVar2.y);
                                            break;
                                        case 21:
                                            kkgVar2.e = obtainStyledAttributes3.getLayoutDimension(index3, kkgVar2.e);
                                            break;
                                        case 22:
                                            kkgVar2.d = obtainStyledAttributes3.getLayoutDimension(index3, kkgVar2.d);
                                            break;
                                        case 23:
                                            kkgVar2.H = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.H);
                                            break;
                                        case 24:
                                            kkgVar2.j = a(obtainStyledAttributes3, index3, kkgVar2.j);
                                            break;
                                        case 25:
                                            kkgVar2.k = a(obtainStyledAttributes3, index3, kkgVar2.k);
                                            break;
                                        case 26:
                                            kkgVar2.G = obtainStyledAttributes3.getInt(index3, kkgVar2.G);
                                            break;
                                        case 27:
                                            kkgVar2.I = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.I);
                                            break;
                                        case 28:
                                            kkgVar2.l = a(obtainStyledAttributes3, index3, kkgVar2.l);
                                            break;
                                        case 29:
                                            kkgVar2.m = a(obtainStyledAttributes3, index3, kkgVar2.m);
                                            break;
                                        case 30:
                                            kkgVar2.M = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.M);
                                            break;
                                        case 31:
                                            kkgVar2.u = a(obtainStyledAttributes3, index3, kkgVar2.u);
                                            break;
                                        case 32:
                                            kkgVar2.v = a(obtainStyledAttributes3, index3, kkgVar2.v);
                                            break;
                                        case 33:
                                            kkgVar2.J = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.J);
                                            break;
                                        case 34:
                                            kkgVar2.o = a(obtainStyledAttributes3, index3, kkgVar2.o);
                                            break;
                                        case 35:
                                            kkgVar2.n = a(obtainStyledAttributes3, index3, kkgVar2.n);
                                            break;
                                        case 36:
                                            kkgVar2.z = obtainStyledAttributes3.getFloat(index3, kkgVar2.z);
                                            break;
                                        case 37:
                                            kkgVar2.W = obtainStyledAttributes3.getFloat(index3, kkgVar2.W);
                                            break;
                                        case 38:
                                            kkgVar2.V = obtainStyledAttributes3.getFloat(index3, kkgVar2.V);
                                            break;
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                            kkgVar2.X = obtainStyledAttributes3.getInt(index3, kkgVar2.X);
                                            break;
                                        case 40:
                                            kkgVar2.Y = obtainStyledAttributes3.getInt(index3, kkgVar2.Y);
                                            break;
                                        case 41:
                                            l(kkgVar2, obtainStyledAttributes3, index3, 0);
                                            break;
                                        case 42:
                                            l(kkgVar2, obtainStyledAttributes3, index3, 1);
                                            break;
                                        default:
                                            switch (i6) {
                                                case 61:
                                                    kkgVar2.B = a(obtainStyledAttributes3, index3, kkgVar2.B);
                                                    break;
                                                case 62:
                                                    kkgVar2.C = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.C);
                                                    break;
                                                case 63:
                                                    kkgVar2.D = obtainStyledAttributes3.getFloat(index3, kkgVar2.D);
                                                    break;
                                                default:
                                                    switch (i6) {
                                                        case 69:
                                                            kkgVar2.af = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                            break;
                                                        case 70:
                                                            kkgVar2.ag = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                            break;
                                                        case 71:
                                                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                            break;
                                                        case 72:
                                                            kkgVar2.ah = obtainStyledAttributes3.getInt(index3, kkgVar2.ah);
                                                            break;
                                                        case 73:
                                                            kkgVar2.ai = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.ai);
                                                            break;
                                                        case 74:
                                                            kkgVar2.al = obtainStyledAttributes3.getString(index3);
                                                            break;
                                                        case 75:
                                                            kkgVar2.ap = obtainStyledAttributes3.getBoolean(index3, kkgVar2.ap);
                                                            break;
                                                        case 76:
                                                            kkgVar2.aq = obtainStyledAttributes3.getInt(index3, kkgVar2.aq);
                                                            break;
                                                        case 77:
                                                            kkgVar2.s = a(obtainStyledAttributes3, index3, kkgVar2.s);
                                                            break;
                                                        case 78:
                                                            kkgVar2.t = a(obtainStyledAttributes3, index3, kkgVar2.t);
                                                            break;
                                                        case 79:
                                                            kkgVar2.U = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.U);
                                                            break;
                                                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                                            kkgVar2.N = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.N);
                                                            break;
                                                        case 81:
                                                            kkgVar2.Z = obtainStyledAttributes3.getInt(index3, kkgVar2.Z);
                                                            break;
                                                        case 82:
                                                            kkgVar2.aa = obtainStyledAttributes3.getInt(index3, kkgVar2.aa);
                                                            break;
                                                        case 83:
                                                            kkgVar2.ac = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.ac);
                                                            break;
                                                        case 84:
                                                            kkgVar2.ab = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.ab);
                                                            break;
                                                        case 85:
                                                            kkgVar2.ae = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.ae);
                                                            break;
                                                        case 86:
                                                            kkgVar2.ad = obtainStyledAttributes3.getDimensionPixelSize(index3, kkgVar2.ad);
                                                            break;
                                                        case 87:
                                                            kkgVar2.an = obtainStyledAttributes3.getBoolean(index3, kkgVar2.an);
                                                            break;
                                                        case 88:
                                                            kkgVar2.ao = obtainStyledAttributes3.getBoolean(index3, kkgVar2.ao);
                                                            break;
                                                        case 89:
                                                            kkgVar2.am = obtainStyledAttributes3.getString(index3);
                                                            break;
                                                        case 90:
                                                            kkgVar2.i = obtainStyledAttributes3.getBoolean(index3, kkgVar2.i);
                                                            break;
                                                        case 91:
                                                            Log.w("ConstraintSet", a.e(index3, "unused attribute 0x", kkg.a));
                                                            break;
                                                        default:
                                                            Log.w("ConstraintSet", a.e(index3, "Unknown attribute 0x", kkg.a));
                                                            break;
                                                    }
                                            }
                                    }
                                }
                                obtainStyledAttributes3.recycle();
                                break;
                            case 7:
                                if (kkfVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                kkh kkhVar = kkfVar.c;
                                TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), kko.f);
                                kkhVar.b = true;
                                int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                for (int i7 = 0; i7 < indexCount4; i7++) {
                                    int index4 = obtainStyledAttributes4.getIndex(i7);
                                    switch (kkh.a.get(index4)) {
                                        case 1:
                                            kkhVar.j = obtainStyledAttributes4.getFloat(index4, kkhVar.j);
                                            break;
                                        case 2:
                                            kkhVar.f = obtainStyledAttributes4.getInt(index4, kkhVar.f);
                                            break;
                                        case 3:
                                            if (obtainStyledAttributes4.peekValue(index4).type == 3) {
                                                kkhVar.e = obtainStyledAttributes4.getString(index4);
                                                break;
                                            } else {
                                                kkhVar.e = khg.a[obtainStyledAttributes4.getInteger(index4, 0)];
                                                break;
                                            }
                                        case 4:
                                            kkhVar.g = obtainStyledAttributes4.getInt(index4, 0);
                                            break;
                                        case 5:
                                            kkhVar.c = a(obtainStyledAttributes4, index4, kkhVar.c);
                                            break;
                                        case 6:
                                            kkhVar.d = obtainStyledAttributes4.getInteger(index4, kkhVar.d);
                                            break;
                                        case 7:
                                            kkhVar.h = obtainStyledAttributes4.getFloat(index4, kkhVar.h);
                                            break;
                                        case 8:
                                            kkhVar.l = obtainStyledAttributes4.getInteger(index4, kkhVar.l);
                                            break;
                                        case 9:
                                            kkhVar.k = obtainStyledAttributes4.getFloat(index4, kkhVar.k);
                                            break;
                                        case 10:
                                            TypedValue peekValue = obtainStyledAttributes4.peekValue(index4);
                                            if (peekValue.type == 1) {
                                                int resourceId = obtainStyledAttributes4.getResourceId(index4, -1);
                                                kkhVar.o = resourceId;
                                                if (resourceId == -1) {
                                                    break;
                                                } else {
                                                    kkhVar.n = -2;
                                                }
                                            } else if (peekValue.type != 3) {
                                                kkhVar.n = obtainStyledAttributes4.getInteger(index4, kkhVar.o);
                                                break;
                                            } else {
                                                kkhVar.m = obtainStyledAttributes4.getString(index4);
                                                if (kkhVar.m.indexOf("/") <= 0) {
                                                    kkhVar.n = -1;
                                                    break;
                                                } else {
                                                    kkhVar.o = obtainStyledAttributes4.getResourceId(index4, -1);
                                                    kkhVar.n = -2;
                                                }
                                            }
                                    }
                                }
                                obtainStyledAttributes4.recycle();
                                break;
                            case '\b':
                            case '\t':
                                if (kkfVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                HashMap hashMap = kkfVar.f;
                                TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), kko.d);
                                int indexCount5 = obtainStyledAttributes5.getIndexCount();
                                int i8 = 0;
                                int i9 = 0;
                                boolean z = false;
                                String str = null;
                                Object obj2 = null;
                                while (i8 < indexCount5) {
                                    int index5 = obtainStyledAttributes5.getIndex(i8);
                                    if (index5 == 0) {
                                        String string = obtainStyledAttributes5.getString(0);
                                        str = (string == null || string.length() <= 0) ? string : Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                    } else if (index5 == 10) {
                                        str = obtainStyledAttributes5.getString(10);
                                        z = true;
                                    } else {
                                        if (index5 == 1) {
                                            obj2 = Boolean.valueOf(obtainStyledAttributes5.getBoolean(1, false));
                                            i9 = 6;
                                        } else if (index5 == 3) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(3, 0));
                                            i9 = 3;
                                        } else if (index5 == i) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(i, 0));
                                            i9 = 4;
                                        } else {
                                            if (index5 == 7) {
                                                obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes5.getDimension(7, 0.0f), context.getResources().getDisplayMetrics()));
                                            } else if (index5 == 4) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getDimension(4, 0.0f));
                                            } else if (index5 == 5) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getFloat(5, Float.NaN));
                                                i9 = 2;
                                            } else if (index5 == 6) {
                                                obj2 = Integer.valueOf(obtainStyledAttributes5.getInteger(6, -1));
                                                i9 = 1;
                                            } else if (index5 == 9) {
                                                obj2 = obtainStyledAttributes5.getString(9);
                                                i9 = 5;
                                            } else if (index5 == 8) {
                                                int resourceId2 = obtainStyledAttributes5.getResourceId(8, -1);
                                                if (resourceId2 == -1) {
                                                    resourceId2 = obtainStyledAttributes5.getInt(8, -1);
                                                }
                                                obj2 = Integer.valueOf(resourceId2);
                                                i9 = 8;
                                            }
                                            i9 = 7;
                                        }
                                        i8++;
                                        i = 2;
                                    }
                                    i8++;
                                    i = 2;
                                }
                                String str2 = str;
                                if (str2 != null && (obj = obj2) != null) {
                                    hashMap.put(str2, new kjw(str2, i9, obj, z));
                                }
                                obtainStyledAttributes5.recycle();
                                break;
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0) {
                        }
                        if (c3 == 1 || c3 == 2 || c3 == 3) {
                            try {
                                this.b.put(Integer.valueOf(kkfVar.a), kkfVar);
                                kkfVar = null;
                            } catch (IOException e) {
                                e = e;
                                Log.e("ConstraintSet", "Error parsing XML resource", e);
                                return;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                Log.e("ConstraintSet", "Error parsing XML resource", e);
                                return;
                            }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }

    public final void n(ConstraintLayout constraintLayout) {
        String str;
        HashSet hashSet;
        int i;
        char c2;
        HashSet hashSet2;
        String str2;
        int i2;
        int i3;
        int i4;
        HashMap hashMap = this.b;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet3 = new HashSet(hashMap.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            HashMap hashMap2 = this.b;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap2.containsKey(valueOf)) {
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(str)));
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.b.containsKey(valueOf)) {
                        hashSet3.remove(valueOf);
                        kkf kkfVar = (kkf) this.b.get(valueOf);
                        if (kkfVar != null) {
                            if (childAt instanceof Barrier) {
                                kkfVar.d.aj = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                kkg kkgVar = kkfVar.d;
                                barrier.a = kkgVar.ah;
                                barrier.b(kkgVar.ai);
                                kkg kkgVar2 = kkfVar.d;
                                c2 = 0;
                                barrier.b.b = kkgVar2.ap;
                                int[] iArr = kkgVar2.ak;
                                if (iArr != null) {
                                    barrier.j(iArr);
                                } else {
                                    String str3 = kkgVar2.al;
                                    if (str3 != null) {
                                        kkgVar2.ak = p(barrier, str3);
                                        barrier.j(kkfVar.d.ak);
                                    }
                                }
                            } else {
                                c2 = 0;
                            }
                            kjz kjzVar = (kjz) childAt.getLayoutParams();
                            kjzVar.a();
                            kkfVar.a(kjzVar);
                            HashMap hashMap3 = kkfVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                kjw kjwVar = (kjw) hashMap3.get(str4);
                                if (kjwVar.a) {
                                    hashSet2 = hashSet3;
                                    str2 = str4;
                                } else {
                                    hashSet2 = hashSet3;
                                    str2 = "set".concat(String.valueOf(str4));
                                }
                                try {
                                    i3 = kjwVar.h;
                                    i4 = i3 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i2 = i5;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i2 = i5;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i2 = i5;
                                }
                                if (i3 == 0) {
                                    i2 = i5;
                                    throw null;
                                }
                                switch (i4) {
                                    case 0:
                                        i2 = i5;
                                        Class<?>[] clsArr = new Class[1];
                                        clsArr[c2] = Integer.TYPE;
                                        Method method = cls.getMethod(str2, clsArr);
                                        Integer valueOf2 = Integer.valueOf(kjwVar.c);
                                        Object[] objArr = new Object[1];
                                        objArr[c2] = valueOf2;
                                        method.invoke(childAt, objArr);
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 1:
                                        i2 = i5;
                                        Class<?>[] clsArr2 = new Class[1];
                                        clsArr2[c2] = Float.TYPE;
                                        Method method2 = cls.getMethod(str2, clsArr2);
                                        Float valueOf3 = Float.valueOf(kjwVar.d);
                                        Object[] objArr2 = new Object[1];
                                        objArr2[c2] = valueOf3;
                                        method2.invoke(childAt, objArr2);
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 2:
                                        i2 = i5;
                                        Class<?>[] clsArr3 = new Class[1];
                                        clsArr3[c2] = Integer.TYPE;
                                        Method method3 = cls.getMethod(str2, clsArr3);
                                        Integer valueOf4 = Integer.valueOf(kjwVar.g);
                                        Object[] objArr3 = new Object[1];
                                        objArr3[c2] = valueOf4;
                                        method3.invoke(childAt, objArr3);
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 3:
                                        i2 = i5;
                                        Class<?>[] clsArr4 = new Class[1];
                                        clsArr4[c2] = Drawable.class;
                                        Method method4 = cls.getMethod(str2, clsArr4);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(kjwVar.g);
                                        Object[] objArr4 = new Object[1];
                                        objArr4[c2] = colorDrawable;
                                        method4.invoke(childAt, objArr4);
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 4:
                                        i2 = i5;
                                        Class<?>[] clsArr5 = new Class[1];
                                        clsArr5[c2] = CharSequence.class;
                                        Method method5 = cls.getMethod(str2, clsArr5);
                                        String str5 = kjwVar.e;
                                        Object[] objArr5 = new Object[1];
                                        objArr5[c2] = str5;
                                        method5.invoke(childAt, objArr5);
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 5:
                                        i2 = i5;
                                        Class<?>[] clsArr6 = new Class[1];
                                        clsArr6[c2] = Boolean.TYPE;
                                        Method method6 = cls.getMethod(str2, clsArr6);
                                        Boolean valueOf5 = Boolean.valueOf(kjwVar.f);
                                        Object[] objArr6 = new Object[1];
                                        objArr6[c2] = valueOf5;
                                        method6.invoke(childAt, objArr6);
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 6:
                                        i2 = i5;
                                        Class<?>[] clsArr7 = new Class[1];
                                        clsArr7[c2] = Float.TYPE;
                                        Method method7 = cls.getMethod(str2, clsArr7);
                                        Float valueOf6 = Float.valueOf(kjwVar.d);
                                        Object[] objArr7 = new Object[1];
                                        objArr7[c2] = valueOf6;
                                        method7.invoke(childAt, objArr7);
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 7:
                                        i2 = i5;
                                        try {
                                            Class<?>[] clsArr8 = new Class[1];
                                            clsArr8[c2] = Integer.TYPE;
                                            Method method8 = cls.getMethod(str2, clsArr8);
                                            Integer valueOf7 = Integer.valueOf(kjwVar.c);
                                            Object[] objArr8 = new Object[1];
                                            objArr8[c2] = valueOf7;
                                            method8.invoke(childAt, objArr8);
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashSet3 = hashSet2;
                                            i5 = i2;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                            hashSet3 = hashSet2;
                                            i5 = i2;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashSet3 = hashSet2;
                                            i5 = i2;
                                        }
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                    default:
                                        hashSet3 = hashSet2;
                                        break;
                                }
                            }
                            hashSet = hashSet3;
                            i = i5;
                            childAt.setLayoutParams(kjzVar);
                            kki kkiVar = kkfVar.b;
                            if (kkiVar.c == 0) {
                                childAt.setVisibility(kkiVar.b);
                            }
                            childAt.setAlpha(kkfVar.b.d);
                            childAt.setRotation(kkfVar.e.c);
                            childAt.setRotationX(kkfVar.e.d);
                            childAt.setRotationY(kkfVar.e.e);
                            childAt.setScaleX(kkfVar.e.f);
                            childAt.setScaleY(kkfVar.e.g);
                            kkj kkjVar = kkfVar.e;
                            if (kkjVar.j != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(kkfVar.e.j);
                                if (findViewById != null) {
                                    int top = findViewById.getTop() + findViewById.getBottom();
                                    int left = findViewById.getLeft() + findViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(kkjVar.h)) {
                                    childAt.setPivotX(kkfVar.e.h);
                                }
                                if (!Float.isNaN(kkfVar.e.i)) {
                                    childAt.setPivotY(kkfVar.e.i);
                                }
                            }
                            childAt.setTranslationX(kkfVar.e.k);
                            childAt.setTranslationY(kkfVar.e.l);
                            childAt.setTranslationZ(kkfVar.e.m);
                            kkj kkjVar2 = kkfVar.e;
                            if (kkjVar2.n) {
                                childAt.setElevation(kkjVar2.o);
                            }
                        }
                    } else {
                        hashSet = hashSet3;
                        i = i5;
                        Log.v("ConstraintSet", a.h(id, "WARNING NO CONSTRAINTS for view "));
                    }
                    i5 = i + 1;
                    hashSet3 = hashSet;
                }
            }
            hashSet = hashSet3;
            i = i5;
            i5 = i + 1;
            hashSet3 = hashSet;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            kkf kkfVar2 = (kkf) this.b.get(num);
            if (kkfVar2 != null) {
                if (kkfVar2.d.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    kkg kkgVar3 = kkfVar2.d;
                    int[] iArr2 = kkgVar3.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        String str6 = kkgVar3.al;
                        if (str6 != null) {
                            kkgVar3.ak = p(barrier2, str6);
                            barrier2.j(kkfVar2.d.ak);
                        }
                    }
                    kkg kkgVar4 = kkfVar2.d;
                    barrier2.a = kkgVar4.ah;
                    barrier2.b(kkgVar4.ai);
                    kjz kjzVar2 = new kjz();
                    barrier2.k();
                    kkfVar2.a(kjzVar2);
                    constraintLayout.addView(barrier2, kjzVar2);
                }
                if (kkfVar2.d.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    kjz kjzVar3 = new kjz();
                    kkfVar2.a(kjzVar3);
                    constraintLayout.addView(guideline, kjzVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof kjx) {
                ((kjx) childAt2).g(constraintLayout);
            }
        }
    }
}
