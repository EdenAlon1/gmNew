package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aw {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = ax.a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    private static int q(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static final String r(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME : ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME : "baseline" : "bottom" : "top";
    }

    public final av a(int i) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new av());
        }
        return (av) this.a.get(valueOf);
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.c = null;
    }

    public final void c(ConstraintLayout constraintLayout) {
        HashMap hashMap = this.a;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap2 = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap2.containsKey(valueOf)) {
                hashSet.remove(valueOf);
                av avVar = (av) this.a.get(valueOf);
                au auVar = (au) childAt.getLayoutParams();
                avVar.b(auVar);
                childAt.setLayoutParams(auVar);
                childAt.setVisibility(avVar.G);
                childAt.setAlpha(avVar.R);
                childAt.setRotationX(avVar.U);
                childAt.setRotationY(avVar.V);
                childAt.setScaleX(avVar.W);
                childAt.setScaleY(avVar.X);
                childAt.setPivotX(avVar.Y);
                childAt.setPivotY(avVar.Z);
                childAt.setTranslationX(avVar.aa);
                childAt.setTranslationY(avVar.ab);
                childAt.setTranslationZ(avVar.ac);
                if (avVar.S) {
                    childAt.setElevation(avVar.T);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            av avVar2 = (av) this.a.get(num);
            if (avVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                au auVar2 = new au(-2, -2);
                avVar2.b(auVar2);
                constraintLayout.addView(guideline, auVar2);
            }
        }
    }

    public final void d(int i, int i2) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            av avVar = (av) this.a.get(valueOf);
            if (i2 != 6) {
                avVar.s = -1;
                avVar.t = -1;
                avVar.E = -1;
                avVar.L = -1;
                return;
            }
            avVar.q = -1;
            avVar.r = -1;
            avVar.F = -1;
            avVar.M = -1;
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            au auVar = (au) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                this.a.put(valueOf, new av());
            }
            av avVar = (av) this.a.get(valueOf);
            avVar.d = id;
            avVar.h = auVar.d;
            avVar.i = auVar.e;
            avVar.j = auVar.f;
            avVar.k = auVar.g;
            avVar.l = auVar.h;
            avVar.m = auVar.i;
            avVar.n = auVar.j;
            avVar.o = auVar.k;
            avVar.p = auVar.l;
            avVar.q = auVar.m;
            avVar.r = auVar.n;
            avVar.s = auVar.o;
            avVar.t = auVar.p;
            avVar.u = auVar.w;
            avVar.v = auVar.x;
            avVar.w = auVar.y;
            avVar.x = auVar.K;
            avVar.y = auVar.L;
            avVar.z = auVar.M;
            avVar.g = auVar.c;
            avVar.e = auVar.a;
            avVar.f = auVar.b;
            avVar.b = auVar.width;
            avVar.c = auVar.height;
            avVar.A = auVar.leftMargin;
            avVar.B = auVar.rightMargin;
            avVar.C = auVar.topMargin;
            avVar.D = auVar.bottomMargin;
            avVar.N = auVar.B;
            avVar.O = auVar.A;
            avVar.Q = auVar.D;
            avVar.P = auVar.C;
            avVar.ad = auVar.E;
            avVar.ae = auVar.F;
            avVar.af = auVar.I;
            avVar.ag = auVar.J;
            avVar.ah = auVar.G;
            avVar.ai = auVar.H;
            avVar.E = auVar.getMarginEnd();
            avVar.F = auVar.getMarginStart();
            avVar.G = childAt.getVisibility();
            avVar.R = childAt.getAlpha();
            avVar.U = childAt.getRotationX();
            avVar.V = childAt.getRotationY();
            avVar.W = childAt.getScaleX();
            avVar.X = childAt.getScaleY();
            avVar.Y = childAt.getPivotX();
            avVar.Z = childAt.getPivotY();
            avVar.aa = childAt.getTranslationX();
            avVar.ab = childAt.getTranslationY();
            avVar.ac = childAt.getTranslationZ();
            if (avVar.S) {
                avVar.T = childAt.getElevation();
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new av());
        }
        av avVar = (av) this.a.get(valueOf);
        if (i2 == 3) {
            if (i4 == 3) {
                avVar.l = i3;
                avVar.m = -1;
                avVar.p = -1;
            } else {
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + r(i4) + " undefined");
                }
                avVar.m = i3;
                avVar.l = -1;
                avVar.p = -1;
            }
            avVar.C = i5;
            return;
        }
        if (i2 == 4) {
            if (i4 == 4) {
                avVar.o = i3;
                avVar.n = -1;
                avVar.p = -1;
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + r(i4) + " undefined");
                }
                avVar.n = i3;
                avVar.o = -1;
                avVar.p = -1;
            }
            avVar.D = i5;
            return;
        }
        if (i2 == 5) {
            if (i4 != 5) {
                throw new IllegalArgumentException("right to " + r(i4) + " undefined");
            }
            avVar.p = i3;
            avVar.o = -1;
            avVar.n = -1;
            avVar.l = -1;
            avVar.m = -1;
            return;
        }
        if (i2 != 6) {
            if (i4 == 7) {
                avVar.t = i3;
                avVar.s = -1;
            } else {
                if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + r(i4) + " undefined");
                }
                avVar.s = i3;
                avVar.t = -1;
            }
            avVar.E = i5;
            return;
        }
        if (i4 == 6) {
            avVar.r = i3;
            avVar.q = -1;
        } else {
            if (i4 != 7) {
                throw new IllegalArgumentException("right to " + r(i4) + " undefined");
            }
            avVar.q = i3;
            avVar.r = -1;
        }
        avVar.F = i5;
    }

    public final void g(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    av avVar = new av();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, ax.b);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = c;
                        int i3 = sparseIntArray.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    avVar.p = q(obtainStyledAttributes, index, avVar.p);
                                    break;
                                case 2:
                                    avVar.D = obtainStyledAttributes.getDimensionPixelSize(index, avVar.D);
                                    break;
                                case 3:
                                    avVar.o = q(obtainStyledAttributes, index, avVar.o);
                                    break;
                                case 4:
                                    avVar.n = q(obtainStyledAttributes, index, avVar.n);
                                    break;
                                case 5:
                                    avVar.w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    avVar.x = obtainStyledAttributes.getDimensionPixelOffset(index, avVar.x);
                                    break;
                                case 7:
                                    avVar.y = obtainStyledAttributes.getDimensionPixelOffset(index, avVar.y);
                                    break;
                                case 8:
                                    avVar.E = obtainStyledAttributes.getDimensionPixelSize(index, avVar.E);
                                    break;
                                case 9:
                                    avVar.n = q(obtainStyledAttributes, index, avVar.t);
                                    break;
                                case 10:
                                    avVar.s = q(obtainStyledAttributes, index, avVar.s);
                                    break;
                                case 11:
                                    avVar.K = obtainStyledAttributes.getDimensionPixelSize(index, avVar.K);
                                    break;
                                case 12:
                                    avVar.L = obtainStyledAttributes.getDimensionPixelSize(index, avVar.L);
                                    break;
                                case 13:
                                    avVar.H = obtainStyledAttributes.getDimensionPixelSize(index, avVar.H);
                                    break;
                                case 14:
                                    avVar.J = obtainStyledAttributes.getDimensionPixelSize(index, avVar.J);
                                    break;
                                case 15:
                                    avVar.M = obtainStyledAttributes.getDimensionPixelSize(index, avVar.M);
                                    break;
                                case 16:
                                    avVar.I = obtainStyledAttributes.getDimensionPixelSize(index, avVar.I);
                                    break;
                                case 17:
                                    avVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, avVar.e);
                                    break;
                                case 18:
                                    avVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, avVar.f);
                                    break;
                                case 19:
                                    avVar.g = obtainStyledAttributes.getFloat(index, avVar.g);
                                    break;
                                case 20:
                                    avVar.u = obtainStyledAttributes.getFloat(index, avVar.u);
                                    break;
                                case 21:
                                    avVar.c = obtainStyledAttributes.getLayoutDimension(index, avVar.c);
                                    break;
                                case 22:
                                    int i4 = obtainStyledAttributes.getInt(index, avVar.G);
                                    avVar.G = i4;
                                    avVar.G = b[i4];
                                    break;
                                case 23:
                                    avVar.b = obtainStyledAttributes.getLayoutDimension(index, avVar.b);
                                    break;
                                case 24:
                                    avVar.A = obtainStyledAttributes.getDimensionPixelSize(index, avVar.A);
                                    break;
                                case 25:
                                    avVar.h = q(obtainStyledAttributes, index, avVar.h);
                                    break;
                                case 26:
                                    avVar.i = q(obtainStyledAttributes, index, avVar.i);
                                    break;
                                case 27:
                                    avVar.z = obtainStyledAttributes.getInt(index, avVar.z);
                                    break;
                                case 28:
                                    avVar.B = obtainStyledAttributes.getDimensionPixelSize(index, avVar.B);
                                    break;
                                case 29:
                                    avVar.j = q(obtainStyledAttributes, index, avVar.j);
                                    break;
                                case 30:
                                    avVar.k = q(obtainStyledAttributes, index, avVar.k);
                                    break;
                                case 31:
                                    avVar.F = obtainStyledAttributes.getDimensionPixelSize(index, avVar.F);
                                    break;
                                case 32:
                                    avVar.q = q(obtainStyledAttributes, index, avVar.q);
                                    break;
                                case 33:
                                    avVar.r = q(obtainStyledAttributes, index, avVar.r);
                                    break;
                                case 34:
                                    avVar.C = obtainStyledAttributes.getDimensionPixelSize(index, avVar.C);
                                    break;
                                case 35:
                                    avVar.m = q(obtainStyledAttributes, index, avVar.m);
                                    break;
                                case 36:
                                    avVar.l = q(obtainStyledAttributes, index, avVar.l);
                                    break;
                                case 37:
                                    avVar.v = obtainStyledAttributes.getFloat(index, avVar.v);
                                    break;
                                case 38:
                                    avVar.d = obtainStyledAttributes.getResourceId(index, avVar.d);
                                    break;
                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                    avVar.O = obtainStyledAttributes.getFloat(index, avVar.O);
                                    break;
                                case 40:
                                    avVar.N = obtainStyledAttributes.getFloat(index, avVar.N);
                                    break;
                                case 41:
                                    avVar.P = obtainStyledAttributes.getInt(index, avVar.P);
                                    break;
                                case 42:
                                    avVar.Q = obtainStyledAttributes.getInt(index, avVar.Q);
                                    break;
                                case 43:
                                    avVar.R = obtainStyledAttributes.getFloat(index, avVar.R);
                                    break;
                                case 44:
                                    avVar.S = true;
                                    avVar.T = obtainStyledAttributes.getFloat(index, avVar.T);
                                    break;
                                case 45:
                                    avVar.U = obtainStyledAttributes.getFloat(index, avVar.U);
                                    break;
                                case 46:
                                    avVar.V = obtainStyledAttributes.getFloat(index, avVar.V);
                                    break;
                                case 47:
                                    avVar.W = obtainStyledAttributes.getFloat(index, avVar.W);
                                    break;
                                case 48:
                                    avVar.X = obtainStyledAttributes.getFloat(index, avVar.X);
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                    avVar.Y = obtainStyledAttributes.getFloat(index, avVar.Y);
                                    break;
                                case 50:
                                    avVar.Z = obtainStyledAttributes.getFloat(index, avVar.Z);
                                    break;
                                case 51:
                                    avVar.aa = obtainStyledAttributes.getFloat(index, avVar.aa);
                                    break;
                                case 52:
                                    avVar.ab = obtainStyledAttributes.getFloat(index, avVar.ab);
                                    break;
                                case 53:
                                    avVar.ac = obtainStyledAttributes.getFloat(index, avVar.ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", a.e(index, "Unknown attribute 0x", sparseIntArray));
                                    break;
                            }
                        } else {
                            Log.w("ConstraintSet", a.e(index, "unused attribute 0x", sparseIntArray));
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        avVar.a = true;
                    }
                    this.a.put(Integer.valueOf(avVar.d), avVar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void h(int i, int i2, int i3) {
        av a = a(i);
        if (i2 == 4) {
            a.D = i3;
        } else {
            if (i2 == 5) {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            a.F = i3;
        }
    }

    public final void i(int i, float f) {
        a(i).W = f;
    }

    public final void j(int i, float f) {
        a(i).X = f;
    }

    public final void k(int i, float f, float f2) {
        av a = a(i);
        a.Z = f2;
        a.Y = f;
    }

    public final void l(int i, int i2) {
        a(i).G = i2;
    }

    public final void m(int i, int i2, int i3) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new av());
        }
        av avVar = (av) this.a.get(valueOf);
        if (i2 != 6) {
            avVar.s = i3;
            avVar.t = -1;
        } else {
            avVar.r = i3;
            avVar.q = -1;
        }
    }

    public final void n(int i) {
        a(R.id.banner_card_id).c = i;
    }

    public final void o(int i) {
        a(R.id.banner_card_id).b = i;
    }

    public final void p(int i) {
        a(R.id.screen_bottom_guideline).f = i;
        a(R.id.screen_bottom_guideline).e = -1;
        a(R.id.screen_bottom_guideline).g = -1.0f;
    }
}
