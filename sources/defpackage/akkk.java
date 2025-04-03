package defpackage;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionWorkManagerScheduler;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.chromium.net.CronetEngine;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akkk implements fbbf {
    public final akis a;
    private final int b;

    public akkk(akis akisVar, int i) {
        this.a = akisVar;
        this.b = i;
    }

    private final Object A() {
        int i = this.b;
        switch (i) {
            case 3100:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45670952").e());
            case 3101:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45678348").e());
            case 3102:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45650660").e());
            case 3103:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45426381").e());
            case 3104:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45657547").e());
            case 3105:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45672595").e());
            case 3106:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45672977").e());
            case 3107:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45672513").e());
            case 3108:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45665943").e());
            case 3109:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45386874").e());
            case 3110:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45674726").e());
            case 3111:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45677414").e());
            case 3112:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45625125").e());
            case 3113:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45669777").e());
            case 3114:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45676736").e());
            case 3115:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45677242").e());
            case 3116:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45677781").e());
            case 3117:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45678373").e());
            case 3118:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45674166").e());
            case 3119:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45367497").e());
            case 3120:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45669068").e());
            case 3121:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45676316").e());
            case 3122:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45673755").e());
            case 3123:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45660976").e());
            case 3124:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45621973").e());
            case 3125:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45421542").e());
            case 3126:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45663969").e());
            case 3127:
                return Boolean.valueOf(((ekck) this.a.a.oI().a.b()).a("com.google.android.apps.messaging.auto 45668437").e());
            case 3128:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45660508").e());
            case 3129:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45664261").e());
            case 3130:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45633988").e());
            case 3131:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45660120").e());
            case 3132:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45620263").e());
            case 3133:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45673676").e());
            case 3134:
                return Boolean.valueOf(((ekck) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto 45670382").e());
            case 3135:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45676713").e());
            case 3136:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45648825").e());
            case 3137:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45677732").e());
            case 3138:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45671612").e());
            case 3139:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45678033").e());
            case 3140:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45677611").e());
            case 3141:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45678191").e());
            case 3142:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45674752").e());
            case 3143:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45674876").e());
            case 3144:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45677450").e());
            case 3145:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45618236").e());
            case 3146:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45657548").e());
            case 3147:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45677355").e());
            case 3148:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45669574").e());
            case 3149:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45647174").e());
            case 3150:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45638296").e());
            case 3151:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45634794").e());
            case 3152:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45671407").e());
            case 3153:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45669575").e());
            case 3154:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45639797").e());
            case 3155:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45667168").e());
            case 3156:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45677966").e());
            case 3157:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45672060").e());
            case 3158:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45671552").e());
            case 3159:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45676118").e());
            case 3160:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45674359").e());
            case 3161:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45674281").e());
            case 3162:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45667850").e());
            case 3163:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45648518").e());
            case 3164:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45680278").e());
            case 3165:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45413235").e());
            case 3166:
                Boolean bool = (Boolean) ((cfup) aref.d.get()).e();
                bool.booleanValue();
                return bool;
            case 3167:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45673838").e());
            case 3168:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45677769").e());
            case 3169:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45664064").e());
            case 3170:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45638344").e());
            case 3171:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45637232").e());
            case 3172:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45637233").e());
            case 3173:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45637234").e());
            case 3174:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45637235").e());
            case 3175:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45668452").e());
            case 3176:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45637236").e());
            case 3177:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45623693").e());
            case 3178:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45671770").e());
            case 3179:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45648351").e());
            case 3180:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45674410").e());
            case 3181:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45668382").e());
            case 3182:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45679589").e());
            case 3183:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45680136").e());
            case 3184:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45657150").e());
            case 3185:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45619445").e());
            case 3186:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45673533").e());
            case 3187:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45639129").e());
            case 3188:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45650376").e());
            case 3189:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45478338").e());
            case 3190:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45664282").e());
            case 3191:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45678505").e());
            case 3192:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45677283").e());
            case 3193:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45680268").e());
            case 3194:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45672666").e());
            case 3195:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45678251").e());
            case 3196:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45668997").e());
            case 3197:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45672688").e());
            case 3198:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45671730").e());
            case 3199:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45669460").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object B() {
        int i = this.b;
        switch (i) {
            case 3200:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45670336").e());
            case 3201:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45671923").e());
            case 3202:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45644073").e());
            case 3203:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45670113").e());
            case 3204:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45677046").e());
            case 3205:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45676317").e());
            case 3206:
                return Boolean.valueOf(((ekck) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto 45674718").e());
            case 3207:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45413825").e());
            case 3208:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45650539").e());
            case 3209:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45658425").e());
            case 3210:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45678016").e());
            case 3211:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45657549").e());
            case 3212:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45672281").e());
            case 3213:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45679934").e());
            case 3214:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45679527").e());
            case 3215:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45624411").e());
            case 3216:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45641444").e());
            case 3217:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45585366").e());
            case 3218:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45677702").e());
            case 3219:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45461067").e());
            case 3220:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45676223").e());
            case 3221:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45647143").e());
            case 3222:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45460276").e());
            case 3223:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45679543").e());
            case 3224:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45676326").e());
            case 3225:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45665285").e());
            case 3226:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45680199").e());
            case 3227:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45669229").e());
            case 3228:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45676714").e());
            case 3229:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45478382").e());
            case 3230:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45676576").e());
            case 3231:
                return Boolean.valueOf(((ekck) this.a.a.om().a.b()).a("com.google.android.apps.messaging.auto 45623804").e());
            case 3232:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45622422").e());
            case 3233:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45671888").e());
            case 3234:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45628405").e());
            case 3235:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45655908").e());
            case 3236:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45677604").e());
            case 3237:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45680219").e());
            case 3238:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45646726").e());
            case 3239:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45665214").e());
            case 3240:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45656532").e());
            case 3241:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45667826").e());
            case 3242:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45669010").e());
            case 3243:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45621320").e());
            case 3244:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45669287").e());
            case 3245:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45620350").e());
            case 3246:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45670312").e());
            case 3247:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45625296").e());
            case 3248:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45670488").e());
            case 3249:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45671842").e());
            case 3250:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45679794").e());
            case 3251:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45651281").e());
            case 3252:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45664260").e());
            case 3253:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45660983").e());
            case 3254:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45666370").e());
            case 3255:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45680014").e());
            case 3256:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45400273").e());
            case 3257:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45430694").e());
            case 3258:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45680100").e());
            case 3259:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45677521").e());
            case 3260:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45675134").e());
            case 3261:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45673671").e());
            case 3262:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45680220").e());
            case 3263:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45677520").e());
            case 3264:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45672016").e());
            case 3265:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45675663").e());
            case 3266:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45672603").e());
            case 3267:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45673272").e());
            case 3268:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45661662").e());
            case 3269:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45677718").e());
            case 3270:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45531686").e());
            case 3271:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45637238").e());
            case 3272:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45424757").e());
            case 3273:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45680221").e());
            case 3274:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45680222").e());
            case 3275:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45680223").e());
            case 3276:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45680224").e());
            case 3277:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45680225").e());
            case 3278:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45680226").e());
            case 3279:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45680227").e());
            case 3280:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45680228").e());
            case 3281:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45680229").e());
            case 3282:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45680230").e());
            case 3283:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45637323").e());
            case 3284:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45637239").e());
            case 3285:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45662115").e());
            case 3286:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45675634").e());
            case 3287:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45657577").e());
            case 3288:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45678532").e());
            case 3289:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45670917").e());
            case 3290:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45618808").e());
            case 3291:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45632791").e());
            case 3292:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45673995").e());
            case 3293:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45678338").e());
            case 3294:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45671889").e());
            case 3295:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45670838").e());
            case 3296:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45663069").e());
            case 3297:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45633084").e());
            case 3298:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45678349").e());
            case 3299:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45650223").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object C() {
        int i = this.b;
        switch (i) {
            case 400:
                return new cpbw((Context) this.a.q.b(), (cpbs) this.a.a.ft.b(), (ctyw) this.a.a.fu.b(), (ctwb) this.a.a.c.b(), (cxao) this.a.a.fv.b());
            case 401:
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new cxao(akkpVar.aT, akisVar.q, akisVar.dy, akkpVar.fu, akkpVar.c, akisVar.aR);
            case 402:
                Context context = (Context) this.a.q.b();
                akkp akkpVar2 = this.a.a;
                return new azze(context, akkpVar2.ab, akkpVar2.Z);
            case 403:
                Context context2 = (Context) this.a.q.b();
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                akis akisVar2 = this.a;
                akkp akkpVar3 = akisVar2.a;
                return new bdvi(context2, ctvbVar, ctwbVar, cpbsVar, akkpVar3.sY, akkpVar3.AV, akisVar2.kk, (crnx) akkpVar3.Df.b());
            case 404:
                return cbck.a(this.a.a.fA());
            case 405:
                Context context3 = (Context) this.a.q.b();
                akis akisVar3 = this.a;
                fbbf fbbfVar = akisVar3.cz;
                akkp akkpVar4 = akisVar3.a;
                return new bbdj(context3, akkpVar4.fF, akkpVar4.fC, akkpVar4.fG, akkpVar4.fH, (cqoh) fbbfVar.b());
            case 406:
                Context context4 = (Context) this.a.q.b();
                albq albqVar = (albq) this.a.a.di.b();
                cfuu cfuuVar = (cfuu) this.a.aX.b();
                ecrj ecrjVar = (ecrj) this.a.cN.b();
                errl errlVar = (errl) this.a.aK.b();
                errl errlVar2 = (errl) this.a.p.b();
                akkp akkpVar5 = this.a.a;
                return new ActionExecutorImpl(context4, albqVar, cfuuVar, ecrjVar, errlVar, errlVar2, akkpVar5.fz, akkpVar5.fA, akkpVar5.eK(), akkpVar5.fD, akkpVar5.fE);
            case 407:
                final fbbf fbbfVar2 = this.a.a.s;
                return new arei() { // from class: arey
                    @Override // defpackage.arei
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_action_catch_cancellation_exception");
                    }
                };
            case 408:
                final fbbf fbbfVar3 = this.a.a.s;
                return new areh() { // from class: arew
                    @Override // defpackage.areh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.actions_report_callers");
                    }
                };
            case 409:
                return new bbdv(fbbd.a(), this.a.a.fB);
            case 410:
                final fbbf fbbfVar4 = this.a.a.s;
                return new arej() { // from class: arfa
                    @Override // defpackage.arej
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_persistable_action_parameters");
                    }
                };
            case 411:
                final fbbf fbbfVar5 = this.a.a.s;
                return new areg() { // from class: areu
                    @Override // defpackage.areg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.actions_have_named_wakelocks");
                    }
                };
            case 412:
                final fbbf fbbfVar6 = this.a.a.s;
                return new atkz() { // from class: atla
                    @Override // defpackage.atkz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.acquire_wake_lock_on_blocking");
                    }
                };
            case 413:
                return new bbcy((Context) this.a.q.b(), this.a.a.f);
            case 414:
                akis akisVar4 = this.a;
                return new ActionWorkManagerScheduler(akisVar4.a.fC, (Context) akisVar4.q.b());
            case 415:
                akkp akkpVar6 = this.a.a;
                return new bavz(akkpVar6.fy, akkpVar6.c, akkpVar6.fK, akkpVar6.fL);
            case 416:
                final fbbf fbbfVar7 = this.a.a.s;
                return new aukf() { // from class: aujw
                    @Override // defpackage.aukf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_flaggable_self_refresh_throttle");
                    }
                };
            case 417:
                return Long.valueOf(fdid.a(this.a.a.oC()));
            case 418:
                akis akisVar5 = this.a;
                akkp akkpVar7 = akisVar5.a;
                return new baeo(akkpVar7.fN, akkpVar7.ay, akkpVar7.f, akisVar5.cz, akkpVar7.hK, akkpVar7.hL);
            case 419:
                return new cbia((Context) this.a.q.b(), (bcwz) this.a.a.ad.b());
            case 420:
                akis akisVar6 = this.a;
                akkp akkpVar8 = akisVar6.a;
                fbbf fbbfVar8 = akkpVar8.dB;
                fbbf fbbfVar9 = akkpVar8.dn;
                fbbf fbbfVar10 = akkpVar8.fO;
                fbbf fbbfVar11 = akkpVar8.Z;
                fbbf fbbfVar12 = akkpVar8.fP;
                fbbf fbbfVar13 = akkpVar8.aO;
                fbbf fbbfVar14 = akkpVar8.hI;
                errl errlVar3 = (errl) akisVar6.p.b();
                errl errlVar4 = (errl) this.a.aK.b();
                akkp akkpVar9 = this.a.a;
                return new ameo(fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar14, errlVar3, errlVar4, akkpVar9.ay, akkpVar9.bQ(), akkpVar9.hJ, (asvn) akkpVar9.Q.b());
            case 421:
                return new cfsq((ffsk) this.a.a.aq.b(), this.a.cz);
            case 422:
                bdmr bdmrVar = (bdmr) this.a.a.gC.b();
                aqvh aqvhVar = (aqvh) this.a.a.gN.b();
                csjk csjkVar = (csjk) this.a.a.el.b();
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                errl errlVar7 = (errl) this.a.aK.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                akkp akkpVar10 = this.a.a;
                return new aqgw(bdmrVar, aqvhVar, csjkVar, errlVar5, errlVar6, errlVar7, ctyxVar, akkpVar10.ex(), akkpVar10.fP, akkpVar10.dn, akkpVar10.dB, akkpVar10.hH, akkpVar10.cE());
            case 423:
                akkp akkpVar11 = this.a.a;
                return new bdmr(akkpVar11.gB, akkpVar11.dp);
            case 424:
                akkp akkpVar12 = this.a.a;
                fbbf fbbfVar15 = akkpVar12.dn;
                fbbf fbbfVar16 = akkpVar12.dR;
                fbbf fbbfVar17 = akkpVar12.fQ;
                fbbf fbbfVar18 = akkpVar12.fR;
                ctyw ctywVar = (ctyw) akkpVar12.fu.b();
                akkp akkpVar13 = this.a.a;
                return new bcvw(fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, ctywVar, akkpVar13.c, akkpVar13.fw, akkpVar13.br, akkpVar13.al, (azaw) akkpVar13.gA.b(), (errl) this.a.aK.b());
            case 425:
                Context context5 = (Context) this.a.q.b();
                akkp akkpVar14 = this.a.a;
                return new cflw(context5, akkpVar14.ac, akkpVar14.fw, akkpVar14.ft);
            case 426:
                akkp akkpVar15 = this.a.a;
                return azbm.a(akkpVar15.dd(), akkpVar15.pZ());
            case 427:
                akkp akkpVar16 = this.a.a;
                return new cjzh(akkpVar16.br, (djrk) akkpVar16.bF.b());
            case 428:
                final fbbf fbbfVar19 = this.a.a.s;
                return new asuu() { // from class: ascq
                    @Override // defpackage.asuu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rbm_bot_capabilities_fetch");
                    }
                };
            case 429:
                akkp akkpVar17 = this.a.a;
                return new azei(akkpVar17.ge, (ffsk) akkpVar17.p.b());
            case 430:
                return new enpx(this.a.a.cW());
            case 431:
                return new avmk((avlg) this.a.a.gb.b());
            case 432:
                akkp akkpVar18 = this.a.a;
                return new avlg(akkpVar18.fU, akkpVar18.fV, akkpVar18.fW, akkpVar18.fX, akkpVar18.fY, akkpVar18.fZ, akkpVar18.ga);
            case 433:
                return Long.valueOf(fcxz.a(this.a.a.nH()));
            case 434:
                return Long.valueOf(fcxy.a(this.a.a.nH()));
            case 435:
                return Long.valueOf(fcxt.a(this.a.a.nH()));
            case 436:
                return Long.valueOf(fcxw.a(this.a.a.nH()));
            case 437:
                return Long.valueOf(fcxx.a(this.a.a.nH()));
            case 438:
                return Long.valueOf(fcxv.a(this.a.a.nH()));
            case 439:
                return Long.valueOf(fcxu.a(this.a.a.nH()));
            case 440:
                return new azei(fbbh.a(), (ffsk) this.a.a.p.b());
            case 441:
                return new akjz(this);
            case 442:
                akis akisVar7 = this.a;
                return avsa.a(akisVar7.a.cZ(), (akio) akisVar7.hh.b());
            case 443:
                errl errlVar8 = (errl) this.a.aK.b();
                errl errlVar9 = (errl) this.a.p.b();
                ContactsService contactsService = (ContactsService) this.a.a.dm.b();
                azei azeiVar = (azei) this.a.a.gf.b();
                akis akisVar8 = this.a;
                return new avqv(errlVar8, errlVar9, contactsService, azeiVar, akisVar8.a.G, (cqoh) akisVar8.cz.b());
            case 444:
                Context context6 = (Context) this.a.q.b();
                errl errlVar10 = (errl) this.a.t.b();
                ckds ckdsVar = (ckds) this.a.a.dp.b();
                akis akisVar9 = this.a;
                fbbf fbbfVar20 = akisVar9.cz;
                avor cY = akisVar9.a.cY();
                cqoh cqohVar = (cqoh) fbbfVar20.b();
                akkp akkpVar19 = this.a.a;
                return new avsr(context6, errlVar10, ckdsVar, cY, cqohVar, akkpVar19.lP(), (azei) akkpVar19.gf.b());
            case 445:
                cphm cphmVar = new cphm();
                errl errlVar11 = (errl) this.a.p.b();
                errl errlVar12 = (errl) this.a.t.b();
                azei azeiVar2 = (azei) this.a.a.gf.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akkp akkpVar20 = this.a.a;
                return new cphn(cphmVar, errlVar11, errlVar12, azeiVar2, cqohVar2, akkpVar20.cG, (cpsu) akkpVar20.gx.b(), (chbx) this.a.a.gr.b());
            case 446:
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                akkp akkpVar21 = this.a.a;
                return new cpsu(ffhdVar, ffskVar, ffskVar2, akkpVar21.gq, akkpVar21.gt, akkpVar21.gu, akkpVar21.bF, akkpVar21.bE, akkpVar21.oR());
            case 447:
                return new akke(this);
            case 448:
                return cprc.a((Context) this.a.q.b(), (cgwp) this.a.a.gk.b());
            case 449:
                akis akisVar10 = this.a;
                return new cgwp(akisVar10.a.gj, akisVar10.hc);
            case 450:
                return Long.valueOf(fddo.a(this.a.a.oj()));
            case 451:
                akis akisVar11 = this.a;
                return new cpor(akisVar11.a.az, (cqoh) akisVar11.cz.b(), (avuh) this.a.hd.b());
            case 452:
                ecrj ecrjVar2 = (ecrj) this.a.cN.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                errm errmVar = (errm) this.a.p.b();
                akis akisVar12 = this.a;
                akkp akkpVar22 = akisVar12.a;
                return new cpev(ecrjVar2, cqohVar3, errmVar, akkpVar22.gn, akisVar12.he, akkpVar22.go);
            case 453:
                return new askp() { // from class: arnh
                };
            case 454:
                return new alqy(this.a.a.cG);
            case 455:
                return new akkf(this);
            case 456:
                return new akkg(this);
            case 457:
                return new cpfx((chhs) this.a.a.aW.b());
            case 458:
                return new akkh(this);
            case 459:
                akis akisVar13 = this.a;
                return chka.a(akisVar13.a.bd, (ekpg) akisVar13.hg.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 460:
                aqte aqteVar = (aqte) this.a.a.hA.b();
                this.a.a.sb();
                aqvg.a(aqteVar);
                return aqteVar;
            case 461:
                errl errlVar13 = (errl) this.a.p.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                ffsk ffskVar4 = (ffsk) this.a.a.aq.b();
                akis akisVar14 = this.a;
                Object qk = akisVar14.a.qk();
                aqgc aqgcVar = (aqgc) akisVar14.hu.b();
                akkp akkpVar23 = this.a.a;
                aqsn bf = akkpVar23.bf();
                fbbf fbbfVar21 = akkpVar23.ht;
                fbbf fbbfVar22 = akkpVar23.hu;
                Optional optional = (Optional) akkpVar23.gZ.b();
                akkp akkpVar24 = this.a.a;
                return new aqte(errlVar13, ffskVar3, ffskVar4, (aquw) qk, aqgcVar, bf, fbbfVar21, fbbfVar22, optional, akkpVar24.hz, (aqvt) akkpVar24.hk.b());
            case 462:
                akis akisVar15 = this.a;
                akkp akkpVar25 = akisVar15.a;
                return new aqsn(akkpVar25.c, akkpVar25.gD, akkpVar25.gT, akisVar15.hn, akkpVar25.fx, akkpVar25.Z, akkpVar25.gV, akkpVar25.el, akisVar15.t, akisVar15.p, akisVar15.aK, akkpVar25.gZ, akkpVar25.hf, akkpVar25.u, akkpVar25.hg, akkpVar25.hh, akkpVar25.hk, akkpVar25.ab, akkpVar25.hl, akkpVar25.hm, akkpVar25.hn, akkpVar25.ho, akkpVar25.aG, akkpVar25.hp);
            case 463:
                akis akisVar16 = this.a;
                akkp akkpVar26 = akisVar16.a;
                return new aqzb(akisVar16.hi, akisVar16.p, akkpVar26.br, akkpVar26.bj);
            case 464:
                return new aqwd(this.a.a.gS);
            case 465:
                akis akisVar17 = this.a;
                akkp akkpVar27 = akisVar17.a;
                return new aqwo(akkpVar27.gQ, akisVar17.hi, akisVar17.t, akkpVar27.cx, fbbg.a(akkpVar27.gR));
            case 466:
                akis akisVar18 = this.a;
                fbbf fbbfVar23 = akisVar18.cn;
                akkp akkpVar28 = akisVar18.a;
                return new ckac(akkpVar28.gE, akkpVar28.gN, akkpVar28.dn, akkpVar28.gO, akkpVar28.G, akkpVar28.bF, akkpVar28.gP, akkpVar28.u, (ffhd) fbbfVar23.b(), (ffhd) this.a.cP.b(), (ffsk) this.a.a.p.b());
            case 467:
                cose coseVar = (cose) this.a.a.bm.b();
                akkp akkpVar29 = this.a.a;
                return new djsz(coseVar, akkpVar29.gF, akkpVar29.gM, (ffsk) akkpVar29.aq.b(), (ffhd) this.a.cP.b());
            case 468:
                akis akisVar19 = this.a;
                akkp akkpVar30 = akisVar19.a;
                return new clwn(akkpVar30.bi, akkpVar30.bj, akisVar19.aQ, akkpVar30.gE, (ffsk) akkpVar30.aq.b());
            case 469:
                csjk csjkVar2 = (csjk) this.a.a.fQ.b();
                akis akisVar20 = this.a;
                fbbf fbbfVar24 = akisVar20.cP;
                akkp akkpVar31 = akisVar20.a;
                return new djsh(csjkVar2, akkpVar31.bj, akkpVar31.gJ, akisVar20.hl, akkpVar31.gL, (ffhd) fbbfVar24.b());
            case 470:
                return new dkcp((Context) this.a.q.b(), (dksa) this.a.a.gH.b(), (dkpp) this.a.aQ.b(), (errl) this.a.aK.b(), (dikw) this.a.a.gI.b(), (cguo) this.a.a.cK.b(), this.a.hk);
            case 471:
                return new dksa((Context) this.a.q.b(), (dijv) this.a.a.gG.b());
            case 472:
                return new dijv((Context) this.a.q.b(), (errl) this.a.aK.b(), (dkpp) this.a.aQ.b(), (dijt) this.a.a.cN.b());
            case 473:
                return new dikw((djix) this.a.a.cM.b(), (dkpp) this.a.aQ.b(), cmnc.a(), (errl) this.a.aK.b(), (dijt) this.a.a.cN.b());
            case 474:
                return new djtn((ctvb) this.a.a.u.b(), (djrk) this.a.a.bF.b(), (diwt) this.a.a.gK.b(), (dlpw) this.a.l.b());
            case 475:
                return new diuz();
            case 476:
                akis akisVar21 = this.a;
                akkp akkpVar32 = akisVar21.a;
                return new cjzj(akkpVar32.bi, akkpVar32.bj, akisVar21.aT, (ffsk) akkpVar32.aq.b());
            case 477:
                final fbbf fbbfVar25 = this.a.a.s;
                return new aulf() { // from class: aukj
                    @Override // defpackage.aulf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.check_self_endpoint_for_profiles");
                    }
                };
            case 478:
                return new aqwf((ctbk) this.a.hi.b(), (aolr) this.a.a.Z.b());
            case 479:
                akkp akkpVar33 = this.a.a;
                return new aqyr(akkpVar33.G, akkpVar33.gE, akkpVar33.Z, akkpVar33.gQ, akkpVar33.gU);
            case 480:
                final fbbf fbbfVar26 = this.a.a.s;
                return new atrn() { // from class: atos
                    @Override // defpackage.atrn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_use_rcs_local_identity_provider_in_mapi");
                    }
                };
            case 481:
                return Optional.of(this.a.a.bi());
            case 482:
                akis akisVar22 = this.a;
                akkp akkpVar34 = akisVar22.a;
                return new aqxm(akkpVar34.gW, akisVar22.ho, akisVar22.cz, akkpVar34.aq, akkpVar34.gX);
            case 483:
                return new aqxs((ffsk) this.a.a.aq.b());
            case 484:
                final fbbf fbbfVar27 = this.a.a.s;
                return new aulk() { // from class: aukt
                    @Override // defpackage.aulk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_self_profile_timestamp");
                    }
                };
            case 485:
                akkp akkpVar35 = this.a.a;
                return new aqyi(akkpVar35.bC, akkpVar35.bF, akkpVar35.hd, akkpVar35.he, akkpVar35.gV);
            case 486:
                return new akki(this);
            case 487:
                return new csuk((ctyx) this.a.aU.b(), (cpbs) this.a.a.ft.b(), Optional.of((djry) this.a.a.bC.b()), this.a.a.c);
            case 488:
                return this.a.a.dT();
            case 489:
                return new csmk((ctvb) this.a.a.u.b(), (aolr) this.a.a.Z.b());
            case 490:
                return new akkj(this);
            case 491:
                return new asrd() { // from class: arxz
                };
            case 492:
                final fbbf fbbfVar28 = this.a.a.s;
                return new atti() { // from class: atta
                    @Override // defpackage.atti
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.move_dunestar_business_logic_to_mapi");
                    }
                };
            case 493:
                akis akisVar23 = this.a;
                akkp akkpVar36 = akisVar23.a;
                return new aqvt(akisVar23.hi, akkpVar36.p, akkpVar36.hj);
            case 494:
                Context context7 = (Context) this.a.q.b();
                ffsk ffskVar5 = (ffsk) this.a.a.q.b();
                csjk csjkVar3 = (csjk) this.a.a.el.b();
                akkp akkpVar37 = this.a.a;
                return new cnph(context7, ffskVar5, csjkVar3, akkpVar37.oQ(), (ausa) akkpVar37.bR.b(), this.a.ga());
            case 495:
                return Long.valueOf(fdhl.a(this.a.a.oz()));
            case 496:
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                akkp akkpVar38 = this.a.a;
                return new aqzz(ffskVar6, akkpVar38.ef(), (aolr) akkpVar38.Z.b());
            case 497:
                return new aqzv(fbbg.a(this.a.a.ac), fbbg.a(this.a.ht));
            case 498:
                final fbbf fbbfVar29 = this.a.a.s;
                return new atte() { // from class: atss
                    @Override // defpackage.atte
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_media_on_supported_carriers");
                    }
                };
            case 499:
                return fdht.a(this.a.a.oA());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object D() {
        int i = this.b;
        switch (i) {
            case 500:
                final fbbf fbbfVar = this.a.a.s;
                return new attd() { // from class: atsq
                    @Override // defpackage.attd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_media_on_all_carriers");
                    }
                };
            case 501:
                return new akit(this);
            case 502:
                return new aqkd((dtuu) this.a.a.ay.b(), this.a.a.hr);
            case 503:
                final fbbf fbbfVar2 = this.a.a.s;
                return new asnw() { // from class: arsq
                    @Override // defpackage.asnw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_run_after_commit_dedup_id_collision");
                    }
                };
            case 504:
                return new akiu(this);
            case 505:
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new aqya(akkpVar.fu, akkpVar.fM, akkpVar.hy, (Context) akisVar.q.b());
            case 506:
                akis akisVar2 = this.a;
                akkp akkpVar2 = akisVar2.a;
                return new batz(akkpVar2.dn, akkpVar2.fs, akkpVar2.hv, akkpVar2.c, akkpVar2.u, akkpVar2.ds, akkpVar2.di, akkpVar2.hw, akkpVar2.hx, akkpVar2.dA, akkpVar2.ay, akkpVar2.Z, akisVar2.q);
            case 507:
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar3 = akkpVar3.dA;
                dtuu dtuuVar = (dtuu) akkpVar3.ay.b();
                akkp akkpVar4 = this.a.a;
                return new cgpv(fbbfVar3, dtuuVar, akkpVar4.dy, akkpVar4.dB, akkpVar4.dn, akkpVar4.fs, akkpVar4.C);
            case 508:
                return new cisl(this.a.a.cc);
            case 509:
                return new cish(this.a.a.cc);
            case 510:
                return new akiv(this);
            case 511:
                final fbbf fbbfVar4 = this.a.a.s;
                return new aulj() { // from class: aukr
                    @Override // defpackage.aulj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_self_profile_avatar_in_my_identity");
                    }
                };
            case 512:
                return new auic() { // from class: auhs
                };
            case 513:
                return Boolean.valueOf(fdgb.a(this.a.a.ou()));
            case 514:
                final fbbf fbbfVar5 = this.a.a.s;
                return new attl() { // from class: attj
                    @Override // defpackage.attl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_emergency_rcs_messaging");
                    }
                };
            case 515:
                return Long.valueOf(fdip.a(this.a.a.oF()));
            case 516:
                return new bacz(this.a.a.e);
            case 517:
                Context context = (Context) this.a.q.b();
                akkp akkpVar5 = this.a.a;
                return new crqh(context, akkpVar5.CY, (ffsk) akkpVar5.aq.b());
            case 518:
                akis akisVar3 = this.a;
                akkp akkpVar6 = akisVar3.a;
                return new crqf(akkpVar6.ip, akkpVar6.ic, akisVar3.cX, akkpVar6.wX, akkpVar6.hP, akkpVar6.ia, akkpVar6.ib, akkpVar6.iq, akkpVar6.cf, akisVar3.hA, akkpVar6.fo, akkpVar6.im, akkpVar6.dn, (ffsk) akkpVar6.q.b());
            case 519:
                Context context2 = (Context) this.a.q.b();
                akis akisVar4 = this.a;
                fbbf fbbfVar6 = akisVar4.cX;
                akkp akkpVar7 = akisVar4.a;
                fbbf fbbfVar7 = akkpVar7.hP;
                fbbf fbbfVar8 = akkpVar7.ia;
                fbbf fbbfVar9 = akkpVar7.ib;
                fbbf fbbfVar10 = akkpVar7.dn;
                crqw crqwVar = (crqw) fbbfVar6.b();
                akkp akkpVar8 = this.a.a;
                fbbf fbbfVar11 = akkpVar8.ic;
                croc crocVar = (croc) akkpVar8.id.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                akkp akkpVar9 = this.a.a;
                fbbf fbbfVar12 = akkpVar9.cf;
                dtuu dtuuVar2 = (dtuu) akkpVar9.ay.b();
                akis akisVar5 = this.a;
                akkp akkpVar10 = akisVar5.a;
                return new crrm(context2, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, crqwVar, fbbfVar11, crocVar, cbgfVar, fbbfVar12, dtuuVar2, akkpVar10.f22io, akisVar5.hA, (ffsk) akkpVar10.aq.b(), this.a.hB);
            case 520:
                akkp akkpVar11 = this.a.a;
                return ayhy.a(akkpVar11.hX, akkpVar11.hZ);
            case 521:
                akis akisVar6 = this.a;
                fbbf fbbfVar13 = akisVar6.aK;
                fbbf fbbfVar14 = akisVar6.a.hR;
                errl errlVar = (errl) fbbfVar13.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.p.b();
                fazb a = fbaz.a(this.a.a.hS);
                akis akisVar7 = this.a;
                fbbf fbbfVar15 = akisVar7.cN;
                fbbf fbbfVar16 = akisVar7.a.ay;
                ecrj ecrjVar = (ecrj) fbbfVar15.b();
                akis akisVar8 = this.a;
                akkp akkpVar12 = akisVar8.a;
                return new ayxm(fbbfVar14, errlVar, errlVar2, errlVar3, a, fbbfVar16, ecrjVar, akkpVar12.dn, akkpVar12.C, akkpVar12.hT, akkpVar12.L, akkpVar12.hU, akkpVar12.w, akisVar8.hw, akkpVar12.H, akkpVar12.hV, akkpVar12.hW);
            case 522:
                akis akisVar9 = this.a;
                return new ayyi(akisVar9.a.hQ, (errl) akisVar9.p.b(), this.a.a.aT);
            case 523:
                return new ayzq((errl) this.a.t.b(), (dtuu) this.a.a.ay.b());
            case 524:
                return new ayvs(this.a.a.H);
            case 525:
                final fbbf fbbfVar17 = this.a.a.s;
                return new atzt() { // from class: atyr
                    @Override // defpackage.atzt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.merge_mms_messages_into_rcs_groups");
                    }
                };
            case 526:
                akkp akkpVar13 = this.a.a;
                return new ayhu(akkpVar13.dn, akkpVar13.L);
            case 527:
                final fbbf fbbfVar18 = this.a.a.s;
                return new askm() { // from class: arnb
                    @Override // defpackage.askm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.conversation_creation_correctness_check");
                    }
                };
            case 528:
                final fbbf fbbfVar19 = this.a.a.s;
                return new aren() { // from class: arfh
                    @Override // defpackage.aren
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_sync_method_to_participant_matcher");
                    }
                };
            case 529:
                akis akisVar10 = this.a;
                akkp akkpVar14 = akisVar10.a;
                return new ayiu(akkpVar14.ay, akkpVar14.hX, akkpVar14.hY, (errl) akisVar10.t.b(), (errl) this.a.p.b(), (ecrj) this.a.cN.b());
            case 530:
                final fbbf fbbfVar20 = this.a.a.s;
                return new arel() { // from class: arfe
                    @Override // defpackage.arel
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_normalized_dest_to_conversation_matcher_cache_for_1_to_1_flag");
                    }
                };
            case 531:
                return new crql((Context) this.a.q.b(), (cpdg) this.a.a.ap.b());
            case 532:
                akkp akkpVar15 = this.a.a;
                return new cugm(akkpVar15.im, akkpVar15.in, (ffsk) akkpVar15.q.b());
            case 533:
                akis akisVar11 = this.a;
                fbbf fbbfVar21 = akisVar11.cP;
                akkp akkpVar16 = akisVar11.a;
                return new cugi(akkpVar16.ie, akkpVar16.ih, akkpVar16.ig, akkpVar16.ii, akkpVar16.ik, akkpVar16.ib, akkpVar16.dn, akkpVar16.dB, akkpVar16.Z, akkpVar16.il, akisVar11.cz, akkpVar16.el, (ffhd) fbbfVar21.b());
            case 534:
                return new cuha((effy) this.a.hx.b(), (cqoh) this.a.cz.b(), (dtuu) this.a.a.ay.b(), (ffsk) this.a.a.aq.b());
            case 535:
                Context context3 = (Context) this.a.q.b();
                akis akisVar12 = this.a;
                fbbf fbbfVar22 = akisVar12.cz;
                fbbf fbbfVar23 = akisVar12.a.ig;
                cqoh cqohVar = (cqoh) fbbfVar22.b();
                akis akisVar13 = this.a;
                return new culz(context3, fbbfVar23, cqohVar, akisVar13.aU, akisVar13.fL);
            case 536:
                Context context4 = (Context) this.a.q.b();
                akis akisVar14 = this.a;
                fbbf fbbfVar24 = akisVar14.cP;
                akkp akkpVar17 = akisVar14.a;
                return new culw(context4, akisVar14.fL, akisVar14.aU, akkpVar17.f8if, (ffhd) fbbfVar24.b());
            case 537:
                Context context5 = (Context) this.a.q.b();
                akis akisVar15 = this.a;
                return new cufk(context5, akisVar15.hy, (errl) akisVar15.aK.b(), (ffsk) this.a.a.aq.b());
            case 538:
                return new ahor((ctyz) this.a.fM.b(), (csjk) this.a.a.el.b());
            case 539:
                akis akisVar16 = this.a;
                fbbf fbbfVar25 = akisVar16.cP;
                akkp akkpVar18 = akisVar16.a;
                return new curb(akkpVar18.aT, akkpVar18.ij, (ffhd) fbbfVar25.b());
            case 540:
                akkp akkpVar19 = this.a.a;
                return new cuqw(akkpVar19.C, (ffsk) akkpVar19.p.b());
            case 541:
                cpdg cpdgVar = (cpdg) this.a.a.ap.b();
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                akkp akkpVar20 = this.a.a;
                return new aljt(cpdgVar, ctvbVar, akkpVar20.Z, (asvn) akkpVar20.Q.b());
            case 542:
                akis akisVar17 = this.a;
                fbbf fbbfVar26 = akisVar17.cz;
                return new cufu(akisVar17.q, akisVar17.hz, akisVar17.a.be, (cqoh) fbbfVar26.b(), (ffsk) this.a.a.q.b());
            case 543:
                akkp akkpVar21 = this.a.a;
                fbbf fbbfVar27 = akkpVar21.iw;
                fbbf fbbfVar28 = akkpVar21.CV;
                fbbf fbbfVar29 = akkpVar21.CX;
                croc crocVar2 = (croc) akkpVar21.id.b();
                akkp akkpVar22 = this.a.a;
                fbbf fbbfVar30 = akkpVar22.ib;
                fbbf fbbfVar31 = akkpVar22.dn;
                fbbf fbbfVar32 = akkpVar22.iq;
                fbbf fbbfVar33 = akkpVar22.xb;
                dtuu dtuuVar3 = (dtuu) akkpVar22.ay.b();
                akis akisVar18 = this.a;
                return new cucf(fbbfVar27, fbbfVar28, fbbfVar29, crocVar2, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, dtuuVar3, akisVar18.a.f22io, akisVar18.hB);
            case 544:
                akkp akkpVar23 = this.a.a;
                return new cuwv(akkpVar23.ib, akkpVar23.dn, akkpVar23.dB, akkpVar23.iq, akkpVar23.it, akkpVar23.iv, (ffsk) akkpVar23.q.b(), (ffsk) this.a.a.aq.b());
            case 545:
                akis akisVar19 = this.a;
                akkp akkpVar24 = akisVar19.a;
                return new cuvp(akkpVar24.ib, akkpVar24.dn, akkpVar24.dB, akisVar19.cz, (dtuu) akkpVar24.ay.b(), (ffsk) this.a.a.aq.b());
            case 546:
                akis akisVar20 = this.a;
                fbbf fbbfVar34 = akisVar20.co;
                akkp akkpVar25 = akisVar20.a;
                return new cuwf(akkpVar25.ir, akkpVar25.ap, akkpVar25.dE, akisVar20.cz, akkpVar25.cp, akkpVar25.ib, akisVar20.hC, akkpVar25.is, akkpVar25.ie, akkpVar25.c, (ffhd) fbbfVar34.b());
            case 547:
                return new cuvq(this.a.a.aW);
            case 548:
                return new cuma((Context) this.a.q.b(), this.a.a.u);
            case 549:
                akkp akkpVar26 = this.a.a;
                return new culs(akkpVar26.iq, akkpVar26.cf, akkpVar26.iu, akkpVar26.f22io, (ffsk) akkpVar26.aq.b());
            case 550:
                akkp akkpVar27 = this.a.a;
                return new cufr(akkpVar27.im, akkpVar27.in, (ffsk) akkpVar27.p.b(), (ffsk) this.a.a.aq.b());
            case 551:
                Context context6 = (Context) this.a.q.b();
                akkp akkpVar28 = this.a.a;
                return new cujh(context6, akkpVar28.nT, akkpVar28.dB, akkpVar28.ib, akkpVar28.ia, akkpVar28.CT, akkpVar28.iy, akkpVar28.aO, akkpVar28.Z, akkpVar28.CU, akkpVar28.ft, (ffsk) akkpVar28.aq.b());
            case 552:
                akkp akkpVar29 = this.a.a;
                return new bagj(akkpVar29.fr, akkpVar29.dn, akkpVar29.ay, akkpVar29.Z, akkpVar29.ix, akkpVar29.iz, akkpVar29.iA, akkpVar29.CS, akkpVar29.Bh, akkpVar29.Bm, akkpVar29.mV, akkpVar29.le);
            case 553:
                Context context7 = (Context) this.a.q.b();
                akkp akkpVar30 = this.a.a;
                return new cipm(context7, akkpVar30.az, akkpVar30.aT);
            case 554:
                akis akisVar21 = this.a;
                akkp akkpVar31 = akisVar21.a;
                return new azzz(akkpVar31.iy, akkpVar31.fr, (errl) akisVar21.t.b());
            case 555:
                akis akisVar22 = this.a;
                akkp akkpVar32 = akisVar22.a;
                fbbf fbbfVar35 = akisVar22.fM;
                fbbf fbbfVar36 = akkpVar32.iD;
                fbbf fbbfVar37 = akkpVar32.iE;
                fbbf fbbfVar38 = akkpVar32.CK;
                fbbf fbbfVar39 = akkpVar32.CL;
                fbbf fbbfVar40 = akkpVar32.dk;
                fbbf fbbfVar41 = akkpVar32.dl;
                fbbf fbbfVar42 = akkpVar32.dm;
                fbbf fbbfVar43 = akkpVar32.CM;
                fbbf fbbfVar44 = akkpVar32.BU;
                csjk csjkVar = (csjk) akkpVar32.el.b();
                akis akisVar23 = this.a;
                akkp akkpVar33 = akisVar23.a;
                fbbf fbbfVar45 = akkpVar33.je;
                fbbf fbbfVar46 = akkpVar33.fP;
                fbbf fbbfVar47 = akkpVar33.fQ;
                bbfo bbfoVar = (bbfo) akisVar23.jU.b();
                akis akisVar24 = this.a;
                fbbf fbbfVar48 = akisVar24.cT;
                akkp akkpVar34 = akisVar24.a;
                fbbf fbbfVar49 = akkpVar34.cG;
                fbbf fbbfVar50 = akkpVar34.CP;
                fbbf fbbfVar51 = akkpVar34.CQ;
                fbbf fbbfVar52 = akkpVar34.br;
                ctud ctudVar = (ctud) fbbfVar48.b();
                akis akisVar25 = this.a;
                akkp akkpVar35 = akisVar25.a;
                return new clwx(fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, fbbfVar40, fbbfVar41, fbbfVar42, fbbfVar43, fbbfVar44, csjkVar, fbbfVar45, fbbfVar46, fbbfVar47, bbfoVar, fbbfVar49, fbbfVar50, fbbfVar51, fbbfVar52, ctudVar, akkpVar35.gQ, akkpVar35.CR, (errl) akisVar25.p.b());
            case 556:
                akkp akkpVar36 = this.a.a;
                fbbf fbbfVar53 = akkpVar36.iB;
                fbbf fbbfVar54 = akkpVar36.iC;
                return new bbax(fbbfVar53, fbbfVar54, fbbfVar53, fbbfVar54);
            case 557:
                akis akisVar26 = this.a;
                akkp akkpVar37 = akisVar26.a;
                return new bbbe(akkpVar37.p, akkpVar37.iA, akisVar26.hD);
            case 558:
                return new bbbh(this.a.a.iA);
            case 559:
                akkp akkpVar38 = this.a.a;
                return new baxl(akkpVar38.iE, akkpVar38.iA, akkpVar38.tA);
            case 560:
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                Context context8 = (Context) this.a.q.b();
                akkp akkpVar39 = this.a.a;
                fbbf fbbfVar55 = akkpVar39.dB;
                fbbf fbbfVar56 = akkpVar39.fP;
                avkk avkkVar = (avkk) this.a.a.cH.b();
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                clws clwsVar = (clws) this.a.a.iA.b();
                akis akisVar27 = this.a;
                akkp akkpVar40 = akisVar27.a;
                return new cluu(ctyxVar, context8, fbbfVar55, fbbfVar56, avkkVar, dtuuVar4, clwsVar, akkpVar40.iy, akkpVar40.uH, akkpVar40.CI, akkpVar40.nJ, akkpVar40.CJ, akkpVar40.G, akkpVar40.ib, akkpVar40.kR, akkpVar40.uG, (errl) akisVar27.p.b());
            case 561:
                akkp akkpVar41 = this.a.a;
                return new cfsj(akkpVar41.fm(), (asqi) akkpVar41.mV.b());
            case 562:
                avkj avkjVar = (avkj) this.a.a.jf.b();
                awtm awtmVar = (awtm) this.a.iz.b();
                avtu avtuVar = (avtu) this.a.lD.b();
                avla avlaVar = (avla) this.a.lC.b();
                akis akisVar28 = this.a;
                fbbf fbbfVar57 = akisVar28.aK;
                akkp akkpVar42 = akisVar28.a;
                fbbf fbbfVar58 = akkpVar42.uL;
                fbbf fbbfVar59 = akkpVar42.nK;
                fbbf fbbfVar60 = akkpVar42.kR;
                errl errlVar4 = (errl) fbbfVar57.b();
                akis akisVar29 = this.a;
                return new couo(avkjVar, awtmVar, avtuVar, avlaVar, fbbfVar58, fbbfVar59, fbbfVar60, errlVar4, akisVar29.a.yq, (avuh) akisVar29.hd.b(), (cslr) this.a.iq.b(), (avtx) this.a.jE.b(), (cpev) this.a.a.gp.b());
            case 563:
                akkp akkpVar43 = this.a.a;
                return new awtl(akkpVar43.rf(), akkpVar43.cG);
            case 564:
                akis akisVar30 = this.a;
                akkp akkpVar44 = akisVar30.a;
                clgs co = akisVar30.co();
                Object qh = akkpVar44.qh();
                club clubVar = (club) akkpVar44.BT.b();
                akkp akkpVar45 = this.a.a;
                Object qm = akkpVar45.qm();
                clue clueVar = (clue) akkpVar45.BW.b();
                akkp akkpVar46 = this.a.a;
                Object oX = akkpVar46.oX();
                clti cltiVar = (clti) akkpVar46.BX.b();
                akkp akkpVar47 = this.a.a;
                clev jb = akkpVar47.jb();
                cltm cltmVar = (cltm) akkpVar47.BY.b();
                akkp akkpVar48 = this.a.a;
                clhl jd = akkpVar48.jd();
                clty cltyVar = (clty) akkpVar48.BZ.b();
                akkp akkpVar49 = this.a.a;
                clid jf = akkpVar49.jf();
                clun clunVar = (clun) akkpVar49.Ca.b();
                akkp akkpVar50 = this.a.a;
                clia je = akkpVar50.je();
                cluk clukVar = (cluk) akkpVar50.Cb.b();
                akis akisVar31 = this.a;
                cles clesVar = (cles) oX;
                return new clhh(co, (clhp) qh, clubVar, (clhx) qm, clueVar, clesVar, cltiVar, jb, cltmVar, jd, cltyVar, jf, clunVar, je, clukVar, akisVar31.a.jg(), (errl) akisVar31.p.b());
            case 565:
                akkp akkpVar51 = this.a.a;
                fbbf fbbfVar61 = akkpVar51.u;
                fbbf fbbfVar62 = akkpVar51.Bz;
                awnv dK = akkpVar51.dK();
                awnw dL = akkpVar51.dL();
                fbbf fbbfVar63 = akkpVar51.wM;
                awgx dA = akkpVar51.dA();
                awgq dx = akkpVar51.dx();
                awgv dz = akkpVar51.dz();
                awgt dy = akkpVar51.dy();
                akvz akvzVar = (akvz) akkpVar51.dE.b();
                akis akisVar32 = this.a;
                fbbf fbbfVar64 = akisVar32.a.uL;
                errl errlVar5 = (errl) akisVar32.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                akis akisVar33 = this.a;
                clie jg = akisVar33.a.jg();
                avuh avuhVar = (avuh) akisVar33.hd.b();
                cetc cetcVar = (cetc) this.a.a.yh.b();
                akkp akkpVar52 = this.a.a;
                return new awoo(fbbfVar61, fbbfVar62, dK, dL, fbbfVar63, dA, dx, dz, dy, akvzVar, fbbfVar64, errlVar5, errlVar6, jg, avuhVar, cetcVar, akkpVar52.f, akkpVar52.BJ, akkpVar52.wL, akkpVar52.BR, akkpVar52.xC, akkpVar52.xD, (atmb) akkpVar52.kS.b());
            case 566:
                bbfr bbfrVar = (bbfr) this.a.a.jj.b();
                cfyt cfytVar = (cfyt) this.a.a.cf.b();
                akis akisVar34 = this.a;
                akkp akkpVar53 = akisVar34.a;
                fbbf fbbfVar65 = akkpVar53.dB;
                fbbf fbbfVar66 = akkpVar53.fP;
                cnkb jJ = akkpVar53.jJ();
                avla avlaVar2 = (avla) akisVar34.lC.b();
                avtu avtuVar2 = (avtu) this.a.lD.b();
                akis akisVar35 = this.a;
                akkp akkpVar54 = akisVar35.a;
                fbbf fbbfVar67 = akkpVar54.Bu;
                fbbf fbbfVar68 = akkpVar54.By;
                Map iU = akis.iU();
                errl errlVar7 = (errl) akisVar35.p.b();
                errl errlVar8 = (errl) this.a.aK.b();
                akis akisVar36 = this.a;
                fbbf fbbfVar69 = akisVar36.cz;
                akkp akkpVar55 = akisVar36.a;
                fbbf fbbfVar70 = akkpVar55.yq;
                fbbf fbbfVar71 = akkpVar55.yk;
                cqoh cqohVar2 = (cqoh) fbbfVar69.b();
                autk autkVar = (autk) this.a.a.Bn.b();
                return new awrg(bbfrVar, cfytVar, fbbfVar65, fbbfVar66, jJ, avlaVar2, avtuVar2, fbbfVar67, fbbfVar68, iU, errlVar7, errlVar8, fbbfVar70, fbbfVar71, cqohVar2, autkVar, this.a.a.kR);
            case 567:
                akkp akkpVar56 = this.a.a;
                return new baoj(akkpVar56.Br, akkpVar56.Bt);
            case 568:
                Context context9 = (Context) this.a.q.b();
                covr covrVar = (covr) this.a.a.iM.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                Object b = this.a.a.AI.b();
                akkp akkpVar57 = this.a.a;
                fbbf fbbfVar72 = akkpVar57.dB;
                bdtd bdtdVar = (bdtd) akkpVar57.aO.b();
                dtuu dtuuVar5 = (dtuu) this.a.a.ay.b();
                akkp akkpVar58 = this.a.a;
                fbbf fbbfVar73 = akkpVar58.Q;
                fbbf fbbfVar74 = akkpVar58.yg;
                aslt asltVar = (aslt) akkpVar58.iL.b();
                akis akisVar37 = this.a;
                return baok.a(context9, covrVar, cqohVar3, coxkVar, cpbsVar, b, fbbfVar72, bdtdVar, dtuuVar5, fbbfVar73, fbbfVar74, asltVar, akisVar37.a.al, (errl) akisVar37.aK.b());
            case 569:
                cpaw cpawVar = (cpaw) this.a.a.em.b();
                cpbs cpbsVar2 = (cpbs) this.a.a.ft.b();
                csjk csjkVar2 = (csjk) this.a.a.el.b();
                ctvb ctvbVar2 = (ctvb) this.a.a.u.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                cnjt cnjtVar = (cnjt) this.a.a.iG.b();
                fazb a2 = fbaz.a(this.a.a.fP);
                csrv csrvVar = (csrv) this.a.a.iK.b();
                akkp akkpVar59 = this.a.a;
                return new covr(cpawVar, cpbsVar2, csjkVar2, ctvbVar2, ctwbVar, cnjtVar, a2, csrvVar, akkpVar59.g(), (aslt) akkpVar59.iL.b());
            case 570:
                return new cnfb((Context) this.a.q.b(), (cpdg) this.a.a.ap.b(), (bbcf) this.a.a.fI.b(), (bbfd) this.a.a.iF.b());
            case 571:
                akis akisVar38 = this.a;
                akkp akkpVar60 = akisVar38.a;
                return new csrv(akkpVar60.db, akisVar38.hE, akkpVar60.iH, fbaz.a(akkpVar60.iJ), (ffsk) this.a.a.q.b());
            case 572:
                akkp akkpVar61 = this.a.a;
                return new csrw(akkpVar61.db, akkpVar61.c);
            case 573:
                akis akisVar39 = this.a;
                akkp akkpVar62 = akisVar39.a;
                return new cssu(akkpVar62.aT, akkpVar62.iI, akisVar39.hF, (ffsk) akkpVar62.p.b());
            case 574:
                return new ashc() { // from class: arhe
                };
            case 575:
                final fbbf fbbfVar75 = this.a.a.s;
                return new aslt() { // from class: arpi
                    @Override // defpackage.aslt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_satellite_mms_retry");
                    }
                };
            case 576:
                akkp akkpVar63 = this.a.a;
                fbbf fbbfVar76 = akkpVar63.dn;
                fbbf fbbfVar77 = akkpVar63.iP;
                fbbf fbbfVar78 = akkpVar63.dB;
                altk altkVar = (altk) akkpVar63.fP.b();
                ctvb ctvbVar3 = (ctvb) this.a.a.u.b();
                cpdg cpdgVar2 = (cpdg) this.a.a.ap.b();
                Optional optional = (Optional) this.a.a.jb.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                ckds ckdsVar = (ckds) this.a.a.dp.b();
                cvlf cvlfVar = (cvlf) this.a.a.hG.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                cpbs cpbsVar3 = (cpbs) this.a.a.ft.b();
                cins cinsVar = (cins) this.a.a.jc.b();
                covo covoVar = (covo) this.a.a.jd.b();
                aliv alivVar = (aliv) this.a.ig.b();
                cisl cislVar = (cisl) this.a.a.hw.b();
                bbfq bbfqVar = (bbfq) this.a.a.je.b();
                bdvi bdviVar = (bdvi) this.a.a.jh.b();
                bbhf bbhfVar = (bbhf) this.a.a.pf.b();
                Optional optional2 = (Optional) this.a.a.Bo.b();
                Optional of = Optional.of(this.a.a.jw());
                csrv csrvVar2 = (csrv) this.a.a.iK.b();
                akkp akkpVar64 = this.a.a;
                fbbf fbbfVar79 = akkpVar64.Bp;
                cbgf cbgfVar2 = (cbgf) akkpVar64.dA.b();
                Optional of2 = Optional.of((cpdd) this.a.a.jo.b());
                akkp akkpVar65 = this.a.a;
                bbbo eJ = akkpVar65.eJ();
                bbbr bbbrVar = (bbbr) akkpVar65.xP.b();
                akis akisVar40 = this.a;
                akkp akkpVar66 = akisVar40.a;
                fbbf fbbfVar80 = akkpVar66.yf;
                fbbf fbbfVar81 = akkpVar66.eo;
                fbbf fbbfVar82 = akkpVar66.aO;
                fbbf fbbfVar83 = akkpVar66.iz;
                errl errlVar9 = (errl) akisVar40.t.b();
                alwb alwbVar = (alwb) this.a.mg.b();
                cpez cpezVar = (cpez) this.a.a.xT.b();
                akis akisVar41 = this.a;
                fbbf fbbfVar84 = akisVar41.aK;
                akkp akkpVar67 = akisVar41.a;
                fbbf fbbfVar85 = akkpVar67.xU;
                fbbf fbbfVar86 = akkpVar67.pP;
                fbbf fbbfVar87 = akkpVar67.sl;
                errl errlVar10 = (errl) fbbfVar84.b();
                azei azeiVar = (azei) this.a.a.sm.b();
                akkp akkpVar68 = this.a.a;
                fbbf fbbfVar88 = akkpVar68.pK;
                cmlm cmlmVar = (cmlm) akkpVar68.yd.b();
                akkp akkpVar69 = this.a.a;
                fbbf fbbfVar89 = akkpVar69.fq;
                fbbf fbbfVar90 = akkpVar69.iN;
                bdge eQ = akkpVar69.eQ();
                asvn asvnVar = (asvn) akkpVar69.Q.b();
                akkp akkpVar70 = this.a.a;
                fbbf fbbfVar91 = akkpVar70.Bq;
                asmj asmjVar = (asmj) akkpVar70.jD.b();
                akkp akkpVar71 = this.a.a;
                return new baxz(fbbfVar76, fbbfVar77, fbbfVar78, altkVar, ctvbVar3, cpdgVar2, optional, akztVar, ckdsVar, cvlfVar, cqohVar4, cpbsVar3, cinsVar, covoVar, alivVar, cislVar, bbfqVar, bdviVar, bbhfVar, optional2, of, csrvVar2, fbbfVar79, cbgfVar2, of2, eJ, bbbrVar, fbbfVar80, fbbfVar81, fbbfVar82, fbbfVar83, errlVar9, alwbVar, cpezVar, fbbfVar85, fbbfVar86, fbbfVar87, errlVar10, azeiVar, fbbfVar88, cmlmVar, fbbfVar89, fbbfVar90, eQ, asvnVar, fbbfVar91, asmjVar, akkpVar71.jF, akkpVar71.hJ, akkpVar71.fO);
            case 577:
                akkp akkpVar72 = this.a.a;
                return new bdfw(akkpVar72.f, akkpVar72.iO, akkpVar72.Z, akkpVar72.dn);
            case 578:
                akkp akkpVar73 = this.a.a;
                fbbf fbbfVar92 = akkpVar73.ds;
                fbbf fbbfVar93 = akkpVar73.dB;
                fbbf fbbfVar94 = akkpVar73.f;
                coxk coxkVar2 = (coxk) akkpVar73.iN.b();
                akkp akkpVar74 = this.a.a;
                return new cbee(fbbfVar92, fbbfVar93, fbbfVar94, coxkVar2, akkpVar74.Z, akkpVar74.aF);
            case 579:
                return Optional.of(this.a.a.M());
            case 580:
                return Optional.of(this.a.a.N());
            case 581:
                cgmf cgmfVar = (cgmf) this.a.a.iX.b();
                Context context10 = (Context) this.a.q.b();
                errl errlVar11 = (errl) this.a.t.b();
                errl errlVar12 = (errl) this.a.aK.b();
                errl errlVar13 = (errl) this.a.p.b();
                akis akisVar42 = this.a;
                return new cwme(cgmfVar, context10, errlVar11, errlVar12, errlVar13, akisVar42.ee(), (albq) akisVar42.a.di.b(), this.a.a.cf);
            case 582:
                akis akisVar43 = this.a;
                akkp akkpVar75 = akisVar43.a;
                fbbf fbbfVar95 = akkpVar75.iQ;
                fbbf fbbfVar96 = akkpVar75.iW;
                fbbf fbbfVar97 = akisVar43.hY;
                errl errlVar14 = (errl) akisVar43.t.b();
                errl errlVar15 = (errl) this.a.p.b();
                akis akisVar44 = this.a;
                return cgnj.a(fbbfVar95, fbbfVar96, fbbfVar97, errlVar14, errlVar15, akisVar44.ie, (ctvs) akisVar44.aZ.b());
            case 583:
                return dybz.a((Context) this.a.q.b(), (errl) this.a.aK.b(), (engw) this.a.a.iV.b(), (dwxk) this.a.ia.b(), (efbm) this.a.hR.b(), (dxxg) this.a.hP.b(), emxc.j((dxxc) this.a.hQ.b()), (emyl) this.a.hS.b(), emxc.j((dxam) this.a.ib.b()), (dwxo) this.a.ic.b(), (dxwx) this.a.hH.b(), (dwxf) this.a.id.b(), (efgc) this.a.hU.b(), emxc.h(), emxc.h(), (dwqy) this.a.hG.b(), emxc.h(), emxc.h());
            case 584:
                akis akisVar45 = this.a;
                return cgni.a(akisVar45.a.rv(), (dwqt) akisVar45.hX.b(), (String) this.a.hW.b(), (dwqt) this.a.hY.b());
            case 585:
                Context context11 = (Context) this.a.q.b();
                akkp akkpVar76 = this.a.a;
                Geller mf = akkpVar76.mf();
                String qE = akkpVar76.qE();
                String qD = akkpVar76.qD();
                cgnx cgnxVar = new cgnx();
                dybe dybeVar = new dybe();
                akis akisVar46 = this.a;
                return cgol.a(context11, mf, qE, qD, cgnxVar, dybeVar, akisVar46.dJ(), (ExecutorService) akisVar46.p.b(), (ExecutorService) this.a.aK.b(), (ExecutorService) this.a.t.b(), this.a.a.qP());
            case 586:
                return fddj.a(this.a.a.oi());
            case 587:
                return fddi.a(this.a.a.oi());
            case 588:
                return fddh.a(this.a.a.oi());
            case 589:
                akis akisVar47 = this.a;
                return new cgns(akisVar47.a.dF, (Executor) akisVar47.p.b());
            case 590:
                final fbbf fbbfVar98 = this.a.a.s;
                return new aubt() { // from class: aubq
                    @Override // defpackage.aubt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_linkify_background_activity_allowed");
                    }
                };
            case 591:
                Context context12 = (Context) this.a.q.b();
                akis akisVar48 = this.a;
                akkp akkpVar77 = akisVar48.a;
                fbbf fbbfVar99 = akisVar48.f4if;
                cpbs cpbsVar4 = (cpbs) akkpVar77.ft.b();
                akkp akkpVar78 = this.a.a;
                fbbf fbbfVar100 = akkpVar78.iN;
                bcwz bcwzVar = (bcwz) akkpVar78.ad.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                akkp akkpVar79 = this.a.a;
                return new covo(context12, fbbfVar99, cpbsVar4, fbbfVar100, bcwzVar, byzpVar, akkpVar79.dy, akkpVar79.aw);
            case 592:
                return new bbfq((cqoh) this.a.cz.b(), this.a.a.eB());
            case 593:
                ffhd ffhdVar = (ffhd) this.a.co.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akkp akkpVar80 = this.a.a;
                return new ckce(ffhdVar, ffskVar, akkpVar80.jf, akkpVar80.C);
            case 594:
                Context context13 = (Context) this.a.q.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                akkp akkpVar81 = this.a.a;
                fbbf fbbfVar101 = akkpVar81.ib;
                fbbf fbbfVar102 = akkpVar81.dn;
                fbbf fbbfVar103 = akkpVar81.fs;
                fbbf fbbfVar104 = akkpVar81.aO;
                fbbf fbbfVar105 = akkpVar81.hK;
                altk altkVar2 = (altk) akkpVar81.fP.b();
                fazb a3 = fbaz.a(this.a.a.iN);
                Optional of3 = Optional.of((cpbz) this.a.a.ji.b());
                bbge bbgeVar = (bbge) this.a.a.Bm.b();
                dtuu dtuuVar6 = (dtuu) this.a.a.ay.b();
                csrv csrvVar3 = (csrv) this.a.a.iK.b();
                aolr aolrVar = (aolr) this.a.a.Z.b();
                cbut cbutVar = (cbut) this.a.a.qJ.b();
                Optional optional3 = (Optional) this.a.a.pg.b();
                cmlm cmlmVar2 = (cmlm) this.a.a.yd.b();
                akkp akkpVar82 = this.a.a;
                return new bbhf(context13, cqohVar5, fbbfVar101, fbbfVar102, fbbfVar103, fbbfVar104, fbbfVar105, altkVar2, a3, of3, bbgeVar, dtuuVar6, csrvVar3, aolrVar, cbutVar, optional3, cmlmVar2, akkpVar82.hw, akkpVar82.Bn);
            case 595:
                return new dean((cpbs) this.a.a.ft.b());
            case 596:
                akis akisVar49 = this.a;
                akkp akkpVar83 = akisVar49.a;
                fbbf fbbfVar106 = akisVar49.q;
                fbbf fbbfVar107 = akkpVar83.jj;
                fbbf fbbfVar108 = akkpVar83.br;
                fbbf fbbfVar109 = akkpVar83.AH;
                fbbf fbbfVar110 = akkpVar83.aO;
                fbbf fbbfVar111 = akkpVar83.AI;
                fbbf fbbfVar112 = akkpVar83.iN;
                fbbf fbbfVar113 = akkpVar83.AL;
                fbbf fbbfVar114 = akisVar49.cz;
                fbbf fbbfVar115 = akkpVar83.fP;
                fbbf fbbfVar116 = akkpVar83.di;
                fbbf fbbfVar117 = akkpVar83.c;
                fbbf fbbfVar118 = akkpVar83.kj;
                fbbf fbbfVar119 = akkpVar83.ds;
                fbbf fbbfVar120 = akkpVar83.AN;
                fbbf fbbfVar121 = akkpVar83.iK;
                fbbf fbbfVar122 = akkpVar83.fJ;
                fbbf fbbfVar123 = akisVar49.aK;
                fbbf fbbfVar124 = akisVar49.cI;
                fbbf fbbfVar125 = akisVar49.me;
                fbbf fbbfVar126 = akkpVar83.AQ;
                fbbf fbbfVar127 = akkpVar83.oO;
                fbbf fbbfVar128 = akkpVar83.AR;
                fbbf fbbfVar129 = akkpVar83.AS;
                fbbf fbbfVar130 = akkpVar83.AT;
                fbbf fbbfVar131 = akkpVar83.nK;
                fbbf fbbfVar132 = akkpVar83.ky;
                fbbf fbbfVar133 = akkpVar83.gC;
                fbbf fbbfVar134 = akkpVar83.eT;
                fbbf fbbfVar135 = akisVar49.mf;
                fbbf fbbfVar136 = akkpVar83.pd;
                fbbf fbbfVar137 = akkpVar83.xP;
                fbbf fbbfVar138 = akkpVar83.jG;
                fbbf fbbfVar139 = akkpVar83.Z;
                fbbf fbbfVar140 = akkpVar83.gp;
                fbbf fbbfVar141 = akkpVar83.AW;
                return new baws(fbbfVar106, fbbfVar107, fbbfVar108, fbbfVar109, fbbfVar110, fbbfVar111, fbbfVar112, fbbfVar113, fbbfVar114, fbbfVar115, fbbfVar116, fbbfVar117, fbbfVar118, fbbfVar119, fbbfVar120, fbbfVar121, fbbfVar122, fbbfVar123, fbbfVar124, fbbfVar125, fbbfVar126, fbbfVar127, fbbfVar128, fbbfVar129, fbbfVar130, fbbfVar131, fbbfVar132, fbbfVar133, fbbfVar134, fbbfVar135, fbbfVar136, fbbfVar137, fbbfVar138, fbbfVar139, fbbfVar140, fbbfVar141, fbbfVar141, akisVar49.mg, akkpVar83.AX, akkpVar83.Q, akkpVar83.AY, akkpVar83.yd, akkpVar83.Bh, akkpVar83.yg, akkpVar83.oQ, akkpVar83.pr, akkpVar83.oz, akkpVar83.dB, akkpVar83.al, akkpVar83.pa, akkpVar83.Bi, akkpVar83.Bj, akkpVar83.yu, akisVar49.iq, akkpVar83.xJ, akkpVar83.Bl);
            case 597:
                akkp akkpVar84 = this.a.a;
                return new cbdx(akkpVar84.f, akkpVar84.iN, Optional.of(akkpVar84.AG), this.a.a.jG);
            case 598:
                Context context14 = (Context) this.a.q.b();
                dtuu dtuuVar7 = (dtuu) this.a.a.ay.b();
                akkp akkpVar85 = this.a.a;
                fbbf fbbfVar142 = akkpVar85.ib;
                fbbf fbbfVar143 = akkpVar85.dn;
                fbbf fbbfVar144 = akkpVar85.jk;
                fbbf fbbfVar145 = akkpVar85.iP;
                coxk coxkVar3 = (coxk) akkpVar85.iN.b();
                byzp byzpVar2 = (byzp) this.a.a.iy.b();
                bcwz bcwzVar2 = (bcwz) this.a.a.ad.b();
                akkp akkpVar86 = this.a.a;
                ccpr fT = akkpVar86.fT();
                comy comyVar = (comy) akkpVar86.aT.b();
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                errl errlVar16 = (errl) this.a.aK.b();
                akkp akkpVar87 = this.a.a;
                fbbf fbbfVar146 = akkpVar87.bi;
                fbbf fbbfVar147 = akkpVar87.az;
                fbbf fbbfVar148 = akkpVar87.jl;
                fbbf fbbfVar149 = akkpVar87.c;
                fbbf fbbfVar150 = akkpVar87.dv;
                fbbf fbbfVar151 = akkpVar87.aO;
                Optional optional4 = (Optional) akkpVar87.jp.b();
                akis akisVar50 = this.a;
                akkp akkpVar88 = akisVar50.a;
                return new cpvp(context14, dtuuVar7, fbbfVar142, fbbfVar143, fbbfVar144, fbbfVar145, coxkVar3, byzpVar2, bcwzVar2, fT, comyVar, cqohVar6, errlVar16, fbbfVar146, fbbfVar147, fbbfVar148, fbbfVar149, fbbfVar150, fbbfVar151, optional4, akkpVar88.jx, akkpVar88.jv, akkpVar88.js, akkpVar88.jy, akkpVar88.iN, akkpVar88.jq, akkpVar88.jG, akisVar50.ij, akkpVar88.jH, akkpVar88.jI, akkpVar88.AF, (asmj) akkpVar88.jD.b(), this.a.a.jF);
            case 599:
                dtuu dtuuVar8 = (dtuu) this.a.a.ay.b();
                akkp akkpVar89 = this.a.a;
                return new bdes(dtuuVar8, akkpVar89.fs, akkpVar89.hv);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [bznw, java.lang.Object] */
    private final Object E() {
        int i = this.b;
        switch (i) {
            case 600:
                return Optional.of(this.a.a.jo);
            case 601:
                return new aknj(this.a.a.jn);
            case 602:
                return new akne((Context) this.a.q.b(), this.a.a.jm);
            case 603:
                Context context = (Context) this.a.q.b();
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.a.aT;
                return new adat(context, fbbfVar, Optional.of(new adav()), (akmj) this.a.cq.b());
            case 604:
                Context context2 = (Context) this.a.q.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                bazb bazbVar = (bazb) this.a.a.jq.b();
                cerb cerbVar = (cerb) this.a.a.jr.b();
                akkp akkpVar = this.a.a;
                return new cngp(context2, ctyxVar, ctudVar, bazbVar, cerbVar, akkpVar.jt, akkpVar.jw);
            case 605:
                return new cerb(this.a.a.cc);
            case 606:
                return new cpwx((cevh) this.a.a.cc.b(), (comy) this.a.a.aT.b(), (cqoh) this.a.cz.b(), this.a.a.js);
            case 607:
                akis akisVar2 = this.a;
                return new cpvw(akisVar2.a.aT, (cqoh) akisVar2.cz.b());
            case 608:
                akis akisVar3 = this.a;
                fbbf fbbfVar2 = akisVar3.a.ju;
                cqoh cqohVar = (cqoh) akisVar3.cz.b();
                akis akisVar4 = this.a;
                cpwv kD = akisVar4.a.kD();
                coyq coyqVar = (coyq) akisVar4.a.iN.b();
                akkp akkpVar2 = this.a.a;
                return new cpwl(fbbfVar2, cqohVar, kD, coyqVar, akkpVar2.f, akkpVar2.jv);
            case 609:
                akis akisVar5 = this.a;
                return enip.s(akisVar5.a.kA(), akisVar5.a.kC(), akisVar5.a.kB());
            case 610:
                akis akisVar6 = this.a;
                return new cptp(akisVar6.cT, akisVar6.a.u, (Context) akisVar6.q.b());
            case 611:
                akis akisVar7 = this.a;
                return new cpxj(akisVar7.a.jX(), (errl) akisVar7.p.b(), (cqoh) this.a.cz.b());
            case 612:
                akis akisVar8 = this.a;
                akkp akkpVar3 = akisVar8.a;
                fbbf fbbfVar3 = akkpVar3.iN;
                fbbf fbbfVar4 = akisVar8.ih;
                fbbf fbbfVar5 = akkpVar3.jB;
                fbbf fbbfVar6 = akkpVar3.jC;
                fbbf fbbfVar7 = akkpVar3.C;
                Optional of = Optional.of((cpdd) akkpVar3.jo.b());
                asmj asmjVar = (asmj) this.a.a.jD.b();
                akis akisVar9 = this.a;
                return new ayfp(akisVar8.cv, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, of, asmjVar, akisVar9.a.jF, (Context) akisVar9.q.b());
            case 613:
                return new ayza((ayvn) this.a.a.L.b(), (ayyn) this.a.a.jA.b(), (errl) this.a.t.b(), this.a.a.az);
            case 614:
                akis akisVar10 = this.a;
                akkp akkpVar4 = akisVar10.a;
                return new ayyn(akkpVar4.L, akkpVar4.dn, akkpVar4.dR, akkpVar4.iN, akkpVar4.jv, akkpVar4.dE, akkpVar4.jz, akisVar10.t);
            case 615:
                final fbbf fbbfVar8 = this.a.a.s;
                return new asps() { // from class: arvj
                    @Override // defpackage.asps
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_privacy_compliant_conversation_id");
                    }
                };
            case 616:
                return new ayfs(this.a.a.cc);
            case 617:
                final fbbf fbbfVar9 = this.a.a.s;
                return new asmj() { // from class: arqb
                    @Override // defpackage.asmj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_messages_archival_intent");
                    }
                };
            case 618:
                akkp akkpVar5 = this.a.a;
                return new azei(akkpVar5.jE, (ffsk) akkpVar5.p.b());
            case 619:
                akkp akkpVar6 = this.a.a;
                enin i2 = enip.i(2);
                i2.j(akkpVar6.ro());
                i2.c((cpdd) this.a.a.jo.b());
                return i2.g();
            case 620:
                return Long.valueOf(fdix.a(this.a.a.oH()));
            case 621:
                return Long.valueOf(fdiv.a(this.a.a.oH()));
            case 622:
                cqih cqihVar = (cqih) this.a.a.AC.b();
                cqfr cqfrVar = (cqfr) this.a.a.AD.b();
                akis akisVar11 = this.a;
                Set rw = akisVar11.a.rw();
                akkp akkpVar7 = akisVar11.a;
                return new cqiy(cqihVar, cqfrVar, rw, akkpVar7.kF(), akkpVar7.cL(), (akzt) akkpVar7.C.b(), (ffsk) this.a.a.q.b(), (ffsk) this.a.a.aq.b());
            case 623:
                akis akisVar12 = this.a;
                fbbf fbbfVar10 = akisVar12.ik;
                fbbf fbbfVar11 = akisVar12.il;
                akkp akkpVar8 = akisVar12.a;
                fbbf fbbfVar12 = akkpVar8.jJ;
                fbbf fbbfVar13 = akkpVar8.jL;
                cqoh cqohVar2 = (cqoh) akisVar12.cz.b();
                akis akisVar13 = this.a;
                akkp akkpVar9 = akisVar13.a;
                fbbf fbbfVar14 = akkpVar9.jM;
                fbbf fbbfVar15 = akkpVar9.jN;
                fbbf fbbfVar16 = akkpVar9.jO;
                fbbf fbbfVar17 = akkpVar9.jP;
                ffhd ffhdVar = (ffhd) akisVar13.co.b();
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                akis akisVar14 = this.a;
                cqdf kG = akisVar14.a.kG();
                fbbf fbbfVar18 = akisVar14.md;
                akkp akkpVar10 = akisVar14.a;
                return new cqih(fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, cqohVar2, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, ffhdVar, ffskVar, kG, fbbfVar18, akkpVar10.C, akkpVar10.aT, akkpVar10.ks);
            case 624:
                ctyx ctyxVar2 = (ctyx) this.a.aU.b();
                akis akisVar15 = this.a;
                akkp akkpVar11 = akisVar15.a;
                return new cqek(ctyxVar2, akkpVar11.f, akkpVar11.aT, (errl) akisVar15.p.b());
            case 625:
                akis akisVar16 = this.a;
                return new cqfa(akisVar16.a.jK, (ffhd) akisVar16.cP.b());
            case 626:
                return new cqew(this.a.a.cc);
            case 627:
                return new cqcd((cqbu) this.a.a.pA());
            case 628:
                return new cqbz((cqbu) this.a.a.pA());
            case 629:
                return new cqbm((cqbu) this.a.a.pA());
            case 630:
                return new cqcl((cqbu) this.a.a.pA());
            case 631:
                akkp akkpVar12 = this.a.a;
                return new azei(akkpVar12.jR, (ffsk) akkpVar12.p.b());
            case 632:
                return new enpx((cqcv) this.a.a.jQ.b());
            case 633:
                akkp akkpVar13 = this.a.a;
                return new afbt(akkpVar13.y(), akkpVar13.ay, akkpVar13.fJ);
            case 634:
                akkp akkpVar14 = this.a.a;
                return new azei(akkpVar14.AA, (ffsk) akkpVar14.p.b());
            case 635:
                akis akisVar17 = this.a;
                coxh kl = akisVar17.a.kl();
                coxh coxhVar = (coxh) akisVar17.a.uS.b();
                akis akisVar18 = this.a;
                return enip.v(kl, coxhVar, akisVar18.a.fL(), (coxh) akisVar18.a.jQ.b(), (coxh) this.a.a.wp.b(), this.a.a.L(), new coxh[0]);
            case 636:
                return new apaq((aorv) this.a.a.jT.b(), this.a.in);
            case 637:
                return new aorv((dtuu) this.a.a.ay.b(), (errl) this.a.p.b());
            case 638:
                return new athl() { // from class: atgl
                };
            case 639:
                bzaf bzafVar = (bzaf) this.a.a.uU.b();
                fazb a = fbaz.a(this.a.a.Ay);
                fazb a2 = fbaz.a(this.a.lv);
                Optional optional = (Optional) this.a.a.ag.b();
                errl errlVar = (errl) this.a.p.b();
                ctyx ctyxVar3 = (ctyx) this.a.aU.b();
                bzgd bzgdVar = (bzgd) this.a.a.fa.b();
                akis akisVar19 = this.a;
                akkp akkpVar15 = akisVar19.a;
                fbbf fbbfVar19 = akkpVar15.ka;
                ?? po = akkpVar15.po();
                bbfl bbflVar = (bbfl) akisVar19.a.vD.b();
                banb banbVar = (banb) this.a.a.vT.b();
                fazb a3 = fbaz.a(this.a.a.vS);
                Optional optional2 = (Optional) this.a.ip.b();
                csjk csjkVar = (csjk) this.a.a.fQ.b();
                akis akisVar20 = this.a;
                akkp akkpVar16 = akisVar20.a;
                fbbf fbbfVar20 = akkpVar16.vQ;
                fbbf fbbfVar21 = akkpVar16.vR;
                banr eA = akkpVar16.eA();
                bbem bbemVar = (bbem) akisVar20.a.vN.b();
                bbfs bbfsVar = (bbfs) this.a.a.vy.b();
                akkp akkpVar17 = this.a.a;
                fbbf fbbfVar22 = akkpVar17.wj;
                fbbf fbbfVar23 = akkpVar17.fJ;
                Optional optional3 = (Optional) akkpVar17.uP.b();
                akkp akkpVar18 = this.a.a;
                return new bzby(bzafVar, a, a2, optional, errlVar, ctyxVar3, bzgdVar, fbbfVar19, po, bbflVar, banbVar, a3, optional2, csjkVar, fbbfVar20, fbbfVar21, eA, bbemVar, bbfsVar, fbbfVar22, fbbfVar23, optional3, akkpVar18.vd, akkpVar18.qL, akkpVar18.vp, akkpVar18.vq, akkpVar18.vB, akkpVar18.ck, akkpVar18.Az);
            case 640:
                Context context3 = (Context) this.a.q.b();
                csjk csjkVar2 = (csjk) this.a.a.el.b();
                bbfs bbfsVar2 = (bbfs) this.a.a.vy.b();
                akkp akkpVar19 = this.a.a;
                return new bzaf(context3, csjkVar2, bbfsVar2, akkpVar19.Aw, (akzt) akkpVar19.f.b(), (elbx) this.a.aJ.b());
            case 641:
                akis akisVar21 = this.a;
                akkp akkpVar20 = akisVar21.a;
                return new baov(akkpVar20.ql, akkpVar20.va, akkpVar20.fa, akkpVar20.f, akisVar21.p, akisVar21.t, akkpVar20.Au, akkpVar20.vg, akisVar21.da);
            case 642:
                return new chep((errl) this.a.t.b(), (Optional) this.a.a.uP.b(), (chrv) this.a.a.bN.b(), (ciji) this.a.a.uQ.b(), (cgwk) this.a.a.jV.b(), (chbx) this.a.a.gr.b(), (akzt) this.a.a.f.b(), (Optional) this.a.ip.b(), fbaz.a(this.a.a.uV), (chga) this.a.a.cp.b(), (albq) this.a.a.di.b(), (chih) this.a.a.wq.b());
            case 643:
                return Optional.of((cilk) this.a.a.kd.b());
            case 644:
                akis akisVar22 = this.a;
                fbbf fbbfVar24 = akisVar22.a.aV;
                Context context4 = (Context) akisVar22.q.b();
                errl errlVar2 = (errl) this.a.p.b();
                errl errlVar3 = (errl) this.a.aK.b();
                akis akisVar23 = this.a;
                akkp akkpVar21 = akisVar23.a;
                fbbf fbbfVar25 = akkpVar21.al;
                fbbf fbbfVar26 = akkpVar21.bN;
                fbbf fbbfVar27 = akkpVar21.jV;
                fbbf fbbfVar28 = akkpVar21.gr;
                Optional optional4 = (Optional) akisVar23.ip.b();
                Optional of2 = Optional.of(this.a.a.hL());
                Optional of3 = Optional.of(this.a.a.hP());
                Optional of4 = Optional.of(this.a.a.hS());
                akkp akkpVar22 = this.a.a;
                return new cilu(fbbfVar24, context4, errlVar2, errlVar3, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, optional4, of2, of3, of4, akkpVar22.G, akkpVar22.jY, akkpVar22.eV, akkpVar22.At);
            case 645:
                Context context5 = (Context) this.a.q.b();
                akis akisVar24 = this.a;
                akkp akkpVar23 = akisVar24.a;
                fbbf fbbfVar29 = akkpVar23.eo;
                bzed bzedVar = (bzed) akkpVar23.jW.b();
                akkp akkpVar24 = this.a.a;
                fbbf fbbfVar30 = akkpVar24.be;
                aslr aslrVar = (aslr) akkpVar24.jX.b();
                akis akisVar25 = this.a;
                return new bzec(context5, akisVar24.aU, fbbfVar29, akisVar24.aZ, bzedVar, fbbfVar30, aslrVar, akisVar25.a.jY, (errl) akisVar25.t.b());
            case 646:
                Context context6 = (Context) this.a.q.b();
                akis akisVar26 = this.a;
                return new bzed(context6, akisVar26.aO, akisVar26.a.az);
            case 647:
                final fbbf fbbfVar31 = this.a.a.s;
                return new aslr() { // from class: arpf
                    @Override // defpackage.aslr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_device_onboarding");
                    }
                };
            case 648:
                return this.a.a.kZ();
            case 649:
                akis akisVar27 = this.a;
                fbbf fbbfVar32 = akisVar27.a.az;
                cqoh cqohVar3 = (cqoh) akisVar27.cz.b();
                akis akisVar28 = this.a;
                return new cimr(fbbfVar32, cqohVar3, akisVar28.iq, (errl) akisVar28.t.b());
            case 650:
                final fbbf fbbfVar33 = this.a.a.s;
                return new auwh() { // from class: auwb
                    @Override // defpackage.auwh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_set_receive_messages_pong_interval");
                    }
                };
            case 651:
                akis akisVar29 = this.a;
                enhd h = enhk.h(8);
                h.k(fbzs.TACHYGRAM_CONTROL_MESSAGE, akisVar29.a.ke);
                h.k(fbzs.TACHYGRAM_MESSAGE, this.a.a.kT);
                h.k(fbzs.GROUP, this.a.a.kU);
                h.k(fbzs.DITTO, this.a.a.Ao);
                h.k(fbzs.WIREBALL, this.a.a.Ao);
                h.k(fbzs.BUGLE_AGENT, this.a.a.Ao);
                h.k(fbzs.REFLECTED_TACHYGRAM_MESSAGE, this.a.a.Aq);
                h.k(fbzs.USERDATA, this.a.a.Ar);
                return h.h();
            case 652:
                return this.a.a.kv();
            case 653:
            case 693:
                return this.a.a.ku();
            case 654:
                return new akiw(this);
            case 655:
                return new akix(this);
            case 656:
                return new akiy(this);
            case 657:
                akkp akkpVar25 = this.a.a;
                return new cpke(akkpVar25.ky, (akzt) akkpVar25.f.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 658:
                akkp akkpVar26 = this.a.a;
                return cken.a(akkpVar26.kx, akkpVar26.kw);
            case 659:
                ckjh ckjhVar = (ckjh) this.a.a.kw.b();
                akis akisVar30 = this.a;
                akkp akkpVar27 = akisVar30.a;
                return new ckjk(ckjhVar, akkpVar27.G, akkpVar27.Z, akkpVar27.kp, (errl) akisVar30.t.b());
            case 660:
                errl errlVar4 = (errl) this.a.t.b();
                akis akisVar31 = this.a;
                Object qb = akisVar31.a.qb();
                clbd clbdVar = (clbd) akisVar31.a.kl.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                akis akisVar32 = this.a;
                akkp akkpVar28 = akisVar32.a;
                fbbf fbbfVar34 = akkpVar28.di;
                fbbf fbbfVar35 = akkpVar28.ia;
                fbbf fbbfVar36 = akkpVar28.kk;
                fbbf fbbfVar37 = akkpVar28.kt;
                fbbf fbbfVar38 = akkpVar28.jG;
                ckkl iN = akkpVar28.iN();
                akkp akkpVar29 = akisVar32.a;
                return new ckjh(errlVar4, (ckjt) qb, clbdVar, akztVar, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, iN, akkpVar29.ku, fbaz.a(akkpVar29.Z), (atlx) this.a.a.kv.b());
            case 661:
                return new bdgb(this.a.a.dn);
            case 662:
                return new ayzn(this.a.a.jB);
            case 663:
                return new clbd((coxk) this.a.a.iN.b(), (clbc) this.a.cu.b(), (akzt) this.a.a.f.b());
            case 664:
                akkp akkpVar30 = this.a.a;
                fbbf fbbfVar39 = akkpVar30.kj;
                fbbf fbbfVar40 = akkpVar30.ib;
                fbbf fbbfVar41 = akkpVar30.iN;
                dtuu dtuuVar = (dtuu) akkpVar30.ay.b();
                Context context7 = (Context) this.a.q.b();
                akkp akkpVar31 = this.a.a;
                fbbf fbbfVar42 = akkpVar31.Z;
                aqky aqkyVar = (aqky) akkpVar31.kp.b();
                akkp akkpVar32 = this.a.a;
                return new cpye(fbbfVar39, fbbfVar40, fbbfVar41, dtuuVar, context7, fbbfVar42, aqkyVar, akkpVar32.kq, akkpVar32.kr, akkpVar32.ks);
            case 665:
                Context context8 = (Context) this.a.q.b();
                akis akisVar33 = this.a;
                akkp akkpVar33 = akisVar33.a;
                return new aqkz(context8, akkpVar33.Z, akkpVar33.ft, akkpVar33.Q, akisVar33.ir, akisVar33.cO, akisVar33.cs, akkpVar33.kn, akkpVar33.ao, akkpVar33.ko);
            case 666:
                return new cjzf(this.a.a.km);
            case 667:
                return new asuj() { // from class: asbx
                };
            case 668:
                final fbbf fbbfVar43 = this.a.a.s;
                return new astw() { // from class: asba
                    @Override // defpackage.astw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_legacy_normalized_instead_of_comparable");
                    }
                };
            case 669:
                return Boolean.valueOf(fczc.a(this.a.a.nL()));
            case 670:
                akkp akkpVar34 = this.a.a;
                return new cozl(akkpVar34.dn, akkpVar34.iN, akkpVar34.Z);
            case 671:
                return new cpza((ayhi) this.a.a.K.b(), this.a.a.Z);
            case 672:
                final fbbf fbbfVar44 = this.a.a.s;
                return new asgl() { // from class: arfz
                    @Override // defpackage.asgl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.set_restore_from_telephony_false_for_bcm_code_paths");
                    }
                };
            case 673:
                final fbbf fbbfVar45 = this.a.a.s;
                return new atlx() { // from class: atlc
                    @Override // defpackage.atlx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.conversation_creation_sets_destination_token");
                    }
                };
            case 674:
                final fbbf fbbfVar46 = this.a.a.s;
                return new asqj() { // from class: arwn
                    @Override // defpackage.asqj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_mms_group_upgrade_passive_upgrader");
                    }
                };
            case 675:
                return new akiz();
            case 676:
                azcn azcnVar = (azcn) this.a.a.kJ.b();
                azpx azpxVar = (azpx) this.a.a.hB.b();
                azac azacVar = (azac) this.a.it.b();
                azac azacVar2 = (azac) this.a.iu.b();
                akkp akkpVar35 = this.a.a;
                fbbf fbbfVar47 = akkpVar35.dn;
                fbbf fbbfVar48 = akkpVar35.G;
                ffsk ffskVar2 = (ffsk) akkpVar35.p.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                akis akisVar34 = this.a;
                return new azfe(azcnVar, azpxVar, azacVar, azacVar2, fbbfVar47, fbbfVar48, ffskVar2, ffhdVar2, akisVar34.a.en(), (emar) akisVar34.iv.b(), this.a.a.el());
            case 677:
                azac azacVar3 = (azac) this.a.a.kD.b();
                azac azacVar4 = (azac) this.a.a.kE.b();
                akis akisVar35 = this.a;
                akkp akkpVar36 = akisVar35.a;
                return new azcf(azacVar3, azacVar4, akkpVar36.kH, akkpVar36.u, (ffhd) akisVar35.co.b(), (ffsk) this.a.a.p.b(), (azpx) this.a.a.hB.b(), (azpo) this.a.a.he.b(), this.a.a.kI);
            case 678:
                return new azac(this.a.a.ed());
            case 679:
                return Long.valueOf(fczh.a(this.a.a.nN()));
            case 680:
                return new azac(this.a.a.ee());
            case 681:
                return new azea((cbwj) this.a.a.kG.b(), (ffhd) this.a.cP.b());
            case 682:
                akkp akkpVar37 = this.a.a;
                return bwll.a(akkpVar37.ay, akkpVar37.kF);
            case 683:
                return azwk.a(this.a.is);
            case 684:
                return new azyt((Executor) this.a.is.b(), Optional.empty(), new azyq());
            case 685:
                return new auha() { // from class: augn
                };
            case 686:
                akis akisVar36 = this.a;
                akkp akkpVar38 = akisVar36.a;
                return new cpow(akkpVar38.G, akkpVar38.kz, (errl) akisVar36.p.b());
            case 687:
                return new akja(this);
            case 688:
                return new azpk((azpx) this.a.a.hB.b(), (azpo) this.a.a.he.b(), (akjb) this.a.a.kO.b(), this.a.a.aK);
            case 689:
                return new akjb(this);
            case 690:
                return new akjc(this);
            case 691:
                final fbbf fbbfVar49 = this.a.a.s;
                return new augx() { // from class: augk
                    @Override // defpackage.augx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.send_negative_delivery_for_unsupported_content_types");
                    }
                };
            case 692:
                final fbbf fbbfVar50 = this.a.a.s;
                return new atmb() { // from class: atlj
                    @Override // defpackage.atmb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.do_not_serialize_tokens_directly");
                    }
                };
            case 694:
                bzgd bzgdVar2 = (bzgd) this.a.a.fa.b();
                errl errlVar5 = (errl) this.a.t.b();
                akis akisVar37 = this.a;
                chvq hK = akisVar37.a.hK();
                akkp akkpVar39 = akisVar37.a;
                return new cigu(bzgdVar2, errlVar5, hK, akkpVar39.jZ, fbaz.a(akkpVar39.eY));
            case 695:
                final fbbf fbbfVar51 = this.a.a.s;
                return new audz() { // from class: audl
                    @Override // defpackage.audz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_ditto_conversation_creator");
                    }
                };
            case 696:
                return new cict((ffsk) this.a.a.aq.b(), (ctvs) this.a.aZ.b(), (alxl) this.a.a.mx.b(), (aqkp) this.a.a.mu.b(), (aolr) this.a.a.Z.b(), (cidg) this.a.a.zr.b());
            case 697:
                akis akisVar38 = this.a;
                Map qO = akisVar38.a.qO();
                akkp akkpVar40 = akisVar38.a;
                return new amfk(qO, akkpVar40.Q, akkpVar40.no, akkpVar40.ld, akkpVar40.hJ);
            case 698:
                return new aprl(this.a.a.lr);
            case 699:
                akis akisVar39 = this.a;
                akkp akkpVar41 = akisVar39.a;
                return new apin(akkpVar41.p, akkpVar41.lg, akisVar39.cz, akkpVar41.lh, akkpVar41.ll, akkpVar41.lm, akkpVar41.ln, akkpVar41.lo, akkpVar41.lp, akkpVar41.lq);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [ampj, java.lang.Object] */
    private final Object F() {
        int i = this.b;
        switch (i) {
            case 700:
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.p;
                akkp akkpVar = akisVar.a;
                return new apsa(fbbfVar, akisVar.aK, akisVar.t, akkpVar.kX, akkpVar.iy, akkpVar.kY, akkpVar.la, akkpVar.lc, akkpVar.gQ, akisVar.iz, akkpVar.dB, akkpVar.Q, akisVar.cz, akkpVar.ld, akkpVar.lb, akkpVar.kW, akkpVar.le, akkpVar.lf, akkpVar.hH);
            case 701:
                return new apgc(this.a.a.kW);
            case 702:
                return new auec() { // from class: audr
                };
            case 703:
                return new apqg((bcwz) this.a.a.ad.b());
            case 704:
                return new clwb((clvk) this.a.a.kZ.b(), (errl) this.a.t.b(), (aqvh) this.a.a.gN.b());
            case 705:
                return new akje(this);
            case 706:
                return Optional.of(this.a.a.aQ());
            case 707:
                final fbbf fbbfVar2 = this.a.a.s;
                return new auqo() { // from class: aupu
                    @Override // defpackage.auqo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_gsma_reactions_transport");
                    }
                };
            case 708:
                final fbbf fbbfVar3 = this.a.a.s;
                return new askf() { // from class: armo
                    @Override // defpackage.askf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rbm_in_conversation_2");
                    }
                };
            case 709:
                final fbbf fbbfVar4 = this.a.a.s;
                return new augw() { // from class: augi
                    @Override // defpackage.augw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_zinnia_in_conversations");
                    }
                };
            case 710:
                final fbbf fbbfVar5 = this.a.a.s;
                return new auqx() { // from class: auqj
                    @Override // defpackage.auqx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_fallback_if_reacted_message_missing_rcs_id");
                    }
                };
            case 711:
                akis akisVar2 = this.a;
                return new apka(akisVar2.a.p, akisVar2.iA, akisVar2.hi);
            case 712:
                akis akisVar3 = this.a;
                akkp akkpVar2 = akisVar3.a;
                return new apkm(akisVar3.p, akkpVar2.p, akisVar3.hi, akisVar3.iB, akkpVar2.li, akkpVar2.lj, akkpVar2.lk, akisVar3.aJ);
            case 713:
                return (eyev) ((ekck) this.a.a.nQ().a.b()).a("com.google.android.apps.messaging.auto 45668101").c();
            case 714:
                return (eyev) ((ekck) this.a.a.nQ().a.b()).a("com.google.android.apps.messaging.auto 45669099").c();
            case 715:
                return Long.valueOf(((ekck) this.a.a.nQ().a.b()).a("com.google.android.apps.messaging.auto 45669943").b());
            case 716:
                akis akisVar4 = this.a;
                return new apjq(akisVar4.a.p, akisVar4.hi, akisVar4.iD);
            case 717:
                akis akisVar5 = this.a;
                return new apjg(akisVar5.a.p, akisVar5.hi);
            case 718:
                akis akisVar6 = this.a;
                akkp akkpVar3 = akisVar6.a;
                return new apky(akkpVar3.p, akkpVar3.aq, akisVar6.cz, akisVar6.iE, akisVar6.hi);
            case 719:
                akis akisVar7 = this.a;
                akkp akkpVar4 = akisVar7.a;
                return new aphh(akkpVar4.p, akkpVar4.q, akisVar7.cz, akisVar7.hi);
            case 720:
                akis akisVar8 = this.a;
                return new apiy(akisVar8.a.p, akisVar8.hi);
            case 721:
                akis akisVar9 = this.a;
                akkp akkpVar5 = akisVar9.a;
                return new amrq(akkpVar5.p, akkpVar5.aq, akisVar9.hi);
            case 722:
                akis akisVar10 = this.a;
                fbbf fbbfVar6 = akisVar10.cz;
                akkp akkpVar6 = akisVar10.a;
                amiz az = akkpVar6.az();
                fbbf fbbfVar7 = akkpVar6.wN;
                ?? fj = akisVar10.fj();
                fbbf fbbfVar8 = akkpVar6.wO;
                fbbf fbbfVar9 = akkpVar6.wP;
                fbbf fbbfVar10 = akkpVar6.dA;
                fbbf fbbfVar11 = akkpVar6.wW;
                fbbf fbbfVar12 = akkpVar6.dn;
                fbbf fbbfVar13 = akkpVar6.mF;
                fbbf fbbfVar14 = akkpVar6.xd;
                fbbf fbbfVar15 = akkpVar6.id;
                fbbf fbbfVar16 = akkpVar6.mP;
                fbbf fbbfVar17 = akkpVar6.xe;
                fbbf fbbfVar18 = akkpVar6.xf;
                fbbf fbbfVar19 = akkpVar6.xh;
                fbbf fbbfVar20 = akkpVar6.xm;
                fbbf fbbfVar21 = akkpVar6.wA;
                fbbf fbbfVar22 = akkpVar6.br;
                cqoh cqohVar = (cqoh) fbbfVar6.b();
                errl errlVar = (errl) this.a.p.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.aK.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                ckqj ckqjVar = (ckqj) this.a.a.xn.b();
                akkp akkpVar7 = this.a.a;
                fbbf fbbfVar23 = akkpVar7.xo;
                fbbf fbbfVar24 = akkpVar7.ia;
                fbbf fbbfVar25 = akkpVar7.pB;
                amsk amskVar = (amsk) akkpVar7.mD.b();
                akkp akkpVar8 = this.a.a;
                return new amkx(az, fbbfVar7, fj, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, cqohVar, errlVar, errlVar2, errlVar3, cbwjVar, ckqjVar, fbbfVar23, fbbfVar24, fbbfVar25, amskVar, akkpVar8.xw, akkpVar8.xz, akkpVar8.wL, akkpVar8.xA, akkpVar8.xB, akkpVar8.xC, akkpVar8.xE, akkpVar8.xF, akkpVar8.yS, akkpVar8.yT, akkpVar8.yV, (atbw) akkpVar8.ry.b(), this.a.a.yW);
            case 723:
                Context context = (Context) this.a.q.b();
                errl errlVar4 = (errl) this.a.p.b();
                errl errlVar5 = (errl) this.a.aK.b();
                akis akisVar11 = this.a;
                arai aw = akisVar11.aw();
                ctbk ctbkVar = (ctbk) akisVar11.hi.b();
                aolr aolrVar = (aolr) this.a.a.Z.b();
                akkp akkpVar9 = this.a.a;
                aqhl ba = akkpVar9.ba();
                aqky aqkyVar = (aqky) akkpVar9.kp.b();
                akis akisVar12 = this.a;
                akkp akkpVar10 = akisVar12.a;
                return new aqjw(context, errlVar4, errlVar5, aw, ctbkVar, aolrVar, ba, aqkyVar, akkpVar10.lZ, akkpVar10.ma, akkpVar10.mb, akkpVar10.mc, akisVar12.cy, akkpVar10.ib, akkpVar10.ay, akkpVar10.mq, akkpVar10.gX, Optional.of(akkpVar10.be()), Optional.of(this.a.a.me), this.a.ho);
            case 724:
                return this.a.a.bb();
            case 725:
                akkp akkpVar11 = this.a.a;
                return ((azbk) akkpVar11.pZ()).a(akkpVar11.dc());
            case 726:
                akis akisVar13 = this.a;
                akkp akkpVar12 = akisVar13.a;
                return new aqmx(akkpVar12.p, akkpVar12.aq, akisVar13.hi, akisVar13.iE, akisVar13.iF);
            case 727:
                return new aqnx(this.a.a.ly);
            case 728:
                return Optional.of(this.a.a.pV());
            case 729:
                akis akisVar14 = this.a;
                return akisVar14.aH().a(akisVar14.a.rL());
            case 730:
                akis akisVar15 = this.a;
                akkp akkpVar13 = akisVar15.a;
                return new cjvl(akkpVar13.Z, akkpVar13.ab, akkpVar13.lA, akkpVar13.lF, akisVar15.cP, akkpVar13.lG, akkpVar13.lH);
            case 731:
                return new asuk() { // from class: asbz
                };
            case 732:
                return new ctas((Context) this.a.q.b(), (ctap) this.a.a.co.b(), (albq) this.a.a.di.b(), (akzt) this.a.a.f.b(), (ctcd) this.a.a.lB.b(), (cqoh) this.a.cz.b(), (csuu) this.a.iL.b(), (ctax) this.a.a.lD.b(), this.a.a.lE);
            case 733:
                akis akisVar16 = this.a;
                return new ctcd(akisVar16.a.dF, new ctcb(), (Executor) akisVar16.p.b());
            case 734:
                akis akisVar17 = this.a;
                fbbf fbbfVar26 = akisVar17.aR;
                fbbf fbbfVar27 = akisVar17.a.aT;
                ejvp ejvpVar = (ejvp) fbbfVar26.b();
                akkp akkpVar14 = this.a.a;
                return new ctax(fbbfVar27, ejvpVar, akkpVar14.f, akkpVar14.lC);
            case 735:
                final fbbf fbbfVar28 = this.a.a.s;
                return new auff() { // from class: auef
                    @Override // defpackage.auff
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_different_rcs_image_compression_settings");
                    }
                };
            case 736:
                final fbbf fbbfVar29 = this.a.a.s;
                return new aufj() { // from class: auen
                    @Override // defpackage.aufj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_jpegli_encoder");
                    }
                };
            case 737:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45426952").b());
            case 738:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45426953").b());
            case 739:
                akis akisVar18 = this.a;
                akkp akkpVar15 = akisVar18.a;
                return new cjvr(akisVar18.p, akisVar18.iM, akkpVar15.p, akkpVar15.lJ, akkpVar15.gX, akkpVar15.lK, akkpVar15.lQ, akkpVar15.lR);
            case 740:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45653926").b());
            case 741:
                final fbbf fbbfVar30 = this.a.a.s;
                return new auln() { // from class: aukz
                    @Override // defpackage.auln
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_profile_staleness_heuristic");
                    }
                };
            case 742:
                return Optional.of(this.a.a.lP);
            case 743:
                akis akisVar19 = this.a;
                akkp akkpVar16 = akisVar19.a;
                return new cjqi(akkpVar16.lO, akisVar19.jk, akkpVar16.al);
            case 744:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                dvxo dvxoVar = (dvxo) this.a.a.lM.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akis akisVar20 = this.a;
                akkp akkpVar17 = akisVar20.a;
                return new alex(ffskVar, dvxoVar, cqohVar2, akkpVar17.lN, akkpVar17.be, (alff) akisVar20.ji.b());
            case 745:
                return new dvzp((dvwi) this.a.a.lL.b(), (dvwa) this.a.jh.b());
            case 746:
                akis akisVar21 = this.a;
                dvwe mi = akisVar21.a.mi();
                errl errlVar6 = (errl) akisVar21.t.b();
                akis akisVar22 = this.a;
                fbbf fbbfVar31 = akisVar22.jg;
                Set iW = akis.iW();
                return new dvwi(errlVar6, fbbfVar31, iW, mi);
            case 747:
                return Long.valueOf(this.a.a.nE().a());
            case 748:
                final fbbf fbbfVar32 = this.a.a.s;
                return new aukg() { // from class: aukh
                    @Override // defpackage.aukg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_logging_for_recipient_sharing");
                    }
                };
            case 749:
                akkp akkpVar18 = this.a.a;
                return new aqmm(akkpVar18.ab, akkpVar18.fx);
            case 750:
                akis akisVar23 = this.a;
                akkp akkpVar19 = akisVar23.a;
                fbbf fbbfVar33 = akisVar23.jl;
                fbbf fbbfVar34 = akkpVar19.p;
                fbbf fbbfVar35 = akisVar23.jm;
                aqvh aqvhVar = (aqvh) akkpVar19.gN.b();
                cghm cghmVar = (cghm) this.a.a.eX.b();
                fbbf fbbfVar36 = this.a.a.lU;
                return new aqmh(fbbfVar33, akisVar23.cP, fbbfVar34, fbbfVar35, akisVar23.cN, aqvhVar, cghmVar, fbbfVar36);
            case 751:
                final fbbf fbbfVar37 = this.a.a.s;
                return new asnx() { // from class: arss
                    @Override // defpackage.asnx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_trusted_contacts_group_conversation_allow_state");
                    }
                };
            case 752:
                final fbbf fbbfVar38 = this.a.a.s;
                return new atly() { // from class: atle
                    @Override // defpackage.atly
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.destination_token_in_mapi");
                    }
                };
            case 753:
                return new aqmk((ffsk) this.a.a.p.b(), (ffhd) this.a.cP.b(), this.a.a.lY);
            case 754:
                akkp akkpVar20 = this.a.a;
                fbbf fbbfVar39 = akkpVar20.Z;
                fbbf fbbfVar40 = akkpVar20.dn;
                fbbf fbbfVar41 = akkpVar20.kp;
                fbbf fbbfVar42 = akkpVar20.ib;
                dtuu dtuuVar = (dtuu) akkpVar20.ay.b();
                akis akisVar24 = this.a;
                fbbf fbbfVar43 = akisVar24.a.aF;
                fazb a = fbaz.a(akisVar24.jn);
                fazb a2 = fbaz.a(this.a.jo);
                akkp akkpVar21 = this.a.a;
                return new bdso(fbbfVar39, fbbfVar40, fbbfVar41, fbbfVar42, dtuuVar, fbbfVar43, a, a2, akkpVar21.hS, akkpVar21.aE, akkpVar21.hQ, akkpVar21.C, akkpVar21.w, akkpVar21.lX);
            case 755:
                final fbbf fbbfVar44 = this.a.a.s;
                return new aswc() { // from class: aser
                    @Override // defpackage.aswc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_update_with_on_conflict_in_replace_all_participants_in_conversations");
                    }
                };
            case 756:
                return new akjf(this);
            case 757:
                return new akjg(this);
            case 758:
                akis akisVar25 = this.a;
                fbbf fbbfVar45 = akisVar25.p;
                akkp akkpVar22 = akisVar25.a;
                return new aqoo(fbbfVar45, akisVar25.aK, akkpVar22.gd, akkpVar22.gA, akkpVar22.lu, akisVar25.hi);
            case 759:
                aolr aolrVar2 = (aolr) this.a.a.Z.b();
                akkp akkpVar23 = this.a.a;
                fbbf fbbfVar46 = akkpVar23.md;
                fbbf fbbfVar47 = akkpVar23.kn;
                fbbf fbbfVar48 = akkpVar23.al;
                ffsk ffskVar2 = (ffsk) akkpVar23.q.b();
                akis akisVar26 = this.a;
                akkp akkpVar24 = akisVar26.a;
                return new aqqu(aolrVar2, fbbfVar46, fbbfVar47, fbbfVar48, ffskVar2, akkpVar24.c, akkpVar24.mh, akkpVar24.mi, akkpVar24.kG, akisVar26.cN, akkpVar24.hX, akkpVar24.mo, akkpVar24.bi, akkpVar24.il, akkpVar24.mp, akkpVar24.mn);
            case 760:
                akkp akkpVar25 = this.a.a;
                return new bdqo(akkpVar25.t, akkpVar25.kn);
            case 761:
                akkp akkpVar26 = this.a.a;
                return new azei(akkpVar26.mg, (ffsk) akkpVar26.p.b());
            case 762:
                return new enpx(this.a.a.bd());
            case 763:
                Context context2 = (Context) this.a.q.b();
                cbbu cbbuVar = (cbbu) this.a.dB.b();
                akis akisVar27 = this.a;
                akkp akkpVar27 = akisVar27.a;
                return new azzu(context2, cbbuVar, akkpVar27.t, akkpVar27.dn, akisVar27.t);
            case 764:
                return Long.valueOf(((ekck) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto 45632698").b());
            case 765:
                Context context3 = (Context) this.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akis akisVar28 = this.a;
                fbbf fbbfVar49 = akisVar28.a.aq;
                Executor executor = (Executor) akisVar28.p.b();
                ejtr ejtrVar = (ejtr) this.a.a.f7do.b();
                akkp akkpVar28 = this.a.a;
                return new axyy(context3, ffhdVar, fbbfVar49, akisVar28.cP, executor, ejtrVar, akkpVar28.mj, akkpVar28.mk, akkpVar28.ml, akkpVar28.mm, akkpVar28.mn);
            case 766:
                return new asjx() { // from class: armd
                };
            case 767:
                return Boolean.valueOf(armg.a((ersq) this.a.a.s.b()));
            case 768:
                return Boolean.valueOf(((ekck) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto 45427448").e());
            case 769:
                final fbbf fbbfVar50 = this.a.a.s;
                return new atfd() { // from class: ateu
                    @Override // defpackage.atfd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_single_quotes_for_account_type_predicate");
                    }
                };
            case 770:
                final fbbf fbbfVar51 = this.a.a.s;
                return new atfe() { // from class: atew
                    @Override // defpackage.atfe
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_work_profile_contacts_sync");
                    }
                };
            case 771:
                final fbbf fbbfVar52 = this.a.a.s;
                return new atey() { // from class: atel
                    @Override // defpackage.atey
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_cleared_contact_validation");
                    }
                };
            case 772:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45428677").b());
            case 773:
                return new cjzg((cpdg) this.a.a.ap.b());
            case 774:
                return new enpx((cbft) this.a.a.hs.b());
            case 775:
                akis akisVar29 = this.a;
                fbbf fbbfVar53 = akisVar29.hi;
                fbbf fbbfVar54 = akisVar29.q;
                fbbf fbbfVar55 = akisVar29.p;
                akkp akkpVar29 = akisVar29.a;
                return new amhp(fbbfVar53, fbbfVar54, fbbfVar55, akisVar29.aK, akisVar29.iE, akkpVar29.gN, akkpVar29.mD, akkpVar29.Z, akkpVar29.mL, akkpVar29.Q, akkpVar29.le, akkpVar29.mu, akkpVar29.bR, akkpVar29.mM, akkpVar29.lW, akkpVar29.mO, akkpVar29.mN);
            case 776:
                akis akisVar30 = this.a;
                akkp akkpVar30 = akisVar30.a;
                return new amsk(akkpVar30.mB, akkpVar30.mC, akkpVar30.aq, akkpVar30.q, akisVar30.jq, akisVar30.jr);
            case 777:
                akis akisVar31 = this.a;
                akkp akkpVar31 = akisVar31.a;
                return new amtb(akkpVar31.p, akkpVar31.q, akisVar31.hi, akisVar31.iE, akkpVar31.mA, akkpVar31.G, akkpVar31.kP);
            case 778:
                return Optional.of(this.a.a.ik());
            case 779:
                return new ajgp((chhs) this.a.a.aW.b(), this.a.a.bG);
            case 780:
                akis akisVar32 = this.a;
                akkp akkpVar32 = akisVar32.a;
                return new cppk(akisVar32.jp, akkpVar32.au, akkpVar32.my, (akzt) akkpVar32.C.b());
            case 781:
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                lap lapVar = (lap) this.a.a.mw.b();
                akis akisVar33 = this.a;
                akkp akkpVar33 = akisVar33.a;
                return new cjfw(ffskVar3, ffskVar4, lapVar, akkpVar33.as, akisVar33.aR, akkpVar33.mx, akkpVar33.mu, akkpVar33.Z);
            case 782:
                return cjej.a((Context) this.a.q.b(), (ffsk) this.a.a.q.b());
            case 783:
                return new amsj((dtuu) this.a.a.ay.b(), (ffsk) this.a.a.aq.b());
            case 784:
                ffsk ffskVar5 = (ffsk) this.a.a.aq.b();
                azvu azvuVar = (azvu) this.a.a.aK.b();
                akkp akkpVar34 = this.a.a;
                return new aqzh(ffskVar5, azvuVar, akkpVar34.bj(), (aqvt) akkpVar34.hk.b());
            case 785:
                akkp akkpVar35 = this.a.a;
                return new cnvp(akkpVar35.jM(), (cnnh) akkpVar35.bQ.b(), (ffsk) this.a.a.aq.b(), (ffsk) this.a.a.q.b(), (cbeq) this.a.a.fy.b(), (arek) this.a.a.mG.b());
            case 786:
                errl errlVar7 = (errl) this.a.t.b();
                akkp akkpVar36 = this.a.a;
                return new aygf(errlVar7, akkpVar36.dA, akkpVar36.ay, akkpVar36.hv, akkpVar36.mE);
            case 787:
                return new ceqc(this.a.a.cc);
            case 788:
                final fbbf fbbfVar56 = this.a.a.s;
                return new arek() { // from class: arfc
                    @Override // defpackage.arek
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_listener_for_satellite_session_state_change");
                    }
                };
            case 789:
                return new aphl((ffsk) this.a.a.aq.b(), (cnni) this.a.a.mI.b());
            case 790:
                akkp akkpVar37 = this.a.a;
                return new cnno(akkpVar37.aT, (cnnh) akkpVar37.bQ.b(), (ffsk) this.a.a.aq.b());
            case 791:
                return new apho(this.a.a.bR);
            case 792:
                final fbbf fbbfVar57 = this.a.a.s;
                return new atzo() { // from class: atyh
                    @Override // defpackage.atzo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_group_icon_on_update");
                    }
                };
            case 793:
                return new amvn((auit) this.a.a.mN.b());
            case 794:
                return new auit() { // from class: auim
                };
            case 795:
                return new akjh(this);
            case 796:
                this.a.a.sd();
                aoye aoyeVar = (aoye) this.a.a.sK.b();
                aoyeVar.getClass();
                return aoyeVar;
            case 797:
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                akis akisVar34 = this.a;
                return new apbl(ffskVar6, akisVar34.in, akisVar34.jt, (aoye) akisVar34.a.sK.b(), this.a.a.rb);
            case 798:
                akis akisVar35 = this.a;
                fbbf fbbfVar58 = akisVar35.hi;
                fbbf fbbfVar59 = akisVar35.p;
                fbbf fbbfVar60 = akisVar35.t;
                akkp akkpVar38 = akisVar35.a;
                return new aoye(fbbfVar58, fbbfVar59, fbbfVar60, akisVar35.aK, akkpVar38.nN, akkpVar38.qY, akkpVar38.qZ, akkpVar38.ra, akkpVar38.rb, akkpVar38.ro, akkpVar38.rL, akisVar35.kp, akisVar35.kq, akkpVar38.rT, akisVar35.jt, akkpVar38.qO, akisVar35.hu, akkpVar38.rU, akkpVar38.pw, akisVar35.jS, akkpVar38.iF, akkpVar38.rV, akkpVar38.rY, akkpVar38.sc, akkpVar38.gp, akkpVar38.sd, akisVar35.ku, akkpVar38.sf, akkpVar38.jU, akkpVar38.sj, akkpVar38.sk, akkpVar38.so, akkpVar38.qU, akkpVar38.st, akisVar35.cz, akkpVar38.sv, akkpVar38.hI, akisVar35.ky, akkpVar38.sw, akisVar35.ko, akkpVar38.sy, akisVar35.kz, akkpVar38.sz, akkpVar38.ng, akkpVar38.sB, akkpVar38.hh, akkpVar38.sC, akisVar35.kA, akkpVar38.sD, akkpVar38.sE, akkpVar38.sJ);
            case 799:
                akis akisVar36 = this.a;
                fbbf fbbfVar61 = akisVar36.cz;
                akkp akkpVar39 = akisVar36.a;
                return new apfv(akisVar36.p, akisVar36.hu, akkpVar39.mR, akkpVar39.na, akkpVar39.lg, akkpVar39.nG, akkpVar39.nL, fbbg.a(fbbfVar61), akkpVar39.nM);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object G() {
        Object apgzVar;
        int i = this.b;
        switch (i) {
            case 800:
                akis akisVar = this.a;
                return new apmm(akisVar.ju, akisVar.hi, akisVar.a.Z, akisVar.p, akisVar.cz);
            case 801:
                akis akisVar2 = this.a;
                akkp akkpVar = akisVar2.a;
                fbbf fbbfVar = akisVar2.hi;
                fbbf fbbfVar2 = akisVar2.p;
                fbbf fbbfVar3 = akisVar2.t;
                fbbf fbbfVar4 = akkpVar.mK;
                fbbf fbbfVar5 = akkpVar.Q;
                fbbf fbbfVar6 = akkpVar.mJ;
                fbbf fbbfVar7 = akkpVar.mu;
                fbbf fbbfVar8 = akkpVar.mS;
                fbbf a = fbbg.a(akkpVar.mU);
                akkp akkpVar2 = this.a.a;
                apgzVar = new apgz(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, akisVar2.aO, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, a, akkpVar2.mV, akkpVar2.lW, akkpVar2.mW, akkpVar2.mX, akkpVar2.mY, akkpVar2.mZ);
                break;
            case 802:
                final fbbf fbbfVar9 = this.a.a.s;
                return new askh() { // from class: armr
                    @Override // defpackage.askh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_is_conversation_rcs_for_details");
                    }
                };
            case 803:
                errl errlVar = (errl) this.a.aK.b();
                akis akisVar3 = this.a;
                akkp akkpVar3 = akisVar3.a;
                return new amib(errlVar, akkpVar3.mT, akkpVar3.fP, akisVar3.cz);
            case 804:
                return new asqi() { // from class: arwl
                };
            case 805:
                final fbbf fbbfVar10 = this.a.a.s;
                return new atmg() { // from class: atlt
                    @Override // defpackage.atmg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.on_conversation_rcs_populate_destination");
                    }
                };
            case 806:
                final fbbf fbbfVar11 = this.a.a.s;
                return new aued() { // from class: audt
                    @Override // defpackage.aued
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.exclude_self_from_compose_constraints_capabilities");
                    }
                };
            case 807:
                akkp akkpVar4 = this.a.a;
                return new amna(akkpVar4.mT, (ffsk) akkpVar4.p.b());
            case 808:
                final fbbf fbbfVar12 = this.a.a.s;
                return new auee() { // from class: audv
                    @Override // defpackage.auee
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.self_identity_get_rcs_config_async");
                    }
                };
            case 809:
                akis akisVar4 = this.a;
                akkp akkpVar5 = akisVar4.a;
                return new aoam(akkpVar5.ld, akkpVar5.nv, akkpVar5.nz, akisVar4.cP, akkpVar5.ns, akkpVar5.nw, akkpVar5.nA, akkpVar5.nB, akkpVar5.nr, akkpVar5.nF, akkpVar5.p);
            case 810:
                akis akisVar5 = this.a;
                akkp akkpVar6 = akisVar5.a;
                return new anzv(akkpVar6.p, akkpVar6.aq, akisVar5.hi, akkpVar6.ns, akkpVar6.nt, akkpVar6.nu);
            case 811:
                akis akisVar6 = this.a;
                akkp akkpVar7 = akisVar6.a;
                return new anyg(akkpVar7.p, akisVar6.hi, akisVar6.iE, akkpVar7.nn, akkpVar7.np, akkpVar7.nq, akkpVar7.nr);
            case 812:
                return new cpfi((ctiy) this.a.jv.b(), this.a.a.kp(), new cpfl());
            case 813:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_selfie_gifs"));
            case 814:
                return new ctot(this.a.a.nd);
            case 815:
                return new ctos((errl) this.a.p.b(), (ffhd) this.a.cn.b(), this.a.a.nc);
            case 816:
                return new cgnd((cgmf) this.a.a.iX.b(), (efbm) this.a.hR.b(), (Executor) this.a.p.b(), (Executor) this.a.t.b(), (cgmd) this.a.jw.b());
            case 817:
                akis akisVar7 = this.a;
                akkp akkpVar8 = akisVar7.a;
                return new ctml(akisVar7.fM, akkpVar8.ig, akkpVar8.qX());
            case 818:
                errl errlVar2 = (errl) this.a.p.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                akis akisVar8 = this.a;
                akkp akkpVar9 = akisVar8.a;
                return new cttm(errlVar2, ffskVar, ffskVar2, akisVar8.jx, akkpVar9.jZ(), akisVar8.dy, akisVar8.aR, akkpVar9.ng);
            case 819:
                return Optional.of((cgoo) this.a.a.nf.b());
            case 820:
                return new ahsc((ffsk) this.a.a.p.b(), (ffhd) this.a.co.b(), (dtve) this.a.a.cD.b(), this.a.a.dB);
            case 821:
                ffsk ffskVar3 = (ffsk) this.a.a.q.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akis akisVar9 = this.a;
                return new cttq(ffskVar3, cqohVar, akisVar9.a.ni, akisVar9.fM);
            case 822:
                return new czui((crjp) this.a.jy.b(), (Optional) this.a.a.nl.b());
            case 823:
                return Optional.of(this.a.a.pY());
            case 824:
                Context context = (Context) this.a.q.b();
                akis akisVar10 = this.a;
                fbbf fbbfVar13 = akisVar10.fO;
                cvff cY = akisVar10.cY();
                fbbf fbbfVar14 = akisVar10.fQ;
                dgea dgeaVar = (dgea) akisVar10.fP.b();
                akkp akkpVar10 = this.a.a;
                fbbf fbbfVar15 = akkpVar10.fo;
                fbbf fbbfVar16 = akkpVar10.C;
                fbbf fbbfVar17 = akkpVar10.az;
                aleq aleqVar = (aleq) akkpVar10.lO.b();
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                ffhd ffhdVar2 = (ffhd) this.a.cn.b();
                akkp akkpVar11 = this.a.a;
                return new cvdp(context, fbbfVar13, cY, fbbfVar14, dgeaVar, fbbfVar15, fbbfVar16, fbbfVar17, aleqVar, ffhdVar, ffhdVar2, akkpVar11.no, akkpVar11.lu(), akkpVar11.dE);
            case 825:
                final fbbf fbbfVar18 = this.a.a.s;
                return new aspy() { // from class: arvs
                    @Override // defpackage.aspy
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_use_penpal_bot_conversation_id");
                    }
                };
            case 826:
                ffhd ffhdVar3 = (ffhd) this.a.co.b();
                ffhd ffhdVar4 = (ffhd) this.a.cP.b();
                akis akisVar11 = this.a;
                return new ctrg(ffhdVar3, ffhdVar4, akisVar11.a.lg(), (cqoh) akisVar11.cz.b());
            case 827:
                ffsk ffskVar4 = (ffsk) this.a.a.q.b();
                ffhd ffhdVar5 = (ffhd) this.a.co.b();
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar6 = (ffhd) this.a.cn.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akkp akkpVar12 = this.a.a;
                return new ctrc(ffskVar4, ffhdVar5, ffskVar5, ffhdVar6, cqohVar2, akkpVar12.dA, (dtuu) akkpVar12.ay.b(), this.a.jA);
            case 828:
                akis akisVar12 = this.a;
                akkp akkpVar13 = akisVar12.a;
                return new anwi(akkpVar13.p, akkpVar13.aq, akisVar12.hi, akisVar12.iE);
            case 829:
                akis akisVar13 = this.a;
                akkp akkpVar14 = akisVar13.a;
                return new anvm(akkpVar14.p, akkpVar14.aq, akisVar13.hi, akisVar13.iE);
            case 830:
                akis akisVar14 = this.a;
                akkp akkpVar15 = akisVar14.a;
                return new aoaj(akkpVar15.p, akkpVar15.aq, akisVar14.hi, akkpVar15.nw, akkpVar15.nx, akkpVar15.ny);
            case 831:
                akis akisVar15 = this.a;
                akkp akkpVar16 = akisVar15.a;
                return new anyz(akisVar15.q, akkpVar16.p, akisVar15.hi, akisVar15.iE, akkpVar16.nn, akkpVar16.np, akkpVar16.nq, akkpVar16.nr);
            case 832:
                akis akisVar16 = this.a;
                akkp akkpVar17 = akisVar16.a;
                return new anws(akkpVar17.p, akkpVar17.aq, akisVar16.hi, akisVar16.iE);
            case 833:
                akis akisVar17 = this.a;
                akkp akkpVar18 = akisVar17.a;
                return new anvx(akkpVar18.p, akkpVar18.aq, akisVar17.hi, akisVar17.iE);
            case 834:
                akis akisVar18 = this.a;
                akkp akkpVar19 = akisVar18.a;
                return new anxe(akkpVar19.p, akisVar18.hi, akisVar18.iE, akkpVar19.nq);
            case 835:
                akis akisVar19 = this.a;
                akkp akkpVar20 = akisVar19.a;
                return new anxn(akkpVar20.p, akisVar19.hi, akisVar19.iE, akkpVar20.nq);
            case 836:
                return Optional.of((ctjh) this.a.a.nE.b());
            case 837:
                akis akisVar20 = this.a;
                fbbf fbbfVar19 = akisVar20.co;
                akkp akkpVar21 = akisVar20.a;
                fbbf fbbfVar20 = akkpVar21.dB;
                fbbf fbbfVar21 = akkpVar21.nr;
                ffhd ffhdVar7 = (ffhd) fbbfVar19.b();
                ffhd ffhdVar8 = (ffhd) this.a.cn.b();
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                ffsk ffskVar7 = (ffsk) this.a.a.p.b();
                akkp akkpVar22 = this.a.a;
                return new ctko(fbbfVar20, fbbfVar21, ffhdVar7, ffhdVar8, ffskVar6, ffskVar7, akkpVar22.nC, akkpVar22.nj, akkpVar22.nD);
            case 838:
                akis akisVar21 = this.a;
                akkp akkpVar23 = akisVar21.a;
                return new ctle(akkpVar23.dE, akkpVar23.az, akisVar21.jB, (cjdi) akisVar21.jC.b());
            case 839:
                akis akisVar22 = this.a;
                akkp akkpVar24 = akisVar22.a;
                return new aply(akkpVar24.nI, akkpVar24.nK, akkpVar24.p, akisVar22.co, akisVar22.cz, akkpVar24.la);
            case 840:
                akis akisVar23 = this.a;
                akkp akkpVar25 = akisVar23.a;
                fbbf fbbfVar22 = akisVar23.fM;
                couo couoVar = (couo) akkpVar25.nH.b();
                akis akisVar24 = this.a;
                akkp akkpVar26 = akisVar24.a;
                return new cpaa(fbbfVar22, couoVar, akisVar24.cv(), akkpVar26.gQ, akkpVar26.br, akkpVar26.gE);
            case 841:
                return new avkm((avkc) this.a.a.G.b(), (avkf) this.a.a.nJ.b());
            case 842:
                return new avkf((avkc) this.a.a.G.b());
            case 843:
                return new aphr((errl) this.a.p.b(), (errl) this.a.t.b(), (aphw) this.a.jF.b(), this.a.a.Q);
            case 844:
                akis akisVar25 = this.a;
                akkp akkpVar27 = akisVar25.a;
                return new aqbp(akkpVar27.qO, akkpVar27.fP, akkpVar27.qU, akkpVar27.qX, akisVar25.p);
            case 845:
                akis akisVar26 = this.a;
                akkp akkpVar28 = akisVar26.a;
                fbbf fbbfVar23 = akkpVar28.nS;
                fbbf fbbfVar24 = akkpVar28.nT;
                fbbf fbbfVar25 = akkpVar28.iy;
                fbbf fbbfVar26 = akkpVar28.pE;
                fbbf fbbfVar27 = akkpVar28.qM;
                fbbf fbbfVar28 = akkpVar28.pS;
                fbbf fbbfVar29 = akkpVar28.iF;
                errl errlVar3 = (errl) akisVar26.t.b();
                akkp akkpVar29 = this.a.a;
                return new amca(fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, errlVar3, akkpVar29.qN, akkpVar29.c);
            case 846:
                return new bcvz((bcwz) this.a.a.ad.b(), (bcxm) this.a.a.nQ.b());
            case 847:
                akis akisVar27 = this.a;
                akkp akkpVar30 = akisVar27.a;
                fbbf fbbfVar30 = akkpVar30.nP;
                fbbf fbbfVar31 = akisVar27.q;
                fbbf fbbfVar32 = akkpVar30.ha;
                fbbf fbbfVar33 = akkpVar30.ft;
                fbbf fbbfVar34 = akisVar27.iL;
                fbbf fbbfVar35 = akkpVar30.ad;
                fbbf fbbfVar36 = akisVar27.cB;
                fbbf fbbfVar37 = akisVar27.cC;
                fbbf fbbfVar38 = akkpVar30.ac;
                fbbf fbbfVar39 = akkpVar30.nQ;
                apgzVar = new bcxm(fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, akkpVar30.co, akisVar27.cz, akisVar27.fM, akisVar27.jG, akkpVar30.jp, akisVar27.jH, akisVar27.t, akkpVar30.jD, akkpVar30.jF, akkpVar30.nR, fbbfVar39, fbbfVar39, fbbfVar39, fbbfVar39, fbbfVar39, fbbfVar39, fbbfVar39, fbbfVar39);
                break;
            case 848:
                return new ctfj(this.a.a.nO);
            case 849:
                return Boolean.valueOf(((ekck) this.a.a.nA().a.b()).a("com.google.android.apps.messaging.auto 45368720").e());
            case 850:
                final fbbf fbbfVar40 = this.a.a.s;
                return new aswd() { // from class: aset
                    @Override // defpackage.aswd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.update_message_core_data_adds_preserve_size");
                    }
                };
            case 851:
                akis akisVar28 = this.a;
                akkp akkpVar31 = akisVar28.a;
                return new batq(akisVar28.q, akkpVar31.dB, akisVar28.cz, akkpVar31.nW, akkpVar31.ps, akkpVar31.pt, akkpVar31.pv, akkpVar31.pC, akkpVar31.hw, akkpVar31.pD, akkpVar31.dn);
            case 852:
                akis akisVar29 = this.a;
                akkp akkpVar32 = akisVar29.a;
                return new tuu(akkpVar32.iy, akkpVar32.nU, akkpVar32.ld, akkpVar32.nV, akisVar29.cz);
            case 853:
                return new amet(this.a.a.mx);
            case 854:
                final fbbf fbbfVar41 = this.a.a.s;
                return new atdn() { // from class: atdc
                    @Override // defpackage.atdn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.compose_row2_only_use_incoming_compose_row_state");
                    }
                };
            case 855:
                akis akisVar30 = this.a;
                akkp akkpVar33 = akisVar30.a;
                return new bavo(akkpVar33.dB, akisVar30.cz, akkpVar33.f, akisVar30.t, akisVar30.p, akkpVar33.oO, akkpVar33.oP, akkpVar33.oQ, akkpVar33.pr, akkpVar33.pq);
            case 856:
                akkp akkpVar34 = this.a.a;
                return new cqos(akkpVar34.oq, akkpVar34.or, akkpVar34.oM, akkpVar34.oN, akkpVar34.cG);
            case 857:
                errl errlVar4 = (errl) this.a.p.b();
                akkp akkpVar35 = this.a.a;
                return new cqvf(errlVar4, akkpVar35.oa, (avya) akkpVar35.op.b());
            case 858:
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                akkp akkpVar36 = this.a.a;
                return new cqvb(errlVar5, errlVar6, akkpVar36.nX, akkpVar36.nY, akkpVar36.nZ);
            case 859:
                return new avxv(this.a.a.cc);
            case 860:
                errl errlVar7 = (errl) this.a.t.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akis akisVar31 = this.a;
                return new cqrl(errlVar7, dtuuVar, akisVar31.a.dB, (cqoh) akisVar31.cz.b());
            case 861:
                final fbbf fbbfVar42 = this.a.a.s;
                return new atxc() { // from class: atwd
                    @Override // defpackage.atxc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.set_deduplication_tag_in_download_worker");
                    }
                };
            case 862:
                return ((akji) this.a.a.om.b()).a(this.a.a.dk());
            case 863:
                return new akji(this);
            case 864:
                akkp akkpVar37 = this.a.a;
                return avvf.a(akkpVar37.cG, akkpVar37.pu(), akkpVar37.pS());
            case 865:
                fbbf fbbfVar43 = this.a.a.oi;
                fbbfVar43.getClass();
                Object b = fbbfVar43.b();
                b.getClass();
                return (cqqq) b;
            case 866:
                Context context2 = (Context) this.a.q.b();
                akis akisVar32 = this.a;
                return new cqqp(context2, akisVar32.a.kN(), (chks) akisVar32.df.b(), this.a.a.oh);
            case 867:
                return (ezgw) ((ekck) this.a.a.nY().a.b()).a("com.google.android.apps.messaging.auto 45617207").c();
            case 868:
                return Long.valueOf(((ekck) this.a.a.nT().a.b()).a("com.google.android.apps.messaging.auto 45621596").b());
            case 869:
                return Long.valueOf(((ekck) this.a.a.nT().a.b()).a("com.google.android.apps.messaging.auto 45621597").b());
            case 870:
                return Long.valueOf(((ekck) this.a.a.nT().a.b()).a("com.google.android.apps.messaging.auto 45621598").b());
            case 871:
                return Boolean.valueOf(((ekck) this.a.a.nT().a.b()).a("com.google.android.apps.messaging.auto 45621599").e());
            case 872:
                return Long.valueOf(((ekck) this.a.a.nT().a.b()).a("com.google.android.apps.messaging.auto 45637759").b());
            case 873:
                final fbbf fbbfVar44 = this.a.a.s;
                return new aslm() { // from class: arov
                    @Override // defpackage.aslm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.disable_crashing_on_quic_storage_failure");
                    }
                };
            case 874:
                akis akisVar33 = this.a;
                return new avvw(akisVar33.t, akisVar33.a.bu);
            case 875:
                return new avwh((djry) this.a.a.bC.b(), (avwx) this.a.jJ.b());
            case 876:
                return Long.valueOf(((ekck) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto 45390697").b());
            case 877:
                return Long.valueOf(((ekck) this.a.a.nR().a.b()).a("com.google.android.apps.messaging.auto 45390698").b());
            case 878:
                akis akisVar34 = this.a;
                akkp akkpVar38 = akisVar34.a;
                return new cqvs(akkpVar38.dk, akkpVar38.nY, (Context) akisVar34.q.b(), (errl) this.a.aK.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 879:
                errl errlVar8 = (errl) this.a.p.b();
                errl errlVar9 = (errl) this.a.t.b();
                akkp akkpVar39 = this.a.a;
                return new crez(errlVar8, errlVar9, akkpVar39.ot, akkpVar39.oK, akkpVar39.nY, akkpVar39.oL);
            case 880:
                akis akisVar35 = this.a;
                return new crda(akisVar35.a.os, (errl) akisVar35.t.b(), (errl) this.a.p.b(), this.a.a.nY);
            case 881:
                return new crdm(this.a.a.cc);
            case 882:
                errl errlVar10 = (errl) this.a.p.b();
                errl errlVar11 = (errl) this.a.aK.b();
                akkp akkpVar40 = this.a.a;
                return new creu(errlVar10, errlVar11, akkpVar40.oI, akkpVar40.oJ, akkpVar40.oz, akkpVar40.kR(), akkpVar40.bI());
            case 883:
                errl errlVar12 = (errl) this.a.p.b();
                akis akisVar36 = this.a;
                Object qB = akisVar36.a.qB();
                crcd crcdVar = (crcd) akisVar36.jM.b();
                akkp akkpVar41 = this.a.a;
                return new creh(errlVar12, (crft) qB, crcdVar, akkpVar41.kR(), akkpVar41.oH, akkpVar41.bE());
            case 884:
                return new akjj(this);
            case 885:
                akis akisVar37 = this.a;
                fbbf fbbfVar45 = akisVar37.cz;
                fbbf fbbfVar46 = akisVar37.a.ov;
                cqoh cqohVar3 = (cqoh) fbbfVar45.b();
                errl errlVar13 = (errl) this.a.aK.b();
                akkp akkpVar42 = this.a.a;
                return cqql.a(fbbfVar46, cqohVar3, errlVar13, akkpVar42.hU(), akkpVar42.ou);
            case 886:
                fbbf fbbfVar47 = this.a.a.oi;
                fbbfVar47.getClass();
                CronetEngine b2 = ((cqqp) fbbfVar47.b()).b();
                b2.getClass();
                return b2;
            case 887:
                akkp akkpVar43 = this.a.a;
                return new awdu(akkpVar43.du(), (ffsk) akkpVar43.p.b(), this.a.a.dv());
            case 888:
                return (eyev) ((ekck) this.a.a.nW().a.b()).a("com.google.android.apps.messaging.auto 45666939").c();
            case 889:
                final fbbf fbbfVar48 = this.a.a.s;
                return new atwx() { // from class: atvt
                    @Override // defpackage.atwx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_upload_resume_in_file_processing_pipeline");
                    }
                };
            case 890:
                final fbbf fbbfVar49 = this.a.a.s;
                return new atxg() { // from class: atwi
                    @Override // defpackage.atxg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_cronet_for_all_upload_file_sizes");
                    }
                };
            case 891:
                return ((ekck) this.a.a.nV().a.b()).a("com.google.android.apps.messaging.auto 45622549").d();
            case 892:
                return Long.valueOf(((ekck) this.a.a.nX().a.b()).a("com.google.android.apps.messaging.auto 45428196").b());
            case 893:
                return Long.valueOf(((ekck) this.a.a.nX().a.b()).a("com.google.android.apps.messaging.auto 45616285").b());
            case 894:
                akkp akkpVar44 = this.a.a;
                return new crfh(akkpVar44.bC, akkpVar44.oE, akkpVar44.oF, akkpVar44.oG, (djrk) akkpVar44.bF.b());
            case 895:
                return Boolean.valueOf(((ekck) this.a.a.nS().a.b()).a("com.google.android.apps.messaging.auto 45627089").e());
            case 896:
                return ((ekck) this.a.a.nS().a.b()).a("com.google.android.apps.messaging.auto 45643305").d();
            case 897:
                return Boolean.valueOf(((ekck) this.a.a.nS().a.b()).a("com.google.android.apps.messaging.auto 45627090").e());
            case 898:
                errl errlVar14 = (errl) this.a.p.b();
                akis akisVar38 = this.a;
                akkp akkpVar45 = akisVar38.a;
                Object qB2 = akkpVar45.qB();
                cqqd kL = akkpVar45.kL();
                crcd crcdVar2 = (crcd) akisVar38.jM.b();
                akkp akkpVar46 = this.a.a;
                return new crdz(errlVar14, (crft) qB2, kL, crcdVar2, akkpVar46.oH, akkpVar46.bE());
            case 899:
                errl errlVar15 = (errl) this.a.t.b();
                errl errlVar16 = (errl) this.a.aK.b();
                akkp akkpVar47 = this.a.a;
                return new cqps(errlVar15, errlVar16, akkpVar47.dB, (cqrl) akkpVar47.nY.b(), (cqoh) this.a.cz.b());
            default:
                throw new AssertionError(i);
        }
        return apgzVar;
    }

    private final Object H() {
        fban fbanVar;
        int i = this.b;
        switch (i) {
            case 900:
                akkp akkpVar = this.a.a;
                fbbf fbbfVar = akkpVar.dk;
                dtuu dtuuVar = (dtuu) akkpVar.ay.b();
                Context context = (Context) this.a.q.b();
                akis akisVar = this.a;
                return new crdl(fbbfVar, dtuuVar, context, akisVar.a.nY, (errl) akisVar.t.b(), (errl) this.a.aK.b());
            case 901:
                akkp akkpVar2 = this.a.a;
                return new cqvy(akkpVar2.bi, akkpVar2.dE, akkpVar2.f, akkpVar2.cH, akkpVar2.oo, akkpVar2.gp);
            case 902:
                final fbbf fbbfVar2 = this.a.a.s;
                return new asnv() { // from class: arso
                    @Override // defpackage.asnv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_file_processing_pipeline");
                    }
                };
            case 903:
                akkp akkpVar3 = this.a.a;
                return new awah(akkpVar3.dp(), (ffsk) akkpVar3.p.b());
            case 904:
                Context context2 = (Context) this.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akkp akkpVar4 = this.a.a;
                return new cbjv(context2, ffhdVar, akkpVar4.fE(), akkpVar4.fG(), akkpVar4.C, (crbd) akkpVar4.oX.b(), (ctap) this.a.a.co.b(), (ctax) this.a.a.lD.b());
            case 905:
                final fbbf fbbfVar3 = this.a.a.s;
                return new atww() { // from class: atvr
                    @Override // defpackage.atww
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_media_transcoding_logging_for_file_processing_pipeline");
                    }
                };
            case 906:
                return new ctfi((Context) this.a.q.b(), (ctfl) this.a.a.oS.b(), (cqoh) this.a.cz.b(), this.a.cN);
            case 907:
                return new ctfl((akzt) this.a.a.f.b(), this.a.a.aw());
            case 908:
                Context context3 = (Context) this.a.q.b();
                ejlk ejlkVar = (ejlk) this.a.ds.b();
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                akis akisVar2 = this.a;
                fbbf fbbfVar4 = akisVar2.cz;
                ctfu cP = akisVar2.cP();
                cqoh cqohVar = (cqoh) fbbfVar4.b();
                csuu csuuVar = (csuu) this.a.iL.b();
                ctcd ctcdVar = (ctcd) this.a.a.lB.b();
                ctfl ctflVar = (ctfl) this.a.a.oS.b();
                akkp akkpVar5 = this.a.a;
                return new ctgf(context3, ejlkVar, ffskVar, cP, cqohVar, csuuVar, ctcdVar, ctflVar, akkpVar5.lb(), akkpVar5.oU);
            case 909:
                return Long.valueOf(fdck.a(this.a.a.of()));
            case 910:
                final fbbf fbbfVar5 = this.a.a.s;
                return new aufm() { // from class: auet
                    @Override // defpackage.aufm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fail_video_resizing_if_size_exceeds_limit");
                    }
                };
            case 911:
                return new crbd((Context) this.a.q.b(), (csum) this.a.a.dr.b(), (ctap) this.a.a.co.b());
            case 912:
                asqi asqiVar = (asqi) this.a.a.mV.b();
                this.a.a.sm();
                return new cfmm(asqiVar);
            case 913:
                return new atub() { // from class: atto
                };
            case 914:
                return fdaz.a(this.a.a.nW());
            case 915:
                return new cqqa((dtuu) this.a.a.ay.b(), (cqtw) this.a.jO.b(), (errl) this.a.p.b(), (errl) this.a.t.b(), (ConcurrentMap) this.a.jP.b());
            case 916:
                akis akisVar3 = this.a;
                akkp akkpVar6 = akisVar3.a;
                return new crga(akkpVar6.dE, akkpVar6.cH, akkpVar6.bi, (errl) akisVar3.p.b());
            case 917:
                return Long.valueOf(fdbj.a(this.a.a.nZ()));
            case 918:
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                errl errlVar = (errl) this.a.aK.b();
                akkp akkpVar7 = this.a.a;
                fbbf fbbfVar6 = akkpVar7.dB;
                bbhf bbhfVar = (bbhf) akkpVar7.pf.b();
                akkp akkpVar8 = this.a.a;
                return new crbp(dtuuVar2, errlVar, fbbfVar6, bbhfVar, akkpVar8.ez(), (crga) akkpVar8.pd.b(), (baoy) this.a.a.pj.b(), (cqoh) this.a.cz.b());
            case 919:
                return Optional.of(this.a.a.ai());
            case 920:
                final fbbf fbbfVar7 = this.a.a.s;
                return new asqx() { // from class: arxn
                    @Override // defpackage.asqx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_default_sub_id_in_process_file_transfer_action");
                    }
                };
            case 921:
                akkp akkpVar9 = this.a.a;
                return new ckam(akkpVar9.gE, akkpVar9.bF, akkpVar9.aO);
            case 922:
                Context context4 = (Context) this.a.q.b();
                akkp akkpVar10 = this.a.a;
                return new baoy(context4, akkpVar10.dB, akkpVar10.dw, (coxk) akkpVar10.iN.b(), (dtuu) this.a.a.ay.b());
            case 923:
                return awaq.a(this.a.a.a());
            case 924:
                final fbbf fbbfVar8 = this.a.a.s;
                return new atwz() { // from class: atvx
                    @Override // defpackage.atwz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_message_id_for_processing_pipeline_if_message_was_sent");
                    }
                };
            case 925:
                final fbbf fbbfVar9 = this.a.a.s;
                return new atwv() { // from class: atvp
                    @Override // defpackage.atwv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_logging_for_file_processing_pipeline");
                    }
                };
            case 926:
                final fbbf fbbfVar10 = this.a.a.s;
                return new atwu() { // from class: atvn
                    @Override // defpackage.atwu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_file_transfer_diagnostics_logging_in_processing_pipeline");
                    }
                };
            case 927:
                final fbbf fbbfVar11 = this.a.a.s;
                return new atwt() { // from class: atvl
                    @Override // defpackage.atwt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_early_upload_for_encrypted_images");
                    }
                };
            case 928:
                return new asmp() { // from class: arqn
                };
            case 929:
                akis akisVar4 = this.a;
                akkp akkpVar11 = akisVar4.a;
                return new bats(akkpVar11.jc, akkpVar11.ej, akisVar4.aO);
            case 930:
                return new banu((csxu) this.a.aO.b(), (bbgq) this.a.a.pu.b());
            case 931:
                akkp akkpVar12 = this.a.a;
                return new bbgq(akkpVar12.dB, (bbfw) akkpVar12.pt.b());
            case 932:
                akis akisVar5 = this.a;
                akkp akkpVar13 = akisVar5.a;
                return new cjbe(akkpVar13.pw, akkpVar13.px, akisVar5.jS, akkpVar13.py, akkpVar13.pA, akkpVar13.pB, akisVar5.p);
            case 933:
                akkp akkpVar14 = this.a.a;
                return new ciwj(akkpVar14.hW(), akkpVar14.hV());
            case 934:
                final fbbf fbbfVar12 = this.a.a.s;
                return new asqe() { // from class: arwe
                    @Override // defpackage.asqe
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.merge_notification_directors_into_one");
                    }
                };
            case 935:
                return new cjdh((ciwj) this.a.a.pw.b(), this.a.a.ij());
            case 936:
                akis akisVar6 = this.a;
                akkp akkpVar15 = akisVar6.a;
                return new cgie(akisVar6.cP, akisVar6.cn, akkpVar15.p, akisVar6.jm, akisVar6.cN, (aqkp) akkpVar15.mu.b(), (aqly) this.a.a.lV.b());
            case 937:
                akis akisVar7 = this.a;
                akkp akkpVar16 = akisVar7.a;
                return new amoc(akisVar7.jT, akkpVar16.aq, akisVar7.cP, akisVar7.jl, akisVar7.jm, akkpVar16.lV, akkpVar16.eX, akkpVar16.lU, akkpVar16.mu, akkpVar16.aO);
            case 938:
                akkp akkpVar17 = this.a.a;
                return new ames(akkpVar17.Z, akkpVar17.no, akkpVar17.ld, akkpVar17.hJ);
            case 939:
                akis akisVar8 = this.a;
                akkp akkpVar18 = akisVar8.a;
                return new bauy(akkpVar18.Z, akkpVar18.dB, akkpVar18.gQ, akkpVar18.aO, akisVar8.cz, akkpVar18.pH, akkpVar18.fP, akkpVar18.dE, akkpVar18.pI, akkpVar18.qJ, akkpVar18.fr, akkpVar18.pP, akkpVar18.ck, akkpVar18.qL, akisVar8.p, akkpVar18.Q, akkpVar18.pf, akkpVar18.pD, akkpVar18.cj, akkpVar18.ci);
            case 940:
                Context context5 = (Context) this.a.q.b();
                akkp akkpVar19 = this.a.a;
                return new cbif(context5, akkpVar19.fC(), akkpVar19.fD(), (cbia) akkpVar19.fN.b(), (cins) this.a.a.jc.b(), this.a.a.f);
            case 941:
                akis akisVar9 = this.a;
                akkp akkpVar20 = akisVar9.a;
                return new bazm(akisVar9.q, akkpVar20.fN, akkpVar20.pF, akkpVar20.ay);
            case 942:
                return new bdor((cbgf) this.a.a.dA.b(), this.a.a.hK);
            case 943:
                Context context6 = (Context) this.a.q.b();
                csuk csukVar = (csuk) this.a.a.ha.b();
                csuu csuuVar2 = (csuu) this.a.iL.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                ctfj ctfjVar = (ctfj) this.a.a.nP.b();
                akkp akkpVar21 = this.a.a;
                return new bdve(context6, csukVar, csuuVar2, cpbsVar, ctfjVar, akkpVar21.lC, akkpVar21.lD, akkpVar21.oQ);
            case 944:
                akzt akztVar = (akzt) this.a.a.f.b();
                akkp akkpVar22 = this.a.a;
                fbbf fbbfVar13 = akkpVar22.fr;
                fbbf fbbfVar14 = akkpVar22.dB;
                fbbf fbbfVar15 = akkpVar22.dn;
                fbbf fbbfVar16 = akkpVar22.hv;
                fbbf fbbfVar17 = akkpVar22.aO;
                dtuu dtuuVar3 = (dtuu) akkpVar22.ay.b();
                cpdg cpdgVar = (cpdg) this.a.a.ap.b();
                akis akisVar10 = this.a;
                fbbf fbbfVar18 = akisVar10.a.pJ;
                errl errlVar2 = (errl) akisVar10.t.b();
                akkp akkpVar23 = this.a.a;
                return new cano(akztVar, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, dtuuVar3, cpdgVar, fbbfVar18, errlVar2, akkpVar23.qC, akkpVar23.hK, akkpVar23.qD, akkpVar23.qk, akkpVar23.qG, akkpVar23.qH, akkpVar23.Z, akkpVar23.qI, akkpVar23.hJ);
            case 945:
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar19 = akisVar11.cz;
                akkp akkpVar24 = akisVar11.a;
                fbbf fbbfVar20 = akkpVar24.dA;
                fbbf fbbfVar21 = akisVar11.iz;
                fbbf fbbfVar22 = akkpVar24.dE;
                fbbf fbbfVar23 = akkpVar24.dy;
                fbbf fbbfVar24 = akkpVar24.ib;
                fbbf fbbfVar25 = akkpVar24.qh;
                fbbf fbbfVar26 = akkpVar24.Z;
                cqoh cqohVar2 = (cqoh) fbbfVar19.b();
                akkp akkpVar25 = this.a.a;
                return new bdjr(dtuuVar4, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, cqohVar2, akkpVar25.qi, akkpVar25.qj);
            case 946:
                return new bdol((ffhd) this.a.co.b(), (ffhd) this.a.cn.b(), (ffsk) this.a.a.p.b(), fbaz.a(this.a.a.qg));
            case 947:
                akkp akkpVar26 = this.a.a;
                sgd h = akkpVar26.h();
                shh j = akkpVar26.j();
                celv gR = akkpVar26.gR();
                alwo av = akkpVar26.av();
                aczs aczsVar = new aczs();
                akis akisVar12 = this.a;
                cmjf jp = akisVar12.a.jp();
                akkp akkpVar27 = this.a.a;
                akkp akkpVar28 = this.a.a;
                return enip.v(h, j, gR, av, aczsVar, jp, akisVar12.a.jr(), this.a.a.io(), this.a.a.hz(), this.a.a.aq(), akkpVar27.S(), akkpVar27.V(), this.a.a.jz(), this.a.a.jK(), akkpVar28.lt(), akkpVar28.m());
            case 948:
                return Boolean.valueOf(arfr.a((ersq) this.a.a.s.b()));
            case 949:
                final fbbf fbbfVar27 = this.a.a.s;
                return new arep() { // from class: arfk
                    @Override // defpackage.arep
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.allow_true_multi_device_opt_in");
                    }
                };
            case 950:
                ejet ejetVar = (ejet) this.a.a.pM.b();
                return new babf(ejetVar, (errl) this.a.aK.b(), (dtuu) this.a.a.ay.b(), (ejvp) this.a.aR.b(), (akzt) this.a.a.f.b());
            case 951:
                return new ejet((eiyk) this.a.a.o.b());
            case 952:
                akis akisVar13 = this.a;
                fbbf fbbfVar28 = akisVar13.a.pO;
                Optional optional = (Optional) akisVar13.jZ.b();
                akis akisVar14 = this.a;
                akkp akkpVar29 = akisVar14.a;
                return new alwf(fbbfVar28, optional, akisVar14.dl(), akkpVar29.au(), akkpVar29.br, (errl) akisVar14.p.b(), (errl) this.a.t.b(), (errl) this.a.aK.b());
            case 953:
                final fbbf fbbfVar29 = this.a.a.s;
                return new atrb() { // from class: atnv
                    @Override // defpackage.atrb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_non_compliant_api_from_cobalt_logger");
                    }
                };
            case 954:
                akis akisVar15 = this.a;
                akkp akkpVar30 = akisVar15.a;
                return new cmje(akkpVar30.iy, akkpVar30.pQ, akisVar15.iz, akkpVar30.pS);
            case 955:
                akis akisVar16 = this.a;
                return new cgrq(akisVar16.a.hx(), (errm) akisVar16.p.b(), (asix) this.a.a.pR.b());
            case 956:
                final fbbf fbbfVar30 = this.a.a.s;
                return new asix() { // from class: arkh
                    @Override // defpackage.asix
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_message_deletions_in_buffer");
                    }
                };
            case 957:
                final fbbf fbbfVar31 = this.a.a.s;
                return new auol() { // from class: auoj
                    @Override // defpackage.auol
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rcs_delete");
                    }
                };
            case 958:
                return new cmky((cbgf) this.a.a.dA.b());
            case 959:
                ejar ejarVar = (ejar) this.a.a.au.b();
                akkp akkpVar31 = this.a.a;
                return new cjho(ejarVar, akkpVar31.me(), (ffsk) akkpVar31.q.b(), (cfyt) this.a.a.cf.b());
            case 960:
                fbanVar = this.a.c;
                Application a = fbao.a(fbanVar);
                akis akisVar17 = this.a;
                return drsx.a(a, cjhc.a(), drsw.a(), akisVar17.fb(), (Executor) akisVar17.p.b(), (ScheduledExecutorService) this.a.t.b(), (Executor) this.a.a.m.b());
            case 961:
                akkp akkpVar32 = this.a.a;
                return new bdxd(akkpVar32.eR(), akkpVar32.ay);
            case 962:
                dtuu dtuuVar5 = (dtuu) this.a.a.ay.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                akis akisVar18 = this.a;
                fbbf fbbfVar32 = akisVar18.cz;
                akkp akkpVar33 = akisVar18.a;
                return new cnbr(dtuuVar5, cbgfVar, akkpVar33.bN(), akkpVar33.rB(), (cqoh) fbbfVar32.b());
            case 963:
                akkp akkpVar34 = this.a.a;
                return new cmql(akkpVar34.am(), akkpVar34.an(), (cpbs) akkpVar34.ft.b(), (akvz) this.a.a.dE.b());
            case 964:
                akzt akztVar2 = (akzt) this.a.a.f.b();
                akkp akkpVar35 = this.a.a;
                return new cmqm(akztVar2, akkpVar35.al, akkpVar35.D(), akkpVar35.bN());
            case 965:
                return aajy.a((aajs) this.a.a.qb.b());
            case 966:
                akkp akkpVar36 = this.a.a;
                return new aajs(akkpVar36.nc, (ffsk) akkpVar36.q.b());
            case 967:
                return new apct((akvz) this.a.a.dE.b());
            case 968:
                akis akisVar19 = this.a;
                Object ff = akisVar19.ff();
                Context context7 = (Context) akisVar19.q.b();
                emyl emylVar = (emyl) this.a.dj.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar37 = this.a.a;
                return akys.a(ff, context7, emylVar, cqohVar3, akkpVar37.be, (albl) akkpVar37.bh.b(), (Executor) this.a.p.b());
            case 969:
                final fbbf fbbfVar33 = this.a.a.s;
                return new astz() { // from class: asbe
                    @Override // defpackage.astz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_messaging_identity_in_message_core_data_inserter");
                    }
                };
            case 970:
                final fbbf fbbfVar34 = this.a.a.s;
                return new auxc() { // from class: auww
                    @Override // defpackage.auxc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_mpid_in_forward_sync");
                    }
                };
            case 971:
                akkp akkpVar38 = this.a.a;
                return new camv(akkpVar38.ay, akkpVar38.kG, akkpVar38.qx, akkpVar38.qz, akkpVar38.qA, akkpVar38.qB, akkpVar38.dR, akkpVar38.qk);
            case 972:
                akkp akkpVar39 = this.a.a;
                return new canc(akkpVar39.dB, akkpVar39.qk, akkpVar39.qw, akkpVar39.qv);
            case 973:
                return new canu((akzt) this.a.a.f.b());
            case 974:
                akkp akkpVar40 = this.a.a;
                return new canw(akkpVar40.aO, akkpVar40.dn, akkpVar40.dB, akkpVar40.hv, akkpVar40.pJ, akkpVar40.qq, akkpVar40.qk, akkpVar40.hK, akkpVar40.qv);
            case 975:
                errl errlVar3 = (errl) this.a.t.b();
                caen caenVar = (caen) this.a.a.qu.b();
                bzqa bzqaVar = (bzqa) this.a.cI.b();
                akkp akkpVar41 = this.a.a;
                fbbf fbbfVar35 = akkpVar41.fr;
                fbbf fbbfVar36 = akkpVar41.dB;
                dtuu dtuuVar6 = (dtuu) akkpVar41.ay.b();
                akkp akkpVar42 = this.a.a;
                fbbf fbbfVar37 = akkpVar42.dA;
                fbbf fbbfVar38 = akkpVar42.dn;
                fbbf fbbfVar39 = akkpVar42.aO;
                caqi fz = akkpVar42.fz();
                chef chefVar = (chef) akkpVar42.qs.b();
                akis akisVar20 = this.a;
                fbbf fbbfVar40 = akisVar20.a.C;
                awtm awtmVar = (awtm) akisVar20.iz.b();
                akkp akkpVar43 = this.a.a;
                return new caly(errlVar3, caenVar, bzqaVar, fbbfVar35, fbbfVar36, dtuuVar6, fbbfVar37, fbbfVar38, fbbfVar39, fz, chefVar, fbbfVar40, awtmVar, akkpVar43.gE, akkpVar43.ci(), akkpVar43.pi);
            case 976:
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                dtuu dtuuVar7 = (dtuu) this.a.a.ay.b();
                akis akisVar21 = this.a;
                fbbf fbbfVar41 = akisVar21.a.qn;
                errl errlVar4 = (errl) akisVar21.t.b();
                akkp akkpVar44 = this.a.a;
                fbbf fbbfVar42 = akkpVar44.az;
                fbbf fbbfVar43 = akkpVar44.qo;
                chef chefVar2 = (chef) akkpVar44.qs.b();
                akzt akztVar3 = (akzt) this.a.a.f.b();
                fazb a2 = fbaz.a(this.a.a.qp);
                akkp akkpVar45 = this.a.a;
                return new caen(cqohVar4, dtuuVar7, fbbfVar41, errlVar4, fbbfVar42, fbbfVar43, chefVar2, akztVar3, a2, akkpVar45.qt, akkpVar45.ch());
            case 977:
                return new akjk(this);
            case 978:
                return new akjl(this);
            case 979:
                akkp akkpVar46 = this.a.a;
                fbbf fbbfVar44 = akkpVar46.fP;
                avkk avkkVar = (avkk) akkpVar46.cH.b();
                akkp akkpVar47 = this.a.a;
                return new bzzi(fbbfVar44, avkkVar, akkpVar47.az, akkpVar47.ck());
            case 980:
                dtuu dtuuVar8 = (dtuu) this.a.a.ay.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                fazb a3 = fbaz.a(this.a.a.qp);
                akkp akkpVar48 = this.a.a;
                return new chef(dtuuVar8, cqohVar5, a3, akkpVar48.ch(), fbaz.a(akkpVar48.qr));
            case 981:
                return enip.r(this.a.a.fd(), new caeo());
            case 982:
                return new enpx(this.a.a.ff());
            case 983:
                final fbbf fbbfVar45 = this.a.a.s;
                return new astp() { // from class: asas
                    @Override // defpackage.astp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_legacy_fallback_rcs_destination_feature_flag");
                    }
                };
            case 984:
                return new cans(this.a.a.dB);
            case 985:
                akkp akkpVar49 = this.a.a;
                return new canq(akkpVar49.dB, akkpVar49.qq, akkpVar49.dn, akkpVar49.pJ, akkpVar49.qw, akkpVar49.qv, akkpVar49.qy);
            case 986:
                final fbbf fbbfVar46 = this.a.a.s;
                return new aspc() { // from class: arur
                    @Override // defpackage.aspc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.insert_tombstone_for_mms_messages_in_e2ee_conversations");
                    }
                };
            case 987:
                akkp akkpVar50 = this.a.a;
                return new camq(akkpVar50.pQ, akkpVar50.qz);
            case 988:
                akkp akkpVar51 = this.a.a;
                return new camr(akkpVar51.dB, akkpVar51.qw, akkpVar51.qz);
            case 989:
                final fbbf fbbfVar47 = this.a.a.s;
                return new asnq() { // from class: arsg
                    @Override // defpackage.asnq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_one_on_one_transitional_pst");
                    }
                };
            case 990:
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                akis akisVar22 = this.a;
                fbbf fbbfVar48 = akisVar22.co;
                akkp akkpVar52 = akisVar22.a;
                return new ccix(cbwjVar, cqohVar6, akkpVar52.cm, akkpVar52.qE, akkpVar52.qF, (ffhd) fbbfVar48.b(), (ffsk) this.a.a.q.b());
            case 991:
                final fbbf fbbfVar49 = this.a.a.s;
                return new asis() { // from class: arjx
                    @Override // defpackage.asis
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_entry_not_found_in_cms_deleted_messages_buffer");
                    }
                };
            case 992:
                final fbbf fbbfVar50 = this.a.a.s;
                return new asjm() { // from class: arll
                    @Override // defpackage.asjm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.round_cms_buffer_deletion_timestamp_to_day");
                    }
                };
            case 993:
                final fbbf fbbfVar51 = this.a.a.s;
                return new asiz() { // from class: arkl
                    @Override // defpackage.asiz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_tombstone_deletion_in_cms_deleted_messages_buffer");
                    }
                };
            case 994:
                final fbbf fbbfVar52 = this.a.a.s;
                return new auyj() { // from class: auyf
                    @Override // defpackage.auyj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.project_only_minimum_fields_for_validity_type");
                    }
                };
            case 995:
                axkm axkmVar = (axkm) this.a.a.ck.b();
                akkp akkpVar53 = this.a.a;
                return new axmm(axkmVar, akkpVar53.bZ(), (axcm) akkpVar53.qK.b());
            case 996:
                return new axcm((ffsk) this.a.a.p.b());
            case 997:
                return new amcq(this.a.a.cc);
            case 998:
                return Optional.of((coja) this.a.a.qT.b());
            case 999:
                cqoh cqohVar7 = (cqoh) this.a.cz.b();
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                akis akisVar23 = this.a;
                fbbf fbbfVar53 = akisVar23.aR;
                akkp akkpVar54 = akisVar23.a;
                fbbf fbbfVar54 = akkpVar54.qO;
                fbbf fbbfVar55 = akkpVar54.iy;
                fbbf fbbfVar56 = akkpVar54.ad;
                ejvp ejvpVar = (ejvp) fbbfVar53.b();
                aktq aktqVar = (aktq) this.a.kc.b();
                akis akisVar24 = this.a;
                akkp akkpVar55 = akisVar24.a;
                return new aksw(cqohVar7, errlVar5, errlVar6, fbbfVar54, fbbfVar55, fbbfVar56, ejvpVar, aktqVar, akkpVar55.qP, akkpVar55.qQ, akkpVar55.qR, akkpVar55.qS, akkpVar55.aO, akisVar24.bC(), akkpVar55.dw, akkpVar55.dB, akkpVar55.dn);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v158, types: [ejdd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v58, types: [bbgh, java.lang.Object] */
    private final Object a() {
        int i = this.b;
        switch (i) {
            case 0:
                return new dabt((Context) this.a.q.b(), (dabs) this.a.a.alk.b());
            case 1:
                Context context = (Context) this.a.q.b();
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new dabs(context, akkpVar.lH(), akisVar.aN, akkpVar.f, akisVar.p);
            case 2:
                akis akisVar2 = this.a;
                return dabu.a(dabk.a(), akisVar2.eA(), (efbm) akisVar2.aM.b());
            case 3:
                akis akisVar3 = this.a;
                return akzj.a(akisVar3.aO, akisVar3.a.az);
            case 4:
                Context context2 = (Context) this.a.q.b();
                errm errmVar = (errm) this.a.t.b();
                csxu csxuVar = (csxu) this.a.aO.b();
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar = akkpVar2.x;
                cskx cskxVar = (cskx) akkpVar2.alj.b();
                akis akisVar4 = this.a;
                cqoh cqohVar = (cqoh) akisVar4.cz.b();
                algm algmVar = (algm) this.a.a.Dt.b();
                akis akisVar5 = this.a;
                akkp akkpVar3 = akisVar5.a;
                diky rP = akkpVar3.rP();
                Object ff = akisVar5.ff();
                return new akya(context2, errmVar, csxuVar, fbbfVar, cskxVar, akisVar4.aP, cqohVar, algmVar, rP, (akxp) ff, akkpVar3.be, (akyb) akkpVar3.bi.b(), (akyb) this.a.a.qf.b(), (akyb) this.a.a.dt.b());
            case 5:
                akis akisVar6 = this.a;
                akkp akkpVar4 = akisVar6.a;
                return new alar(akkpVar4.ali, akkpVar4.c, akisVar6.aZ);
            case 6:
                akis akisVar7 = this.a;
                akkp akkpVar5 = akisVar7.a;
                return new akyt(akisVar7.aT, akkpVar5.c, akisVar7.aQ, akisVar7.aP, akisVar7.aZ, akkpVar5.bj, akkpVar5.dS);
            case 7:
                Context context3 = (Context) this.a.q.b();
                akkp akkpVar6 = this.a.a;
                return ctvu.a(context3, akkpVar6.d, akkpVar6.li());
            case 8:
                akis akisVar8 = this.a;
                fbbf fbbfVar2 = akisVar8.mx;
                akkp akkpVar7 = akisVar8.a;
                return new crng(fbbfVar2, akisVar8.aO, akkpVar7.iK, akkpVar7.fv);
            case 9:
                akkp akkpVar8 = this.a.a;
                return new ctyw((ctyu) akkpVar8.pf(), (ctwb) akkpVar8.c.b(), Optional.of(this.a.a.pc()));
            case 10:
                return new cpbs((ctwb) this.a.a.c.b(), (cpai) this.a.a.hO.b(), (ctud) this.a.cT.b(), (errl) this.a.aK.b(), (cpbu) this.a.a.DI.b());
            case 11:
                Context context4 = (Context) this.a.q.b();
                Optional optional = (Optional) this.a.aV.b();
                akis akisVar9 = this.a;
                akkp akkpVar9 = akisVar9.a;
                return cpaj.a(context4, optional, akkpVar9.u, akisVar9.aZ, akkpVar9.c, akkpVar9.DB, akkpVar9.akU, akisVar9.p);
            case 12:
                Context context5 = (Context) this.a.q.b();
                akis akisVar10 = this.a;
                akkp akkpVar10 = akisVar10.a;
                fbbf fbbfVar3 = akkpVar10.d;
                fbbf fbbfVar4 = akkpVar10.c;
                ctvi ctviVar = (ctvi) akkpVar10.e.b();
                akis akisVar11 = this.a;
                return ctvt.a(context5, fbbfVar3, fbbfVar4, akisVar10.aY, ctviVar, akisVar11.aZ, fbaz.a(akisVar11.a.H));
            case 13:
                return new ctvi(this.a.a.c);
            case 14:
                return ctvl.a(this.a.a.akT);
            case 15:
                return new esfv((Context) this.a.q.b(), (esfn) this.a.a.E.b());
            case 16:
                return aogg.a(this.a.a.rt());
            case 17:
                return new astn() { // from class: asao
                };
            case 18:
                akkp akkpVar11 = this.a.a;
                return new ersq(akkpVar11.qH(), (ersv) akkpVar11.akO.b());
            case 19:
                return Boolean.valueOf(fczz.a(this.a.a.nP()));
            case 20:
                return ekco.a((ekbo) this.a.a.aZ.b());
            case 21:
                ekbp ekbpVar = (ekbp) this.a.bS.b();
                ekcb ekcbVar = (ekcb) this.a.bV.b();
                ekql ekqlVar = (ekql) this.a.aL.b();
                errl errlVar = (errl) this.a.aK.b();
                ekav ekavVar = (ekav) this.a.a.ba.b();
                akis akisVar12 = this.a;
                return ekcp.a(ekbpVar, ekcbVar, ekqlVar, errlVar, ekavVar, akisVar12.a.qK(), akisVar12.ex());
            case 22:
                emxc j = emxc.j(this.a.a.my());
                ekbv ekbvVar = (ekbv) this.a.bC.b();
                akis akisVar13 = this.a;
                return new ekax(j, ekbvVar, akisVar13.a.Us, akisVar13.fR(), (Map) akisVar13.bO.b());
            case 23:
                eiyk eiykVar = (eiyk) this.a.a.o.b();
                eiyx eiyxVar = (eiyx) this.a.a.Ud.b();
                akis akisVar14 = this.a;
                eiyh mv = akisVar14.a.mv();
                ejvb ejvbVar = (ejvb) akisVar14.dy.b();
                akis akisVar15 = this.a;
                return new eixx(eiykVar, eiyxVar, mv, ejvbVar, akisVar15.a.Ur, (dlpw) akisVar15.l.b(), (ScheduledExecutorService) this.a.p.b());
            case 24:
                akkp akkpVar12 = this.a.a;
                return new ejds((ejcw) akkpVar12.oU(), akkpVar12.oV());
            case 25:
                akis akisVar16 = this.a;
                return ejdu.a(akisVar16.a.mC(), akisVar16.eA(), (efbm) akisVar16.aM.b());
            case 26:
                return new enpx(this.a.a.lG());
            case 27:
                akis akisVar17 = this.a;
                return new csrf(akisVar17.ca, akisVar17.a.f, akisVar17.cb);
            case 28:
                enin i2 = enip.i(3);
                i2.j(this.a.a.rn());
                i2.c(this.a.ei());
                i2.c(this.a.a.mn());
                return i2.g();
            case 29:
                dlpw dlpwVar = (dlpw) this.a.l.b();
                Context context6 = (Context) this.a.q.b();
                errm errmVar2 = (errm) this.a.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                akis akisVar18 = this.a;
                akkp akkpVar13 = akisVar18.a;
                edyp ed = akisVar18.ed();
                ejjz ejjzVar = (ejjz) akkpVar13.n.b();
                emxc j2 = emxc.j((eiyk) this.a.a.o.b());
                eksm eksmVar = (eksm) this.a.cm.b();
                akis akisVar19 = this.a;
                akkp akkpVar14 = akisVar19.a;
                return new ektp(dlpwVar, context6, errmVar2, errlVar2, ed, ejjzVar, j2, eksmVar, akkpVar14.qG(), enhk.k(), akisVar19.fQ(), akkpVar14.sh(), akkpVar14.mF(), akisVar19.pq);
            case 30:
                Context context7 = (Context) this.a.q.b();
                PowerManager powerManager = (PowerManager) this.a.ce.b();
                ejka ejkaVar = (ejka) this.a.cf.b();
                errl errlVar3 = (errl) this.a.a.m.b();
                akis akisVar20 = this.a;
                fbbf fbbfVar5 = akisVar20.cl;
                Map fO = akisVar20.fO();
                Map fP = akisVar20.fP();
                ejko ejkoVar = (ejko) fbbfVar5.b();
                akis akisVar21 = this.a;
                return new ejjz(context7, powerManager, ejkaVar, errlVar3, fO, fP, ejkoVar, akisVar21.eo(), (errm) akisVar21.t.b(), (errm) this.a.aK.b(), this.a.ed());
            case 31:
                return new dtnn((dlpw) this.a.l.b(), akis.iY(), emxc.j(fbaz.a(this.a.a.l)));
            case 32:
                return Boolean.valueOf(ejkg.a(this.a.a.k));
            case 33:
                return Boolean.valueOf(fdww.a(this.a.a.oO()));
            case 34:
                return ahrp.a(this.a.a.Tv);
            case 35:
                akkp akkpVar15 = this.a.a;
                return new ahrn(akkpVar15.tK, (ffsk) akkpVar15.aq.b());
            case 36:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akis akisVar22 = this.a;
                return new ahrw(ffskVar, ffskVar2, ffhdVar, akisVar22.a.dB, (cqoh) akisVar22.cz.b());
            case 37:
                return ejqx.a((ffhd) this.a.cn.b(), this.a.a.mx());
            case 38:
                return ejqv.a((ffhd) this.a.co.b(), this.a.a.mx());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                akis akisVar23 = this.a;
                akkp akkpVar16 = akisVar23.a;
                return new bdmq(akkpVar16.ab, akkpVar16.iy, akkpVar16.dw, akisVar23.kk, akkpVar16.ib, akkpVar16.dn, akkpVar16.ay, akkpVar16.dA, akkpVar16.Kt, akkpVar16.Z, akkpVar16.ad, akkpVar16.pQ, akisVar23.kv, akkpVar16.SV, akkpVar16.pU);
            case 40:
                Context context8 = (Context) this.a.q.b();
                akis akisVar24 = this.a;
                akkp akkpVar17 = akisVar24.a;
                fbbf fbbfVar6 = akkpVar17.r;
                fbbf fbbfVar7 = akkpVar17.t;
                Optional of = Optional.of(akkpVar17.af());
                akis akisVar25 = this.a;
                akkp akkpVar18 = akisVar25.a;
                return new crjm(context8, fbbfVar6, akisVar24.cp, fbbfVar7, of, akkpVar18.Z, akkpVar18.Q, akisVar25.cy, akkpVar18.aa);
            case 41:
                Context context9 = (Context) this.a.q.b();
                crjx crjxVar = (crjx) this.a.a.r.b();
                akis akisVar26 = this.a;
                return new cttz(context9, crjxVar, akisVar26.a.cG(), (akmj) akisVar26.cq.b());
            case 42:
                akkp akkpVar19 = this.a.a;
                return aomw.a(akkpVar19.U, akkpVar19.W, akkpVar19.Y);
            case 43:
                fazb a = fbaz.a(this.a.a.v);
                fazb a2 = fbaz.a(this.a.a.u);
                akkp akkpVar20 = this.a.a;
                fbbf fbbfVar8 = akkpVar20.w;
                fbbf fbbfVar9 = akkpVar20.c;
                fbbf fbbfVar10 = akkpVar20.D;
                fbbf fbbfVar11 = akkpVar20.G;
                fbbf fbbfVar12 = akkpVar20.O;
                fazb a3 = fbaz.a(akkpVar20.P);
                akis akisVar27 = this.a;
                akkp akkpVar21 = akisVar27.a;
                return new aomv(a, a2, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, a3, akkpVar21.Q, akkpVar21.N, akkpVar21.R, akisVar27.cs, fbaz.a(akkpVar21.S), this.a.a.T);
            case 44:
                return new aoqw(fbaz.a(this.a.a.u), fbaz.a(this.a.cs));
            case 45:
                return new ctve((ctvi) this.a.a.e.b());
            case 46:
                Context context10 = (Context) this.a.q.b();
                akis akisVar28 = this.a;
                return new ckby(context10, akisVar28.aU, akisVar28.a.iM());
            case 47:
                akis akisVar29 = this.a;
                akkp akkpVar22 = akisVar29.a;
                return akza.a(akisVar29.aO, akkpVar22.B, akkpVar22.f);
            case 48:
                return akzd.a((dfmc) this.a.a.z.b(), (akzx) this.a.a.x.b(), (alat) this.a.a.A.b());
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                akis akisVar30 = this.a;
                return akzh.a(akisVar30.ff(), (akyy) akisVar30.a.y.b());
            case 50:
                return akzc.a((akzx) this.a.a.x.b(), (errm) this.a.t.b(), (errm) this.a.aK.b());
            case 51:
                return akzf.a((akzx) this.a.a.x.b(), this.a.ff());
            case 52:
                return new avkc((ctvb) this.a.a.u.b(), (cfsk) this.a.a.F.b());
            case 53:
                akkp akkpVar23 = this.a.a;
                return new cfsl(akkpVar23.E, akkpVar23.u);
            case 54:
                return new aodp(fbaz.a(this.a.a.v), fbaz.a(this.a.a.G), fbaz.a(this.a.a.u), fbaz.a(this.a.a.w), fbaz.a(this.a.a.N));
            case 55:
                fbbf a4 = fbbg.a(this.a.a.M);
                akkp akkpVar24 = this.a.a;
                return new aokt(a4, akkpVar24.u, akkpVar24.F);
            case 56:
                return new aolq((Context) this.a.q.b(), fbaz.a(this.a.a.L), fbaz.a(this.a.a.c), fbaz.a(this.a.a.H), fbaz.a(this.a.a.w), fbaz.a(this.a.a.u));
            case 57:
                akis akisVar31 = this.a;
                akkp akkpVar25 = akisVar31.a;
                return new ayvn(akkpVar25.w, akisVar31.cu, akisVar31.cv, akisVar31.cx, akkpVar25.H, akkpVar25.I, akkpVar25.J, akkpVar25.K);
            case 58:
                return new divw(this.a.a.s);
            case 59:
                return new diup(this.a.a.s);
            case 60:
                akis akisVar32 = this.a;
                return new ayhi(akisVar32.cx, akisVar32.a.I);
            case 61:
                return new aogb(fbaz.a(this.a.a.v), fbaz.a(this.a.a.G), fbaz.a(this.a.a.u), fbaz.a(this.a.a.w), fbaz.a(this.a.a.N), fbaz.a(this.a.a.F), fbaz.a(this.a.a.E), fbaz.a(this.a.a.E));
            case 62:
                final fbbf fbbfVar13 = this.a.a.s;
                return new asvn() { // from class: asdv
                    @Override // defpackage.asvn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_emergency_satellite_messaging");
                    }
                };
            case 63:
                final fbbf fbbfVar14 = this.a.a.s;
                return new astm() { // from class: asam
                    @Override // defpackage.astm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.messaging_identity_from_recipient_entry_uses_contact_country");
                    }
                };
            case 64:
                final fbbf fbbfVar15 = this.a.a.s;
                return new aukb() { // from class: aujr
                    @Override // defpackage.aukb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.messaging_identity_for_sub_uses_home");
                    }
                };
            case 65:
                final fbbf fbbfVar16 = this.a.a.s;
                return new aukc() { // from class: aujt
                    @Override // defpackage.aukc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.messaging_identity_passes_parsed_data");
                    }
                };
            case 66:
                fazb a5 = fbaz.a(this.a.a.v);
                fazb a6 = fbaz.a(this.a.a.u);
                akis akisVar33 = this.a;
                return new aonz(a5, a6, fbaz.a(akisVar33.cs), fbaz.a(akisVar33.a.w), fbaz.a(this.a.a.c), fbaz.a(this.a.a.D), fbaz.a(this.a.a.G), fbaz.a(this.a.a.V), fbaz.a(this.a.a.Q), fbaz.a(this.a.a.N), fbaz.a(this.a.a.S));
            case 67:
                return new aoih(fbaz.a(this.a.a.v), fbaz.a(this.a.a.u), fbaz.a(this.a.a.H), fbaz.a(this.a.a.G), fbaz.a(this.a.a.w), fbaz.a(this.a.a.N), fbaz.a(this.a.a.E));
            case 68:
                return new aooo(fbaz.a(this.a.a.X), fbaz.a(this.a.a.U), fbaz.a(this.a.a.W));
            case 69:
                Context context11 = (Context) this.a.q.b();
                fazb a7 = fbaz.a(this.a.a.O);
                fazb a8 = fbaz.a(this.a.a.V);
                fazb a9 = fbaz.a(this.a.a.L);
                fazb a10 = fbaz.a(this.a.a.c);
                fazb a11 = fbaz.a(this.a.a.H);
                fazb a12 = fbaz.a(this.a.a.w);
                fazb a13 = fbaz.a(this.a.a.u);
                fazb a14 = fbaz.a(this.a.a.N);
                fbaz.a(this.a.a.E);
                return aogf.a(context11, a7, a8, a9, a10, a11, a12, a13, a14);
            case 70:
                final fbbf fbbfVar17 = this.a.a.s;
                return new atfc() { // from class: ates
                    @Override // defpackage.atfc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_hi_res_corp_avatar_when_fully_managed");
                    }
                };
            case 71:
                akis akisVar34 = this.a;
                fbbf fbbfVar18 = akisVar34.q;
                akkp akkpVar26 = akisVar34.a;
                return new bcws(fbbfVar18, akisVar34.cz, akkpVar26.ad, akkpVar26.iy, akkpVar26.iK, akkpVar26.Ts, akkpVar26.Z, akkpVar26.G, akkpVar26.rz, akkpVar26.xi, akkpVar26.Tu, akkpVar26.aO);
            case 72:
                akis akisVar35 = this.a;
                akkp akkpVar27 = akisVar35.a;
                return new bcxa(akisVar35.cB, akisVar35.cC, akkpVar27.ac, akkpVar27.ad, akkpVar27.co, akisVar35.cz, akisVar35.fM, akisVar35.q, akisVar35.iL, akisVar35.jG, akkpVar27.jp, akisVar35.jH, akisVar35.t, akkpVar27.jD, akkpVar27.jF, akkpVar27.nR);
            case 73:
                akis akisVar36 = this.a;
                return new cpaz(akisVar36.a.u, akisVar36.cp);
            case 74:
                return new ctap((Context) this.a.q.b(), (crmr) this.a.a.jl.b(), fbaz.a(this.a.a.Tr));
            case 75:
                akkp akkpVar28 = this.a.a;
                return new crmr(akkpVar28.Tq, akkpVar28.f);
            case 76:
                akis akisVar37 = this.a;
                akkp akkpVar29 = akisVar37.a;
                cskg cF = akisVar37.cF();
                cskg cskgVar = (cskg) akkpVar29.ab.b();
                cskg cskgVar2 = (cskg) this.a.a.u.b();
                cskg cskgVar3 = (cskg) this.a.cG.b();
                cskg cskgVar4 = (cskg) this.a.a.af.b();
                akkp akkpVar30 = this.a.a;
                return enip.v(cF, cskgVar, cskgVar2, cskgVar3, cskgVar4, akkpVar30.py(), (cskg) akkpVar30.ks.b(), (cskg) this.a.a.kD.b(), (cskg) this.a.a.kE.b(), (cskg) this.a.a.di.b(), (cskg) this.a.a.Ku.b(), (cskg) this.a.cZ.b(), this.a.a.lp(), (cskg) this.a.kv.b(), (cskg) this.a.mr.b(), (cskg) this.a.a.aF.b(), (cskg) this.a.a.Tl.b(), (cskg) this.a.a.tJ.b(), (cskg) this.a.a.ds.b(), (cskg) this.a.a.AN.b(), (cskg) this.a.a.iY.b());
            case 77:
                Context context12 = (Context) this.a.q.b();
                akis akisVar38 = this.a;
                akkp akkpVar31 = akisVar38.a;
                return new cxqh(context12, akkpVar31.r, akkpVar31.ae, akisVar38.cH, akisVar38.cI);
            case 78:
                return new cuxh((Context) this.a.q.b());
            case 79:
                return caqs.a((Context) this.a.q.b(), (errl) this.a.cK.b(), fbaz.a(this.a.a.aW));
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                Context context13 = (Context) this.a.q.b();
                akis akisVar39 = this.a;
                fbbf fbbfVar19 = akisVar39.aK;
                fbbf fbbfVar20 = akisVar39.a.bC;
                errl errlVar4 = (errl) fbbfVar19.b();
                akkp akkpVar32 = this.a.a;
                return new chhs(context13, fbbfVar20, errlVar4, akkpVar32.hU(), akkpVar32.f, (aipn) akkpVar32.rh.b());
            case 81:
                akis akisVar40 = this.a;
                akkp akkpVar33 = akisVar40.a;
                return new cmoe(akkpVar33.Tl, akisVar40.aQ, (djsz) akkpVar33.gE.b());
            case 82:
                akkp akkpVar34 = this.a.a;
                return cmnd.a(akkpVar34.lT(), akkpVar34.jt(), (azpx) akkpVar34.hB.b(), (azpo) this.a.a.he.b(), (ffsk) this.a.a.p.b());
            case 83:
                akkp akkpVar35 = this.a.a;
                return enip.s(akkpVar35.cT(), (djrx) akkpVar35.cG.b(), this.a.a.pU());
            case 84:
                cvbr cvbrVar = (cvbr) this.a.a.fe.b();
                csqh csqhVar = (csqh) this.a.oL.b();
                cuye cuyeVar = (cuye) this.a.a.ff.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                akkp akkpVar36 = this.a.a;
                chkk hH = akkpVar36.hH();
                cvdc cvdcVar = (cvdc) akkpVar36.Tb.b();
                cuyi cuyiVar = (cuyi) this.a.a.Tc.b();
                akis akisVar41 = this.a;
                return new cvad(cvbrVar, csqhVar, cuyeVar, ctwbVar, hH, cvdcVar, cuyiVar, akisVar41.a.Td, (cqoh) akisVar41.cz.b(), (Context) this.a.q.b(), (errl) this.a.p.b(), (errl) this.a.t.b(), (akzt) this.a.a.f.b(), this.a.a.Z);
            case 85:
                akis akisVar42 = this.a;
                return new cvbr(akisVar42.a.aT, (effy) akisVar42.oJ.b(), (cqoh) this.a.cz.b(), (akzt) this.a.a.f.b(), (ejvb) this.a.dy.b(), (cfyt) this.a.a.cf.b(), (errl) this.a.p.b());
            case 86:
                return new comy(this.a.a.ki());
            case 87:
                return new cbwo(this.a.a.cD);
            case 88:
                return bwlm.a(this.a.a.ra());
            case 89:
                return bbil.a((cbcj) this.a.a.Lw.b());
            case 90:
                return new cbcj(this.a.a.es());
            case 91:
                akis akisVar43 = this.a;
                fbbf fbbfVar21 = akisVar43.q;
                akkp akkpVar37 = akisVar43.a;
                return new azye(fbbfVar21, akisVar43.aO, akkpVar37.f, akisVar43.cL, akkpVar37.Su, akkpVar37.FL, akkpVar37.ck, akkpVar37.aI, fbbd.a());
            case 92:
                akkp akkpVar38 = this.a.a;
                return enip.r(akkpVar38.eS(), akkpVar38.eT());
            case 93:
                Context context14 = (Context) this.a.q.b();
                akkp akkpVar39 = this.a.a;
                return new ciwb(context14, akkpVar39.an, akkpVar39.Jl);
            case 94:
                Context context15 = (Context) this.a.q.b();
                akis akisVar44 = this.a;
                akkp akkpVar40 = akisVar44.a;
                fazb a15 = fbaz.a(akisVar44.cM);
                fazb a16 = fbaz.a(akkpVar40.ag);
                akis akisVar45 = this.a;
                return new cthp(context15, a15, a16, akisVar45.aU, akisVar45.a.f, fbaz.a(akisVar45.cj));
            case 95:
                return Optional.of((acar) this.a.a.am.b());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                akis akisVar46 = this.a;
                akkp akkpVar41 = akisVar46.a;
                return new acar(cqohVar2, ctyxVar, akkpVar41.qn(), akkpVar41.hX(), akkpVar41.al, akisVar46.cN);
            case 97:
                akis akisVar47 = this.a;
                akkp akkpVar42 = akisVar47.a;
                return akze.a(akisVar47.aO, akkpVar42.ak, akkpVar42.f);
            case 98:
                return akzb.a((dfmc) this.a.a.ai.b(), (akzx) this.a.a.x.b(), (alat) this.a.a.aj.b());
            case 99:
                akis akisVar48 = this.a;
                return akzi.a(akisVar48.ff(), (akyy) akisVar48.a.y.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return akzg.a((akzx) this.a.a.x.b(), this.a.ff());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                akkp akkpVar = this.a.a;
                cixf cixfVar = cixf.NT_INCOMING_MESSAGE;
                civa civaVar = (civa) akkpVar.px.b();
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.ou;
                akkp akkpVar2 = akisVar.a;
                return enhk.p(cixfVar, civaVar, cixf.NT_SAFETYCORE_MISSING, akisVar.ci(), cixf.NT_SECONDARY_USER, akkpVar2.ii(), cixf.NT_SHARE_PDU, (civa) fbbfVar.b(), cixf.NT_INCOMING_UNAPPROVED_MESSAGE, this.a.a.ij());
            case 102:
                Context context = (Context) this.a.q.b();
                errl errlVar = (errl) this.a.p.b();
                errl errlVar2 = (errl) this.a.aK.b();
                errm errmVar = (errm) this.a.aK.b();
                akkp akkpVar3 = this.a.a;
                cjat m166if = akkpVar3.m166if();
                ciyg id = akkpVar3.id();
                cjcf ig = akkpVar3.ig();
                cjam cjamVar = (cjam) akkpVar3.DL.b();
                akis akisVar2 = this.a;
                akkp akkpVar4 = akisVar2.a;
                ciyy cg = akisVar2.cg();
                ayfg ayfgVar = (ayfg) akkpVar4.nW.b();
                Optional optional = (Optional) this.a.a.aQ.b();
                akis akisVar3 = this.a;
                cqoh cqohVar = (cqoh) akisVar3.cz.b();
                cjad cjadVar = (cjad) this.a.a.Iy.b();
                cjcj cjcjVar = (cjcj) this.a.jS.b();
                akkp akkpVar5 = this.a.a;
                cjci ih = akkpVar5.ih();
                ciyv ie = akkpVar5.ie();
                Optional optional2 = (Optional) akkpVar5.ag.b();
                akkp akkpVar6 = this.a.a;
                fbbf fbbfVar2 = akkpVar6.sY;
                Optional empty = Optional.empty();
                ciwj ciwjVar = (ciwj) akkpVar6.pw.b();
                akis akisVar4 = this.a;
                Optional of = Optional.of(akisVar4.os);
                akkp akkpVar7 = akisVar4.a;
                return new cizx(context, errlVar, errlVar2, errmVar, m166if, id, ig, cjamVar, cg, ayfgVar, optional, akisVar3.a.Pj, cqohVar, cjadVar, cjcjVar, ih, ie, optional2, fbbfVar2, empty, ciwjVar, of, akkpVar7.C, akkpVar7.Ss, akkpVar7.dn);
            case 103:
                return new cjbb(fbaz.a(this.a.a.ap), fbaz.a(this.a.a.aw));
            case 104:
                Context context2 = (Context) this.a.q.b();
                fazb a = fbaz.a(this.a.a.e);
                fbaz.a(this.a.a.f);
                fazb a2 = fbaz.a(this.a.a.v);
                akis akisVar5 = this.a;
                akkp akkpVar8 = akisVar5.a;
                return new cpdg(context2, a, a2, akkpVar8.H, akisVar5.cO, akkpVar8.ao);
            case 105:
                return Boolean.valueOf(fdch.a(this.a.a.oe()));
            case 106:
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                akkp akkpVar9 = this.a.a;
                return new cutu(ffskVar, akkpVar9.at, akkpVar9.av);
            case 107:
                return new cuun((ffsk) this.a.a.aq.b(), (lap) this.a.a.ar.b(), this.a.a.as);
            case 108:
                return ejqw.a((ffhd) this.a.cP.b(), this.a.a.mx());
            case 109:
                return cuuh.a((Context) this.a.q.b(), (ffsk) this.a.a.q.b());
            case 110:
                ejar ejarVar = (ejar) this.a.a.au.b();
                akis akisVar6 = this.a;
                return new cuuc(ejarVar, akisVar6.dn(), (azac) akisVar6.cR.b(), (ffhd) this.a.cP.b(), (ffsk) this.a.a.aq.b());
            case 111:
                return new ejar(emxc.j((eiyk) this.a.a.o.b()), emxc.j(ejbq.a()), (emxc) this.a.cQ.b());
            case 112:
                akkp akkpVar10 = this.a.a;
                return new bdtd(akkpVar10.aK, akkpVar10.Sp);
            case 113:
                akkp akkpVar11 = this.a.a;
                fbbf fbbfVar3 = akkpVar11.c;
                fbbf fbbfVar4 = akkpVar11.ay;
                fbbf fbbfVar5 = akkpVar11.aA;
                fbbf fbbfVar6 = akkpVar11.Z;
                fbbf fbbfVar7 = akkpVar11.aF;
                azzp azzpVar = (azzp) akkpVar11.aI.b();
                akkp akkpVar12 = this.a.a;
                return new azvu(fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, azzpVar, akkpVar12.aJ, (auig) akkpVar12.aG.b());
            case 114:
                akis akisVar7 = this.a;
                return new bdsy(akisVar7.a.az, (errl) akisVar7.t.b());
            case 115:
                akkp akkpVar13 = this.a.a;
                return new bdrv(akkpVar13.aE, akkpVar13.ay);
            case 116:
                akis akisVar8 = this.a;
                fbbf fbbfVar8 = akisVar8.cz;
                akkp akkpVar14 = akisVar8.a;
                return new bdsv(akkpVar14.c, akkpVar14.aC, akkpVar14.aD, (cqoh) fbbfVar8.b());
            case 117:
                akkp akkpVar15 = this.a.a;
                return new bdsu(akkpVar15.c, akkpVar15.aB);
            case 118:
                return Optional.of((ctuy) this.a.a.d.b());
            case 119:
                return new asub() { // from class: asbi
                };
            case 120:
                akkp akkpVar16 = this.a.a;
                return new azzp(akkpVar16.ay, akkpVar16.aH, akkpVar16.cA());
            case 121:
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akis akisVar9 = this.a;
                fbbf fbbfVar9 = akisVar9.cP;
                fbbf fbbfVar10 = akisVar9.a.Z;
                ffhd ffhdVar = (ffhd) fbbfVar9.b();
                akkp akkpVar17 = this.a.a;
                return new azst(dtuuVar, fbbfVar10, ffhdVar, akkpVar17.cx(), (auig) akkpVar17.aG.b());
            case 122:
                final fbbf fbbfVar11 = this.a.a.s;
                return new auig() { // from class: auia
                    @Override // defpackage.auig
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.read_from_my_identity_foreign_key");
                    }
                };
            case 123:
                return new akjd(this);
            case 124:
                akkp akkpVar18 = this.a.a;
                return new azmo(akkpVar18.aK, akkpVar18.hC);
            case 125:
                Context context3 = (Context) this.a.q.b();
                akis akisVar10 = this.a;
                akkp akkpVar19 = akisVar10.a;
                return new csqw(context3, akisVar10.cT, akkpVar19.cf, akkpVar19.So, akkpVar19.Z, akkpVar19.Po);
            case 126:
                akis akisVar11 = this.a;
                return cfzb.a(akisVar11.a.hm(), (errl) akisVar11.aK.b());
            case 127:
                return aipu.a(this.a.a.O());
            case 128:
                Context context4 = (Context) this.a.q.b();
                akis akisVar12 = this.a;
                return new cino(context4, akisVar12.aU, akisVar12.a.an);
            case 129:
                akkp akkpVar20 = this.a.a;
                return new cinq(akkpVar20.Pz, akkpVar20.PA, akkpVar20.PB, akkpVar20.PC, akkpVar20.RN, akkpVar20.RW, akkpVar20.RX, akkpVar20.RY, akkpVar20.RZ, akkpVar20.Sc, akkpVar20.Sd, akkpVar20.Se, akkpVar20.Sf, akkpVar20.Sg, akkpVar20.Sh, akkpVar20.Si, akkpVar20.Sj, akkpVar20.Sk);
            case 130:
                return new ciqi((Context) this.a.q.b(), (ciqn) this.a.a.aN.b(), (ciph) this.a.a.Py.b());
            case 131:
                return new ciqn(this.a.a.aM);
            case 132:
                return new cine(this.a.a.an);
            case 133:
                return new aips(this.a.a.Px);
            case 134:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                crqw crqwVar = (crqw) this.a.cX.b();
                ddzb ddzbVar = (ddzb) this.a.a.nk.b();
                sfy sfyVar = (sfy) this.a.a.Pv.b();
                Optional of2 = Optional.of(new dcxf());
                this.a.a.ao();
                akis akisVar13 = this.a;
                return new cwpn(cqohVar2, crqwVar, ddzbVar, sfyVar, of2, akisVar13.cy(), (ctwb) akisVar13.a.c.b(), (clzh) this.a.a.Pw.b(), this.a.nS);
            case 135:
                return new ddzb((Context) this.a.q.b(), this.a.a.Pu);
            case 136:
                return new ddwn((Context) this.a.q.b(), this.a.a.Pt);
            case 137:
                return Optional.of((akew) this.a.a.Ps.b());
            case 138:
                Context context5 = (Context) this.a.q.b();
                akis akisVar14 = this.a;
                akkp akkpVar21 = akisVar14.a;
                return new akew(context5, akisVar14.cY, akkpVar21.c, akkpVar21.Z, akkpVar21.fy, (ffsk) akkpVar21.aq.b());
            case 139:
                akkp akkpVar22 = this.a.a;
                fbbf fbbfVar12 = akkpVar22.Pn;
                fbbf fbbfVar13 = akkpVar22.er;
                fbbf fbbfVar14 = akkpVar22.dn;
                cbfr cbfrVar = (cbfr) fbbfVar12.b();
                akkp akkpVar23 = this.a.a;
                fbbf fbbfVar15 = akkpVar23.dA;
                fbbf fbbfVar16 = akkpVar23.Lr;
                fbbf fbbfVar17 = akkpVar23.ej;
                fbbf fbbfVar18 = akkpVar23.mf;
                Optional of3 = Optional.of(akkpVar23.fp);
                Optional of4 = Optional.of(this.a.a.me);
                akis akisVar15 = this.a;
                fbbf fbbfVar19 = akisVar15.mr;
                akkp akkpVar24 = akisVar15.a;
                return new cbew(fbbfVar13, fbbfVar14, cbfrVar, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, of3, of4, fbbfVar19, akkpVar24.Pq, akkpVar24.Pr, akkpVar24.mt, akkpVar24.bU(), akkpVar24.ml, akkpVar24.C);
            case 140:
                akkp akkpVar25 = this.a.a;
                fbbf fbbfVar20 = akkpVar25.Pn;
                fbbf fbbfVar21 = akkpVar25.dn;
                cbfr cbfrVar2 = (cbfr) fbbfVar20.b();
                akis akisVar16 = this.a;
                fbbf fbbfVar22 = akisVar16.a.hC;
                Context context6 = (Context) akisVar16.q.b();
                akis akisVar17 = this.a;
                akkp akkpVar26 = akisVar17.a;
                fbbf fbbfVar23 = akkpVar26.dA;
                fbbf fbbfVar24 = akkpVar26.aO;
                dtuu dtuuVar2 = (dtuu) akkpVar26.ay.b();
                akis akisVar18 = this.a;
                fbbf fbbfVar25 = akisVar18.aK;
                akkp akkpVar27 = akisVar18.a;
                fbbf fbbfVar26 = akkpVar27.aA;
                fbbf fbbfVar27 = akkpVar27.il;
                fbbf fbbfVar28 = akkpVar27.az;
                fbbf fbbfVar29 = akkpVar27.Z;
                fbbf fbbfVar30 = akkpVar27.md;
                fbbf fbbfVar31 = akkpVar27.aF;
                fbbf fbbfVar32 = akkpVar27.kn;
                fbbf fbbfVar33 = akkpVar27.f;
                fbbf fbbfVar34 = akkpVar27.aD;
                fbbf fbbfVar35 = akkpVar27.ko;
                fbbf fbbfVar36 = akkpVar27.c;
                fbbf fbbfVar37 = akkpVar27.uM;
                fbbf fbbfVar38 = akkpVar27.gN;
                errl errlVar3 = (errl) fbbfVar25.b();
                fbbf fbbfVar39 = this.a.he;
                fbbf fbbfVar40 = akkpVar27.Pp;
                fbbf fbbfVar41 = akkpVar27.Po;
                return new cbfs(fbbfVar21, cbfrVar2, fbbfVar22, context6, fbbfVar23, akisVar17.cT, fbbfVar24, dtuuVar2, fbbfVar26, fbbfVar27, fbbfVar28, akisVar18.nQ, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar41, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar40, errlVar3, fbbfVar39);
            case 141:
                akkp akkpVar28 = this.a.a;
                fbbf fbbfVar42 = akkpVar28.aO;
                Optional of5 = Optional.of(akkpVar28.aP);
                akkp akkpVar29 = this.a.a;
                fbbf fbbfVar43 = akkpVar29.f;
                fbbf fbbfVar44 = akkpVar29.C;
                fbbf fbbfVar45 = akkpVar29.MX;
                fbbf fbbfVar46 = akkpVar29.dA;
                fbbf fbbfVar47 = akkpVar29.ab;
                fbbf fbbfVar48 = akkpVar29.fx;
                dtuu dtuuVar3 = (dtuu) akkpVar29.ay.b();
                akis akisVar19 = this.a;
                fbbf fbbfVar49 = akisVar19.cz;
                fbbf fbbfVar50 = akisVar19.a.ib;
                fbbf fbbfVar51 = akisVar19.mE;
                cqoh cqohVar3 = (cqoh) fbbfVar49.b();
                akkp akkpVar30 = this.a.a;
                return new bdem(fbbfVar42, of5, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar47, fbbfVar48, dtuuVar3, fbbfVar50, fbbfVar51, cqohVar3, akkpVar30.ej, akkpVar30.Z, akkpVar30.u, akkpVar30.ia, akkpVar30.zw, akkpVar30.G, akkpVar30.MY, akkpVar30.Pl, akkpVar30.L, akkpVar30.Q, akkpVar30.MR, akkpVar30.kv, akkpVar30.Pm, akkpVar30.hJ);
            case 142:
                akis akisVar20 = this.a;
                akkp akkpVar31 = akisVar20.a;
                fbbf fbbfVar52 = akkpVar31.aS;
                fbbf fbbfVar53 = akkpVar31.dQ;
                fbbf fbbfVar54 = akkpVar31.cn;
                Context context7 = (Context) akisVar20.q.b();
                akis akisVar21 = this.a;
                fbbf fbbfVar55 = akisVar21.cz;
                fbbf fbbfVar56 = akisVar21.a.ae;
                cqoh cqohVar4 = (cqoh) fbbfVar55.b();
                akis akisVar22 = this.a;
                fbbf fbbfVar57 = akisVar22.aK;
                akkp akkpVar32 = akisVar22.a;
                fbbf fbbfVar58 = akkpVar32.r;
                errl errlVar4 = (errl) fbbfVar57.b();
                errl errlVar5 = (errl) this.a.t.b();
                errm errmVar2 = (errm) this.a.p.b();
                akkp akkpVar33 = this.a.a;
                return new debh(fbbfVar52, fbbfVar53, fbbfVar54, context7, fbbfVar56, cqohVar4, fbbfVar58, akkpVar32.Pj, errlVar4, errlVar5, errmVar2, Optional.empty(), akkpVar33.nU, (cuay) akkpVar33.Jn.b(), this.a.a.Jm);
            case 143:
                akis akisVar23 = this.a;
                akkp akkpVar34 = akisVar23.a;
                return new bapf(akisVar23.q, akkpVar34.aQ, akisVar23.cZ, akisVar23.p, akkpVar34.aR, akisVar23.t);
            case 144:
                return Optional.of((csll) this.a.a.aP.b());
            case 145:
                final fbbf fbbfVar59 = this.a.a.s;
                return new autz() { // from class: autx
                    @Override // defpackage.autz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.prevent_shortcut_rebuild_on_later_devices");
                    }
                };
            case 146:
                akkp akkpVar35 = this.a.a;
                fbbf fbbfVar60 = akkpVar35.t;
                fbbf fbbfVar61 = akkpVar35.cx;
                csjk csjkVar = (csjk) akkpVar35.fQ.b();
                clws clwsVar = (clws) this.a.a.iA.b();
                akkp akkpVar36 = this.a.a;
                fbbf fbbfVar62 = akkpVar36.Z;
                azbq azbqVar = (azbq) akkpVar36.AO.b();
                akis akisVar24 = this.a;
                akkp akkpVar37 = akisVar24.a;
                return new bcrs(fbbfVar60, fbbfVar61, csjkVar, clwsVar, fbbfVar62, azbqVar, akkpVar37.aO, akkpVar37.br, akkpVar37.Q, (Context) akisVar24.q.b());
            case 147:
                akkp akkpVar38 = this.a.a;
                fbbf fbbfVar63 = akkpVar38.aU;
                fbbf fbbfVar64 = akkpVar38.gr;
                fbbf fbbfVar65 = akkpVar38.pi;
                fbbf fbbfVar66 = akkpVar38.sQ;
                akzt akztVar = (akzt) akkpVar38.f.b();
                akis akisVar25 = this.a;
                akkp akkpVar39 = akisVar25.a;
                return new bzxl(fbbfVar63, fbbfVar64, fbbfVar65, fbbfVar66, akztVar, akkpVar39.az, akisVar25.dH, akkpVar39.cv, akkpVar39.qq, akkpVar39.G, akkpVar39.yU, akkpVar39.Ph, (errl) akisVar25.p.b(), (errl) this.a.t.b(), fbaz.a(this.a.a.cC));
            case 148:
                return new cami(this.a.a.aT);
            case 149:
                akis akisVar26 = this.a;
                akkp akkpVar40 = akisVar26.a;
                return new chbx(akkpVar40.aV, akkpVar40.hD(), akkpVar40.br, (errl) akisVar26.p.b(), (errl) this.a.aK.b());
            case 150:
                akkp akkpVar41 = this.a.a;
                return new chxe(akkpVar41.u, akkpVar41.al);
            case 151:
                akis akisVar27 = this.a;
                chhw chhwVar = (chhw) akisVar27.a.aX.b();
                chhw chhwVar2 = (chhw) this.a.a.aY.b();
                Optional of6 = Optional.of((chix) this.a.a.by.b());
                chii chiiVar = (chii) this.a.a.bz.b();
                chio chioVar = (chio) this.a.a.bA.b();
                chio chioVar2 = (chio) this.a.a.bB.b();
                akkp akkpVar42 = this.a.a;
                return new chrv(akisVar27.da, chhwVar, chhwVar2, of6, chiiVar, chioVar, chioVar2, akkpVar42.bH, akkpVar42.bM);
            case 152:
                return new chib(this.a.a.hE());
            case 153:
                return achv.a((chhw) this.a.a.aX.b(), Optional.empty());
            case 154:
                return new akjo(this);
            case 155:
                akis akisVar28 = this.a;
                return ekpy.a(akisVar28.a.rg(), (cpn) akisVar28.db.b(), this.a.fo());
            case 156:
                final ekfm mA = this.a.a.mA();
                return new evgu() { // from class: evgw
                    @Override // defpackage.evgu
                    public final ListenableFuture a() {
                        ekcr ekcrVar = (ekcr) ekfm.this;
                        ekbo ekboVar = ekcrVar.b;
                        final ListenableFuture a3 = ekcrVar.a.a();
                        final ListenableFuture a4 = ekboVar.a();
                        return elfr.d(a3, a4).a(new Callable() { // from class: ekcq
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Object q = erqt.q(ListenableFuture.this);
                                q.getClass();
                                Object q2 = erqt.q(a4);
                                q2.getClass();
                                return ffew.j((Map) q, (Map) q2);
                            }
                        }, erpp.a);
                    }
                };
            case 157:
                return ekgi.a((ekcb) this.a.bV.b(), (ekbp) this.a.bS.b(), (ekql) this.a.aL.b(), enhk.k(), (Executor) this.a.a.m.b(), (ekav) this.a.a.ba.b(), this.a.ex());
            case 158:
                return evbj.a(this.a.a.mJ(), enip.q());
            case 159:
                akis akisVar29 = this.a;
                return evdh.a(akisVar29.dh.b(), akisVar29.a.rA());
            case 160:
                return aljk.a((alsc) this.a.as.b(), Optional.of((ecow) this.a.a.bs.b()));
            case 161:
                akis akisVar30 = this.a;
                akkp akkpVar43 = akisVar30.a;
                return new akwo(akkpVar43.bj, akkpVar43.br, akisVar30.cT, akkpVar43.c);
            case 162:
                Context context8 = (Context) this.a.q.b();
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                akis akisVar31 = this.a;
                fbbf fbbfVar67 = akisVar31.di;
                fbbf fbbfVar68 = akisVar31.a.c;
                coqb coqbVar = (coqb) fbbfVar67.b();
                akis akisVar32 = this.a;
                akkp akkpVar44 = akisVar32.a;
                fbbf fbbfVar69 = akkpVar44.bl;
                fbbf fbbfVar70 = akkpVar44.bm;
                fbbf fbbfVar71 = akkpVar44.bk;
                fbbf fbbfVar72 = akkpVar44.bn;
                asqs asqsVar = (asqs) akkpVar44.bo.b();
                akis akisVar33 = this.a;
                akkp akkpVar45 = akisVar33.a;
                return new cosd(context8, ffskVar2, fbbfVar68, coqbVar, fbbfVar69, fbbfVar70, akisVar32.dl, fbbfVar71, fbbfVar72, asqsVar, akkpVar45.bp, akisVar33.cT, akkpVar45.bq);
            case 163:
                return new coqp((dkpp) this.a.aQ.b(), this.a.a.bk);
            case 164:
                akkp akkpVar46 = this.a.a;
                return new cosk(akkpVar46.az, akkpVar46.bi, (cort) akkpVar46.bj.b());
            case 165:
                akis akisVar34 = this.a;
                Object ff = akisVar34.ff();
                Context context9 = (Context) akisVar34.q.b();
                emyl emylVar = (emyl) this.a.dj.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                akkp akkpVar47 = this.a.a;
                return akyp.a(ff, context9, emylVar, cqohVar5, akkpVar47.be, (albl) akkpVar47.bh.b(), (Executor) this.a.p.b());
            case 166:
                return new aleo((ffsk) this.a.a.aq.b(), (ffhd) this.a.cP.b(), (dhvo) this.a.dk.b());
            case 167:
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                akkp akkpVar48 = this.a.a;
                return new albl(cqohVar6, akkpVar48.bf, akkpVar48.bg);
            case 168:
                return fdcd.a(this.a.a.od());
            case 169:
                final fbbf fbbfVar73 = this.a.a.s;
                return new asvv() { // from class: asei
                    @Override // defpackage.asvv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_sunset_logging");
                    }
                };
            case 170:
                return new cose((Context) this.a.q.b(), (ctwb) this.a.a.c.b());
            case 171:
                return new asqv() { // from class: arxj
                };
            case 172:
                final fbbf fbbfVar74 = this.a.a.s;
                return new asqs() { // from class: arxe
                    @Override // defpackage.asqs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_multi_sim_rcs");
                    }
                };
            case 173:
                final fbbf fbbfVar75 = this.a.a.s;
                return new dixe() { // from class: divq
                    @Override // defpackage.dixe
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.enable_is_sim_loaded_comparison_event");
                    }
                };
            case 174:
                final fbbf fbbfVar76 = this.a.a.s;
                return new asmd() { // from class: arpp
                    @Override // defpackage.asmd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_google_fi_subscriptions_in_group_check_flag");
                    }
                };
            case 175:
                final fbbf fbbfVar77 = this.a.a.s;
                return new atsf() { // from class: atqb
                    @Override // defpackage.atsf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.retry_tachyon_calls_on_unavailable");
                    }
                };
            case 176:
                return emxc.j(this.a.a.oS());
            case 177:
                return new chii((chhs) this.a.a.aW.b());
            case 178:
                return new chio(this.a.a.hE());
            case 179:
                return new chio(this.a.a.hF());
            case 180:
                return new chiq(this.a.a.bG);
            case 181:
                akkp akkpVar49 = this.a.a;
                return new chhv(akkpVar49.bE, akkpVar49.bF, akkpVar49.aW);
            case 182:
                akkp akkpVar50 = this.a.a;
                return new chin(akkpVar50.bC, akkpVar50.al, akkpVar50.bD);
            case 183:
                final fbbf fbbfVar78 = this.a.a.s;
                return new atro() { // from class: atou
                    @Override // defpackage.atro
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_validate_tachyon_url");
                    }
                };
            case 184:
                return new djrk((ctvb) this.a.a.u.b());
            case 185:
                akkp akkpVar51 = this.a.a;
                return new chia(akkpVar51.bG, (Optional) akkpVar51.bJ.b(), (Optional) this.a.a.bL.b());
            case 186:
                return chkg.a((fbou) this.a.a.bI.b());
            case 187:
                akis akisVar35 = this.a;
                return chjv.a(akisVar35.a.bd, (ekpg) akisVar35.dp.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 188:
                return chkf.a((fbot) this.a.a.bK.b());
            case 189:
                akis akisVar36 = this.a;
                return chjw.a(akisVar36.a.bd, (ekpg) akisVar36.dp.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 190:
                Context context10 = (Context) this.a.q.b();
                akkp akkpVar52 = this.a.a;
                return new chga(context10, akkpVar52.kx(), akkpVar52.gk);
            case 191:
                return csmr.a(fbaz.a(this.a.a.NY));
            case 192:
                akis akisVar37 = this.a;
                akkp akkpVar53 = akisVar37.a;
                fbbf fbbfVar79 = akkpVar53.bO;
                fbbf fbbfVar80 = akkpVar53.bj;
                Context context11 = (Context) akisVar37.q.b();
                akis akisVar38 = this.a;
                fbbf fbbfVar81 = akisVar38.dq;
                fbaz.a(akisVar38.dt);
                fazb a3 = fbaz.a(this.a.a.bY);
                errl errlVar6 = (errl) this.a.aK.b();
                akis akisVar39 = this.a;
                akkp akkpVar54 = akisVar39.a;
                return new csoa(fbbfVar79, fbbfVar80, context11, fbbfVar81, akisVar38.ce, a3, errlVar6, akisVar39.aQ, akkpVar54.az, akkpVar54.bX, akkpVar54.hB, akkpVar54.Pa, akkpVar54.he, akkpVar54.bS, akkpVar54.c, akkpVar54.bR, akkpVar54.Pb);
            case 193:
                final fbbf fbbfVar82 = this.a.a.s;
                return new atrj() { // from class: atol
                    @Override // defpackage.atrj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_sim_preferences_from_connectivity_util");
                    }
                };
            case 194:
                Context context12 = (Context) this.a.q.b();
                errl errlVar7 = (errl) this.a.t.b();
                errl errlVar8 = (errl) this.a.aK.b();
                akkp akkpVar55 = this.a.a;
                return new csow(context12, errlVar7, errlVar8, akkpVar55.bW, akkpVar55.c, akkpVar55.bX);
            case 195:
                akis akisVar40 = this.a;
                akkp akkpVar56 = akisVar40.a;
                return new csog(akkpVar56.bU, akkpVar56.bV, akisVar40.dw, akkpVar56.bT);
            case 196:
                akis akisVar41 = this.a;
                return new csoo(akisVar41.du, akisVar41.t, akisVar41.ds, akisVar41.aJ, akisVar41.a.bT);
            case 197:
                return new csph((Context) this.a.q.b(), this.a.a.bS);
            case 198:
                return new cnoi((Context) this.a.q.b(), (errl) this.a.p.b(), (ffsk) this.a.a.p.b(), (elbx) this.a.aJ.b(), (cnnh) this.a.a.bQ.b(), (ausa) this.a.a.bR.b());
            case 199:
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                akkp akkpVar57 = this.a.a;
                return new cnrn(ffhdVar2, akkpVar57.lO(), akkpVar57.lM(), akkpVar57.lN(), new cnnz(), new cnny());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case 1000:
                errl errlVar = (errl) this.a.t.b();
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.a.hv;
                cqoh cqohVar = (cqoh) akisVar.cz.b();
                akkp akkpVar = this.a.a;
                return new akrr(errlVar, fbbfVar, cqohVar, akkpVar.dA, akkpVar.ad, (dtuu) akkpVar.ay.b(), this.a.a.pQ);
            case 1001:
                akis akisVar2 = this.a;
                return new akpd(akisVar2.a.dF, new akpq(), (Executor) akisVar2.p.b());
            case 1002:
                akis akisVar3 = this.a;
                return new akpj(akisVar3.a.dF, new akpq(), (Executor) akisVar3.p.b());
            case 1003:
                akis akisVar4 = this.a;
                return new akpm(akisVar4.a.dF, new akpq(), (Executor) akisVar4.p.b());
            case 1004:
                akkp akkpVar2 = this.a.a;
                return enip.r(akkpVar2.iK(), new anzb((ffsk) akkpVar2.aq.b(), akkpVar2.qW));
            case 1005:
                final fbbf fbbfVar2 = this.a.a.s;
                return new aull() { // from class: aukv
                    @Override // defpackage.aull
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_sending_as_while_typing");
                    }
                };
            case 1006:
                return new anzg(this.a.a.cc);
            case 1007:
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar3 = akkpVar3.jT;
                aoyy aoyyVar = (aoyy) fbbfVar3.b();
                aoyyVar.getClass();
                return aoyyVar;
            case 1008:
                return new apwf((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1009:
                return Optional.of(this.a.a.aT());
            case 1010:
                akkp akkpVar4 = this.a.a;
                return new apxd(akkpVar4.rn, akkpVar4.pY, (ffsk) akkpVar4.aq.b());
            case 1011:
                akis akisVar5 = this.a;
                fbbf fbbfVar4 = akisVar5.a.rk;
                cqoh cqohVar2 = (cqoh) akisVar5.cz.b();
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar5 = akkpVar5.rg;
                fbbf fbbfVar6 = akkpVar5.rl;
                fbbf fbbfVar7 = akkpVar5.rm;
                fbbf fbbfVar8 = akkpVar5.dB;
                fbbf fbbfVar9 = akkpVar5.ib;
                fbbf fbbfVar10 = akkpVar5.fP;
                akzt akztVar = (akzt) akkpVar5.f.b();
                chga chgaVar = (chga) this.a.a.cp.b();
                akis akisVar6 = this.a;
                akkp akkpVar6 = akisVar6.a;
                return new bdwr(fbbfVar4, cqohVar2, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, akztVar, chgaVar, akkpVar6.is, akkpVar6.ih, akkpVar6.ig, akkpVar6.ie, (errl) akisVar6.t.b(), (errl) this.a.p.b());
            case 1012:
                return Optional.of((ctyn) this.a.a.rj.b());
            case 1013:
                akkp akkpVar7 = this.a.a;
                return new ctyn(akkpVar7.rg, fbaz.a(akkpVar7.ri), (errl) this.a.p.b(), this.a.kh);
            case 1014:
                Context context = (Context) this.a.q.b();
                akkp akkpVar8 = this.a.a;
                fbbf fbbfVar11 = akkpVar8.rc;
                fbbf fbbfVar12 = akkpVar8.dB;
                fbbf fbbfVar13 = akkpVar8.ib;
                fazb a = fbaz.a(akkpVar8.rd);
                akis akisVar7 = this.a;
                akkp akkpVar9 = akisVar7.a;
                fbbf fbbfVar14 = akisVar7.kf;
                ctgw ctgwVar = (ctgw) akkpVar9.re.b();
                ctgw ctgwVar2 = (ctgw) this.a.a.rf.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.p.b();
                akkp akkpVar10 = this.a.a;
                return new crnc(context, fbbfVar11, fbbfVar12, fbbfVar13, a, fbbfVar14, ctgwVar, ctgwVar2, errlVar2, errlVar3, akkpVar10.fP, akkpVar10.iF);
            case 1015:
                akkp akkpVar11 = this.a.a;
                return new ctgv(akkpVar11.dA, (dtuu) akkpVar11.ay.b());
            case 1016:
                akkp akkpVar12 = this.a.a;
                return new crnf(akkpVar12.ib, (altk) akkpVar12.fP.b());
            case 1017:
                cwln cwlnVar = (cwln) this.a.a.iY.b();
                return new cthj(cwlnVar, (errl) this.a.t.b());
            case 1018:
                akis akisVar8 = this.a;
                return new ctha(akisVar8.a.lc(), (errl) akisVar8.p.b());
            case 1019:
                return new ctxw((errl) this.a.p.b(), this.a.a.lj());
            case 1020:
                return new aipn(fbaz.a(this.a.a.bu));
            case 1021:
                return new crma((chhs) this.a.a.aW.b());
            case 1022:
                return new bdvu((dtuu) this.a.a.ay.b(), this.a.a.dA);
            case 1023:
                akis akisVar9 = this.a;
                akkp akkpVar13 = akisVar9.a;
                return new aoyw(akisVar9.q, akkpVar13.rw, akkpVar13.rB, akkpVar13.rF, akkpVar13.rG, akisVar9.kn, akkpVar13.hH, akkpVar13.rH, akkpVar13.rI, akkpVar13.rJ, akkpVar13.rK);
            case 1024:
                return new akjm(this);
            case 1025:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                csrv csrvVar = (csrv) this.a.a.iK.b();
                bcsq bcsqVar = (bcsq) this.a.a.rq.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                bigl biglVar = (bigl) this.a.ki.b();
                bdnf bdnfVar = (bdnf) this.a.a.rr.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                akkp akkpVar14 = this.a.a;
                return new aosg(context2, ffskVar, csrvVar, bcsqVar, coxkVar, biglVar, bdnfVar, ctwbVar, akkpVar14.hH, new culq(akkpVar14.iq), (asnv) akkpVar14.oQ.b(), (atky) this.a.a.rs.b());
            case 1026:
                return new bcsq((bigl) this.a.ki.b(), this.a.a.rp);
            case 1027:
                final fbbf fbbfVar15 = this.a.a.s;
                return new atkw() { // from class: atkl
                    @Override // defpackage.atkw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.modify_get_message_by_id_query");
                    }
                };
            case 1028:
                akis akisVar10 = this.a;
                akkp akkpVar15 = akisVar10.a;
                return new bdnf(akkpVar15.ay, akisVar10.kj, akkpVar15.c);
            case 1029:
                final fbbf fbbfVar16 = this.a.a.s;
                return new atky() { // from class: atkp
                    @Override // defpackage.atky
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_optimized_conversation_messages_query");
                    }
                };
            case 1030:
                return new akjn(this);
            case 1031:
                return new akjp(this);
            case 1032:
                Context context3 = (Context) this.a.q.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar17 = akisVar11.kk;
                ctyz ctyzVar = (ctyz) akisVar11.fM.b();
                cbvv cbvvVar = (cbvv) this.a.a.rz.b();
                return new apcn(context3, fbbfVar17, ctyzVar, cbvvVar, (atbw) this.a.a.ry.b());
            case 1033:
                akis akisVar12 = this.a;
                akkp akkpVar16 = akisVar12.a;
                return new cbvv(akisVar12.cs, akisVar12.kl, akkpVar16.rx, (atbw) akkpVar16.ry.b());
            case 1034:
                final fbbf fbbfVar18 = this.a.a.s;
                return new auyk() { // from class: auyh
                    @Override // defpackage.auyk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.skip_single_user_reference_group_rename_constraint");
                    }
                };
            case 1035:
                final fbbf fbbfVar19 = this.a.a.s;
                return new atbw() { // from class: atbe
                    @Override // defpackage.atbw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.move_sim_selector_to_conversation_details");
                    }
                };
            case 1036:
                return new asnt() { // from class: arsl
                };
            case 1037:
                Context context4 = (Context) this.a.q.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                bcwz bcwzVar = (bcwz) this.a.a.ad.b();
                akis akisVar13 = this.a;
                akkp akkpVar17 = akisVar13.a;
                apqx as = akisVar13.as();
                apmr ar = akisVar13.ar();
                bdjs bdjsVar = (bdjs) akkpVar17.rC.b();
                asvn asvnVar = (asvn) this.a.a.Q.b();
                askf askfVar = (askf) this.a.a.ld.b();
                akkp akkpVar18 = this.a.a;
                aufn cw = akkpVar18.cw();
                auol auolVar = (auol) akkpVar18.pU.b();
                akkp akkpVar19 = this.a.a;
                return new appg(context4, cqohVar3, bcwzVar, as, ar, bdjsVar, asvnVar, askfVar, cw, auolVar, akkpVar19.co(), akkpVar19.cn(), new apri(akkpVar19.p, akkpVar19.rE, akkpVar19.a.hi));
            case 1038:
                return new bdjs((csrv) this.a.a.iK.b(), (cqoh) this.a.cz.b());
            case 1039:
                return new auod() { // from class: aunu
                };
            case 1040:
                return new cblf((ffsk) this.a.a.p.b(), (ctbk) this.a.hi.b());
            case 1041:
                akkp akkpVar20 = this.a.a;
                return aqdn.a(akkpVar20.rF(), akkpVar20.qT());
            case 1042:
                return new akjq(this);
            case 1043:
                return new akjr();
            case 1044:
                return new akjs();
            case 1045:
                return new asmm() { // from class: arqh
                };
            case 1046:
                akkp akkpVar21 = this.a.a;
                return enip.v(akkpVar21.aO(), akkpVar21.aK(), akkpVar21.aN(), akkpVar21.pD(), akkpVar21.aY(), akkpVar21.aM(), new apen(), this.a.a.aP(), this.a.a.aR(), this.a.a.aS());
            case 1047:
                return new apdc((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1048:
                return new apwq((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1049:
                return new cbrb((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1050:
                return new aqdv((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1051:
                return new apdy((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1052:
                return new apym((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1053:
                return new apzn((dtuu) this.a.a.ay.b(), (apuc) this.a.ke.b());
            case 1054:
                return new aouh(this.a.a.mu);
            case 1055:
                akis akisVar14 = this.a;
                return new apvb(akisVar14.cn, akisVar14.kr, akisVar14.js, akisVar14.a.p);
            case 1056:
                akkp akkpVar22 = this.a.a;
                return new apqz(akkpVar22.rX, akkpVar22.pE, akkpVar22.qM);
            case 1057:
                akis akisVar15 = this.a;
                akkp akkpVar23 = akisVar15.a;
                return new bajc(akisVar15.q, akisVar15.t, akkpVar23.dB, akkpVar23.oO, akkpVar23.oQ, akkpVar23.pr, akkpVar23.rW);
            case 1058:
                final fbbf fbbfVar20 = this.a.a.s;
                return new atxa() { // from class: atvz
                    @Override // defpackage.atxa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.mark_message_as_paused_even_if_not_in_progress");
                    }
                };
            case 1059:
                return Optional.of(this.a.a.aL());
            case 1060:
                akis akisVar16 = this.a;
                akkp akkpVar24 = akisVar16.a;
                ejqy er = akisVar16.er();
                errm errmVar = (errm) akkpVar24.m.b();
                errmVar.getClass();
                ffhd a2 = er.a(errmVar);
                a2.getClass();
                return a2;
            case 1061:
                return new ctmy((Context) this.a.q.b(), (errl) this.a.t.b(), (errl) this.a.p.b(), (ctmg) this.a.a.sa.b());
            case 1062:
                Context context5 = (Context) this.a.q.b();
                akis akisVar17 = this.a;
                return new ctmg(context5, akisVar17.a.nc, (errl) akisVar17.t.b(), (errl) this.a.p.b(), (errl) this.a.aK.b(), (cqoh) this.a.cz.b());
            case 1063:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                akkp akkpVar25 = this.a.a;
                return new alrt(ffskVar2, cqohVar4, akkpVar25.dE, akkpVar25.bi);
            case 1064:
                akis akisVar18 = this.a;
                akkp akkpVar26 = akisVar18.a;
                return new apcf(akisVar18.iE, akkpVar26.se, akkpVar26.aq);
            case 1065:
                return new aouq(this.a.a.rF);
            case 1066:
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                ckds ckdsVar = (ckds) this.a.a.dp.b();
                avlp avlpVar = (avlp) this.a.a.sg.b();
                akkp akkpVar27 = this.a.a;
                return new aqci(cqohVar5, ckdsVar, avlpVar, akkpVar27.sh, akkpVar27.si, akkpVar27.Z, (ffsk) akkpVar27.q.b());
            case 1067:
                akkp akkpVar28 = this.a.a;
                return ((azbk) akkpVar28.pZ()).a(akkpVar28.db());
            case 1068:
                final fbbf fbbfVar21 = this.a.a.s;
                return new asgo() { // from class: argf
                    @Override // defpackage.asgo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.calculate_rcs_stats_correctly");
                    }
                };
            case 1069:
                akkp akkpVar29 = this.a.a;
                return new aqen(akkpVar29.p, akkpVar29.aq, akkpVar29.qJ, akkpVar29.pJ);
            case 1070:
                akkp akkpVar30 = this.a.a;
                return new apbr(akkpVar30.q, akkpVar30.sl, akkpVar30.sm, akkpVar30.sn);
            case 1071:
                return new cbwc((dtuu) this.a.a.ay.b(), (errm) this.a.p.b());
            case 1072:
                akis akisVar19 = this.a;
                return new azei(akisVar19.kw, (ffsk) akisVar19.a.p.b());
            case 1073:
                return new autc() { // from class: ausj
                };
            case 1074:
                return Optional.of((cboo) this.a.a.ss.b());
            case 1075:
                cbsf cbsfVar = (cbsf) this.a.a.sp.b();
                akkp akkpVar31 = this.a.a;
                return new cboo(cbsfVar, akkpVar31.fI(), (cbpl) akkpVar31.sr.b(), (errl) this.a.aK.b());
            case 1076:
                Context context6 = (Context) this.a.q.b();
                errl errlVar4 = (errl) this.a.t.b();
                akis akisVar20 = this.a;
                fbbf fbbfVar22 = akisVar20.a.az;
                elbx elbxVar = (elbx) akisVar20.aJ.b();
                dfqs dfqsVar = dhmg.a;
                return new cbsq(context6, errlVar4, fbbfVar22, new dhox(context6), elbxVar);
            case 1077:
                akkp akkpVar32 = this.a.a;
                return new cbqm(akkpVar32.fJ(), akkpVar32.sq);
            case 1078:
                final fbbf fbbfVar23 = this.a.a.s;
                return new avek() { // from class: avec
                    @Override // defpackage.avek
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_all_image_types_in_search");
                    }
                };
            case 1079:
                return Optional.of(this.a.a.gv());
            case 1080:
                akkp akkpVar33 = this.a.a;
                return new cdkp(akkpVar33.gn(), akkpVar33.gp(), akkpVar33.gs(), akkpVar33.gr(), akkpVar33.go(), akkpVar33.gq(), (axkm) akkpVar33.ck.b(), (cbwj) this.a.a.kG.b(), (ffsk) this.a.a.aq.b(), (ffhd) this.a.cP.b(), (cevh) this.a.a.cc.b(), this.a.a.bX());
            case 1081:
                return new algw((ffsk) this.a.a.q.b(), (ffhd) this.a.co.b(), (aleq) this.a.a.lO.b());
            case 1082:
                return new apuq(this.a.a.sx);
            case 1083:
                final fbbf fbbfVar24 = this.a.a.s;
                return new avel() { // from class: avee
                    @Override // defpackage.avel
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_check_for_missing_parts");
                    }
                };
            case 1084:
                return new apcv((cqvy) this.a.a.oP.b(), (ffsk) this.a.a.aq.b());
            case 1085:
                akkp akkpVar34 = this.a.a;
                return Optional.of(new aqfj((ffsk) akkpVar34.p.b(), (crlo) akkpVar34.sA.b(), akkpVar34.aZ()));
            case 1086:
                akkp akkpVar35 = this.a.a;
                return new crlt(akkpVar35.dB, akkpVar35.pQ, akkpVar35.pS, (byzp) akkpVar35.iy.b(), (asix) this.a.a.pR.b(), (ffsk) this.a.a.q.b(), (ffhd) this.a.co.b(), this.a.cz);
            case 1087:
                akis akisVar21 = this.a;
                akkp akkpVar36 = akisVar21.a;
                fbbf fbbfVar25 = akkpVar36.dB;
                fbbf fbbfVar26 = akkpVar36.pJ;
                ffhd ffhdVar = (ffhd) akisVar21.cP.b();
                akis akisVar22 = this.a;
                fbbf fbbfVar27 = akisVar22.a.aO;
                cqoh cqohVar6 = (cqoh) akisVar22.cz.b();
                akkp akkpVar37 = this.a.a;
                return new aqes(fbbfVar25, fbbfVar26, ffhdVar, fbbfVar27, cqohVar6, akkpVar37.pS, akkpVar37.pR, (dtuu) akkpVar37.ay.b(), (ffsk) this.a.a.p.b());
            case 1088:
                akis akisVar23 = this.a;
                return new aqff(akisVar23.a.ay, akisVar23.ke);
            case 1089:
                final fbbf fbbfVar28 = this.a.a.s;
                return new atzx() { // from class: atyz
                    @Override // defpackage.atzx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.observe_tombstone_user_reference_added");
                    }
                };
            case 1090:
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akkp akkpVar38 = this.a.a;
                return new apsk(ffskVar3, akkpVar38.iy, akkpVar38.sH, akkpVar38.dB, akkpVar38.pQ, akkpVar38.fs, (dtuu) akkpVar38.ay.b(), this.a.a.sI);
            case 1091:
                akis akisVar24 = this.a;
                akkp akkpVar39 = akisVar24.a;
                return new bahx(akkpVar39.dB, akkpVar39.kj, akkpVar39.sF, akisVar24.p, akisVar24.aK, akkpVar39.Z, akkpVar39.jG, akkpVar39.sG);
            case 1092:
                return new cers(this.a.a.cc);
            case 1093:
                final fbbf fbbfVar29 = this.a.a.s;
                return new atmh() { // from class: atlv
                    @Override // defpackage.atmh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_kotlin_incoming_rcs_message_processor");
                    }
                };
            case 1094:
                return Optional.of((cnbg) this.a.a.pZ.b());
            case 1095:
                akkp akkpVar40 = this.a.a;
                return enip.v(akkpVar40.ay(), akkpVar40.ln(), akkpVar40.aC(), akkpVar40.jN(), akkpVar40.aA(), akkpVar40.C(), this.a.a.iY(), this.a.a.T(), akis.iV(), this.a.a.aB());
            case 1096:
                return new cuem((ffhd) this.a.cP.b(), (dtuu) this.a.a.ay.b(), this.a.cz);
            case 1097:
                akis akisVar25 = this.a;
                akkp akkpVar41 = akisVar25.a;
                return new bbab(akisVar25.p, akkpVar41.sU, akkpVar41.aO, akkpVar41.G, akkpVar41.gE, akkpVar41.qq, akkpVar41.sV);
            case 1098:
                return new akjt(this);
            case 1099:
                akis akisVar26 = this.a;
                fbbf fbbfVar30 = akisVar26.a.C;
                alag ae = akisVar26.ae();
                fbbfVar30.getClass();
                return ae.a(fbbfVar30);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e() {
        int i = this.b;
        switch (i) {
            case 1100:
                return new akju(this);
            case 1101:
                fbbf a = fbbg.a(this.a.a.ql);
                akis akisVar = this.a;
                return new cafn(a, akisVar.a.az, akisVar.p, akisVar.kB, akisVar.kC);
            case 1102:
                return new akjv(this);
            case 1103:
                final fbbf fbbfVar = this.a.a.s;
                return new atrx() { // from class: atpl
                    @Override // defpackage.atrx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_crash_xms_groups_e2ee_update");
                    }
                };
            case 1104:
                final fbbf fbbfVar2 = this.a.a.s;
                return new atrl() { // from class: atoo
                    @Override // defpackage.atrl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_takedown_e2ee_when_no_rcs_available");
                    }
                };
            case 1105:
                return Optional.of(this.a.a.U());
            case 1106:
                return new ajca((Context) this.a.q.b(), (cqoh) this.a.cz.b(), this.a.a.nr);
            case 1107:
                atmh atmhVar = (atmh) this.a.a.sG.b();
                akkp akkpVar = this.a.a;
                return clcw.a(atmhVar, akkpVar.iZ(), akkpVar.ja());
            case 1108:
                akkp akkpVar2 = this.a.a;
                return new cukj(akkpVar2.tl, akkpVar2.tq, akkpVar2.tu, akkpVar2.tp, akkpVar2.iv, akkpVar2.ta, akkpVar2.tt, akkpVar2.to, akkpVar2.tv, (ffsk) akkpVar2.aq.b());
            case 1109:
                return enip.o(this.a.a.rp());
            case 1110:
                return new cunu((cwln) this.a.a.iY.b());
            case 1111:
                akis akisVar2 = this.a;
                return new culy(akisVar2.a.iu, akisVar2.co);
            case 1112:
                akis akisVar3 = this.a;
                akkp akkpVar3 = akisVar3.a;
                return new cumx(akisVar3.kG, akkpVar3.tb, (ffsk) akkpVar3.p.b());
            case 1113:
                akis akisVar4 = this.a;
                akkp akkpVar4 = akisVar4.a;
                return new cung(akkpVar4.nc, akisVar4.kH, (ffsk) akkpVar4.aq.b());
            case 1114:
                akis akisVar5 = this.a;
                akkp akkpVar5 = akisVar5.a;
                return new cumu(akisVar5.kG, akkpVar5.it, akisVar5.kH, akkpVar5.C, (ffsk) akkpVar5.p.b());
            case 1115:
                akkp akkpVar6 = this.a.a;
                return new cuot(akkpVar6.tf, fbaz.a(akkpVar6.sb), (ffhd) this.a.co.b(), (ffhd) this.a.cn.b(), this.a.a.tg);
            case 1116:
                akis akisVar6 = this.a;
                fbbf fbbfVar3 = akisVar6.kW;
                akkp akkpVar7 = akisVar6.a;
                return new cupj(fbbfVar3, akisVar6.cz, akkpVar7.ej, akkpVar7.te);
            case 1117:
                akis akisVar7 = this.a;
                akkp akkpVar8 = akisVar7.a;
                return new cupa(akkpVar8.bi, akkpVar8.dF, (Executor) akisVar7.p.b());
            case 1118:
                akis akisVar8 = this.a;
                return new cuql(akisVar8.a.C, (Context) akisVar8.q.b());
            case 1119:
                akis akisVar9 = this.a;
                akkp akkpVar9 = akisVar9.a;
                return new cuol(akisVar9.kX, akkpVar9.ti, fbaz.a(akkpVar9.sb), (errl) this.a.p.b(), (errl) this.a.t.b(), this.a.a.tg);
            case 1120:
                akis akisVar10 = this.a;
                akkp akkpVar10 = akisVar10.a;
                return new cupd(akisVar10.kX, akisVar10.cz, akkpVar10.ej, akkpVar10.te, (errl) akisVar10.t.b());
            case 1121:
                return Optional.of((cuom) this.a.a.th.b());
            case 1122:
                akkp akkpVar11 = this.a.a;
                return new cukm(akkpVar11.tm, akkpVar11.tp, akkpVar11.iv, akkpVar11.ta, (ffsk) akkpVar11.aq.b());
            case 1123:
                return enip.o(this.a.a.rs());
            case 1124:
                akis akisVar11 = this.a;
                akkp akkpVar12 = akisVar11.a;
                return new cumi(akkpVar12.tn, akkpVar12.ib, akkpVar12.dn, akkpVar12.iq, akkpVar12.id, akkpVar12.fo, akkpVar12.ta, akkpVar12.iu, akkpVar12.iw, akkpVar12.to, akisVar11.cP);
            case 1125:
                akis akisVar12 = this.a;
                return new cudh(akisVar12.a.nc, akisVar12.cn, akisVar12.p, akisVar12.t);
            case 1126:
                akis akisVar13 = this.a;
                fbbf fbbfVar4 = akisVar13.cP;
                akkp akkpVar13 = akisVar13.a;
                return new cuqs(akkpVar13.ik, akkpVar13.id, (ffhd) fbbfVar4.b());
            case 1127:
                akis akisVar14 = this.a;
                akkp akkpVar14 = akisVar14.a;
                return new cusm(akkpVar14.tl, akkpVar14.dn, akkpVar14.dB, akkpVar14.iq, akkpVar14.tr, akkpVar14.tp, akkpVar14.iv, akkpVar14.tq, akkpVar14.tt, akisVar14.cz, akisVar14.cP);
            case 1128:
                return new cusp(this.a.a.cc);
            case 1129:
                akis akisVar15 = this.a;
                akkp akkpVar15 = akisVar15.a;
                return new cuke(akkpVar15.ts, akkpVar15.ib, akkpVar15.dn, akkpVar15.dB, akkpVar15.Z, akkpVar15.aO, akkpVar15.il, akkpVar15.gN, akisVar15.co);
            case 1130:
                akis akisVar16 = this.a;
                fbbf fbbfVar5 = akisVar16.co;
                akkp akkpVar16 = akisVar16.a;
                return new cubw(akkpVar16.ih, akkpVar16.ig, akkpVar16.dB, akkpVar16.ib, akkpVar16.dn, akkpVar16.Z, (ffhd) fbbfVar5.b(), (ffsk) this.a.a.q.b());
            case 1131:
                final fbbf fbbfVar6 = this.a.a.s;
                return new asnd() { // from class: arrl
                    @Override // defpackage.asnd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_spam_network_source_indicator_header");
                    }
                };
            case 1132:
                akis akisVar17 = this.a;
                akkp akkpVar17 = akisVar17.a;
                return new cubr(akkpVar17.ib, akkpVar17.dn, akkpVar17.dB, akkpVar17.tx, (errl) akisVar17.t.b());
            case 1133:
                akis akisVar18 = this.a;
                akkp akkpVar18 = akisVar18.a;
                return new cugd(akkpVar18.bi, akkpVar18.dF, (Executor) akisVar18.p.b());
            case 1134:
                return new bdwt((Context) this.a.q.b(), (bcxm) this.a.a.nQ.b());
            case 1135:
                cbke cbkeVar = (cbke) this.a.a.tD.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                bcwz bcwzVar = (bcwz) this.a.a.ad.b();
                akkp akkpVar19 = this.a.a;
                fbbf fbbfVar7 = akkpVar19.tE;
                askf askfVar = (askf) akkpVar19.ld.b();
                return new bavs(cbkeVar, dtuuVar, bcwzVar, fbbfVar7, askfVar);
            case 1136:
                return new cbke(this.a.a.fH());
            case 1137:
                return dxwt.a((Context) this.a.q.b(), (Executor) this.a.hN.b(), (Class) this.a.kY.b(), (emyl) this.a.a.tB.b(), (dxwc) this.a.hO.b());
            case 1138:
                final Context context = (Context) this.a.q.b();
                final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.aK.b();
                final efbm efbmVar = (efbm) this.a.hR.b();
                final fazb a2 = fbaz.a(this.a.a.bu);
                final dxwc dxwcVar = (dxwc) this.a.hO.b();
                return new emyl() { // from class: dxws
                    @Override // defpackage.emyl
                    public final Object get() {
                        dxbm dxbmVar = new dxbm(scheduledExecutorService, 2);
                        CronetEngine cronetEngine = (CronetEngine) a2.b();
                        cronetEngine.getClass();
                        eaeg eaegVar = new eaeg(new eaef(cronetEngine));
                        Context context2 = context;
                        eaez eaezVar = new eaez(eaegVar, context2, dxbmVar);
                        eaezVar.h(dxwcVar);
                        return new dxbk(context2, eaezVar, eaegVar, efbmVar, dxbmVar);
                    }
                };
            case 1139:
                Context context2 = (Context) this.a.q.b();
                csuk csukVar = (csuk) this.a.a.ha.b();
                akkp akkpVar20 = this.a.a;
                return new csug(context2, csukVar, Optional.empty(), akkpVar20.D, akkpVar20.c);
            case 1140:
                akkp akkpVar21 = this.a.a;
                return new bauj(akkpVar21.ud, akkpVar21.nj);
            case 1141:
                akkp akkpVar22 = this.a.a;
                fbbf fbbfVar8 = akkpVar22.dB;
                ctiz ctizVar = (ctiz) akkpVar22.nC.b();
                ctiw ctiwVar = (ctiw) this.a.a.tJ.b();
                akis akisVar19 = this.a;
                akkp akkpVar23 = akisVar19.a;
                return new bauu(fbbfVar8, ctizVar, ctiwVar, akkpVar23.nD, akkpVar23.eE(), (errl) akisVar19.p.b(), (errl) this.a.t.b(), (bafi) this.a.a.uc.b());
            case 1142:
                Context context3 = (Context) this.a.q.b();
                akis akisVar20 = this.a;
                fbbf fbbfVar9 = akisVar20.cP;
                akkp akkpVar24 = akisVar20.a;
                fbbf fbbfVar10 = akkpVar24.nC;
                fbbf fbbfVar11 = akkpVar24.sa;
                fbbf fbbfVar12 = akkpVar24.ni;
                fbbf fbbfVar13 = akkpVar24.nr;
                ffhd ffhdVar = (ffhd) fbbfVar9.b();
                errl errlVar = (errl) this.a.p.b();
                ffhd ffhdVar2 = (ffhd) this.a.co.b();
                ffhd ffhdVar3 = (ffhd) this.a.cn.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar21 = this.a;
                akkp akkpVar25 = akisVar21.a;
                fbbf fbbfVar14 = akkpVar25.nc;
                fbbf fbbfVar15 = akkpVar25.ej;
                fbbf fbbfVar16 = akkpVar25.cp;
                ctis ctisVar = (ctis) akisVar21.ld.b();
                akis akisVar22 = this.a;
                fbbf fbbfVar17 = akisVar22.cz;
                fbbf fbbfVar18 = akisVar22.a.tG;
                fbbf fbbfVar19 = akisVar22.le;
                cqoh cqohVar = (cqoh) fbbfVar17.b();
                akkp akkpVar26 = this.a.a;
                return new ctof(context3, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, ffhdVar, errlVar, ffhdVar2, ffhdVar3, ffskVar, fbbfVar14, fbbfVar15, akisVar21.aO, fbbfVar16, ctisVar, fbbfVar18, fbbfVar19, cqohVar, akkpVar26.ld(), akkpVar26.cf, akkpVar26.nd, akkpVar26.tH, akkpVar26.tI, akkpVar26.dB);
            case 1143:
                return new alrw(this.a.a.ej);
            case 1144:
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                akis akisVar23 = this.a;
                return new aiqu(ffskVar2, akisVar23.a.nc, (cqoh) akisVar23.cz.b());
            case 1145:
                akis akisVar24 = this.a;
                akkp akkpVar27 = akisVar24.a;
                return new ctow(akkpVar27.ab, akkpVar27.hC, akisVar24.cp, akkpVar27.Z, akkpVar27.nb);
            case 1146:
                akis akisVar25 = this.a;
                akkp akkpVar28 = akisVar25.a;
                return new barw(akkpVar28.dB, akkpVar28.ng, akkpVar28.tL, akkpVar28.lf(), akkpVar28.nj, akkpVar28.pC, akkpVar28.tP, (errl) akisVar25.t.b());
            case 1147:
                return Optional.of((ahrq) this.a.a.tK.b());
            case 1148:
                akkp akkpVar29 = this.a.a;
                return new curf(akkpVar29.tp, akkpVar29.tt, akkpVar29.ta, (ffsk) akkpVar29.q.b());
            case 1149:
                akkp akkpVar30 = this.a.a;
                return new ctqg(akkpVar30.tN, akkpVar30.dB, akkpVar30.sA, (cbgf) akkpVar30.dA.b(), this.a.a.nr);
            case 1150:
                akkp akkpVar31 = this.a.a;
                return new curl(akkpVar31.tp, akkpVar31.tt, akkpVar31.ta, akkpVar31.tL, akkpVar31.dB, (ffsk) akkpVar31.q.b());
            case 1151:
                final fbbf fbbfVar20 = this.a.a.s;
                return new auiv() { // from class: auiq
                    @Override // defpackage.auiv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_notification_system_smart_replies");
                    }
                };
            case 1152:
                akis akisVar26 = this.a;
                akkp akkpVar32 = akisVar26.a;
                return new bafi(akisVar26.q, akkpVar32.cD, akkpVar32.tR, akkpVar32.ub, akisVar26.t, fbbg.a(akisVar26.lh), this.a.cz);
            case 1153:
                return new cbze((cqoh) this.a.cz.b(), (dtuu) this.a.a.ay.b());
            case 1154:
                final Optional of = Optional.of(this.a.a.fM());
                akkp akkpVar33 = this.a.a;
                final fbbf fbbfVar21 = akkpVar33.rg;
                final fbbf fbbfVar22 = akkpVar33.rc;
                final fbbf fbbfVar23 = akkpVar33.cD;
                final Optional optional = (Optional) akkpVar33.rk.b();
                akkp akkpVar34 = this.a.a;
                final ccdu fO = akkpVar34.fO();
                akis akisVar27 = this.a;
                final fbbf fbbfVar24 = akisVar27.a.dB;
                final errl errlVar2 = (errl) akisVar27.t.b();
                akkp akkpVar35 = this.a.a;
                final fbbf fbbfVar25 = akkpVar35.tP;
                final fbbf fbbfVar26 = akkpVar35.pC;
                return new cbym() { // from class: ceot
                    @Override // defpackage.cbym
                    public final engw a() {
                        int i2 = engw.d;
                        final engr engrVar = new engr();
                        engrVar.h(new cbyj(ffbr.this, fbbfVar22, fbbfVar23, fbbfVar24, errlVar2, fbbfVar25, fbbfVar26));
                        Optional optional2 = optional;
                        engrVar.h(new cbyg(optional2));
                        engrVar.h(new cbyn(optional2));
                        engrVar.h(fO);
                        of.ifPresent(new Consumer() { // from class: ceou
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                engr.this.h((cbuj) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return engrVar.g();
                    }
                };
            case 1155:
                akis akisVar28 = this.a;
                fbbf fbbfVar27 = akisVar28.lf;
                errl errlVar3 = (errl) akisVar28.t.b();
                errl errlVar4 = (errl) this.a.p.b();
                cbpl cbplVar = (cbpl) this.a.a.sr.b();
                akkp akkpVar36 = this.a.a;
                return new cbsa(fbbfVar27, errlVar3, errlVar4, cbplVar, akkpVar36.f, akkpVar36.tS, akkpVar36.dn);
            case 1156:
                akis akisVar29 = this.a;
                return new cbsw(akisVar29.a.az, (Random) akisVar29.lg.b());
            case 1157:
                return new cbma();
            case 1158:
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                akis akisVar30 = this.a;
                return new cbmb(ffskVar3, akisVar30.lf, akisVar30.a.tS);
            case 1159:
                return new asxl() { // from class: asxj
                };
            case 1160:
                return new ccdq(this.a.a.tW);
            case 1161:
                return new cccl(this.a.a.cc);
            case 1162:
                return new cdgy((cdhd) this.a.a.tY.b(), (cdgw) this.a.a.tZ.b());
            case 1163:
                return new cdhd(this.a.a.cc);
            case 1164:
                return new cdgw(this.a.a.cc);
            case 1165:
                return new avff((errl) this.a.t.b(), (dtuu) this.a.a.ay.b());
            case 1166:
                final fbbf fbbfVar28 = this.a.a.s;
                return new atme() { // from class: atlp
                    @Override // defpackage.atme
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.incoming_rcs_message_destination_conversation_matching");
                    }
                };
            case 1167:
                akkp akkpVar37 = this.a.a;
                cmjg jq = akkpVar37.jq();
                cagw fx = akkpVar37.fx();
                cmle js = akkpVar37.js();
                bdnu bdnuVar = (bdnu) akkpVar37.uj.b();
                akkp akkpVar38 = this.a.a;
                cnbv jx = akkpVar38.jx();
                cahp fy = akkpVar38.fy();
                akkp akkpVar39 = this.a.a;
                return enip.v(jq, fx, js, bdnuVar, jx, fy, akkpVar38.pa(), this.a.a.hz(), this.a.a.jy(), (bdnu) this.a.kv.b(), this.a.a.W(), this.a.a.jB(), this.a.a.jL(), this.a.a.lA(), this.a.a.hs(), akkpVar39.lt(), akkpVar39.m());
            case 1168:
                return new cmjl((ffhd) this.a.cn.b(), this.a.a.an());
            case 1169:
                akkp akkpVar40 = this.a.a;
                long b = akkpVar40.b();
                long c = akkpVar40.c();
                long d = akkpVar40.d();
                ffsk ffskVar4 = (ffsk) akkpVar40.aq.b();
                akis akisVar31 = this.a;
                akkp akkpVar41 = akisVar31.a;
                return new cfsv(b, c, d, ffskVar4, akkpVar41.ay, akkpVar41.hJ, akkpVar41.fO, akkpVar41.Z, akkpVar41.dn, akisVar31.cz);
            case 1170:
                akis akisVar32 = this.a;
                akkp akkpVar42 = akisVar32.a;
                return new cmtk(akkpVar42.pZ, akisVar32.iy, akkpVar42.uo, akkpVar42.q, akkpVar42.lb);
            case 1171:
                return Optional.of((dqze) this.a.a.un.b());
            case 1172:
                akkp akkpVar43 = this.a.a;
                return new dqzl(akkpVar43.mc(), akkpVar43.ma(), (dqgr) akkpVar43.ul.b(), (Context) this.a.q.b());
            case 1173:
                return dras.a((dqii) this.a.lo.b(), this.a.a.mb());
            case 1174:
                return drah.a(this.a.a.lZ());
            case 1175:
                errl errlVar5 = (errl) this.a.p.b();
                errl errlVar6 = (errl) this.a.aK.b();
                akkp akkpVar44 = this.a.a;
                return new cahm(errlVar5, errlVar6, akkpVar44.nK, akkpVar44.dB, akkpVar44.dn, akkpVar44.uq, akkpVar44.cv, akkpVar44.qo, akkpVar44.C, akkpVar44.dM());
            case 1176:
                return new caig(this.a.a.qo);
            case 1177:
                akis akisVar33 = this.a;
                return new cmss(akisVar33.a.kd(), (ejvb) akisVar33.dy.b(), (ejvp) this.a.aR.b(), (ffsk) this.a.a.p.b(), (akzt) this.a.a.f.b());
            case 1178:
                return new cnej(this.a.a.cc);
            case 1179:
                final fbbf fbbfVar29 = this.a.a.s;
                return new auqp() { // from class: aupw
                    @Override // defpackage.auqp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.hide_unmatched_rcs_reactions");
                    }
                };
            case 1180:
                final fbbf fbbfVar30 = this.a.a.s;
                return new auqs() { // from class: aupz
                    @Override // defpackage.auqs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_origin_reaction_surface");
                    }
                };
            case 1181:
                return new ajpy((ffhd) this.a.cn.b(), this.a.a.an());
            case 1182:
                akis akisVar34 = this.a;
                akkp akkpVar45 = akisVar34.a;
                return new cgis(akisVar34.jm, akisVar34.jl, akkpVar45.p, akkpVar45.aq, akisVar34.cP, akisVar34.gW, akkpVar45.eW, akkpVar45.al, akkpVar45.ux, akkpVar45.uy, akkpVar45.uz, akkpVar45.uA);
            case 1183:
                return new cghw(this.a.a.cc);
            case 1184:
                return Long.valueOf(fdby.a(this.a.a.oc()));
            case 1185:
                return Boolean.valueOf(fdbz.a(this.a.a.oc()));
            case 1186:
                final fbbf fbbfVar31 = this.a.a.s;
                return new avbp() { // from class: avbq
                    @Override // defpackage.avbp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_uma_logs_for_trusted_contacts");
                    }
                };
            case 1187:
                return new atqz() { // from class: atnr
                };
            case 1188:
                errl errlVar7 = (errl) this.a.aK.b();
                akkp akkpVar46 = this.a.a;
                return new avln(errlVar7, akkpVar46.dn, (azaw) akkpVar46.uE.b(), this.a.a.eh());
            case 1189:
                akkp akkpVar47 = this.a.a;
                return azbl.a(akkpVar47.da(), akkpVar47.pZ());
            case 1190:
                akis akisVar35 = this.a;
                akkp akkpVar48 = akisVar35.a;
                return new coww(akkpVar48.nK, akkpVar48.uh, akkpVar48.fP, akkpVar48.cH, akkpVar48.Z, akkpVar48.dn, akkpVar48.ib, akisVar35.cn(), akkpVar48.kR, akkpVar48.uG, (ffsk) akkpVar48.q.b(), this.a.a.G);
            case 1191:
                final fbbf fbbfVar32 = this.a.a.s;
                return new augp() { // from class: auga
                    @Override // defpackage.augp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.avoid_throw_exception_for_delivery_failed");
                    }
                };
            case 1192:
                return new cthl(this.a.a.rc);
            case 1193:
                Set rD = this.a.a.rD();
                eikw.a(rD);
                return rD;
            case 1194:
                return Optional.of((cjeo) this.a.a.my.b());
            case 1195:
                akkp akkpVar49 = this.a.a;
                return new avkz(akkpVar49.az, (avkk) akkpVar49.cH.b(), (djsi) this.a.a.gE.b(), this.a.a.u);
            case 1196:
                akkp akkpVar50 = this.a.a;
                return new bdfv(akkpVar50.dn, (aolr) akkpVar50.Z.b(), (djsi) this.a.a.gE.b(), (bdtd) this.a.a.aO.b(), (ffhd) this.a.co.b(), (ffsk) this.a.a.q.b());
            case 1197:
                final fbbf fbbfVar33 = this.a.a.s;
                return new atsm() { // from class: atqo
                    @Override // defpackage.atsm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_new_api_to_determine_jf_participant_is_part_of_group");
                    }
                };
            case 1198:
                final fbbf fbbfVar34 = this.a.a.s;
                return new atsn() { // from class: atqq
                    @Override // defpackage.atsn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_rcs_subscription_provider");
                    }
                };
            case 1199:
                awqj awqjVar = (awqj) this.a.a.wr.b();
                awti awtiVar = (awti) this.a.ju.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akis akisVar36 = this.a;
                akkp akkpVar51 = akisVar36.a;
                return new awpq(awqjVar, awtiVar, cqohVar2, akkpVar51.br, akkpVar51.wt, akkpVar51.wv, akkpVar51.ww, (errl) akisVar36.t.b(), (atmb) this.a.a.kS.b());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [bznw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [bznw, java.lang.Object] */
    private final Object f() {
        int i = this.b;
        switch (i) {
            case 1200:
                bzgd bzgdVar = (bzgd) this.a.a.fa.b();
                akkp akkpVar = this.a.a;
                fbbf fbbfVar = akkpVar.jZ;
                chep chepVar = (chep) akkpVar.ql.b();
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar2 = akkpVar2.vO;
                chww chwwVar = (chww) akkpVar2.vg.b();
                errl errlVar = (errl) this.a.p.b();
                akis akisVar = this.a;
                return new awqj(bzgdVar, fbbfVar, chepVar, fbbfVar2, chwwVar, errlVar, akisVar.da, akisVar.a.bT());
            case 1201:
                return new chez((errl) this.a.t.b(), (Optional) this.a.a.uP.b(), (chrv) this.a.a.bN.b(), (ciji) this.a.a.uQ.b(), (chdj) this.a.a.uR.b(), akis.iJ(), (chbx) this.a.a.gr.b(), (akzt) this.a.a.f.b(), (Optional) this.a.ip.b(), fbaz.a(this.a.a.uV), (chga) this.a.a.cp.b(), (albq) this.a.a.di.b(), (chih) this.a.a.wq.b());
            case 1202:
                return new cijn(fbaz.a(this.a.a.cc), fbaz.a(this.a.a.ql), (errl) this.a.p.b(), (errl) this.a.t.b());
            case 1203:
                return achw.a((cgwk) this.a.a.jV.b(), Optional.empty());
            case 1204:
                return achu.a((cgcu) this.a.da.b(), (bzby) this.a.a.uS.b(), (bzcw) this.a.a.wp.b());
            case 1205:
                akis akisVar2 = this.a;
                return new bzcw(akisVar2.a.po(), fbaz.a(akisVar2.lv), (errl) this.a.t.b(), (ctyx) this.a.aU.b(), fbaz.a(this.a.a.wo), (ejar) this.a.a.au.b(), (bzgd) this.a.a.fa.b(), (Context) this.a.q.b());
            case 1206:
                return new bznv(this.a.a.cc);
            case 1207:
                Optional optional = (Optional) this.a.lw.b();
                bzaf bzafVar = (bzaf) this.a.a.uU.b();
                fazb a = fbaz.a(this.a.a.vP);
                fazb a2 = fbaz.a(this.a.lv);
                Optional optional2 = (Optional) this.a.a.ag.b();
                errl errlVar2 = (errl) this.a.p.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                bzgd bzgdVar2 = (bzgd) this.a.a.fa.b();
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar3 = akkpVar3.ka;
                ?? po = akkpVar3.po();
                bbfl bbflVar = (bbfl) akkpVar3.vD.b();
                Optional optional3 = (Optional) this.a.ip.b();
                csjk csjkVar = (csjk) this.a.a.fQ.b();
                akkp akkpVar4 = this.a.a;
                fbbf fbbfVar4 = akkpVar4.vQ;
                fbbf fbbfVar5 = akkpVar4.vR;
                banr eA = akkpVar4.eA();
                fazb a3 = fbaz.a(akkpVar4.vS);
                fazb a4 = fbaz.a(this.a.a.vU);
                bbem bbemVar = (bbem) this.a.a.vN.b();
                bbfs bbfsVar = (bbfs) this.a.a.vy.b();
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar6 = akkpVar5.wj;
                fbbf fbbfVar7 = akkpVar5.fJ;
                fbbf fbbfVar8 = akkpVar5.vd;
                fbbf fbbfVar9 = akkpVar5.wk;
                Optional optional4 = (Optional) akkpVar5.uP.b();
                akkp akkpVar6 = this.a.a;
                return new bzdx(optional, bzafVar, a, a2, optional2, errlVar2, ctyxVar, bzgdVar2, fbbfVar3, po, bbflVar, optional3, csjkVar, fbbfVar4, fbbfVar5, eA, a3, a4, bbemVar, bbfsVar, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, optional4, akkpVar6.vp, akkpVar6.vq, akkpVar6.vB, (Map) akkpVar6.wn.b());
            case 1208:
                Context context = (Context) this.a.q.b();
                akkp akkpVar7 = this.a.a;
                return new bzcf(context, (bzce) akkpVar7.pT(), (aqvh) akkpVar7.gN.b(), (aqkp) this.a.a.mu.b(), (ejtr) this.a.a.f7do.b());
            case 1209:
                akis akisVar3 = this.a;
                akkp akkpVar8 = akisVar3.a;
                return new bakp(akkpVar8.fa, akkpVar8.f, akisVar3.p, akisVar3.t, akisVar3.aK, akisVar3.lx, akkpVar8.dR, akkpVar8.ka, akkpVar8.va, akkpVar8.vg, akkpVar8.vh, akkpVar8.fr, akkpVar8.vn, akisVar3.da, akkpVar8.vo, akisVar3.cN, akkpVar8.vp, akkpVar8.vq, akkpVar8.vB, akkpVar8.vC);
            case 1210:
                return Optional.of((cikg) this.a.a.uZ.b());
            case 1211:
                akkp akkpVar9 = this.a.a;
                ciko hT = akkpVar9.hT();
                cgwk cgwkVar = (cgwk) akkpVar9.jV.b();
                fazb a5 = fbaz.a(this.a.a.eY);
                akkp akkpVar10 = this.a.a;
                return ciky.a(hT, cgwkVar, a5, akkpVar10.jZ, (chrv) akkpVar10.bN.b());
            case 1212:
                return new cikx(this.a.a.cc);
            case 1213:
                return new cikf(this.a.a.cc);
            case 1214:
                return new cijz(this.a.a.cc);
            case 1215:
                akis akisVar4 = this.a;
                fbbf fbbfVar10 = akisVar4.a.vf;
                return new chww(fbbfVar10, akisVar4.da, fbbfVar10, fbbfVar10);
            case 1216:
                akis akisVar5 = this.a;
                akkp akkpVar11 = akisVar5.a;
                fbbf fbbfVar11 = akkpVar11.ka;
                fbbf fbbfVar12 = akkpVar11.fa;
                fbbf fbbfVar13 = akkpVar11.ql;
                fbbf fbbfVar14 = akisVar5.p;
                fbbf fbbfVar15 = akkpVar11.jZ;
                fbbf a6 = fbbg.a(akkpVar11.uV);
                akis akisVar6 = this.a;
                akkp akkpVar12 = akisVar6.a;
                return new chwx(fbbfVar11, akisVar5.cz, akisVar5.aU, fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, a6, akkpVar12.f, akkpVar12.vb, akkpVar12.vd, akkpVar12.ve, akkpVar12.aX, akkpVar12.aY, akisVar6.da, akisVar6.ly);
            case 1217:
                akis akisVar7 = this.a;
                akkp akkpVar13 = akisVar7.a;
                return new chyw(akisVar7.t, akkpVar13.el, akkpVar13.cp, akisVar7.cz);
            case 1218:
                bzgd bzgdVar3 = (bzgd) this.a.a.fa.b();
                akis akisVar8 = this.a;
                fbbf fbbfVar16 = akisVar8.cz;
                akkp akkpVar14 = akisVar8.a;
                return new bzaw(bzgdVar3, akkpVar14.cq, akkpVar14.vc, (cqoh) fbbfVar16.b(), (errl) this.a.t.b());
            case 1219:
                return new chny(this.a.a.aT);
            case 1220:
                return new chyp(this.a.a.jZ);
            case 1221:
                errl errlVar3 = (errl) this.a.p.b();
                errl errlVar4 = (errl) this.a.t.b();
                akkp akkpVar15 = this.a.a;
                return new chqs(errlVar3, errlVar4, akkpVar15.t, (aqvh) akkpVar15.gN.b(), (aqkp) this.a.a.mu.b(), (amhs) this.a.a.mT.b(), this.a.a.bK());
            case 1222:
                errl errlVar5 = (errl) this.a.p.b();
                errl errlVar6 = (errl) this.a.t.b();
                akis akisVar9 = this.a;
                akkp akkpVar16 = akisVar9.a;
                return new chrr(errlVar5, errlVar6, akkpVar16.vm, akkpVar16.Z, akkpVar16.cx, akisVar9.cI, akkpVar16.gN);
            case 1223:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar10 = this.a;
                akkp akkpVar17 = akisVar10.a;
                return new cakn(ffskVar, akkpVar17.vj, akkpVar17.vl, (ejvb) akisVar10.dy.b(), this.a.a.vi);
            case 1224:
                akis akisVar11 = this.a;
                akkp akkpVar18 = akisVar11.a;
                return new cakx(akkpVar18.p, akisVar11.cP, akkpVar18.dn, akkpVar18.qs, akkpVar18.G, akkpVar18.cx, akisVar11.cz, akkpVar18.vi);
            case 1225:
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akkp akkpVar19 = this.a.a;
                return new cakk(ffhdVar, akkpVar19.qu, akkpVar19.qs, akkpVar19.G);
            case 1226:
                akis akisVar12 = this.a;
                akkp akkpVar20 = akisVar12.a;
                return new cakd(akkpVar20.q, akisVar12.co, akisVar12.cn, akkpVar20.mu, akkpVar20.mx, akkpVar20.vi, akkpVar20.cx, akisVar12.cz, akkpVar20.vk);
            case 1227:
                return new caky(this.a.a.C);
            case 1228:
                final fbbf fbbfVar17 = this.a.a.s;
                return new aswi() { // from class: asfd
                    @Override // defpackage.aswi
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_sequential_executor_for_ditto_message_update_pushes");
                    }
                };
            case 1229:
                final fbbf fbbfVar18 = this.a.a.s;
                return new aswh() { // from class: asez
                    @Override // defpackage.aswh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_ditto_throttler_for_dark_launch");
                    }
                };
            case 1230:
                return new aswg() { // from class: asfb
                };
            case 1231:
                akkp akkpVar21 = this.a.a;
                return new bzlm(akkpVar21.al, akkpVar21.vt, akkpVar21.vv, akkpVar21.vx, (azei) akkpVar21.vA.b(), this.a.cz);
            case 1232:
                akkp akkpVar22 = this.a.a;
                return bzlf.a(akkpVar22.dW(), akkpVar22.vs);
            case 1233:
                return Double.valueOf(fczs.a(this.a.a.nO()));
            case 1234:
                return Long.valueOf(fczr.a(this.a.a.nO()));
            case 1235:
                akkp akkpVar23 = this.a.a;
                return bzle.a(akkpVar23.dW(), akkpVar23.vu);
            case 1236:
                return Long.valueOf(fczo.a(this.a.a.nO()));
            case 1237:
                akkp akkpVar24 = this.a.a;
                return bzlg.a(akkpVar24.dW(), akkpVar24.vw);
            case 1238:
                return Long.valueOf(fczt.a(this.a.a.nO()));
            case 1239:
                akkp akkpVar25 = this.a.a;
                return new azei(akkpVar25.vz, (ffsk) akkpVar25.p.b());
            case 1240:
                return new enpx(this.a.a.eX());
            case 1241:
                final fbbf fbbfVar19 = this.a.a.s;
                return new atmu() { // from class: atmo
                    @Override // defpackage.atmu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.prevent_web_push_tickle_for_conversation_update");
                    }
                };
            case 1242:
                return new bzpi(this.a.a.cc);
            case 1243:
                akis akisVar13 = this.a;
                akkp akkpVar26 = akisVar13.a;
                return new bbav(akkpVar26.vF, akkpVar26.uR, akkpVar26.dw, akisVar13.t, akisVar13.lw, akkpVar26.au);
            case 1244:
                akis akisVar14 = this.a;
                akkp akkpVar27 = akisVar14.a;
                fbbf fbbfVar20 = akisVar14.ip;
                fbbf fbbfVar21 = akkpVar27.ka;
                errl errlVar7 = (errl) akisVar14.t.b();
                akkp akkpVar28 = this.a.a;
                return new bznu(fbbfVar20, fbbfVar21, errlVar7, akkpVar28.ay, akkpVar28.dw);
            case 1245:
                akis akisVar15 = this.a;
                akkp akkpVar29 = akisVar15.a;
                fbbf fbbfVar22 = akkpVar29.ab;
                fbbf fbbfVar23 = akkpVar29.ad;
                fbbf fbbfVar24 = akkpVar29.rC;
                fbbf fbbfVar25 = akisVar15.lz;
                fbbf fbbfVar26 = akkpVar29.Z;
                fbbf a7 = fbbg.a(akkpVar29.ap);
                akkp akkpVar30 = this.a.a;
                return new bcsf(fbbfVar22, fbbfVar23, fbbfVar24, akisVar15.cI, fbbfVar25, fbbfVar26, a7, akkpVar30.vH, akkpVar30.vI, akkpVar30.vJ, akkpVar30.rz, fbbg.a(akkpVar30.v), this.a.a.rD);
            case 1246:
                return Boolean.valueOf(arnf.a((ersq) this.a.a.s.b()));
            case 1247:
                return Boolean.valueOf(arwg.a((ersq) this.a.a.s.b()));
            case 1248:
                return new cbwg(this.a.a.sl);
            case 1249:
                return new bcsy((bigl) this.a.ki.b());
            case 1250:
                return Long.valueOf(fczm.a(this.a.a.nO()));
            case 1251:
                akkp akkpVar31 = this.a.a;
                fbbf fbbfVar27 = akkpVar31.vN;
                fbbf fbbfVar28 = akkpVar31.fa;
                fbbf a8 = fbbg.a(akkpVar31.uV);
                akis akisVar16 = this.a;
                akkp akkpVar32 = akisVar16.a;
                return new bacs(fbbfVar27, fbbfVar28, a8, akkpVar32.jZ, akkpVar32.ql, akkpVar32.vO, akisVar16.t, akisVar16.p, akisVar16.cz, akkpVar32.f, akkpVar32.vg, akisVar16.da);
            case 1252:
                errl errlVar8 = (errl) this.a.t.b();
                cgzv cgzvVar = (cgzv) this.a.a.ka.b();
                Optional optional5 = (Optional) this.a.ip.b();
                akis akisVar17 = this.a;
                return new bzdz(errlVar8, cgzvVar, optional5, akisVar17.a.va, (ctud) akisVar17.cT.b(), (chww) this.a.a.vg.b(), this.a.da);
            case 1253:
                comy comyVar = (comy) this.a.a.aT.b();
                akis akisVar18 = this.a;
                return new chnf(comyVar, akisVar18.ca(), (akzt) akisVar18.a.f.b(), (errl) this.a.t.b());
            case 1254:
                return caqr.a((Context) this.a.q.b(), this.a.a.dO);
            case 1255:
                return new caqn(fbbg.a(this.a.a.vT), this.a.aJ);
            case 1256:
                akkp akkpVar33 = this.a.a;
                return new banb(akkpVar33.jZ, akkpVar33.ql, akkpVar33.vO, akkpVar33.vg, akkpVar33.fa);
            case 1257:
                ctyx ctyxVar2 = (ctyx) this.a.aU.b();
                ctyw ctywVar = (ctyw) this.a.a.fu.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                errl errlVar9 = (errl) this.a.t.b();
                ctbk ctbkVar = (ctbk) this.a.hi.b();
                akis akisVar19 = this.a;
                fbbf fbbfVar29 = akisVar19.aJ;
                return new alzj(ctyxVar2, ctywVar, ctwbVar, ctudVar, errlVar9, ctbkVar, (alzv) akisVar19.fw(), (elbx) fbbfVar29.b(), (alzu) this.a.a.qd());
            case 1258:
                Context context2 = (Context) this.a.q.b();
                akis akisVar20 = this.a;
                ffsk ffskVar2 = (ffsk) akisVar20.a.aq.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                errl errlVar10 = (errl) this.a.p.b();
                akis akisVar21 = this.a;
                fbbf fbbfVar30 = akisVar21.aR;
                akkp akkpVar34 = akisVar21.a;
                comc kc = akkpVar34.kc();
                fbbf fbbfVar31 = akkpVar34.bj;
                fbbf fbbfVar32 = akkpVar34.bo;
                fbbf fbbfVar33 = akkpVar34.gE;
                fbbf fbbfVar34 = akkpVar34.fQ;
                ejvp ejvpVar = (ejvp) fbbfVar30.b();
                akis akisVar22 = this.a;
                akkp akkpVar35 = akisVar22.a;
                fbbf fbbfVar35 = akkpVar35.vV;
                fbbf fbbfVar36 = akkpVar35.cK;
                fbbf fbbfVar37 = akkpVar35.vW;
                fbbf fbbfVar38 = akkpVar35.vY;
                fbbf fbbfVar39 = akkpVar35.gJ;
                fbbf fbbfVar40 = akkpVar35.wb;
                ctbk ctbkVar2 = (ctbk) akisVar22.hi.b();
                akkp akkpVar36 = this.a.a;
                fbbf fbbfVar41 = akkpVar36.c;
                fbbf fbbfVar42 = akkpVar36.el;
                fbbf fbbfVar43 = akkpVar36.wc;
                avcq cM = akkpVar36.cM();
                cvjg cvjgVar = (cvjg) akkpVar36.wf.b();
                akkp akkpVar37 = this.a.a;
                fbbf fbbfVar44 = akkpVar37.wg;
                fbbf fbbfVar45 = akkpVar37.wh;
                fbbf fbbfVar46 = akkpVar37.wa;
                return new cmii(context2, akisVar20.aU, ffskVar2, ffhdVar2, errlVar10, kc, fbbfVar31, fbbfVar32, fbbfVar33, fbbfVar34, ejvpVar, akisVar22.cz, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, fbbfVar40, ctbkVar2, fbbfVar41, fbbfVar42, fbbfVar43, cM, cvjgVar, fbbfVar44, fbbfVar45, fbbfVar46);
            case 1259:
                akis akisVar23 = this.a;
                akkp akkpVar38 = akisVar23.a;
                comc kb = akkpVar38.kb();
                fbbf fbbfVar47 = akkpVar38.C;
                this.a.jd();
                akis akisVar24 = this.a;
                akkp akkpVar39 = akisVar24.a;
                ejvo eu = akisVar24.eu();
                ejvo et = akisVar24.et();
                ejvo es = akisVar24.es();
                fbbf fbbfVar48 = akkpVar39.fu;
                fbbf fbbfVar49 = akkpVar39.bj;
                errl errlVar11 = (errl) akisVar24.p.b();
                return new cmel(kb, fbbfVar47, eu, et, es, fbbfVar48, fbbfVar49, errlVar11);
            case 1260:
                return new cgud((cguo) this.a.a.cK.b());
            case 1261:
                akkp akkpVar40 = this.a.a;
                return new cgyh(akkpVar40.gE, akkpVar40.bC, akkpVar40.hc, akkpVar40.Z, akkpVar40.bj, akkpVar40.c, akkpVar40.bF, akkpVar40.vX);
            case 1262:
                akkp akkpVar41 = this.a.a;
                return new cgyi(akkpVar41.c, akkpVar41.bF);
            case 1263:
                akkp akkpVar42 = this.a.a;
                return new clwq(akkpVar42.bj, akkpVar42.cK, akkpVar42.vZ, akkpVar42.wa);
            case 1264:
                final fbbf fbbfVar50 = this.a.a.s;
                return new atrt() { // from class: atpe
                    @Override // defpackage.atrt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_relaxed_provisioning_rules");
                    }
                };
            case 1265:
                final fbbf fbbfVar51 = this.a.a.s;
                return new atrs() { // from class: atpc
                    @Override // defpackage.atrs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_multi_sim_disabled_provisioning_rule");
                    }
                };
            case 1266:
                final fbbf fbbfVar52 = this.a.a.s;
                return new diwq() { // from class: diuv
                    @Override // defpackage.diwq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.enable_fi_multi_sync_help_article_in_rcs_settings");
                    }
                };
            case 1267:
                Context context3 = (Context) this.a.q.b();
                akkp akkpVar43 = this.a.a;
                return new cvjg(context3, akkpVar43.wd, akkpVar43.we);
            case 1268:
                return new avcm() { // from class: avcb
                };
            case 1269:
                return Boolean.valueOf(fdjf.a(this.a.a.oJ()));
            case 1270:
                final fbbf fbbfVar53 = this.a.a.s;
                return new aund() { // from class: aumb
                    @Override // defpackage.aund
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.filter_disabled_sim_absent_from_rcs_settings");
                    }
                };
            case 1271:
                final fbbf fbbfVar54 = this.a.a.s;
                return new aumz() { // from class: ault
                    @Override // defpackage.aumz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_compute_global_toggle_state_on_sim_removal");
                    }
                };
            case 1272:
                akkp akkpVar44 = this.a.a;
                return new chvw(akkpVar44.vg, akkpVar44.va, akkpVar44.fa, (ffsk) akkpVar44.aq.b());
            case 1273:
                return enhk.m("CMS", (ciap) this.a.a.wm.b(), "GDitto", this.a.a.hM());
            case 1274:
                Context context4 = (Context) this.a.q.b();
                errl errlVar12 = (errl) this.a.t.b();
                babm babmVar = (babm) this.a.a.wl.b();
                babf babfVar = (babf) this.a.a.pN.b();
                akkp akkpVar45 = this.a.a;
                return new ciao(context4, errlVar12, babmVar, babfVar, akkpVar45.ck, akkpVar45.eV, akkpVar45.jY);
            case 1275:
                return new babm((babf) this.a.a.pN.b(), (ejar) this.a.a.au.b());
            case 1276:
                return new chih((albq) this.a.a.di.b(), (akzt) this.a.a.f.b(), (errl) this.a.t.b());
            case 1277:
                akkp akkpVar46 = this.a.a;
                return new azei(akkpVar46.ws, (ffsk) akkpVar46.p.b());
            case 1278:
                return new enpx(this.a.a.dO());
            case 1279:
                return new awss((awsp) this.a.a.wu.b(), (ffsk) this.a.a.p.b());
            case 1280:
                return new awsv((alxl) this.a.a.mx.b(), (aqvh) this.a.a.gN.b(), this.a.a.bg());
            case 1281:
                return new azfw((azfv) this.a.a.kI.b(), (ffsk) this.a.a.p.b());
            case 1282:
                return new akjw(this);
            case 1283:
                akis akisVar25 = this.a;
                akkp akkpVar47 = akisVar25.a;
                return new aper(akkpVar47.wD, akkpVar47.nE, akkpVar47.p, akisVar25.co);
            case 1284:
                akis akisVar26 = this.a;
                akkp akkpVar48 = akisVar26.a;
                return new apfk(akkpVar48.p, akkpVar48.aq, akisVar26.hi, akisVar26.iE, akkpVar48.wC, akisVar26.lB, akisVar26.jC);
            case 1285:
                return Optional.of((ctta) this.a.a.nh.b());
            case 1286:
                return new amoq(this.a.a.wF);
            case 1287:
                akis akisVar27 = this.a;
                akkp akkpVar49 = akisVar27.a;
                return new ampa(akkpVar49.p, akkpVar49.aq, akisVar27.hi, akisVar27.iE);
            case 1288:
                return new akjx(this);
            case 1289:
                return new ckwz(this.a.a.wH);
            case 1290:
                return Long.valueOf(fdda.a(this.a.a.og()));
            case 1291:
                akkp akkpVar50 = this.a.a;
                return avrm.a(akkpVar50.df(), akkpVar50.dj());
            case 1292:
                return new akjy(this);
            case 1293:
                return new awhi((avkj) this.a.a.jf.b(), (cknc) this.a.a.wL.b(), (errl) this.a.p.b());
            case 1294:
                akis akisVar28 = this.a;
                akkp akkpVar51 = akisVar28.a;
                return new cknc(akkpVar51.bi, akisVar28.iq, akisVar28.hd, (ckby) akkpVar51.D.b(), (avla) this.a.lC.b(), (avtu) this.a.lD.b(), this.a.a.br);
            case 1295:
                final fbbf fbbfVar55 = this.a.a.s;
                return new audx() { // from class: audi
                    @Override // defpackage.audx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_conversation_creator");
                    }
                };
            case 1296:
                ffhd ffhdVar3 = (ffhd) this.a.cP.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                amhs amhsVar = (amhs) this.a.a.mT.b();
                akis akisVar29 = this.a;
                akkp akkpVar52 = akisVar29.a;
                fbbf fbbfVar56 = akkpVar52.mu;
                avkj avkjVar = (avkj) akkpVar52.jf.b();
                ayif ayifVar = (ayif) this.a.a.ia.b();
                akis akisVar30 = this.a;
                fbbf fbbfVar57 = akisVar30.cN;
                fbbf fbbfVar58 = akisVar30.a.ky;
                ecrj ecrjVar = (ecrj) fbbfVar57.b();
                akkp akkpVar53 = this.a.a;
                fbbf fbbfVar59 = akkpVar53.kI;
                fbbf fbbfVar60 = akkpVar53.Q;
                fbbf fbbfVar61 = akkpVar53.kv;
                akkpVar53.dJ();
                return new amlt(ffhdVar3, ffskVar3, cqohVar, amhsVar, fbbfVar56, akisVar29.aZ, avkjVar, ayifVar, fbbfVar58, ecrjVar, fbbfVar59, fbbfVar60, fbbfVar61, this.a.a.cr());
            case 1297:
                akis akisVar31 = this.a;
                akkp akkpVar54 = akisVar31.a;
                return new bafp(akisVar31.cz, akkpVar54.wV, akkpVar54.gN, akisVar31.p);
            case 1298:
                errl errlVar13 = (errl) this.a.aK.b();
                errl errlVar14 = (errl) this.a.p.b();
                errl errlVar15 = (errl) this.a.t.b();
                fazb a9 = fbaz.a(this.a.a.pJ);
                akkp akkpVar55 = this.a.a;
                fbbf fbbfVar62 = akkpVar55.ib;
                fbbf fbbfVar63 = akkpVar55.dn;
                ctvb ctvbVar = (ctvb) akkpVar55.u.b();
                bdtd bdtdVar = (bdtd) this.a.a.aO.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                bcvw bcvwVar = (bcvw) this.a.a.gB.b();
                Optional of = Optional.of((cpdd) this.a.a.jo.b());
                avkj avkjVar2 = (avkj) this.a.a.jf.b();
                akkp akkpVar56 = this.a.a;
                fbbf fbbfVar64 = akkpVar56.G;
                aolr aolrVar = (aolr) this.a.a.Z.b();
                ayif ayifVar2 = (ayif) this.a.a.ia.b();
                akis akisVar32 = this.a;
                fbbf fbbfVar65 = akisVar32.cN;
                akkp akkpVar57 = akisVar32.a;
                fbbf fbbfVar66 = akkpVar57.ky;
                fbbf fbbfVar67 = akkpVar57.lY;
                ecrj ecrjVar2 = (ecrj) fbbfVar65.b();
                akkp akkpVar58 = this.a.a;
                return new ammv(errlVar13, errlVar14, errlVar15, a9, fbbfVar62, fbbfVar63, ctvbVar, bdtdVar, cbgfVar, dtuuVar, bcvwVar, of, avkjVar2, fbbfVar64, aolrVar, ayifVar2, fbbfVar66, fbbfVar67, ecrjVar2, akkpVar58.Q, (asmj) akkpVar58.jD.b(), this.a.a.jF);
            case 1299:
                akis akisVar33 = this.a;
                fbbf fbbfVar68 = akisVar33.aK;
                akkp akkpVar59 = akisVar33.a;
                fbbf fbbfVar69 = akkpVar59.dp;
                fbbf fbbfVar70 = akkpVar59.br;
                fbbf fbbfVar71 = akkpVar59.D;
                fbbf fbbfVar72 = akkpVar59.c;
                fbbf fbbfVar73 = akkpVar59.f;
                fbbf fbbfVar74 = akkpVar59.wQ;
                fbbf fbbfVar75 = akkpVar59.wR;
                errl errlVar16 = (errl) fbbfVar68.b();
                akkp akkpVar60 = this.a.a;
                return new chco(fbbfVar69, fbbfVar70, fbbfVar71, fbbfVar72, fbbfVar73, fbbfVar74, fbbfVar75, errlVar16, akkpVar60.wS, akkpVar60.wT);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        switch (i) {
            case 1300:
                akkp akkpVar = this.a.a;
                return aoge.a(akkpVar.O, akkpVar.V, akkpVar.P, akkpVar.X, (aojk) akkpVar.E.b());
            case 1301:
                final fbbf fbbfVar = this.a.a.s;
                return new atqt() { // from class: atnf
                    @Override // defpackage.atqt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_disable_default_msisdn_caching");
                    }
                };
            case 1302:
                return Boolean.valueOf(fdex.a(this.a.a.oo()));
            case 1303:
                return Long.valueOf(fdey.a(this.a.a.oo()));
            case 1304:
                return new atrc() { // from class: atnx
                };
            case 1305:
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar2 = akkpVar2.ib;
                fbbf fbbfVar3 = akkpVar2.dn;
                fbbf fbbfVar4 = akkpVar2.ip;
                fbbf fbbfVar5 = akkpVar2.wX;
                fbbf fbbfVar6 = akkpVar2.id;
                fbbf fbbfVar7 = akkpVar2.Z;
                fbbf fbbfVar8 = akkpVar2.mu;
                fbbf fbbfVar9 = akkpVar2.xb;
                dtuu dtuuVar = (dtuu) akkpVar2.ay.b();
                akis akisVar = this.a;
                fbbf fbbfVar10 = akisVar.co;
                akkp akkpVar3 = akisVar.a;
                return new crsa(fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, dtuuVar, akkpVar3.xc, akkpVar3.wZ, akkpVar3.im, (ffhd) fbbfVar10.b(), (ffsk) this.a.a.q.b());
            case 1306:
                return Optional.of(this.a.a.lr());
            case 1307:
                akkp akkpVar4 = this.a.a;
                fbbf fbbfVar11 = akkpVar4.tj;
                fbbf fbbfVar12 = akkpVar4.wY;
                crsl crslVar = (crsl) akkpVar4.wZ.b();
                akis akisVar2 = this.a;
                akkp akkpVar5 = akisVar2.a;
                return new cuqg(fbbfVar11, fbbfVar12, crslVar, akkpVar5.dB, akkpVar5.dn, akkpVar5.C, (errl) akisVar2.p.b(), (errl) this.a.t.b());
            case 1308:
                akis akisVar3 = this.a;
                return new cupz(akisVar3.a.ts, (errl) akisVar3.p.b());
            case 1309:
                akkp akkpVar6 = this.a.a;
                return new crsl(akkpVar6.ib, akkpVar6.dn, akkpVar6.dB, akkpVar6.gN, akkpVar6.Z, (ffsk) akkpVar6.q.b());
            case 1310:
                return new crsg(this.a.a.dn);
            case 1311:
                return new cgaz((ffsk) this.a.a.aq.b(), this.a.a.cf);
            case 1312:
                return Optional.of((cbvt) this.a.a.pJ.b());
            case 1313:
                errl errlVar = (errl) this.a.aK.b();
                errl errlVar2 = (errl) this.a.p.b();
                akkp akkpVar7 = this.a.a;
                return new amui(errlVar, errlVar2, akkpVar7.dn, akkpVar7.dA, akkpVar7.iF, akkpVar7.xg);
            case 1314:
                return new amub(this.a.a.az);
            case 1315:
                akis akisVar4 = this.a;
                akkp akkpVar8 = akisVar4.a;
                return new amlj(akkpVar8.aq, akkpVar8.xk, akisVar4.iE, akkpVar8.xl);
            case 1316:
                Context context = (Context) this.a.q.b();
                bcym bcymVar = (bcym) this.a.a.xj.b();
                akis akisVar5 = this.a;
                return new amof(context, bcymVar, akisVar5.cI, akisVar5.lz);
            case 1317:
                akkp akkpVar9 = this.a.a;
                fbbf fbbfVar13 = akkpVar9.xi;
                return new bcym(fbbfVar13);
            case 1318:
                return new csrh((Context) this.a.q.b(), this.a.cI());
            case 1319:
                akkp akkpVar10 = this.a.a;
                return new amon(akkpVar10.xk, akkpVar10.pD);
            case 1320:
                return new ckqj(this.a.a.cc);
            case 1321:
                return Optional.of(this.a.a.aD());
            case 1322:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akkp akkpVar11 = this.a.a;
                fbbf fbbfVar14 = akkpVar11.xp;
                avkj avkjVar = (avkj) akkpVar11.jf.b();
                cktv cktvVar = (cktv) this.a.a.xq.b();
                akkp akkpVar12 = this.a.a;
                amvj aH = akkpVar12.aH();
                cktw cktwVar = (cktw) akkpVar12.xv.b();
                akis akisVar6 = this.a;
                fbbf fbbfVar15 = akisVar6.cz;
                alja ap = akisVar6.a.ap();
                cqoh cqohVar = (cqoh) fbbfVar15.b();
                akkp akkpVar13 = this.a.a;
                return new amut(ffskVar, ffskVar2, fbbfVar14, avkjVar, cktvVar, aH, cktwVar, ap, cqohVar, akkpVar13.xr, akkpVar13.C);
            case 1323:
                return Long.valueOf(fdct.a(this.a.a.og()));
            case 1324:
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akis akisVar7 = this.a;
                return new cktv(dtuuVar2, ffhdVar, ffskVar3, akisVar7.a.dn, (cqoh) akisVar7.cz.b());
            case 1325:
                return Long.valueOf(fdcv.a(this.a.a.og()));
            case 1326:
                return Long.valueOf(fdcx.a(this.a.a.og()));
            case 1327:
                return Long.valueOf(fdcz.a(this.a.a.og()));
            case 1328:
                return Long.valueOf(fdcw.a(this.a.a.og()));
            case 1329:
                return new cktw((akyb) this.a.a.bi.b(), this.a.a.dE);
            case 1330:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar4 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                akis akisVar8 = this.a;
                akkp akkpVar14 = akisVar8.a;
                return new amzm(context2, ffskVar4, ffskVar5, akisVar8.cN, akkpVar14.ia, akkpVar14.w, akkpVar14.hS, akkpVar14.hR, akkpVar14.xx, akkpVar14.xy, akkpVar14.pB);
            case 1331:
                final fbbf fbbfVar16 = this.a.a.s;
                return new auvs() { // from class: auve
                    @Override // defpackage.auvs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_invalid_rcs_group_filtering");
                    }
                };
            case 1332:
                final fbbf fbbfVar17 = this.a.a.s;
                return new auvu() { // from class: auvi
                    @Override // defpackage.auvu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_parent_unapproved_conversation_filtering");
                    }
                };
            case 1333:
                final fbbf fbbfVar18 = this.a.a.s;
                return new atrz() { // from class: atpp
                    @Override // defpackage.atrz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.pass_self_identity_via_leave_rcs_group_params_proto");
                    }
                };
            case 1334:
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar2 = (ffhd) this.a.co.b();
                akis akisVar9 = this.a;
                akkp akkpVar15 = akisVar9.a;
                return new amih(ffskVar6, ffhdVar2, akisVar9.cz, akkpVar15.jh, (ckqj) akkpVar15.xn.b());
            case 1335:
                final fbbf fbbfVar19 = this.a.a.s;
                return new auac() { // from class: atzj
                    @Override // defpackage.auac
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_unified_group_profile_update_sender");
                    }
                };
            case 1336:
                return new amtl((ffsk) this.a.a.p.b(), (awhc) this.a.a.xD.b(), (cknc) this.a.a.wL.b(), (avkf) this.a.a.nJ.b(), this.a.a.dJ());
            case 1337:
                akkp akkpVar16 = this.a.a;
                return new awhc(akkpVar16.e(), (ffsk) akkpVar16.p.b(), (avkj) this.a.a.jf.b());
            case 1338:
                akis akisVar10 = this.a;
                fbbf fbbfVar20 = akisVar10.cP;
                akkp akkpVar17 = akisVar10.a;
                return new amnr(akkpVar17.kJ, akkpVar17.ia, akkpVar17.C, akkpVar17.kp, akkpVar17.Z, akkpVar17.kQ, (ffhd) fbbfVar20.b(), (ffsk) this.a.a.p.b(), (atlx) this.a.a.kv.b());
            case 1339:
                return Optional.of(this.a.a.lm());
            case 1340:
                ffhd ffhdVar3 = (ffhd) this.a.cn.b();
                akis akisVar11 = this.a;
                akkp akkpVar18 = akisVar11.a;
                fbbf fbbfVar21 = akkpVar18.yP;
                fbbf fbbfVar22 = akkpVar18.nK;
                cslr cslrVar = (cslr) akisVar11.iq.b();
                akkp akkpVar19 = this.a.a;
                return new cuev(ffhdVar3, fbbfVar21, fbbfVar22, cslrVar, akkpVar19.G, akkpVar19.kP, akkpVar19.yQ, akkpVar19.yt, akkpVar19.cI(), akkpVar19.mr());
            case 1341:
                awtm awtmVar = (awtm) this.a.iz.b();
                akkp akkpVar20 = this.a.a;
                return new cjok(awtmVar, akkpVar20.ir(), (azei) akkpVar20.ys.b(), (ffsk) this.a.a.p.b(), (autg) this.a.a.yt.b());
            case 1342:
                this.a.a.se();
                akkp akkpVar21 = this.a.a;
                return cjmq.a(akkpVar21.iz(), akkpVar21.iB(), akkpVar21.ix(), akkpVar21.iw(), (aurd) akkpVar21.yp.b());
            case 1343:
                return new cozu((eikl) this.a.jD.b(), (avtx) this.a.jE.b(), (augx) this.a.a.kR.b());
            case 1344:
                final fbbf fbbfVar23 = this.a.a.s;
                return new auth() { // from class: ausr
                    @Override // defpackage.auth
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_destination_token_for_imdn_pipeline");
                    }
                };
            case 1345:
                akkp akkpVar22 = this.a.a;
                return new avkr(akkpVar22.kJ, akkpVar22.kI, akkpVar22.kQ);
            case 1346:
                akkp akkpVar23 = this.a.a;
                return new cfme(akkpVar23.ay, (cbgf) akkpVar23.dA.b());
            case 1347:
                return caqd.a(this.a.a.fi());
            case 1348:
                akis akisVar12 = this.a;
                fbbf fbbfVar24 = akisVar12.cP;
                akkp akkpVar24 = akisVar12.a;
                return new cafe(akkpVar24.fv(), akkpVar24.dB, akkpVar24.sU, (ffhd) fbbfVar24.b(), (ffsk) this.a.a.aq.b(), this.a.a.al);
            case 1349:
                return new cakz(this.a.a.f);
            case 1350:
                return new caij(this.a.a.cc);
            case 1351:
                return new cfml((asqi) this.a.a.mV.b(), this.a.a.qU());
            case 1352:
                akis akisVar13 = this.a;
                akkp akkpVar25 = akisVar13.a;
                return new cbej(akkpVar25.dA, akkpVar25.ay, akisVar13.cI);
            case 1353:
                cvlf cvlfVar = (cvlf) this.a.a.hG.b();
                altk altkVar = (altk) this.a.a.fP.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akkp akkpVar26 = this.a.a;
                fbbf fbbfVar25 = akkpVar26.fr;
                fbbf fbbfVar26 = akkpVar26.iP;
                fbbf fbbfVar27 = akkpVar26.dB;
                fbbf fbbfVar28 = akkpVar26.ib;
                fbbf fbbfVar29 = akkpVar26.xO;
                akzt akztVar = (akzt) akkpVar26.f.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                csrv csrvVar = (csrv) this.a.a.iK.b();
                Optional optional = (Optional) this.a.a.pg.b();
                awtm awtmVar2 = (awtm) this.a.iz.b();
                akis akisVar14 = this.a;
                fbbf fbbfVar30 = akisVar14.aK;
                akkp akkpVar27 = akisVar14.a;
                fbbf fbbfVar31 = akkpVar27.xP;
                fbbf fbbfVar32 = akkpVar27.dn;
                fbbf fbbfVar33 = akkpVar27.qq;
                fbbf fbbfVar34 = akkpVar27.yf;
                fbbf fbbfVar35 = akkpVar27.dA;
                fbbf fbbfVar36 = akkpVar27.G;
                fbbf fbbfVar37 = akkpVar27.gp;
                fbbf fbbfVar38 = akkpVar27.al;
                fbbf fbbfVar39 = akkpVar27.yg;
                errl errlVar3 = (errl) fbbfVar30.b();
                errl errlVar4 = (errl) this.a.p.b();
                akkp akkpVar28 = this.a.a;
                fbbf fbbfVar40 = akkpVar28.sl;
                azei azeiVar = (azei) akkpVar28.sm.b();
                akkp akkpVar29 = this.a.a;
                return new cldf(cvlfVar, altkVar, cqohVar2, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, akztVar, dtuuVar3, csrvVar, optional, awtmVar2, fbbfVar31, fbbfVar32, akisVar14.cI, fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, errlVar3, errlVar4, fbbfVar40, azeiVar, akkpVar29.hK, akkpVar29.yk, akkpVar29.sR);
            case 1354:
                akis akisVar15 = this.a;
                return new bbbr(akisVar15.a.az, (cqoh) akisVar15.cz.b());
            case 1355:
                akkp akkpVar30 = this.a.a;
                return new bdob(akkpVar30.yb, akkpVar30.ye);
            case 1356:
                bdoa bdoaVar = (bdoa) this.a.a.uj.b();
                akkp akkpVar31 = this.a.a;
                return enip.s(bdoaVar, akkpVar31.oZ(), (bdoa) akkpVar31.xQ.b());
            case 1357:
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar32 = this.a.a;
                cgcq ho = akkpVar32.ho();
                cins cinsVar = (cins) akkpVar32.jc.b();
                akis akisVar16 = this.a;
                fbbf fbbfVar41 = akisVar16.aK;
                akkp akkpVar33 = akisVar16.a;
                fbbf fbbfVar42 = akkpVar33.dn;
                fbbf fbbfVar43 = akkpVar33.dB;
                fbbf fbbfVar44 = akkpVar33.dp;
                fbbf fbbfVar45 = akkpVar33.xW;
                fbbf fbbfVar46 = akisVar16.lH;
                fbbf fbbfVar47 = akkpVar33.hI;
                fbbf fbbfVar48 = akkpVar33.xX;
                errl errlVar5 = (errl) fbbfVar41.b();
                akkp akkpVar34 = this.a.a;
                return new cmlu(cqohVar3, ho, cinsVar, fbbfVar42, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar47, fbbfVar48, errlVar5, akkpVar34.xY, akkpVar34.jY, akkpVar34.xZ, akkpVar34.ya, (attl) akkpVar34.hJ.b());
            case 1358:
                errl errlVar6 = (errl) this.a.t.b();
                errl errlVar7 = (errl) this.a.p.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                akis akisVar17 = this.a;
                akkp akkpVar35 = akisVar17.a;
                return new cgcg(errlVar6, errlVar7, cbwjVar, cqohVar4, akkpVar35.qR(), akisVar17.ab(), (cgbe) akkpVar35.px());
            case 1359:
                errl errlVar8 = (errl) this.a.t.b();
                errl errlVar9 = (errl) this.a.p.b();
                errl errlVar10 = (errl) this.a.aK.b();
                akkp akkpVar36 = this.a.a;
                fbbf fbbfVar49 = akkpVar36.dB;
                cgcq ho2 = akkpVar36.ho();
                fbbf fbbfVar50 = akkpVar36.hI;
                cins cinsVar2 = (cins) akkpVar36.jc.b();
                akkp akkpVar37 = this.a.a;
                return new cmmg(errlVar8, errlVar9, errlVar10, fbbfVar49, ho2, fbbfVar50, cinsVar2, akkpVar37.jY, akkpVar37.xR);
            case 1360:
                return Long.valueOf(fdgh.a(this.a.a.ov()));
            case 1361:
                errl errlVar11 = (errl) this.a.t.b();
                cins cinsVar3 = (cins) this.a.a.jc.b();
                akkp akkpVar38 = this.a.a;
                cgcq ho3 = akkpVar38.ho();
                fbbf fbbfVar51 = akkpVar38.dB;
                cpez cpezVar = (cpez) akkpVar38.xT.b();
                akkp akkpVar39 = this.a.a;
                return new cwjw(errlVar11, cinsVar3, ho3, fbbfVar51, cpezVar, akkpVar39.eI(), akkpVar39.xU);
            case 1362:
                return new cpez((cqoh) this.a.cz.b(), this.a.a.eo);
            case 1363:
                final fbbf fbbfVar52 = this.a.a.s;
                return new ashd() { // from class: arhg
                    @Override // defpackage.ashd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.xms_stuck_in_sending_retry_attempts_tracker");
                    }
                };
            case 1364:
                return Long.valueOf(fdgm.a(this.a.a.ov()));
            case 1365:
                return Long.valueOf(fdgn.a(this.a.a.ov()));
            case 1366:
                return Long.valueOf(fdgi.a(this.a.a.ov()));
            case 1367:
                return Long.valueOf(fdgk.a(this.a.a.ov()));
            case 1368:
                akkp akkpVar40 = this.a.a;
                return enip.r(akkpVar40.oY(), (bdnz) akkpVar40.yd.b());
            case 1369:
                akis akisVar18 = this.a;
                fbbf fbbfVar53 = akisVar18.cz;
                fbbf fbbfVar54 = akisVar18.a.xS;
                cqoh cqohVar5 = (cqoh) fbbfVar53.b();
                akkp akkpVar41 = this.a.a;
                return new cmlm(fbbfVar54, cqohVar5, akkpVar41.dn, akkpVar41.hI, akkpVar41.xQ, akkpVar41.dB, akkpVar41.yc, (attl) akkpVar41.hJ.b());
            case 1370:
                return Long.valueOf(fdgj.a(this.a.a.ov()));
            case 1371:
                return new covh(this.a.a.al);
            case 1372:
                errm errmVar = (errm) this.a.p.b();
                akkp akkpVar42 = this.a.a;
                return new clfy(errmVar, akkpVar42.jc, akkpVar42.yh, akkpVar42.yi, akkpVar42.yj);
            case 1373:
                ejjz ejjzVar = (ejjz) this.a.a.n.b();
                akis akisVar19 = this.a;
                return new ceth(ejjzVar, akisVar19.a.al, (errl) akisVar19.p.b());
            case 1374:
                return Long.valueOf(fcwr.a(this.a.a.nC()));
            case 1375:
                return Long.valueOf(fcwq.a(this.a.a.nC()));
            case 1376:
                return eikx.a((Set) this.a.a.uK.b());
            case 1377:
                final fbbf fbbfVar55 = this.a.a.s;
                return new atsa() { // from class: atpr
                    @Override // defpackage.atsa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.refresh_session_on_failed_encryption");
                    }
                };
            case 1378:
                return new aurd() { // from class: aura
                };
            case 1379:
                akis akisVar20 = this.a;
                return new avle(akisVar20.a.az, (cqoh) akisVar20.cz.b(), (avuh) this.a.hd.b());
            case 1380:
                cjop cjopVar = new cjop();
                akkp akkpVar43 = this.a.a;
                cjmc it = akkpVar43.it();
                cjom iC = akkpVar43.iC();
                cjmg iu = akkpVar43.iu();
                cjmy iv = akkpVar43.iv();
                cjnf iy = akkpVar43.iy();
                cjmv cjmvVar = new cjmv();
                akkp akkpVar44 = this.a.a;
                cjly is = akkpVar44.is();
                akkpVar44.sa();
                this.a.a.sg();
                return cjmp.a(cjopVar, it, iC, iu, iv, iy, cjmvVar, is, (autj) this.a.a.yu.b());
            case 1381:
                return new azei(fbbh.a(), (ffsk) this.a.a.p.b());
            case 1382:
                return new autg() { // from class: ausp
                };
            case 1383:
                return new autj() { // from class: ausv
                };
            case 1384:
                akkp akkpVar45 = this.a.a;
                cjpa iE = akkpVar45.iE();
                cjqe iG = akkpVar45.iG();
                akkpVar45.sf();
                akkp akkpVar46 = this.a.a;
                cjqc iF = akkpVar46.iF();
                cjot iD = akkpVar46.iD();
                akkpVar46.sc();
                return cjqa.a(iE, iG, iF, iD, (asnb) this.a.a.cb.b());
            case 1385:
                Context context3 = (Context) this.a.q.b();
                akkp akkpVar47 = this.a.a;
                fbbf fbbfVar56 = akkpVar47.ib;
                fbbf fbbfVar57 = akkpVar47.dn;
                fbbf fbbfVar58 = akkpVar47.dB;
                fbbf fbbfVar59 = akkpVar47.fs;
                fbbf fbbfVar60 = akkpVar47.sY;
                fbbf fbbfVar61 = akkpVar47.aO;
                fbbf fbbfVar62 = akkpVar47.ds;
                fbbf fbbfVar63 = akkpVar47.tw;
                fbbf fbbfVar64 = akkpVar47.ty;
                fbbf fbbfVar65 = akkpVar47.rg;
                fbbf fbbfVar66 = akkpVar47.nj;
                fbbf fbbfVar67 = akkpVar47.fP;
                fbbf fbbfVar68 = akkpVar47.nE;
                fbbf fbbfVar69 = akkpVar47.pY;
                fbbf fbbfVar70 = akkpVar47.jb;
                fbbf fbbfVar71 = akkpVar47.ej;
                fbbf fbbfVar72 = akkpVar47.ap;
                fbbf fbbfVar73 = akkpVar47.hC;
                fbbf fbbfVar74 = akkpVar47.yx;
                fbbf fbbfVar75 = akkpVar47.ay;
                fbbf fbbfVar76 = akkpVar47.ft;
                fbbf fbbfVar77 = akkpVar47.yz;
                fbbf fbbfVar78 = akkpVar47.dA;
                fbbf fbbfVar79 = akkpVar47.jh;
                fbbf fbbfVar80 = akkpVar47.ue;
                fbbf fbbfVar81 = akkpVar47.er;
                fbbf fbbfVar82 = akkpVar47.iy;
                fbbf fbbfVar83 = akkpVar47.qJ;
                fbbf fbbfVar84 = akkpVar47.fJ;
                fbbf fbbfVar85 = akkpVar47.e;
                Optional optional2 = (Optional) akkpVar47.jp.b();
                akis akisVar21 = this.a;
                fbbf fbbfVar86 = akisVar21.aK;
                akkp akkpVar48 = akisVar21.a;
                fbbf fbbfVar87 = akkpVar48.pg;
                fbbf fbbfVar88 = akkpVar48.ip;
                errl errlVar12 = (errl) fbbfVar86.b();
                akkp akkpVar49 = this.a.a;
                fbbf fbbfVar89 = akkpVar49.ia;
                fazb a = fbaz.a(akkpVar49.yB);
                akis akisVar22 = this.a;
                fbbf fbbfVar90 = akisVar22.cN;
                akkp akkpVar50 = akisVar22.a;
                fbbf fbbfVar91 = akkpVar50.Z;
                fbbf fbbfVar92 = akkpVar50.yC;
                fbbf fbbfVar93 = akkpVar50.uF;
                ecrj ecrjVar = (ecrj) fbbfVar90.b();
                akkp akkpVar51 = this.a.a;
                fbbf fbbfVar94 = akkpVar51.pC;
                fbbf fbbfVar95 = akkpVar51.jG;
                fbbf fbbfVar96 = akkpVar51.kt;
                fbbf fbbfVar97 = akkpVar51.lY;
                Optional of = Optional.of((cyfw) akkpVar51.yD.b());
                akis akisVar23 = this.a;
                akkp akkpVar52 = akisVar23.a;
                fbbf fbbfVar98 = akkpVar52.pQ;
                fbbf fbbfVar99 = akkpVar52.yE;
                fbbf fbbfVar100 = akkpVar52.rr;
                fbbf fbbfVar101 = akisVar23.lS;
                fbbf fbbfVar102 = akisVar23.jT;
                fbbf fbbfVar103 = akkpVar52.ku;
                fbbf fbbfVar104 = akisVar23.lT;
                fbbf fbbfVar105 = akkpVar52.pB;
                fbbf fbbfVar106 = akkpVar52.hw;
                cjdh cjdhVar = (cjdh) akkpVar52.pA.b();
                azei azeiVar2 = (azei) this.a.a.yH.b();
                akkp akkpVar53 = this.a.a;
                fbbf fbbfVar107 = akkpVar53.mu;
                asmg asmgVar = (asmg) akkpVar53.yI.b();
                akkp akkpVar54 = this.a.a;
                auif cy = akkpVar54.cy();
                fbbf fbbfVar108 = akkpVar54.yJ;
                fbbf fbbfVar109 = akkpVar54.py;
                asmj asmjVar = (asmj) akkpVar54.jD.b();
                akkp akkpVar55 = this.a.a;
                return new batc(context3, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar59, fbbfVar60, fbbfVar61, fbbfVar62, fbbfVar63, fbbfVar64, fbbfVar65, fbbfVar66, fbbfVar67, fbbfVar68, fbbfVar69, fbbfVar70, fbbfVar71, fbbfVar72, fbbfVar73, fbbfVar74, fbbfVar75, fbbfVar76, fbbfVar77, fbbfVar78, fbbfVar79, fbbfVar80, fbbfVar81, fbbfVar82, fbbfVar83, fbbfVar84, fbbfVar85, optional2, fbbfVar87, fbbfVar88, errlVar12, fbbfVar89, a, fbbfVar91, fbbfVar92, fbbfVar93, ecrjVar, fbbfVar94, fbbfVar95, fbbfVar96, fbbfVar97, of, fbbfVar98, fbbfVar99, fbbfVar100, fbbfVar101, fbbfVar102, fbbfVar103, fbbfVar104, fbbfVar105, fbbfVar106, cjdhVar, azeiVar2, fbbfVar107, asmgVar, cy, fbbfVar108, fbbfVar109, asmjVar, akkpVar55.jF, akkpVar55.yK);
            case 1386:
                cfuu cfuuVar = (cfuu) this.a.aX.b();
                akis akisVar24 = this.a;
                return new cnjp(cfuuVar, akisVar24.a.rC(), (errl) akisVar24.t.b(), (errl) this.a.aK.b());
            case 1387:
                final fbbf fbbfVar110 = this.a.a.s;
                return new atre() { // from class: atob
                    @Override // defpackage.atre
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_rcs_msisdn_accessor_from_tachyon_otp");
                    }
                };
            case 1388:
                akis akisVar25 = this.a;
                akkp akkpVar56 = akisVar25.a;
                return new batu(akisVar25.q, akkpVar56.sY, akkpVar56.yy, akkpVar56.yz, akkpVar56.dn, akkpVar56.er);
            case 1389:
                akis akisVar26 = this.a;
                return new bcpz(akisVar26.a.iK, akisVar26.cT);
            case 1390:
                return new bdnv(fbaz.a(this.a.a.yA));
            case 1391:
                bdnx bdnxVar = (bdnx) this.a.a.uj.b();
                akkp akkpVar57 = this.a.a;
                return enip.u(bdnxVar, akkpVar57.jy(), akkpVar57.hs(), akkpVar57.lt(), akkpVar57.jC());
            case 1392:
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                akkp akkpVar58 = this.a.a;
                return new clvi(cqohVar6, akkpVar58.dB, akkpVar58.dn, akkpVar58.dp);
            case 1393:
                return new cyfw((errl) this.a.p.b(), (errl) this.a.t.b(), (ctjh) this.a.a.nE.b());
            case 1394:
                final fbbf fbbfVar111 = this.a.a.s;
                return new ashb() { // from class: arhc
                    @Override // defpackage.ashb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.measuring_performance_difference_for_sms_receiving");
                    }
                };
            case 1395:
                akkp akkpVar59 = this.a.a;
                return new azei(akkpVar59.yG, (ffsk) akkpVar59.p.b());
            case 1396:
                return new enpx(this.a.a.jn());
            case 1397:
                return Long.valueOf(fdgl.a(this.a.a.ov()));
            case 1398:
                final fbbf fbbfVar112 = this.a.a.s;
                return new asmg() { // from class: arpv
                    @Override // defpackage.asmg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_latch_on_incoming_xms");
                    }
                };
            case 1399:
                return new azow((azoq) this.a.a.kP.b(), (ffsk) this.a.a.p.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        int i = this.b;
        switch (i) {
            case 1400:
                final fbbf fbbfVar = this.a.a.s;
                return new aurc() { // from class: auqy
                    @Override // defpackage.aurc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_is_new_conversation_check_for_participant_update");
                    }
                };
            case 1401:
                return Long.valueOf(fdff.a(this.a.a.oq()));
            case 1402:
                return fdfe.a(this.a.a.oq());
            case 1403:
                final fbbf fbbfVar2 = this.a.a.s;
                return new autl() { // from class: ausz
                    @Override // defpackage.autl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_string_for_message_token");
                    }
                };
            case 1404:
            case 1407:
                return Optional.of((cbvt) this.a.a.pJ.b());
            case 1405:
                return new enpx(this.a.a.fb());
            case 1406:
                return new bzrd(this.a.a.cc);
            case 1408:
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new aple(akkpVar.aq, akkpVar.mT, akisVar.cz, akisVar.hi);
            case 1409:
                return new amsd(this.a.a.p);
            case 1410:
                return new apli(this.a.a.zc);
            case 1411:
                akkp akkpVar2 = this.a.a;
                return new aobd(akkpVar2.za, akkpVar2.zb);
            case 1412:
                akkp akkpVar3 = this.a.a;
                return new aoaz(akkpVar3.ns, akkpVar3.yZ);
            case 1413:
                return new aobe((cpfi) this.a.a.nn.b(), this.a.a.mL());
            case 1414:
                akkp akkpVar4 = this.a.a;
                return new aobb(akkpVar4.nw, akkpVar4.yZ);
            case 1415:
                akis akisVar2 = this.a;
                return new cnsb(akisVar2.a.jQ(), (ffhd) akisVar2.co.b(), (ffsk) this.a.a.q.b());
            case 1416:
                final fbbf fbbfVar3 = this.a.a.s;
                return new asll() { // from class: arot
                    @Override // defpackage.asll
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.disable_conversation_on_ending_emergency");
                    }
                };
            case 1417:
                akis akisVar3 = this.a;
                akkp akkpVar5 = akisVar3.a;
                return new amyj(akkpVar5.p, akkpVar5.aq, akisVar3.hi, akisVar3.iE, akkpVar5.zg);
            case 1418:
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                akis akisVar4 = this.a;
                dtuu dtuuVar = (dtuu) akisVar4.a.ay.b();
                akkp akkpVar6 = this.a.a;
                return new avjw(ejvbVar, akisVar4.cz, dtuuVar, akkpVar6.rq, akkpVar6.vL, akkpVar6.eT, akkpVar6.mu, akkpVar6.ld, (atky) akkpVar6.rs.b(), (ffsk) this.a.a.q.b());
            case 1419:
                akis akisVar5 = this.a;
                akkp akkpVar7 = akisVar5.a;
                return new apxj(akkpVar7.q, akkpVar7.aq, akkpVar7.tD, akisVar5.iL);
            case 1420:
                akkp akkpVar8 = this.a.a;
                return new amxw(akkpVar8.q, akkpVar8.zk);
            case 1421:
                akkp akkpVar9 = this.a.a;
                return new ampf(akkpVar9.zj, akkpVar9.mx);
            case 1422:
                final fbbf fbbfVar4 = this.a.a.s;
                return new aujh() { // from class: auiz
                    @Override // defpackage.aujh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.inject_conversation_repository_in_self_identity_selector");
                    }
                };
            case 1423:
                return new apxn(this.a.a.zm);
            case 1424:
                return new anwt(this.a.a.nz);
            case 1425:
                return new amvy(this.a.a.p);
            case 1426:
                akkp akkpVar10 = this.a.a;
                return new amvu(akkpVar10.q, akkpVar10.zk);
            case 1427:
                return new cidg((aqvh) this.a.a.gN.b(), (ffsk) this.a.a.q.b(), this.a.a.zq);
            case 1428:
                final fbbf fbbfVar5 = this.a.a.s;
                return new asqz() { // from class: arxr
                    @Override // defpackage.asqz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_propagated_identity_in_ditto_start_chat");
                    }
                };
            case 1429:
                akkp akkpVar11 = this.a.a;
                return new bbag(akkpVar11.dn, akkpVar11.pJ, akkpVar11.dA);
            case 1430:
                return new caqz(this.a.a.dA);
            case 1431:
                akkp akkpVar12 = this.a.a;
                fbbf fbbfVar6 = akkpVar12.dQ;
                cgzv cgzvVar = (cgzv) akkpVar12.ka.b();
                chqc chqcVar = (chqc) this.a.a.vh.b();
                akis akisVar6 = this.a;
                fbbf fbbfVar7 = akisVar6.a.fr;
                errl errlVar = (errl) akisVar6.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                akkp akkpVar13 = this.a.a;
                return new cieq(fbbfVar6, cgzvVar, chqcVar, fbbfVar7, errlVar, errlVar2, akkpVar13.vp, akkpVar13.vq, akkpVar13.vB, akkpVar13.vn);
            case 1432:
                cgzv cgzvVar2 = (cgzv) this.a.a.ka.b();
                bbgi bbgiVar = (bbgi) this.a.a.vG.b();
                akkp akkpVar14 = this.a.a;
                fbbf fbbfVar8 = akkpVar14.vE;
                bcsf bcsfVar = (bcsf) akkpVar14.vK.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                bcsq bcsqVar = (bcsq) this.a.a.rq.b();
                akis akisVar7 = this.a;
                akkp akkpVar15 = akisVar7.a;
                fbbf fbbfVar9 = akkpVar15.dw;
                fbbf fbbfVar10 = akkpVar15.au;
                Optional optional = (Optional) akisVar7.lw.b();
                akis akisVar8 = this.a;
                return new ciey(cgzvVar2, bbgiVar, fbbfVar8, bcsfVar, akztVar, bcsqVar, fbbfVar9, fbbfVar10, optional, akisVar8.a.zx, (errl) akisVar8.p.b());
            case 1433:
                akkp akkpVar16 = this.a.a;
                return new cgxd(akkpVar16.ia, akkpVar16.zw, (ffsk) akkpVar16.q.b(), this.a.a.bB());
            case 1434:
                return new ayvt(this.a.a.ky);
            case 1435:
                Context context = (Context) this.a.q.b();
                bbfb bbfbVar = (bbfb) this.a.a.nT.b();
                akis akisVar9 = this.a;
                akkp akkpVar17 = akisVar9.a;
                return new cifx(context, bbfbVar, akkpVar17.fr, akkpVar17.iP, (errl) akisVar9.t.b(), (errl) this.a.p.b(), (cgzv) this.a.a.ka.b(), (akzt) this.a.a.f.b(), (cqoh) this.a.cz.b(), (bcvw) this.a.a.gB.b(), (bcwz) this.a.a.ad.b(), (byzp) this.a.a.iy.b(), (ctvb) this.a.a.u.b(), (albq) this.a.a.di.b(), (aolr) this.a.a.Z.b(), (chdj) this.a.a.uR.b(), (bdtd) this.a.a.aO.b(), (Optional) this.a.lw.b(), this.a.a.zz);
            case 1436:
                return new csta((ctwb) this.a.a.c.b());
            case 1437:
                return new cifz((ctyx) this.a.aU.b(), (cgzv) this.a.a.ka.b(), (alzk) this.a.a.wj.b(), this.a.a.br);
            case 1438:
                ckqj ckqjVar = (ckqj) this.a.a.xn.b();
                errl errlVar3 = (errl) this.a.p.b();
                akkp akkpVar18 = this.a.a;
                return new cids(ckqjVar, errlVar3, akkpVar18.zz, akkpVar18.xA, akkpVar18.zC);
            case 1439:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akkp akkpVar19 = this.a.a;
                return new cida(ffskVar, ffhdVar, akkpVar19.xn, akkpVar19.zz, akkpVar19.gQ);
            case 1440:
                aolr aolrVar = (aolr) this.a.a.Z.b();
                akis akisVar10 = this.a;
                ckza iX = akisVar10.a.iX();
                errl errlVar4 = (errl) akisVar10.p.b();
                akkp akkpVar20 = this.a.a;
                return new cibq(aolrVar, iX, errlVar4, akkpVar20.gQ, akkpVar20.zz);
            case 1441:
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                akkp akkpVar21 = this.a.a;
                fbbf fbbfVar11 = akkpVar21.dn;
                aolr aolrVar2 = (aolr) akkpVar21.Z.b();
                cowz cowzVar = (cowz) this.a.a.nI.b();
                avkm avkmVar = (avkm) this.a.a.nK.b();
                akis akisVar11 = this.a;
                return new cigi(errlVar5, errlVar6, fbbfVar11, aolrVar2, cowzVar, avkmVar, akisVar11.a.G, (cqoh) akisVar11.cz.b(), this.a.a.zz);
            case 1442:
                errl errlVar7 = (errl) this.a.t.b();
                errl errlVar8 = (errl) this.a.p.b();
                chqc chqcVar2 = (chqc) this.a.a.vh.b();
                akkp akkpVar22 = this.a.a;
                return new cidp(errlVar7, errlVar8, chqcVar2, akkpVar22.ka, akkpVar22.vn, akkpVar22.fr, akkpVar22.zx);
            case 1443:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                bzgd bzgdVar = (bzgd) this.a.a.fa.b();
                cibf cibfVar = (cibf) this.a.lU.b();
                Optional of = Optional.of((bzme) this.a.a.zK.b());
                akis akisVar12 = this.a;
                cgvp cgvpVar = (cgvp) akisVar12.lV.b();
                akis akisVar13 = this.a;
                fbbf fbbfVar12 = akisVar13.a.jZ;
                Optional optional2 = (Optional) akisVar13.lw.b();
                cgvn cgvnVar = (cgvn) this.a.lW.b();
                akis akisVar14 = this.a;
                akkp akkpVar23 = akisVar14.a;
                return new cice(context2, ffskVar2, ffskVar3, bzgdVar, cibfVar, of, akisVar12.da, cgvpVar, fbbfVar12, optional2, cgvnVar, akkpVar23.zN, akkpVar23.zO, akkpVar23.zP, akisVar14.lX, akkpVar23.dE);
            case 1444:
                ffsk ffskVar4 = (ffsk) this.a.a.aq.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                akis akisVar15 = this.a;
                fbbf fbbfVar13 = akisVar15.aR;
                akkp akkpVar24 = akisVar15.a;
                fbbf fbbfVar14 = akkpVar24.C;
                fbbf fbbfVar15 = akkpVar24.al;
                fbbf fbbfVar16 = akkpVar24.aT;
                fbbf fbbfVar17 = akisVar15.lV;
                ejvp ejvpVar = (ejvp) fbbfVar13.b();
                akis akisVar16 = this.a;
                akkp akkpVar25 = akisVar16.a;
                fbbf fbbfVar18 = akkpVar25.jZ;
                aslr aslrVar = (aslr) akkpVar25.jX.b();
                akkp akkpVar26 = this.a.a;
                return new bznk(ffskVar4, ffhdVar2, ffskVar5, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, ejvpVar, akisVar16.cz, fbbfVar18, aslrVar, akkpVar26.zH, akkpVar26.zI, akkpVar26.zJ, fbaz.a(akkpVar26.eY));
            case 1445:
                return Long.valueOf(fczv.a(this.a.a.nO()));
            case 1446:
                return Long.valueOf(fczu.a(this.a.a.nO()));
            case 1447:
                return Long.valueOf(fczk.a(this.a.a.nO()));
            case 1448:
                Context context3 = (Context) this.a.q.b();
                Optional of2 = Optional.of((bzme) this.a.a.zK.b());
                Optional of3 = Optional.of((dbvq) this.a.a.zM.b());
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akis akisVar17 = this.a;
                ctyp lj = akisVar17.a.lj();
                cgvp cgvpVar2 = (cgvp) akisVar17.lV.b();
                akis akisVar18 = this.a;
                akkp akkpVar27 = akisVar18.a;
                return new cgvm(context3, of2, of3, cqohVar, lj, cgvpVar2, akisVar18.aN, akkpVar27.jc, akisVar18.lW, akkpVar27.jZ, akkpVar27.zL);
            case 1449:
                ayfg ayfgVar = (ayfg) this.a.a.nW.b();
                akkp akkpVar28 = this.a.a;
                return new dbvq(ayfgVar, akkpVar28.C, akkpVar28.zL);
            case 1450:
                akis akisVar19 = this.a;
                akkp akkpVar29 = akisVar19.a;
                return new bznq(akkpVar29.jZ, akisVar19.lV, akkpVar29.zK, (aslr) akkpVar29.jX.b(), (ffsk) this.a.a.q.b());
            case 1451:
                akkp akkpVar30 = this.a.a;
                return new cgwa(akkpVar30.gE, akkpVar30.gr, akkpVar30.as, (ffsk) akkpVar30.p.b());
            case 1452:
                ffsk ffskVar6 = (ffsk) this.a.a.aq.b();
                akis akisVar20 = this.a;
                return new bzgo(ffskVar6, akisVar20.a.aT, akisVar20.lX);
            case 1453:
                ffsk ffskVar7 = (ffsk) this.a.a.p.b();
                ffsk ffskVar8 = (ffsk) this.a.a.q.b();
                akis akisVar21 = this.a;
                return new cigq(ffskVar7, ffskVar8, akisVar21.da, akisVar21.a.fa);
            case 1454:
                ffsk ffskVar9 = (ffsk) this.a.a.p.b();
                ffsk ffskVar10 = (ffsk) this.a.a.q.b();
                akis akisVar22 = this.a;
                return new cibw(ffskVar9, ffskVar10, akisVar22.da, Optional.of((bzme) akisVar22.a.zK.b()), (cgvp) this.a.lV.b());
            case 1455:
                ffsk ffskVar11 = (ffsk) this.a.a.p.b();
                ffsk ffskVar12 = (ffsk) this.a.a.q.b();
                chqc chqcVar3 = (chqc) this.a.a.vh.b();
                amav amavVar = (amav) this.a.a.zX.b();
                alxl alxlVar = (alxl) this.a.a.mx.b();
                aqkp aqkpVar = (aqkp) this.a.a.mu.b();
                akkp akkpVar31 = this.a.a;
                return new cicd(ffskVar11, ffskVar12, chqcVar3, amavVar, alxlVar, aqkpVar, akkpVar31.dQ, akkpVar31.ka, (aolr) akkpVar31.Z.b());
            case 1456:
                akis akisVar23 = this.a;
                Object fg = akisVar23.fg();
                errl errlVar9 = (errl) akisVar23.t.b();
                akkp akkpVar32 = this.a.a;
                return new aman((amac) fg, errlVar9, (amaq) akkpVar32.pe(), akkpVar32.ax(), akkpVar32.zW);
            case 1457:
                return new axvl((Context) this.a.q.b(), this.a.cT);
            case 1458:
                Context context4 = (Context) this.a.q.b();
                errl errlVar10 = (errl) this.a.p.b();
                errl errlVar11 = (errl) this.a.t.b();
                errl errlVar12 = (errl) this.a.aK.b();
                akis akisVar24 = this.a;
                akkp akkpVar33 = akisVar24.a;
                return new ambg(context4, errlVar10, errlVar11, errlVar12, akkpVar33.Z, akkpVar33.zT, akkpVar33.zU, akkpVar33.zV, akisVar24.cN);
            case 1459:
                return new axvm((Context) this.a.q.b(), this.a.cT);
            case 1460:
                Context context5 = (Context) this.a.q.b();
                akis akisVar25 = this.a;
                return ambq.a(context5, akisVar25.cN, (ffsk) akisVar25.a.q.b(), (aolr) this.a.a.Z.b());
            case 1461:
                return new cifc((ffsk) this.a.a.p.b());
            case 1462:
                return new cidw((ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b(), (Optional) this.a.lw.b(), this.a.a.zO);
            case 1463:
                return new cigm((ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b(), (Optional) this.a.lw.b(), this.a.a.zO);
            case 1464:
                return new cigr((cgzv) this.a.a.ka.b(), this.a.da);
            case 1465:
                akkp akkpVar34 = this.a.a;
                return new cmsj(akkpVar34.Ah, akkpVar34.Ai, akkpVar34.zz, akkpVar34.cF());
            case 1466:
                errl errlVar13 = (errl) this.a.t.b();
                errl errlVar14 = (errl) this.a.p.b();
                akkp akkpVar35 = this.a.a;
                fbbf fbbfVar19 = akkpVar35.Ag;
                fbbf fbbfVar20 = akkpVar35.dp;
                fbbf fbbfVar21 = akkpVar35.br;
                fbbf fbbfVar22 = akkpVar35.cx;
                fbbf fbbfVar23 = akkpVar35.dn;
                bcsf bcsfVar2 = (bcsf) akkpVar35.vK.b();
                akzt akztVar2 = (akzt) this.a.a.f.b();
                cmsl cmslVar = (cmsl) this.a.lY.b();
                akkp akkpVar36 = this.a.a;
                return new cndv(errlVar13, errlVar14, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, bcsfVar2, akztVar2, cmslVar, akkpVar36.Z, akkpVar36.lu, akkpVar36.rq, akkpVar36.vL, akkpVar36.jG(), akkpVar36.aO, (atky) akkpVar36.rs.b());
            case 1467:
                return new cndl(this.a.a.qW());
            case 1468:
                return cneu.a(this.a.a.jI());
            case 1469:
                return cnet.a(this.a.a.jI());
            case 1470:
                cmsl cmslVar2 = (cmsl) this.a.lY.b();
                bbfb bbfbVar2 = (bbfb) this.a.a.nT.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                cndj cndjVar = (cndj) this.a.iw.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                return new cnda(cmslVar2, bbfbVar2, byzpVar, cndjVar, cqohVar2, (awtm) this.a.iz.b(), this.a.a.gQ);
            case 1471:
                akkp akkpVar37 = this.a.a;
                return new cmsc(akkpVar37.jv(), (ffsk) akkpVar37.q.b());
            case 1472:
                return new bcqo(this.a.a.Z);
            case 1473:
                akis akisVar26 = this.a;
                return new chyn(akisVar26.a.fa, akisVar26.t);
            case 1474:
                return new calb((errl) this.a.t.b(), (bzqb) this.a.a.qq.b(), (bbfg) this.a.a.qM.b(), this.a.a.nY);
            case 1475:
                final fbbf fbbfVar24 = this.a.a.s;
                return new atse() { // from class: atpz
                    @Override // defpackage.atse
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_ready_to_send_and_receive_rcs_on_any_sub");
                    }
                };
            case 1476:
                ffsk ffskVar13 = (ffsk) this.a.a.q.b();
                akis akisVar27 = this.a;
                akkp akkpVar38 = akisVar27.a;
                return new cihr(ffskVar13, akisVar27.cz, akkpVar38.zP, akisVar27.lX, akkpVar38.qM(), akkpVar38.rb());
            case 1477:
                akkp akkpVar39 = this.a.a;
                return new ciif(akkpVar39.gN, akkpVar39.mu, akkpVar39.mx, akkpVar39.Z);
            case 1478:
                return new cigw(this.a.a.rc());
            case 1479:
                return fdii.a(this.a.a.oD());
            case 1480:
                akis akisVar28 = this.a;
                return new chyj(akisVar28.a.ql, akisVar28.aU);
            case 1481:
                akkp akkpVar40 = this.a.a;
                return new bzpm(akkpVar40.eY(), akkpVar40.Av, (akzt) akkpVar40.f.b());
            case 1482:
                return new bzod((csjk) this.a.a.el.b());
            case 1483:
                return bzap.a((Context) this.a.q.b(), this.a.a.Ax.b(), (aqvh) this.a.a.gN.b(), (aqkp) this.a.a.mu.b());
            case 1484:
                Context context6 = (Context) this.a.q.b();
                elbx elbxVar = (elbx) this.a.aJ.b();
                fazb a = fbaz.a(this.a.a.uV);
                akkp akkpVar41 = this.a.a;
                bbfk eL = akkpVar41.eL();
                banr eA = akkpVar41.eA();
                bbem bbemVar = (bbem) akkpVar41.vN.b();
                akkp akkpVar42 = this.a.a;
                bzbz eU = akkpVar42.eU();
                cgzv cgzvVar3 = (cgzv) akkpVar42.ka.b();
                akis akisVar29 = this.a;
                return new bzan(context6, elbxVar, a, eL, eA, bbemVar, eU, cgzvVar3, akisVar29.cz, (errl) akisVar29.t.b());
            case 1485:
                final fbbf fbbfVar25 = this.a.a.s;
                return new asvi() { // from class: asdq
                    @Override // defpackage.asvi
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_rebind_to_tachyon_flags");
                    }
                };
            case 1486:
                akis akisVar30 = this.a;
                return new cqfr(akisVar30.a.aT, (cqoh) akisVar30.cz.b(), (ffsk) this.a.a.q.b());
            case 1487:
                return Long.valueOf(fdiw.a(this.a.a.oH()));
            case 1488:
                Context context7 = (Context) this.a.q.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar43 = this.a.a;
                fbbf fbbfVar26 = akkpVar43.AJ;
                csuk csukVar = (csuk) akkpVar43.ha.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                ctap ctapVar = (ctap) this.a.a.co.b();
                bdve bdveVar = (bdve) this.a.a.pI.b();
                csuu csuuVar = (csuu) this.a.iL.b();
                akzt akztVar3 = (akzt) this.a.a.f.b();
                akis akisVar31 = this.a;
                akkp akkpVar44 = akisVar31.a;
                return new cgte(context7, cqohVar3, fbbfVar26, csukVar, cpbsVar, ctapVar, bdveVar, csuuVar, akztVar3, akisVar31.cC(), akkpVar44.ey(), akkpVar44.jE(), (asne) akkpVar44.AK.b());
            case 1489:
                return new cswe((Context) this.a.q.b(), (cqoh) this.a.cz.b(), (dtuu) this.a.a.ay.b());
            case 1490:
                final fbbf fbbfVar27 = this.a.a.s;
                return new asne() { // from class: arrn
                    @Override // defpackage.asne
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_store_image_caption_in_text_part");
                    }
                };
            case 1491:
                Context context8 = (Context) this.a.q.b();
                akkp akkpVar45 = this.a.a;
                return new cowd(context8, akkpVar45.iN, akkpVar45.AM, akkpVar45.Z);
            case 1492:
                akkp akkpVar46 = this.a.a;
                return new cowc(akkpVar46.dn, akkpVar46.Z);
            case 1493:
                Context context9 = (Context) this.a.q.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                fazb a2 = fbaz.a(this.a.a.cC);
                akis akisVar32 = this.a;
                crbc kQ = akisVar32.a.kQ();
                csuu csuuVar2 = (csuu) akisVar32.iL.b();
                akkp akkpVar47 = this.a.a;
                fbbf fbbfVar28 = akkpVar47.oX;
                fbbf fbbfVar29 = akkpVar47.AP;
                return new bzxu(context9, cqohVar4, a2, kQ, csuuVar2, fbbfVar28, fbbfVar29);
            case 1494:
                return new crbe((azbq) this.a.a.AO.b());
            case 1495:
                return new azbq(this.a.a.de());
            case 1496:
                akkp akkpVar48 = this.a.a;
                return new cfsi(akkpVar48.fl(), (asqi) akkpVar48.mV.b());
            case 1497:
                return new axna((aolr) this.a.a.Z.b());
            case 1498:
                akis akisVar33 = this.a;
                return new cncn(akisVar33.a.dF, new cnch(), (Executor) akisVar33.p.b(), this.a.a.jD());
            case 1499:
                Context context10 = (Context) this.a.q.b();
                errl errlVar15 = (errl) this.a.aK.b();
                errl errlVar16 = (errl) this.a.t.b();
                errl errlVar17 = (errl) this.a.p.b();
                cpbw cpbwVar = (cpbw) this.a.a.fw.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                cgtc cgtcVar = (cgtc) this.a.a.dv.b();
                covr covrVar = (covr) this.a.a.iM.b();
                ecnx ecnxVar = (ecnx) this.a.fC.b();
                akkp akkpVar49 = this.a.a;
                return new cvkz(context10, errlVar15, errlVar16, errlVar17, cpbwVar, coxkVar, cgtcVar, covrVar, ecnxVar, akkpVar49.ly(), akkpVar49.lx(), akkpVar49.dB);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        int i = this.b;
        switch (i) {
            case 1500:
                akis akisVar = this.a;
                return new cgst(akisVar.a.I(), (errl) akisVar.p.b());
            case 1501:
                akis akisVar2 = this.a;
                return new aknr(akisVar2.a.ag(), (errl) akisVar2.p.b());
            case 1502:
                return new aolm(this.a.a.N);
            case 1503:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akkp akkpVar = this.a.a;
                return new cnru(ffskVar, ffhdVar, akkpVar.bQ, akkpVar.dB);
            case 1504:
                Context context = (Context) this.a.q.b();
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar = akkpVar2.fr;
                fbbf fbbfVar2 = akkpVar2.rc;
                fbbf fbbfVar3 = akkpVar2.dn;
                fbbf fbbfVar4 = akkpVar2.iP;
                fbbf fbbfVar5 = akkpVar2.dR;
                fbbf fbbfVar6 = akkpVar2.dw;
                fbbf fbbfVar7 = akkpVar2.dB;
                fbbf fbbfVar8 = akkpVar2.fs;
                fbbf fbbfVar9 = akkpVar2.ki;
                fbbf fbbfVar10 = akkpVar2.AZ;
                fbbf fbbfVar11 = akkpVar2.AH;
                bdtd bdtdVar = (bdtd) akkpVar2.aO.b();
                bcvw bcvwVar = (bcvw) this.a.a.gB.b();
                cpbw cpbwVar = (cpbw) this.a.a.fw.b();
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar12 = akkpVar3.ds;
                bdxd bdxdVar = (bdxd) akkpVar3.pY.b();
                akkp akkpVar4 = this.a.a;
                fbbf fbbfVar13 = akkpVar4.nE;
                fbbf fbbfVar14 = akkpVar4.nj;
                ctml ctmlVar = (ctml) akkpVar4.ni.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                csum csumVar = (csum) this.a.a.dr.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                Optional optional = (Optional) this.a.aV.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                albq albqVar = (albq) this.a.a.di.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                akis akisVar3 = this.a;
                akkp akkpVar5 = akisVar3.a;
                fbbf fbbfVar15 = akkpVar5.fP;
                baft aK = akisVar3.aK();
                bdwt bdwtVar = (bdwt) akkpVar5.tz.b();
                bdve bdveVar = (bdve) this.a.a.pI.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                bauj baujVar = (bauj) this.a.a.ue.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akkp akkpVar6 = this.a.a;
                fbbf fbbfVar16 = akkpVar6.fJ;
                cbut cbutVar = (cbut) akkpVar6.qJ.b();
                akkp akkpVar7 = this.a.a;
                fbbf fbbfVar17 = akkpVar7.pQ;
                aolr aolrVar = (aolr) akkpVar7.Z.b();
                akkp akkpVar8 = this.a.a;
                fbbf fbbfVar18 = akkpVar8.qg;
                fbbf fbbfVar19 = akkpVar8.qh;
                cipm cipmVar = (cipm) akkpVar8.ix.b();
                akis akisVar4 = this.a;
                akkp akkpVar9 = akisVar4.a;
                fbbf fbbfVar20 = akkpVar9.cf;
                fbbf fbbfVar21 = akkpVar9.ia;
                fbbf fbbfVar22 = akkpVar9.kt;
                fbbf fbbfVar23 = akkpVar9.jG;
                fbbf fbbfVar24 = akkpVar9.kp;
                fbbf fbbfVar25 = akkpVar9.mu;
                fbbf fbbfVar26 = akkpVar9.AN;
                fbbf fbbfVar27 = akkpVar9.pC;
                fbbf fbbfVar28 = akkpVar9.pf;
                fbbf fbbfVar29 = akkpVar9.iz;
                fbbf fbbfVar30 = akkpVar9.gQ;
                fbbf fbbfVar31 = akkpVar9.iA;
                fbbf fbbfVar32 = akkpVar9.Q;
                fbbf fbbfVar33 = akkpVar9.AX;
                fbbf fbbfVar34 = akkpVar9.Ba;
                fbbf fbbfVar35 = akkpVar9.c;
                fbbf fbbfVar36 = akkpVar9.sm;
                fbbf fbbfVar37 = akisVar4.iz;
                asku bz = akkpVar9.bz();
                errl errlVar = (errl) akisVar4.p.b();
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                akkp akkpVar10 = this.a.a;
                bzpo fa = akkpVar10.fa();
                areq areqVar = (areq) akkpVar10.cu.b();
                akkp akkpVar11 = this.a.a;
                fbbf fbbfVar38 = akkpVar11.ku;
                fbbf fbbfVar39 = akkpVar11.ck;
                fbbf fbbfVar40 = akkpVar11.qL;
                AtomicReference atomicReference = (AtomicReference) akkpVar11.cj.b();
                akkp akkpVar12 = this.a.a;
                return new bahp(context, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, bdtdVar, bcvwVar, cpbwVar, fbbfVar12, bdxdVar, fbbfVar13, fbbfVar14, ctmlVar, ctudVar, csumVar, coxkVar, optional, cqohVar, albqVar, akztVar, fbbfVar15, aK, bdwtVar, bdveVar, cbgfVar, baujVar, byzpVar, dtuuVar, fbbfVar16, cbutVar, fbbfVar17, aolrVar, fbbfVar18, fbbfVar19, cipmVar, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, bz, errlVar, ffskVar2, fa, areqVar, fbbfVar38, fbbfVar39, fbbfVar40, atomicReference, akkpVar12.Be, akkpVar12.oQ, akkpVar12.Bf, akkpVar12.Bg, (asyf) akkpVar12.ci.b(), (asqi) this.a.a.mV.b(), (augw) this.a.a.le.b());
            case 1505:
                akkp akkpVar13 = this.a.a;
                fbbf fbbfVar41 = akkpVar13.dA;
                dtuu dtuuVar2 = (dtuu) akkpVar13.ay.b();
                akkp akkpVar14 = this.a.a;
                return new axmt(fbbfVar41, dtuuVar2, akkpVar14.ib, akkpVar14.dn);
            case 1506:
                return new enpx(this.a.a.et());
            case 1507:
                Context context2 = (Context) this.a.q.b();
                akkp akkpVar15 = this.a.a;
                return new cbit(context2, akkpVar15.fE(), akkpVar15.fG(), akkpVar15.f, akkpVar15.fF(), (ctax) akkpVar15.lD.b(), (errl) this.a.t.b());
            case 1508:
                Context context3 = (Context) this.a.q.b();
                akis akisVar5 = this.a;
                akkp akkpVar16 = akisVar5.a;
                return new cbjl(context3, akkpVar16.fN, akkpVar16.pF, akkpVar16.ay, akisVar5.iL, akkpVar16.lB, akkpVar16.Bc);
            case 1509:
                final fbbf fbbfVar42 = this.a.a.s;
                return new asqa() { // from class: arvw
                    @Override // defpackage.asqa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_transcoding_failure_fallback_logging");
                    }
                };
            case 1510:
                final fbbf fbbfVar43 = this.a.a.s;
                return new astl() { // from class: asak
                    @Override // defpackage.astl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.insert_new_message_action_use_messaging_identity");
                    }
                };
            case 1511:
                return new ckkj(this.a.a.C);
            case 1512:
                final fbbf fbbfVar44 = this.a.a.s;
                return new atsj() { // from class: atqi
                    @Override // defpackage.atsj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.update_conversation_self_id_when_sending_rcs_messages");
                    }
                };
            case 1513:
                final fbbf fbbfVar45 = this.a.a.s;
                return new atwn() { // from class: atuz
                    @Override // defpackage.atwn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.cancel_pipeline_first_if_encryption_status_doesnt_match");
                    }
                };
            case 1514:
                return new cjmk((cjmj) this.a.a.yP.b(), (ffsk) this.a.a.p.b());
            case 1515:
                return new avkt((avks) this.a.a.Bk.b(), (ffsk) this.a.a.p.b());
            case 1516:
                return new avkv((azcn) this.a.a.kJ.b(), (azfv) this.a.a.kI.b());
            case 1517:
                final fbbf fbbfVar46 = this.a.a.s;
                return new autk() { // from class: ausx
                    @Override // defpackage.autk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_sent_timestamp_from_transport");
                    }
                };
            case 1518:
                return Optional.of((cwjw) this.a.a.xV.b());
            case 1519:
                akis akisVar6 = this.a;
                return new alkw(akisVar6.a.ke(), (errl) akisVar6.p.b());
            case 1520:
                bdjr bdjrVar = (bdjr) this.a.a.pQ.b();
                akkp akkpVar17 = this.a.a;
                return new cnrx(bdjrVar, akkpVar17.jO(), akkpVar17.fs);
            case 1521:
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                csjk csjkVar = (csjk) this.a.a.el.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                alrv alrvVar = (alrv) this.a.a.ej.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                cpde cpdeVar = (cpde) this.a.a.Bs.b();
                cnjt cnjtVar = (cnjt) this.a.a.iG.b();
                akzt akztVar2 = (akzt) this.a.a.f.b();
                akkp akkpVar18 = this.a.a;
                return new coxc(ctvbVar, csjkVar, cpbsVar, alrvVar, ctwbVar, cpdeVar, cnjtVar, akztVar2, akkpVar18.bH(), akkpVar18.bG());
            case 1522:
                return new cpde(fbaz.a(this.a.a.ft));
            case 1523:
                akkp akkpVar19 = this.a.a;
                return new curu(akkpVar19.bi, akkpVar19.dF, (avkk) akkpVar19.cH.b(), (Executor) this.a.p.b());
            case 1524:
                return new axcc(this.a.a.dS(), new axbm());
            case 1525:
                return new axby((ffhd) this.a.co.b(), (ffsk) this.a.a.p.b(), (chbx) this.a.a.gr.b());
            case 1526:
                return new axbu((avkh) this.a.a.kh.b(), (ffsk) this.a.a.p.b());
            case 1527:
                akkp akkpVar20 = this.a.a;
                return new axbl(akkpVar20.eg(), (ffsk) akkpVar20.p.b());
            case 1528:
                errl errlVar2 = (errl) this.a.p.b();
                akis akisVar7 = this.a;
                cfmq hj = akisVar7.a.hj();
                avtx avtxVar = (avtx) akisVar7.jE.b();
                akis akisVar8 = this.a;
                akkp akkpVar21 = akisVar8.a;
                return new awqr(errlVar2, hj, avtxVar, (awov) akisVar8.fn(), akkpVar21.yq, akkpVar21.uL, akkpVar21.br, akkpVar21.gE, akkpVar21.bF);
            case 1529:
                akis akisVar9 = this.a;
                akkp akkpVar22 = akisVar9.a;
                return new baed(akkpVar22.f, akkpVar22.dn, akkpVar22.dB, akisVar9.cz, akkpVar22.fP, akkpVar22.dp, akkpVar22.ay, akkpVar22.gN, akisVar9.p);
            case 1530:
                errl errlVar3 = (errl) this.a.aK.b();
                akis akisVar10 = this.a;
                akkp akkpVar23 = akisVar10.a;
                fbbf fbbfVar47 = akkpVar23.fP;
                fbbf fbbfVar48 = akkpVar23.aV;
                fbbf fbbfVar49 = akkpVar23.ib;
                fbbf fbbfVar50 = akkpVar23.dn;
                fbbf fbbfVar51 = akkpVar23.dB;
                fbbf fbbfVar52 = akkpVar23.fs;
                fbbf fbbfVar53 = akisVar10.li;
                cowq cowqVar = (cowq) akkpVar23.uh.b();
                avkm avkmVar = (avkm) this.a.a.nK.b();
                ckju ckjuVar = (ckju) this.a.a.ky.b();
                akkp akkpVar24 = this.a.a;
                fbbf fbbfVar54 = akkpVar24.fJ;
                dtuu dtuuVar3 = (dtuu) akkpVar24.ay.b();
                byzp byzpVar2 = (byzp) this.a.a.iy.b();
                akkp akkpVar25 = this.a.a;
                fbbf fbbfVar55 = akkpVar25.tw;
                cubr cubrVar = (cubr) akkpVar25.ty.b();
                cbut cbutVar2 = (cbut) this.a.a.qJ.b();
                bdvi bdviVar = (bdvi) this.a.a.jh.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                ckch ckchVar = (ckch) this.a.a.kj.b();
                bbgg bbggVar = (bbgg) this.a.a.iE.b();
                bbfo bbfoVar = (bbfo) this.a.jU.b();
                cqos cqosVar = (cqos) this.a.a.oO.b();
                cvlf cvlfVar = (cvlf) this.a.a.hG.b();
                avff avffVar = (avff) this.a.a.uf.b();
                akkp akkpVar26 = this.a.a;
                cfmp hi = akkpVar26.hi();
                fbbf fbbfVar56 = akkpVar26.ip;
                fbbf fbbfVar57 = akkpVar26.BB;
                fazb a = fbaz.a(this.a.a.uC);
                akis akisVar11 = this.a;
                fbbf fbbfVar58 = akisVar11.a.Z;
                akkp akkpVar27 = this.a.a;
                fbbf fbbfVar59 = akkpVar27.sY;
                cers cersVar = (cers) akkpVar27.sF.b();
                akkp akkpVar28 = this.a.a;
                fbbf fbbfVar60 = akkpVar28.uF;
                fbbf fbbfVar61 = akkpVar28.tE;
                fbbf fbbfVar62 = akkpVar28.pC;
                cqvy cqvyVar = (cqvy) akkpVar28.oP.b();
                akis akisVar12 = this.a;
                fbbf fbbfVar63 = akisVar12.a.pQ;
                Object b = akisVar12.ml.b();
                akkp akkpVar29 = this.a.a;
                fbbf fbbfVar64 = akkpVar29.pi;
                fbbf fbbfVar65 = akkpVar29.uH;
                fbbf fbbfVar66 = akkpVar29.uL;
                fbbf fbbfVar67 = akkpVar29.BC;
                atmc ce = akkpVar29.ce();
                atmb atmbVar = (atmb) akkpVar29.kS.b();
                akkp akkpVar30 = this.a.a;
                return cqzy.a(errlVar3, fbbfVar47, fbbfVar48, fbbfVar49, fbbfVar50, fbbfVar51, fbbfVar52, fbbfVar53, cowqVar, avkmVar, ckjuVar, fbbfVar54, dtuuVar3, byzpVar2, fbbfVar55, cubrVar, cbutVar2, bdviVar, cqohVar2, ckchVar, bbggVar, bbfoVar, cqosVar, cvlfVar, avffVar, hi, fbbfVar56, fbbfVar57, a, fbbfVar58, fbbfVar59, cersVar, fbbfVar60, fbbfVar61, fbbfVar62, cqvyVar, fbbfVar63, b, fbbfVar64, fbbfVar65, fbbfVar66, fbbfVar67, ce, atmbVar, akkpVar30.yJ, akkpVar30.wv, akkpVar30.BD, akkpVar30.kI, akkpVar30.jG, akkpVar30.kR);
            case 1531:
                return new cqxx(this.a.a.cc);
            case 1532:
                akis akisVar13 = this.a;
                fbbf fbbfVar68 = akisVar13.cP;
                akkp akkpVar31 = akisVar13.a;
                return new cldk(akkpVar31.gQ, akkpVar31.uM, (ffhd) fbbfVar68.b(), (ffsk) this.a.a.p.b());
            case 1533:
                Context context4 = (Context) this.a.q.b();
                akis akisVar14 = this.a;
                akkp akkpVar32 = akisVar14.a;
                return new avhl(context4, akkpVar32.kG, akkpVar32.fP, akisVar14.cv, akkpVar32.ib, akkpVar32.dn, akisVar14.aR, akkpVar32.iN, akkpVar32.pC);
            case 1534:
                errl errlVar4 = (errl) this.a.p.b();
                errl errlVar5 = (errl) this.a.t.b();
                akis akisVar15 = this.a;
                return new avig(errlVar4, errlVar5, akisVar15.a.BG, akisVar15.iz);
            case 1535:
                akis akisVar16 = this.a;
                akkp akkpVar33 = akisVar16.a;
                return new bart(akkpVar33.ib, akkpVar33.dn, akkpVar33.BF, akkpVar33.dB, akkpVar33.sY, akisVar16.cz, akkpVar33.dA, akkpVar33.kj, akkpVar33.ia);
            case 1536:
                return new ctpl(this.a.a.ay);
            case 1537:
                final fbbf fbbfVar69 = this.a.a.s;
                return new askz() { // from class: arny
                    @Override // defpackage.askz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.convo_id_from_incoming_message_to_clear_typing_indicator");
                    }
                };
            case 1538:
                Object b2 = this.a.a.BJ.b();
                akkp akkpVar34 = this.a.a;
                return awpv.a(b2, akkpVar34.dN(), (avgr) akkpVar34.BQ.b(), (ffsk) this.a.a.aq.b());
            case 1539:
                akis akisVar17 = this.a;
                avhf cR = akisVar17.a.cR();
                errl errlVar6 = (errl) akisVar17.p.b();
                errl errlVar7 = (errl) this.a.t.b();
                akkp akkpVar35 = this.a.a;
                return new avgr(cR, errlVar6, errlVar7, akkpVar35.u, fbaz.a(akkpVar35.BN), fbaz.a(this.a.a.BO), (Context) this.a.q.b(), (avff) this.a.a.uf.b(), (cqoh) this.a.cz.b(), (avjf) this.a.a.eT.b(), (albq) this.a.a.di.b(), (avhl) this.a.a.BD.b(), (errm) this.a.p.b(), this.a.a.BP);
            case 1540:
                return fdfr.a(this.a.a.os());
            case 1541:
                return fdfs.a(this.a.a.os());
            case 1542:
                final fbbf fbbfVar70 = this.a.a.s;
                return new asuv() { // from class: ascs
                    @Override // defpackage.asuv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rbm_deep_linking");
                    }
                };
            case 1543:
                akis akisVar18 = this.a;
                fbbf fbbfVar71 = akisVar18.a.ol;
                errl errlVar8 = (errl) akisVar18.t.b();
                return new cqui(fbbfVar71, errlVar8, (Context) this.a.q.b());
            case 1544:
                return avxu.a((akji) this.a.a.om.b(), this.a.aC());
            case 1545:
                return Long.valueOf(fdft.a(this.a.a.os()));
            case 1546:
                akkp akkpVar36 = this.a.a;
                return new azei(akkpVar36.BS, (ffsk) akkpVar36.p.b());
            case 1547:
                return new enpx(this.a.a.jn());
            case 1548:
                akis akisVar19 = this.a;
                return new club((cltu) akisVar19.a.pH(), (errl) akisVar19.p.b());
            case 1549:
                return colp.a((colj) this.a.a.dj.b());
            case 1550:
                return new clhd((akzt) this.a.a.f.b(), (cqoh) this.a.cz.b());
            case 1551:
                akis akisVar20 = this.a;
                akkp akkpVar37 = akisVar20.a;
                return new clue((cltu) akkpVar37.pI(), akkpVar37.jg(), (errl) akisVar20.p.b());
            case 1552:
                return new clti((errl) this.a.p.b(), (cltu) this.a.a.pE());
            case 1553:
                return new cltm((errl) this.a.p.b(), (cltu) this.a.a.pF());
            case 1554:
                return new clty((errl) this.a.p.b(), (cltu) this.a.a.pG());
            case 1555:
                return new clun((errl) this.a.p.b(), (cltu) this.a.a.pK());
            case 1556:
                return new cluk((errl) this.a.p.b(), (cltu) this.a.a.pJ());
            case 1557:
                akis akisVar21 = this.a;
                akkp akkpVar38 = akisVar21.a;
                return new cpmk(akkpVar38.Cd, akkpVar38.Ce, akkpVar38.Cf, akkpVar38.Cg, akkpVar38.Ch, akkpVar38.Ci, akkpVar38.Cj, akkpVar38.dE, akkpVar38.gm, akkpVar38.CG, akkpVar38.yh, (errm) akisVar21.p.b(), (errl) this.a.t.b(), this.a.a.jc);
            case 1558:
                return new cpnp(this.a.a.cc);
            case 1559:
                return new cpnk(this.a.a.cc);
            case 1560:
                return new cpji(this.a.a.cc);
            case 1561:
                return new cpiy(this.a.a.cc);
            case 1562:
                return new cpne(this.a.a.cc);
            case 1563:
                return new cpop(this.a.a.cc);
            case 1564:
                return new cpkf(this.a.a.cc);
            case 1565:
                akkp akkpVar39 = this.a.a;
                return new cpob((cpnb) akkpVar39.qy(), akkpVar39.jc);
            case 1566:
                return Optional.of((cppe) this.a.a.Cl.b());
            case 1567:
                return new akka(this);
            case 1568:
                return Optional.of((cppg) this.a.a.mz.b());
            case 1569:
                chbx chbxVar = (chbx) this.a.a.gr.b();
                RcsProfileService rcsProfileService = (RcsProfileService) this.a.a.dl.b();
                akis akisVar22 = this.a;
                akkp akkpVar40 = akisVar22.a;
                fbbf fbbfVar72 = akkpVar40.br;
                fbbf fbbfVar73 = akkpVar40.G;
                errl errlVar9 = (errl) akisVar22.t.b();
                errl errlVar10 = (errl) this.a.p.b();
                akis akisVar23 = this.a;
                return new chfz(chbxVar, rcsProfileService, fbbfVar72, fbbfVar73, errlVar9, errlVar10, akisVar23.a.cx, akisVar23.lR);
            case 1570:
                akis akisVar24 = this.a;
                akkp akkpVar41 = akisVar24.a;
                fbbf fbbfVar74 = akkpVar41.Co;
                fbbf fbbfVar75 = akkpVar41.Cp;
                Context context5 = (Context) akisVar24.q.b();
                akkp akkpVar42 = this.a.a;
                fbbf fbbfVar76 = akkpVar42.Cv;
                cfud cfudVar = (cfud) akkpVar42.cT.b();
                akis akisVar25 = this.a;
                fbbf fbbfVar77 = akisVar25.aK;
                fbbf fbbfVar78 = akisVar25.a.fQ;
                errl errlVar11 = (errl) fbbfVar77.b();
                errl errlVar12 = (errl) this.a.p.b();
                akis akisVar26 = this.a;
                akkp akkpVar43 = akisVar26.a;
                fbbf fbbfVar79 = akkpVar43.gJ;
                dkay dkayVar = (dkay) akkpVar43.br.b();
                akkp akkpVar44 = this.a.a;
                dkcc lV = akkpVar44.lV();
                dkca lU = akkpVar44.lU();
                ckhh ckhhVar = (ckhh) akkpVar44.Ct.b();
                akvz akvzVar = (akvz) this.a.a.dE.b();
                akkp akkpVar45 = this.a.a;
                djrb iX = akis.iX();
                cmel cmelVar = (cmel) akkpVar45.vV.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akis akisVar27 = this.a;
                akkp akkpVar46 = akisVar27.a;
                fbbf fbbfVar80 = akisVar27.mo;
                ajoz ajozVar = (ajoz) akkpVar46.Cy.b();
                akis akisVar28 = this.a;
                fbbf fbbfVar81 = akisVar28.aJ;
                fbbf fbbfVar82 = akisVar28.a.dp;
                elbx elbxVar = (elbx) fbbfVar81.b();
                ctud ctudVar2 = (ctud) this.a.cT.b();
                dkvu dkvuVar = (dkvu) this.a.hl.b();
                akkp akkpVar47 = this.a.a;
                fbbf fbbfVar83 = akkpVar47.cL;
                cmnf cmnfVar = (cmnf) akkpVar47.Cz.b();
                cort cortVar = (cort) this.a.a.bj.b();
                akkp akkpVar48 = this.a.a;
                fbbf fbbfVar84 = akkpVar48.gE;
                fbbf fbbfVar85 = akkpVar48.bF;
                cguo cguoVar = (cguo) akkpVar48.cK.b();
                akkp akkpVar49 = this.a.a;
                fbbf fbbfVar86 = akkpVar49.wi;
                fbbf fbbfVar87 = akkpVar49.bo;
                akkp akkpVar50 = this.a.a;
                return new cmpn(fbbfVar74, fbbfVar75, context5, fbbfVar76, cfudVar, fbbfVar78, errlVar11, errlVar12, fbbfVar79, akisVar26.aQ, dkayVar, lV, lU, ckhhVar, akvzVar, iX, cmelVar, cqohVar3, fbbfVar80, ajozVar, fbbfVar82, elbxVar, ctudVar2, dkvuVar, fbbfVar83, cmnfVar, cortVar, fbbfVar84, fbbfVar85, cguoVar, fbbfVar86, fbbfVar87, akkpVar50.bS(), akkpVar50.bR(), akkpVar50.cN, akkpVar50.CA, akkpVar50.CB, akkpVar50.wh, akkpVar50.CC, akkpVar50.gK, akkpVar50.CD, akkpVar50.wa);
            case 1571:
                final fbbf fbbfVar88 = this.a.a.s;
                return new atri() { // from class: atoj
                    @Override // defpackage.atri
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_rcs_utils_update_stored_rcs_sim");
                    }
                };
            case 1572:
                final fbbf fbbfVar89 = this.a.a.s;
                return new atrm() { // from class: atoq
                    @Override // defpackage.atrm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_use_async_to_fetch_rcs_configuration_in_rcs_provisioning_trigger_impl");
                    }
                };
            case 1573:
                Context context6 = (Context) this.a.q.b();
                akis akisVar29 = this.a;
                akkp akkpVar51 = akisVar29.a;
                fbbf fbbfVar90 = akkpVar51.gJ;
                ckhf cl = akisVar29.cl();
                csjk csjkVar2 = (csjk) akkpVar51.fQ.b();
                errl errlVar13 = (errl) this.a.aK.b();
                akis akisVar30 = this.a;
                fbbf fbbfVar91 = akisVar30.cz;
                fbbf fbbfVar92 = akisVar30.dX;
                cqoh cqohVar4 = (cqoh) fbbfVar91.b();
                akis akisVar31 = this.a;
                fbbf fbbfVar93 = akisVar31.a.Cq;
                dkvu dkvuVar2 = (dkvu) akisVar31.hl.b();
                cort cortVar2 = (cort) this.a.a.bj.b();
                errl errlVar14 = (errl) this.a.p.b();
                akkp akkpVar52 = this.a.a;
                return new cmnt(context6, fbbfVar90, akisVar29.aQ, cl, csjkVar2, errlVar13, fbbfVar92, cqohVar4, fbbfVar93, dkvuVar2, cortVar2, errlVar14, akkpVar52.bo, akkpVar52.Cs, akkpVar52.Ct, akkpVar52.cN, akkpVar52.Cu);
            case 1574:
                akis akisVar32 = this.a;
                return new cmmj(akisVar32.a.vV, (errl) akisVar32.t.b());
            case 1575:
                return new asqy() { // from class: arxp
                };
            case 1576:
                final fbbf fbbfVar94 = this.a.a.s;
                return new aung() { // from class: aumh
                    @Override // defpackage.aung
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_provisioning_scheduled_event");
                    }
                };
            case 1577:
                akkp akkpVar53 = this.a.a;
                return new ckhi(akkpVar53.az, akkpVar53.cN, akkpVar53.bi);
            case 1578:
                final fbbf fbbfVar95 = this.a.a.s;
                return new auna() { // from class: aulv
                    @Override // defpackage.auna
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_config_refresh_in_debug_menu");
                    }
                };
            case 1579:
                return new diko((djix) this.a.a.cM.b(), (dkpp) this.a.aQ.b(), cmnc.a(), (errl) this.a.aK.b(), (dijt) this.a.a.cN.b());
            case 1580:
                akis akisVar33 = this.a;
                akkp akkpVar54 = akisVar33.a;
                return new ajoz(akkpVar54.Cx, akisVar33.cl(), (csjk) akkpVar54.fQ.b(), (dkvu) this.a.hl.b(), this.a.t);
            case 1581:
                return new ajon(this.a.a.cc);
            case 1582:
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akis akisVar34 = this.a;
                akkp akkpVar55 = akisVar34.a;
                fbbf fbbfVar96 = akkpVar55.bj;
                fbbf fbbfVar97 = akkpVar55.Cv;
                dkvu dkvuVar3 = (dkvu) akisVar34.hl.b();
                asqs asqsVar = (asqs) this.a.a.bo.b();
                ajoz ajozVar2 = (ajoz) this.a.a.Cy.b();
                akkp akkpVar56 = this.a.a;
                return new cmnk(ffskVar3, fbbfVar96, fbbfVar97, dkvuVar3, asqsVar, ajozVar2, akkpVar56.wb, akkpVar56.cA());
            case 1583:
                return new cmoc(this.a.a.bi);
            case 1584:
                final fbbf fbbfVar98 = this.a.a.s;
                return new aspt() { // from class: arvl
                    @Override // defpackage.aspt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_trigger_in_availability_update_logs");
                    }
                };
            case 1585:
                final fbbf fbbfVar99 = this.a.a.s;
                return new aunm() { // from class: aumt
                    @Override // defpackage.aunm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.set_root_trace_in_on_rcs_availability_update");
                    }
                };
            case 1586:
                final fbbf fbbfVar100 = this.a.a.s;
                return new aunl() { // from class: aumr
                    @Override // defpackage.aunl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.send_disable_rcs_request_when_disabled_for_wear");
                    }
                };
            case 1587:
                return Long.valueOf(fdiq.a(this.a.a.oF()));
            case 1588:
                akkp akkpVar57 = this.a.a;
                return new cjni(akkpVar57.iA(), (ffsk) akkpVar57.q.b());
            case 1589:
                final fbbf fbbfVar101 = this.a.a.s;
                return new autd() { // from class: ausl
                    @Override // defpackage.autd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.imdn_sending_pipeline_v1");
                    }
                };
            case 1590:
                return coln.a((colj) this.a.a.dj.b());
            case 1591:
                return colo.a((colj) this.a.a.dj.b());
            case 1592:
                return coll.a((colj) this.a.a.dj.b());
            case 1593:
                akis akisVar35 = this.a;
                akkp akkpVar58 = akisVar35.a;
                fbbf fbbfVar102 = akkpVar58.CN;
                fbbf fbbfVar103 = akkpVar58.CO;
                return new clfp(fbbfVar102, fbbfVar103, (avuh) this.a.hd.b(), this.a.a.jg());
            case 1594:
                errl errlVar15 = (errl) this.a.t.b();
                errl errlVar16 = (errl) this.a.aK.b();
                errl errlVar17 = (errl) this.a.p.b();
                avkh avkhVar = (avkh) this.a.a.kh.b();
                akis akisVar36 = this.a;
                clja ji = akisVar36.a.ji();
                ctzw ctzwVar = (ctzw) akisVar36.dI.b();
                akis akisVar37 = this.a;
                akkp akkpVar59 = akisVar37.a;
                return new clfi(errlVar15, errlVar16, errlVar17, avkhVar, ji, ctzwVar, akkpVar59.rJ(), (clfb) akisVar37.fl(), (clhd) akkpVar59.BV.b());
            case 1595:
                akis akisVar38 = this.a;
                return new clfs(akisVar38.a.jm(), (cqoh) akisVar38.cz.b(), (errl) this.a.p.b());
            case 1596:
                return new enpx(this.a.a.iP());
            case 1597:
                final fbbf fbbfVar104 = this.a.a.s;
                return new aunc() { // from class: aulz
                    @Override // defpackage.aunc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_report_disabled_by_config_version_in_rcs_availability");
                    }
                };
            case 1598:
                akis akisVar39 = this.a;
                return new bagi(akisVar39.iz, (errl) akisVar39.p.b(), (errl) this.a.aK.b(), this.a.a.Be);
            case 1599:
                akis akisVar40 = this.a;
                return new cujj(akisVar40.a.dB, (Context) akisVar40.q.b(), (bbfb) this.a.a.nT.b(), (cqoh) this.a.cz.b(), (akzt) this.a.a.f.b(), (byzp) this.a.a.iy.b());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v70, types: [diij, java.lang.Object] */
    private final Object j() {
        int i = this.b;
        switch (i) {
            case 1600:
                Context context = (Context) this.a.q.b();
                cuiw cuiwVar = new cuiw();
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new cuiv(context, cuiwVar, akisVar.iz, akkpVar.nH, akisVar.hd, akisVar.iq, akkpVar.nK, akkpVar.gQ, akkpVar.br);
            case 1601:
                akis akisVar2 = this.a;
                akkp akkpVar2 = akisVar2.a;
                fbbf fbbfVar = akkpVar2.dB;
                fbbf fbbfVar2 = akkpVar2.dn;
                fbbf fbbfVar3 = akkpVar2.nH;
                fbbf fbbfVar4 = akkpVar2.Bu;
                fbbf fbbfVar5 = akkpVar2.G;
                fbbf fbbfVar6 = akkpVar2.aO;
                fbbf fbbfVar7 = akkpVar2.gQ;
                errl errlVar = (errl) akisVar2.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                akkp akkpVar3 = this.a.a;
                return new cuse(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, errlVar, errlVar2, akkpVar3.br, akkpVar3.CW);
            case 1602:
                final fbbf fbbfVar8 = this.a.a.s;
                return new atry() { // from class: atpn
                    @Override // defpackage.atry
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_missing_message_self_in_rbm_spam");
                    }
                };
            case 1603:
                Context context2 = (Context) this.a.q.b();
                akis akisVar3 = this.a;
                dglp dm = akisVar3.dm();
                errl errlVar3 = (errl) akisVar3.t.b();
                akkp akkpVar4 = this.a.a;
                return new cggk(context2, dm, errlVar3, akkpVar4.ej, akkpVar4.f);
            case 1604:
                akis akisVar4 = this.a;
                fbbf fbbfVar9 = akisVar4.aJ;
                akkp akkpVar5 = akisVar4.a;
                return new cark(akkpVar5.fJ, akkpVar5.f7do, (elbx) fbbfVar9.b(), (errl) this.a.t.b());
            case 1605:
                final fbbf fbbfVar10 = this.a.a.s;
                return new atru() { // from class: atpg
                    @Override // defpackage.atru
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_self_participant_refresh_on_sim_state_change_speedup");
                    }
                };
            case 1606:
                return Long.valueOf(fdic.a(this.a.a.oC()));
            case 1607:
                return Long.valueOf(fdie.a(this.a.a.oC()));
            case 1608:
                return new crnx((Context) this.a.q.b());
            case 1609:
                return new aknh(this.a.a.jn);
            case 1610:
                akkp akkpVar6 = this.a.a;
                return new bdql(akkpVar6.Dk, akkpVar6.ay);
            case 1611:
                akkp akkpVar7 = this.a.a;
                return enip.r(akkpVar7.bc(), akkpVar7.kS());
            case 1612:
                return new aqpx(this.a.a.cc);
            case 1613:
                akis akisVar5 = this.a;
                return new aqqw(akisVar5.cn, akisVar5.a.al);
            case 1614:
                final fbbf fbbfVar11 = this.a.a.s;
                return new atfb() { // from class: ateq
                    @Override // defpackage.atfb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_create_participant_contact_sync_refactor");
                    }
                };
            case 1615:
                ffhd ffhdVar = (ffhd) this.a.co.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akkp akkpVar8 = this.a.a;
                return new airu(ffhdVar, ffskVar, cbwjVar, cqohVar, akkpVar8.Dn, akkpVar8.dB);
            case 1616:
                return new bczq((ffhd) this.a.co.b(), (dtuu) this.a.a.ay.b());
            case 1617:
                akkp akkpVar9 = this.a.a;
                return new bbae(akkpVar9.dn, akkpVar9.ay);
            case 1618:
                return new crlf((ctyx) this.a.aU.b(), (dkpp) this.a.aQ.b(), (cort) this.a.a.bj.b(), this.a.a.Dq);
            case 1619:
                final fbbf fbbfVar12 = this.a.a.s;
                return new atrw() { // from class: atpj
                    @Override // defpackage.atrw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_sim_subscription_info_retriever_in_bugle_prefs_upsell_record");
                    }
                };
            case 1620:
                return new algm((effy) this.a.a.Ds.b(), (errl) this.a.p.b(), (errl) this.a.t.b());
            case 1621:
                akis akisVar6 = this.a;
                return alfg.a(akisVar6.a.mE(), akisVar6.eA(), (efbm) akisVar6.aM.b());
            case 1622:
                akis akisVar7 = this.a;
                akkp akkpVar10 = akisVar7.a;
                return new algq(akisVar7.mt, akkpVar10.dn, (cpdg) akkpVar10.ap.b());
            case 1623:
                akis akisVar8 = this.a;
                comc jW = akisVar8.a.jW();
                eixo eixoVar = (eixo) this.a.a.as.b();
                errl errlVar4 = (errl) this.a.p.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                akis akisVar9 = this.a;
                return new cgfd(jW, eixoVar, errlVar4, ejvpVar, akisVar9.mu, akisVar9.a.Dx, akisVar9.cz);
            case 1624:
                return Optional.of((cgcw) this.a.a.Dw.b());
            case 1625:
                return new cgdb((ffsk) this.a.a.p.b(), (ekos) this.a.a.Dv.b(), this.a.a.cf);
            case 1626:
                return new ekpa((errl) this.a.aK.b(), (errl) this.a.p.b(), (dfad) this.a.mv.b(), (ekot) this.a.mw.b(), (ejar) this.a.a.au.b(), (dlpw) this.a.l.b());
            case 1627:
                Context context3 = (Context) this.a.q.b();
                akis akisVar10 = this.a;
                fbbf fbbfVar13 = akisVar10.aV;
                akkp akkpVar11 = akisVar10.a;
                fbbf fbbfVar14 = akkpVar11.c;
                fbbf fbbfVar15 = akisVar10.fM;
                fbbf fbbfVar16 = akkpVar11.Dz;
                fazb a = fbaz.a(fbbfVar13);
                fbbf fbbfVar17 = akkpVar11.dp;
                fbbf fbbfVar18 = akkpVar11.r;
                fazb a2 = fbaz.a(akkpVar11.fw);
                akkp akkpVar12 = this.a.a;
                fbbf fbbfVar19 = akkpVar12.DA;
                fazb a3 = fbaz.a(akkpVar12.ha);
                akis akisVar11 = this.a;
                fbbf fbbfVar20 = akisVar11.aK;
                akkp akkpVar13 = akisVar11.a;
                fbbf fbbfVar21 = akkpVar13.jc;
                fbbf fbbfVar22 = akkpVar13.az;
                errl errlVar5 = (errl) fbbfVar20.b();
                errl errlVar6 = (errl) this.a.p.b();
                fazb a4 = fbaz.a(this.a.mx);
                avkk avkkVar = (avkk) this.a.a.cH.b();
                fazb a5 = fbaz.a(this.a.a.DK);
                akkp akkpVar14 = this.a.a;
                fbbf fbbfVar23 = akkpVar14.DL;
                fbbf fbbfVar24 = akkpVar14.fP;
                fbbf fbbfVar25 = akkpVar14.bj;
                fbbf fbbfVar26 = akkpVar14.wi;
                azaw azawVar = (azaw) akkpVar14.gA.b();
                akkp akkpVar15 = this.a.a;
                return new alvz(context3, fbbfVar14, fbbfVar15, fbbfVar16, a, fbbfVar17, akisVar10.cT, fbbfVar18, a2, fbbfVar19, a3, fbbfVar21, fbbfVar22, errlVar5, errlVar6, a4, avkkVar, a5, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, azawVar, akkpVar15.uM, akkpVar15.Z, akkpVar15.br, akkpVar15.uJ, (csjk) akkpVar15.el.b());
            case 1628:
                return new ctsz(fbaz.a(this.a.a.wC), (errl) this.a.p.b());
            case 1629:
                Context context4 = (Context) this.a.q.b();
                Executor executor = (Executor) this.a.t.b();
                akkp akkpVar16 = this.a.a;
                return new cpdl(context4, executor, akkpVar16.fu, akkpVar16.ft, akkpVar16.c, (cxao) akkpVar16.fv.b());
            case 1630:
                return new cpan((cpai) this.a.a.hO.b(), (cpar) this.a.a.DJ.b(), (ctwb) this.a.a.c.b(), (cpcd) this.a.a.DC.b(), (cpcf) this.a.a.DD.b(), (cpcl) this.a.a.DE.b(), (cpca) this.a.a.DH.b(), (cpbu) this.a.a.DI.b());
            case 1631:
                akkp akkpVar17 = this.a.a;
                return new cpar(akkpVar17.c, akkpVar17.hO, akkpVar17.fv, akkpVar17.DC, akkpVar17.DD, akkpVar17.DE, akkpVar17.DI, akkpVar17.DH);
            case 1632:
                return new cpcd(this.a.a.DB);
            case 1633:
                Context context5 = (Context) this.a.q.b();
                akkp akkpVar18 = this.a.a;
                return new cpby(context5, akkpVar18.u, akkpVar18.iH);
            case 1634:
                return new cpcf(this.a.a.DB);
            case 1635:
                akkp akkpVar19 = this.a.a;
                return new cpcl(akkpVar19.iH, (ctwb) akkpVar19.c.b());
            case 1636:
                return new cpbu((ctwb) this.a.a.c.b(), Optional.of(this.a.a.aj()), (cpca) this.a.a.DH.b());
            case 1637:
                akkp akkpVar20 = this.a.a;
                return new adgf(akkpVar20.ft, akkpVar20.fw, akkpVar20.DF);
            case 1638:
                return new akno(this.a.a.aT);
            case 1639:
                akkp akkpVar21 = this.a.a;
                return new cpca(akkpVar21.bk(), akkpVar21.wf);
            case 1640:
                return new cjan((Context) this.a.q.b(), (ciwb) this.a.a.ah.b(), (Optional) this.a.a.aQ.b());
            case 1641:
                final fbbf fbbfVar27 = this.a.a.s;
                return new asva() { // from class: asdb
                    @Override // defpackage.asva
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_parameter_object_when_log_failed");
                    }
                };
            case 1642:
                errl errlVar7 = (errl) this.a.aK.b();
                akkp akkpVar22 = this.a.a;
                return new cerd(errlVar7, akkpVar22.fP, akkpVar22.dB);
            case 1643:
                effy effyVar = (effy) this.a.my.b();
                akkp akkpVar23 = this.a.a;
                return new alqf(effyVar, akkpVar23.DT, (ffsk) akkpVar23.p.b(), (emar) this.a.mz.b(), this.a.ah());
            case 1644:
                return Optional.of(this.a.a.ar());
            case 1645:
                return alob.a((Context) this.a.q.b(), (ffsk) this.a.a.q.b());
            case 1646:
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                eixo eixoVar2 = (eixo) this.a.a.as.b();
                alqf alqfVar = (alqf) this.a.a.DQ.b();
                akis akisVar12 = this.a;
                return new aloo(ffskVar2, eixoVar2, alqfVar, akisVar12.a.as(), akisVar12.ah());
            case 1647:
                akis akisVar13 = this.a;
                Object ff = akisVar13.ff();
                Context context6 = (Context) akisVar13.q.b();
                emyl emylVar = (emyl) this.a.dj.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akkp akkpVar24 = this.a.a;
                return akyr.a(ff, context6, emylVar, cqohVar2, akkpVar24.be, (albl) akkpVar24.bh.b(), (Executor) this.a.p.b());
            case 1648:
                ffsk ffskVar3 = (ffsk) this.a.a.q.b();
                akkp akkpVar25 = this.a.a;
                return new alri(ffskVar3, akkpVar25.dB, akkpVar25.DU);
            case 1649:
                return fcww.a(this.a.a.nD());
            case 1650:
                final fbbf fbbfVar28 = this.a.a.s;
                return new auoa() { // from class: aunp
                    @Override // defpackage.auoa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_logging_message_source_for_imdns");
                    }
                };
            case 1651:
                return new atsb() { // from class: atpt
                };
            case 1652:
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar26 = this.a.a;
                fbbf fbbfVar29 = akkpVar26.cD;
                akvz akvzVar = (akvz) this.a.a.dE.b();
                aljt aljtVar = (aljt) this.a.a.il.b();
                akkp akkpVar27 = this.a.a;
                return new akvy(cqohVar3, fbbfVar29, akvzVar, aljtVar, akkpVar27.cx, akkpVar27.dn);
            case 1653:
                return Boolean.valueOf(asdm.a((ersq) this.a.a.s.b()));
            case 1654:
                final fbbf fbbfVar30 = this.a.a.s;
                return new asqq() { // from class: arxa
                    @Override // defpackage.asqq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_get_sub_phone_number_from_saved_message_core_data");
                    }
                };
            case 1655:
                final fbbf fbbfVar31 = this.a.a.s;
                return new atwp() { // from class: atvd
                    @Override // defpackage.atwp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.defer_storing_file_in_telephony_db");
                    }
                };
            case 1656:
                return new couw((aolr) this.a.a.Z.b());
            case 1657:
                return new cozk((cpdg) this.a.a.ap.b());
            case 1658:
                akkp akkpVar28 = this.a.a;
                return new cove(akkpVar28.Z, akkpVar28.ks);
            case 1659:
                return new covv(this.a.a.dn);
            case 1660:
                akkp akkpVar29 = this.a.a;
                return new baeh(akkpVar29.dw, akkpVar29.ay);
            case 1661:
                return new cpda((effy) this.a.a.Eh.b(), (cqoh) this.a.cz.b());
            case 1662:
                akis akisVar14 = this.a;
                return cpcn.a(akisVar14.a.mD(), akisVar14.eA(), (efbm) akisVar14.aM.b());
            case 1663:
                akis akisVar15 = this.a;
                akkp akkpVar30 = akisVar15.a;
                return new cpzd(akkpVar30.u, akkpVar30.Ek, akkpVar30.El, akkpVar30.Er, akkpVar30.fJ, akisVar15.aK, akisVar15.cT, akkpVar30.Es);
            case 1664:
                return Optional.of(this.a.a.pz());
            case 1665:
                return new cpyl(this.a.a.cc);
            case 1666:
                return new cqcb((cqbu) this.a.a.pA());
            case 1667:
                akis akisVar16 = this.a;
                akkp akkpVar31 = akisVar16.a;
                fbbf fbbfVar32 = akisVar16.q;
                fbbf fbbfVar33 = akkpVar31.di;
                fbbf fbbfVar34 = akkpVar31.f;
                fbbf fbbfVar35 = akkpVar31.C;
                fbbf fbbfVar36 = akkpVar31.Em;
                return new cqaj(fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar36, akkpVar31.iN, akkpVar31.En, akisVar16.cN, akkpVar31.Eo, akkpVar31.Ep, akkpVar31.qj, akkpVar31.Eq, fbbfVar36);
            case 1668:
                akis akisVar17 = this.a;
                akkp akkpVar32 = akisVar17.a;
                return new cqak(akisVar17.q, akkpVar32.di, akkpVar32.Ee, akkpVar32.iN);
            case 1669:
                return new asnz() { // from class: arsw
                };
            case 1670:
                return new asny() { // from class: arsu
                };
            case 1671:
                final fbbf fbbfVar37 = this.a.a.s;
                return new asoa() { // from class: arsy
                    @Override // defpackage.asoa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_max_count_handling_in_sync_cursor_pair");
                    }
                };
            case 1672:
                final fbbf fbbfVar38 = this.a.a.s;
                return new auwz() { // from class: auwq
                    @Override // defpackage.auwz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.import_all_messages_from_telephony_as_read");
                    }
                };
            case 1673:
                final fbbf fbbfVar39 = this.a.a.s;
                return new auwy() { // from class: auwo
                    @Override // defpackage.auwy
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.forward_sync_aborts_if_no_permissions");
                    }
                };
            case 1674:
                akis akisVar18 = this.a;
                akkp akkpVar33 = akisVar18.a;
                return new cqdr(akkpVar33.Ev, akkpVar33.jJ, akisVar18.aZ, akisVar18.aV, akisVar18.cT, akkpVar33.jM, akkpVar33.Es, (Context) akisVar18.q.b(), (ffsk) this.a.a.q.b());
            case 1675:
                cqiy cqiyVar = (cqiy) this.a.a.AF.b();
                cqgu.a(cqiyVar);
                return cqiyVar;
            case 1676:
                akkp akkpVar34 = this.a.a;
                return new cqdt(akkpVar34.fJ, akkpVar34.jJ);
            case 1677:
                akis akisVar19 = this.a;
                fbbf fbbfVar40 = akisVar19.aQ;
                ?? qo = akisVar19.a.qo();
                dkpp dkppVar = (dkpp) fbbfVar40.b();
                csjk csjkVar = (csjk) this.a.a.fQ.b();
                errl errlVar8 = (errl) this.a.t.b();
                errl errlVar9 = (errl) this.a.p.b();
                akis akisVar20 = this.a;
                return new ajno(qo, dkppVar, csjkVar, errlVar8, errlVar9, akisVar20.Z(), akisVar20.a.X());
            case 1678:
                return new akkb(this);
            case 1679:
                return new bbgl((Context) this.a.q.b(), (covo) this.a.a.jd.b(), (csuk) this.a.a.ha.b(), (cqoh) this.a.cz.b(), (bdve) this.a.a.pI.b());
            case 1680:
                akkp akkpVar35 = this.a.a;
                return new cuag(akkpVar35.bC, akkpVar35.cL, akkpVar35.hc);
            case 1681:
                akkp akkpVar36 = this.a.a;
                return new bdnq(akkpVar36.ad, akkpVar36.pQ, akkpVar36.ay);
            case 1682:
                return new asop() { // from class: artw
                };
            case 1683:
                return ckff.a(this.a.a.ES);
            case 1684:
                akis akisVar21 = this.a;
                fbbf fbbfVar41 = akisVar21.a.Co;
                Context context7 = (Context) akisVar21.q.b();
                akis akisVar22 = this.a;
                akkp akkpVar37 = akisVar22.a;
                fbbf fbbfVar42 = akkpVar37.dp;
                fbbf fbbfVar43 = akkpVar37.c;
                Object fh = akisVar22.fh();
                fbbf fbbfVar44 = akkpVar37.gJ;
                fbbf fbbfVar45 = akkpVar37.u;
                fbbf fbbfVar46 = akkpVar37.EM;
                fbbf fbbfVar47 = akkpVar37.cL;
                cslx cslxVar = new cslx();
                fbbf fbbfVar48 = this.a.aK;
                Object qe = akkpVar37.qe();
                errl errlVar10 = (errl) fbbfVar48.b();
                akis akisVar23 = this.a;
                akkp akkpVar38 = akisVar23.a;
                fbbf fbbfVar49 = akisVar23.ii;
                fbbf fbbfVar50 = akkpVar38.EN;
                dkvu dkvuVar = (dkvu) akisVar23.hl.b();
                akkp akkpVar39 = this.a.a;
                fbbf fbbfVar51 = akkpVar39.vV;
                cort cortVar = (cort) akkpVar39.bj.b();
                asqs asqsVar = (asqs) this.a.a.bo.b();
                akis akisVar24 = this.a;
                fbbf fbbfVar52 = akisVar24.aZ;
                fbbf fbbfVar53 = akisVar24.a.EO;
                ctvs ctvsVar = (ctvs) fbbfVar52.b();
                akkp akkpVar40 = this.a.a;
                fbbf fbbfVar54 = akkpVar40.wi;
                cguo cguoVar = (cguo) akkpVar40.cK.b();
                dkay dkayVar = (dkay) this.a.a.br.b();
                akkp akkpVar41 = this.a.a;
                fbbf fbbfVar55 = akkpVar41.EP;
                cvjg cvjgVar = (cvjg) akkpVar41.wf.b();
                akkp akkpVar42 = this.a.a;
                fbbf fbbfVar56 = akkpVar42.CR;
                fbbf fbbfVar57 = akkpVar42.EQ;
                fbbf fbbfVar58 = akkpVar42.ER;
                fbbf fbbfVar59 = akkpVar42.wb;
                fbbf fbbfVar60 = akkpVar42.wa;
                ckfb ckfbVar = (ckfb) fh;
                fbbf fbbfVar61 = akisVar22.cT;
                return new ckga(fbbfVar41, context7, akisVar22.aQ, fbbfVar42, fbbfVar43, ckfbVar, fbbfVar44, fbbfVar61, fbbfVar45, fbbfVar46, fbbfVar47, cslxVar, akisVar22.aT, (ckgl) qe, errlVar10, fbbfVar49, fbbfVar50, dkvuVar, fbbfVar51, cortVar, asqsVar, fbbfVar53, ctvsVar, fbbfVar54, cguoVar, dkayVar, fbbfVar55, cvjgVar, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar59, fbbfVar60);
            case 1685:
                return copv.a((dkpn) this.a.a.EL.b(), (dkpq) this.a.dl.b(), (dkpp) this.a.aQ.b(), (cfuu) this.a.aX.b());
            case 1686:
                akis akisVar25 = this.a;
                dkpx lW = akisVar25.a.lW();
                Context context8 = (Context) akisVar25.q.b();
                dkpl dkplVar = (dkpl) this.a.a.EI.b();
                errl errlVar11 = (errl) this.a.t.b();
                akkp akkpVar43 = this.a.a;
                return copw.a(lW, context8, dkplVar, errlVar11, akkpVar43.EJ, akkpVar43.EK);
            case 1687:
                return new aljm(this.a.a.fP);
            case 1688:
                return new dkpz((dkpi) this.a.a.EH.b());
            case 1689:
                return new divu(this.a.a.s);
            case 1690:
                final fbbf fbbfVar62 = this.a.a.s;
                return new asqu() { // from class: arxh
                    @Override // defpackage.asqu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.handle_sim_loaded_in_phone_sims_state_updater_in_wear");
                    }
                };
            case 1691:
                return ckfe.a(this.a.a.AV);
            case 1692:
                final fbbf fbbfVar63 = this.a.a.s;
                return new asqp() { // from class: arwy
                    @Override // defpackage.asqp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_fire_and_forget_availability_update_listener");
                    }
                };
            case 1693:
                Context context9 = (Context) this.a.q.b();
                akkp akkpVar44 = this.a.a;
                comc jU = akkpVar44.jU();
                ffsk ffskVar4 = (ffsk) akkpVar44.aq.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                akkp akkpVar45 = this.a.a;
                return new cmgg(context9, jU, ffskVar4, ffhdVar2, akkpVar45.bj, akkpVar45.vY, akkpVar45.bo, akkpVar45.vV, akkpVar45.c, akkpVar45.cz());
            case 1694:
                final fbbf fbbfVar64 = this.a.a.s;
                return new aupa() { // from class: auoy
                    @Override // defpackage.aupa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rcs_success_popup_suppression");
                    }
                };
            case 1695:
                final fbbf fbbfVar65 = this.a.a.s;
                return new aunb() { // from class: aulx
                    @Override // defpackage.aunb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_disabled_not_default_sim_availability");
                    }
                };
            case 1696:
                akkp akkpVar46 = this.a.a;
                return enip.r(akkpVar46.qp(), (ckgc) akkpVar46.Fa.b());
            case 1697:
                return colr.a(fbaz.a(this.a.a.EZ), (colj) this.a.a.dj.b(), fbaz.a(this.a.a.iA), fbaz.a(this.a.a.fQ), (cokv) this.a.dJ.b(), (errm) this.a.p.b());
            case 1698:
                baed baedVar = (baed) this.a.a.BA.b();
                baik baikVar = (baik) this.a.a.EU.b();
                bbfr bbfrVar = (bbfr) this.a.a.jj.b();
                akkp akkpVar47 = this.a.a;
                bacj ev = akkpVar47.ev();
                akzt akztVar = (akzt) akkpVar47.f.b();
                fazb a6 = fbaz.a(this.a.a.EV);
                ckds ckdsVar = (ckds) this.a.a.dp.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                fazb a7 = fbaz.a(this.a.a.fQ);
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                akis akisVar26 = this.a;
                akkp akkpVar48 = akisVar26.a;
                avsf dg = akkpVar48.dg();
                cnkb jJ = akkpVar48.jJ();
                alir alirVar = (alir) akisVar26.hv.b();
                akis akisVar27 = this.a;
                banf ez = akisVar27.a.ez();
                errl errlVar12 = (errl) akisVar27.t.b();
                akkp akkpVar49 = this.a.a;
                baob eC = akkpVar49.eC();
                baeq ew = akkpVar49.ew();
                bbfq bbfqVar = (bbfq) akkpVar49.je.b();
                akkp akkpVar50 = this.a.a;
                baod eD = akkpVar50.eD();
                cvad cvadVar = (cvad) akkpVar50.EY.b();
                akkp akkpVar51 = this.a.a;
                fbbf fbbfVar66 = akkpVar51.fP;
                alrv alrvVar = (alrv) akkpVar51.ej.b();
                akis akisVar28 = this.a;
                cksw iV = akisVar28.a.iV();
                cnka cnkaVar = (cnka) akisVar28.mM.b();
                akkp akkpVar52 = this.a.a;
                ckxv iW = akkpVar52.iW();
                clws clwsVar = (clws) akkpVar52.iA.b();
                akis akisVar29 = this.a;
                akkp akkpVar53 = akisVar29.a;
                ckpg iR = akkpVar53.iR();
                cqqi kM = akkpVar53.kM();
                ckos iQ = akkpVar53.iQ();
                fbbf fbbfVar67 = akisVar29.lH;
                fbbf fbbfVar68 = akkpVar53.nY;
                fbbf fbbfVar69 = akkpVar53.dB;
                aviv avivVar = (aviv) akkpVar53.eS.b();
                akkp akkpVar54 = this.a.a;
                return new cnki(baedVar, baikVar, bbfrVar, ev, akztVar, a6, ckdsVar, ctyxVar, a7, cqohVar4, dg, jJ, alirVar, ez, errlVar12, eC, ew, bbfqVar, eD, cvadVar, fbbfVar66, alrvVar, iV, cnkaVar, iW, clwsVar, iR, kM, iQ, fbbfVar67, fbbfVar68, fbbfVar69, avivVar, akkpVar54.ei(), (azaw) akkpVar54.uE.b(), (avkc) this.a.a.G.b());
            case 1699:
                akkp akkpVar55 = this.a.a;
                return new baik(akkpVar55.dn, akkpVar55.dB, akkpVar55.dp, akkpVar55.f, akkpVar55.ay, akkpVar55.gC);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.b;
        switch (i) {
            case 1700:
                Context context = (Context) this.a.q.b();
                akis akisVar = this.a;
                return new alwt(context, akisVar.a.az, (dkpp) akisVar.aQ.b(), (csjk) this.a.a.el.b(), (ctud) this.a.cT.b());
            case 1701:
                errl errlVar = (errl) this.a.aK.b();
                errl errlVar2 = (errl) this.a.p.b();
                errm errmVar = (errm) this.a.p.b();
                ContactsService contactsService = (ContactsService) this.a.a.dm.b();
                akkp akkpVar = this.a.a;
                return new colc(errlVar, errlVar2, errmVar, contactsService, akkpVar.G, (avjf) akkpVar.eT.b());
            case 1702:
                return new baoa(this.a.a.yl);
            case 1703:
                chpz chpzVar = (chpz) this.a.a.cz.b();
                errl errlVar3 = (errl) this.a.p.b();
                chfz chfzVar = (chfz) this.a.a.Cn.b();
                Optional optional = (Optional) this.a.a.uP.b();
                csiy csiyVar = (csiy) this.a.aN.b();
                akkp akkpVar2 = this.a.a;
                return new cpqo(chpzVar, errlVar3, chfzVar, optional, csiyVar, akkpVar2.aT, akkpVar2.G, akkpVar2.Fe);
            case 1704:
                final fbbf fbbfVar = this.a.a.s;
                return new atsg() { // from class: atqd
                    @Override // defpackage.atsg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.set_invalid_protocol_buffer_exception_for_dsdr_related_setting_store_configs");
                    }
                };
            case 1705:
                akkp akkpVar3 = this.a.a;
                return new crgz(akkpVar3.br, akkpVar3.bC, akkpVar3.gE, akkpVar3.bo);
            case 1706:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                akkp akkpVar4 = this.a.a;
                return new crgy(ffskVar, akkpVar4.Fi, akkpVar4.Ct, akkpVar4.Fg, akkpVar4.Fj);
            case 1707:
                return new crgu((eniz) this.a.a.Fh.b());
            case 1708:
                return crgq.a(this.a.a.qI());
            case 1709:
                return new azei(fbbh.a(), (ffsk) this.a.a.p.b());
            case 1710:
                return enip.r(new cibm(), this.a.a.hN());
            case 1711:
                akkp akkpVar5 = this.a.a;
                enin i2 = enip.i(4);
                i2.j(akkpVar5.rq());
                i2.j(this.a.a.rr());
                i2.c(this.a.a.qt());
                i2.c(this.a.a.iL());
                return i2.g();
            case 1712:
                final fbbf fbbfVar2 = this.a.a.s;
                return new dixm() { // from class: diwg
                    @Override // defpackage.dixm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.enable_compose_actions");
                    }
                };
            case 1713:
                return Optional.of(this.a.a.rH());
            case 1714:
                return new enpx((ckds) this.a.a.dp.b());
            case 1715:
                return new chxl((errl) this.a.t.b(), (chzf) this.a.a.Fq.b(), (chhg) this.a.a.cA.b(), (ctwb) this.a.a.c.b(), (ctvb) this.a.a.u.b(), (csxu) this.a.aO.b());
            case 1716:
                Context context2 = (Context) this.a.q.b();
                cgzv cgzvVar = (cgzv) this.a.a.ka.b();
                ctap ctapVar = (ctap) this.a.a.co.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                albq albqVar = (albq) this.a.a.di.b();
                errl errlVar4 = (errl) this.a.t.b();
                errl errlVar5 = (errl) this.a.p.b();
                akkp akkpVar6 = this.a.a;
                return new aipl(context2, cgzvVar, ctapVar, akztVar, albqVar, errlVar4, errlVar5, akkpVar6.dw, (faws) akkpVar6.Fv.b(), (csuu) this.a.iL.b(), (chga) this.a.a.cp.b(), this.a.a.Fw);
            case 1717:
                return achx.a(this.a.a.qi());
            case 1718:
                return new aipq((ffsk) this.a.a.p.b(), (ekos) this.a.a.Dv.b());
            case 1719:
                return new aipd((Context) this.a.q.b(), (Executor) this.a.aK.b(), (chga) this.a.a.cp.b(), (aipn) this.a.a.rh.b(), this.a.a.Fw);
            case 1720:
                return new bctx(fbbg.a(this.a.a.t), fbbg.a(this.a.a.ap), fbbg.a(this.a.a.Z));
            case 1721:
                return new ajrn((ajrp) this.a.a.FA.b(), (ctas) this.a.a.lF.b(), this.a.a.bF());
            case 1722:
                return new ajtb((ffsk) this.a.a.p.b(), (ffhd) this.a.cn.b(), (ffhd) this.a.co.b(), this.a.a.Y());
            case 1723:
                return Long.valueOf(fdfk.a(this.a.a.or()));
            case 1724:
                return new asvk() { // from class: asds
                };
            case 1725:
                akkp akkpVar7 = this.a.a;
                return new cdwh(akkpVar7.FF, akkpVar7.Gk, akkpVar7.cm, akkpVar7.Gl);
            case 1726:
                cins cinsVar = (cins) this.a.a.jc.b();
                Optional optional2 = (Optional) this.a.mO.b();
                Optional optional3 = (Optional) this.a.mP.b();
                axkm axkmVar = (axkm) this.a.a.ck.b();
                axmm axmmVar = (axmm) this.a.a.qL.b();
                akis akisVar2 = this.a;
                return new tet(cinsVar, optional2, optional3, axkmVar, axmmVar, akisVar2.a.AF, (Context) akisVar2.q.b(), (ffsk) this.a.a.q.b());
            case 1727:
                akkp akkpVar8 = this.a.a;
                fbbf fbbfVar3 = akkpVar8.cD;
                ccrm fX = akkpVar8.fX();
                babm babmVar = (babm) akkpVar8.wl.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                akkp akkpVar9 = this.a.a;
                fbbf fbbfVar4 = akkpVar9.ej;
                fbbf fbbfVar5 = akkpVar9.FM;
                asif asifVar = (asif) akkpVar9.cl.b();
                akzt akztVar2 = (akzt) this.a.a.al.b();
                axkm axkmVar2 = (axkm) this.a.a.ck.b();
                akis akisVar3 = this.a;
                fbbf fbbfVar6 = akisVar3.a.FN;
                errl errlVar6 = (errl) akisVar3.t.b();
                errl errlVar7 = (errl) this.a.p.b();
                Context context3 = (Context) this.a.q.b();
                axdf axdfVar = (axdf) this.a.a.cm.b();
                akkp akkpVar10 = this.a.a;
                cddf gg = akkpVar10.gg();
                cdcc gf = akkpVar10.gf();
                cdyb gH = akkpVar10.gH();
                cdrc gA = akkpVar10.gA();
                babf babfVar = (babf) akkpVar10.pN.b();
                axmm axmmVar2 = (axmm) this.a.a.qL.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                Optional.empty();
                this.a.a.sj();
                akis akisVar4 = this.a;
                fbbf fbbfVar7 = akisVar4.aR;
                akkp akkpVar11 = akisVar4.a;
                fbbf fbbfVar8 = akkpVar11.Gg;
                fbbf fbbfVar9 = akkpVar11.Gh;
                ejvp ejvpVar = (ejvp) fbbfVar7.b();
                akkp akkpVar12 = this.a.a;
                asiv bq = akkpVar12.bq();
                ashx ashxVar = (ashx) akkpVar12.Gi.b();
                Optional.of(this.a.a.dV());
                return new crvg(fbbfVar3, fX, babmVar, dtuuVar, cbwjVar, fbbfVar4, fbbfVar5, asifVar, akztVar2, axkmVar2, fbbfVar6, errlVar6, errlVar7, context3, axdfVar, gg, gf, gH, gA, babfVar, axmmVar2, cqohVar, fbbfVar8, fbbfVar9, ejvpVar, bq, ashxVar);
            case 1728:
                akkp akkpVar13 = this.a.a;
                return enip.v(akkpVar13.fV(), akkpVar13.fU(), akkpVar13.fP(), akkpVar13.fW(), akkpVar13.fR(), new ccdv(), new cctr[0]);
            case 1729:
                return new cctp((axkm) this.a.a.ck.b(), (ashh) this.a.a.FG.b());
            case 1730:
                final fbbf fbbfVar10 = this.a.a.s;
                return new ashh() { // from class: arhm
                    @Override // defpackage.ashh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_trigger_name_in_cms_triggers");
                    }
                };
            case 1731:
                return Optional.of(this.a.a.qJ());
            case 1732:
                final fbbf fbbfVar11 = this.a.a.s;
                return new ashs() { // from class: arif
                    @Override // defpackage.ashs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_backup_completeness");
                    }
                };
            case 1733:
                return Optional.of(this.a.a.re());
            case 1734:
                return Boolean.valueOf(arip.a((ersq) this.a.a.s.b()));
            case 1735:
                return new cead(this.a.a.cc);
            case 1736:
                final fbbf fbbfVar12 = this.a.a.s;
                return new ashm() { // from class: arhv
                    @Override // defpackage.ashm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.bnr_delay_media_download");
                    }
                };
            case 1737:
                final fbbf fbbfVar13 = this.a.a.s;
                return new ashn() { // from class: arhx
                    @Override // defpackage.ashn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.bnr_delay_media_upload");
                    }
                };
            case 1738:
                akkp akkpVar14 = this.a.a;
                akkpVar14.fR();
                akkpVar14.fV();
                this.a.a.fP();
                this.a.a.fU();
                akis akisVar5 = this.a;
                akkp akkpVar15 = akisVar5.a;
                akkpVar15.fW();
                return new ccbt(akkpVar15.gk(), (errl) akisVar5.p.b(), (errl) this.a.t.b());
            case 1739:
                return new cdgk((cbwj) this.a.a.kG.b(), (axdf) this.a.a.cm.b(), (cfyt) this.a.a.cf.b(), (asjt) this.a.a.ch.b(), (asih) this.a.a.FQ.b(), (ffhd) this.a.co.b(), this.a.a.ck);
            case 1740:
                return new asih() { // from class: arje
                };
            case 1741:
                return Optional.of((bzjz) this.a.a.FT.b());
            case 1742:
                Context context4 = (Context) this.a.q.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akkp akkpVar16 = this.a.a;
                return new bzka(context4, ffskVar2, akkpVar16.cX, (ejar) akkpVar16.au.b(), this.a.a.C);
            case 1743:
                dtve dtveVar = (dtve) this.a.a.cD.b();
                akkp akkpVar17 = this.a.a;
                ccrm fX2 = akkpVar17.fX();
                cccl ccclVar = (cccl) akkpVar17.tW.b();
                akkp akkpVar18 = this.a.a;
                cefm gK = akkpVar18.gK();
                cegb gM = akkpVar18.gM();
                cejp gQ = akkpVar18.gQ();
                cefu gL = akkpVar18.gL();
                cegh gN = akkpVar18.gN();
                cdxt gG = akkpVar18.gG();
                cdiv gl = akkpVar18.gl();
                cdcc gf2 = akkpVar18.gf();
                cdyb gH2 = akkpVar18.gH();
                cedy gJ = akkpVar18.gJ();
                cdeq gh = akkpVar18.gh();
                cbzo fN = akkpVar18.fN();
                ceib ceibVar = (ceib) akkpVar18.FV.b();
                akkp akkpVar19 = this.a.a;
                cegs gO = akkpVar19.gO();
                cehz cehzVar = (cehz) akkpVar19.FW.b();
                crud crudVar = (crud) this.a.mQ.b();
                csct csctVar = (csct) this.a.mR.b();
                ashs ashsVar = (ashs) this.a.a.FJ.b();
                babf babfVar2 = (babf) this.a.a.pN.b();
                axkm axkmVar3 = (axkm) this.a.a.ck.b();
                cead ceadVar = (cead) this.a.a.FN.b();
                akis akisVar6 = this.a;
                akkp akkpVar20 = akisVar6.a;
                cdyu bS = akisVar6.bS();
                dtuu dtuuVar2 = (dtuu) akkpVar20.ay.b();
                cdkg cdkgVar = (cdkg) this.a.a.su.b();
                akkp akkpVar21 = this.a.a;
                axeb dU = akkpVar21.dU();
                asiv bq2 = akkpVar21.bq();
                ffsk ffskVar3 = (ffsk) akkpVar21.p.b();
                axcn axcnVar = (axcn) this.a.cG.b();
                cdrh cdrhVar = (cdrh) this.a.a.FX.b();
                cdri cdriVar = (cdri) this.a.a.FY.b();
                cdrk cdrkVar = (cdrk) this.a.a.FZ.b();
                cdrq cdrqVar = (cdrq) this.a.a.Ga.b();
                cdrm cdrmVar = (cdrm) this.a.a.Gb.b();
                cdro cdroVar = (cdro) this.a.a.Gc.b();
                akzt akztVar3 = (akzt) this.a.a.al.b();
                akkp akkpVar22 = this.a.a;
                return new crzn(dtveVar, fX2, ccclVar, gK, gM, gQ, gL, gN, gG, gl, gf2, gH2, gJ, gh, fN, ceibVar, gO, cehzVar, crudVar, csctVar, ashsVar, babfVar2, axkmVar3, ceadVar, bS, dtuuVar2, cdkgVar, dU, bq2, ffskVar3, axcnVar, cdrhVar, cdriVar, cdrkVar, cdrqVar, cdrmVar, cdroVar, akztVar3, akkpVar22.ca(), (cefc) akkpVar22.Gd.b(), (cdhd) this.a.a.tY.b(), (cdgw) this.a.a.tZ.b(), (cdyp) this.a.a.Ge.b(), (cdyj) this.a.a.Gf.b(), this.a.a.gZ());
            case 1744:
                return new ceib(this.a.a.cc);
            case 1745:
                return new cehz(this.a.a.cc);
            case 1746:
                return new cdrh(this.a.a.cc);
            case 1747:
                return new cdri(this.a.a.cc);
            case 1748:
                return new cdrk(this.a.a.cc);
            case 1749:
                return new cdrq(this.a.a.cc);
            case 1750:
                return new cdrm(this.a.a.cc);
            case 1751:
                return new cdro(this.a.a.cc);
            case 1752:
                return new cefc((ffsk) this.a.a.p.b());
            case 1753:
                return new cdyp(this.a.a.cc);
            case 1754:
                return new cdyj(this.a.a.cc);
            case 1755:
                return new cena((crzf) this.a.a.Gg.b(), (dtuu) this.a.a.ay.b(), (ffhd) this.a.co.b(), (ffsk) this.a.a.q.b());
            case 1756:
                final fbbf fbbfVar14 = this.a.a.s;
                return new ashx() { // from class: arin
                    @Override // defpackage.ashx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_bnr_mms_push_notification");
                    }
                };
            case 1757:
                akis akisVar7 = this.a;
                return new crok(akisVar7.q, akisVar7.co, akisVar7.dF, akisVar7.a.p);
            case 1758:
                final fbbf fbbfVar15 = this.a.a.s;
                return new asii() { // from class: arjg
                    @Override // defpackage.asii
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_logging_stack_trace_for_auto_opt_out");
                    }
                };
            case 1759:
                akkp akkpVar23 = this.a.a;
                return new azei(akkpVar23.Gn, (ffsk) akkpVar23.p.b());
            case 1760:
                return new enpx((ceeu) this.a.a.uS.b());
            case 1761:
                akkp akkpVar24 = this.a.a;
                return ceec.a(akkpVar24.pd(), akkpVar24.gC());
            case 1762:
                akkp akkpVar25 = this.a.a;
                return cdxf.a(akkpVar25.gC(), akkpVar25.gE());
            case 1763:
                akkp akkpVar26 = this.a.a;
                return ceoe.a(akkpVar26.gC(), akkpVar26.gY());
            case 1764:
                return this.a.a.ge();
            case 1765:
                akkp akkpVar27 = this.a.a;
                return cdxj.a(akkpVar27.gC(), akkpVar27.gF());
            case 1766:
                akkp akkpVar28 = this.a.a;
                return cdld.a(akkpVar28.gC(), akkpVar28.gt());
            case 1767:
                akkp akkpVar29 = this.a.a;
                return new bdjk(akkpVar29.vK, akkpVar29.rq, akkpVar29.vL, (atky) akkpVar29.rs.b());
            case 1768:
                akkp akkpVar30 = this.a.a;
                return cdlf.a(akkpVar30.gC(), akkpVar30.gt());
            case 1769:
                akkp akkpVar31 = this.a.a;
                return cdli.a(akkpVar31.gC(), akkpVar31.gt());
            case 1770:
                akkp akkpVar32 = this.a.a;
                return cdlh.a(akkpVar32.gC(), akkpVar32.gt());
            case 1771:
                akkp akkpVar33 = this.a.a;
                return cdle.a(akkpVar33.gC(), akkpVar33.gt());
            case 1772:
                akkp akkpVar34 = this.a.a;
                return cdlg.a(akkpVar34.gC(), akkpVar34.gt());
            case 1773:
                akkp akkpVar35 = this.a.a;
                return cdqg.a(akkpVar35.gC(), akkpVar35.gy());
            case 1774:
                akkp akkpVar36 = this.a.a;
                return cdqy.a(akkpVar36.gC(), akkpVar36.gz());
            case 1775:
                Context context5 = (Context) this.a.q.b();
                albq albqVar2 = (albq) this.a.a.di.b();
                akzt akztVar4 = (akzt) this.a.a.f.b();
                return new ctak(context5, albqVar2, akztVar4, this.a.jG);
            case 1776:
                return Boolean.valueOf(fdfm.a(this.a.a.or()));
            case 1777:
                final fbbf fbbfVar16 = this.a.a.s;
                return new asid() { // from class: arix
                    @Override // defpackage.asid
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_foreground_service_for_media_backup");
                    }
                };
            case 1778:
                akkp akkpVar37 = this.a.a;
                return cdsa.a(akkpVar37.gC(), akkpVar37.gB());
            case 1779:
                akkp akkpVar38 = this.a.a;
                return cdsc.a(akkpVar38.gC(), akkpVar38.gB());
            case 1780:
                akkp akkpVar39 = this.a.a;
                return cdse.a(akkpVar39.gC(), akkpVar39.gB());
            case 1781:
                akkp akkpVar40 = this.a.a;
                return cdsg.a(akkpVar40.gC(), akkpVar40.gB());
            case 1782:
                akkp akkpVar41 = this.a.a;
                return cdsf.a(akkpVar41.gC(), akkpVar41.gB(), akkpVar41.fS());
            case 1783:
                akkp akkpVar42 = this.a.a;
                return cdrz.a(akkpVar42.gC(), akkpVar42.gB(), akkpVar42.fS());
            case 1784:
                akkp akkpVar43 = this.a.a;
                return cdsb.a(akkpVar43.gC(), akkpVar43.gB(), akkpVar43.fS());
            case 1785:
                akkp akkpVar44 = this.a.a;
                return cdsd.a(akkpVar44.gC(), akkpVar44.gB(), akkpVar44.fS());
            case 1786:
                akkp akkpVar45 = this.a.a;
                return cdry.a(akkpVar45.gC(), akkpVar45.gB());
            case 1787:
                akkp akkpVar46 = this.a.a;
                return cdrx.a(akkpVar46.gC(), akkpVar46.gB());
            case 1788:
                akkp akkpVar47 = this.a.a;
                Object pm = akkpVar47.pm();
                cdwi gC = akkpVar47.gC();
                akkpVar47.sk();
                return cdxr.a(pm, gC);
            case 1789:
                akkp akkpVar48 = this.a.a;
                Object pn = akkpVar48.pn();
                cdwi gC2 = akkpVar48.gC();
                akkpVar48.sl();
                return cdxs.a(pn, gC2);
            case 1790:
                akkp akkpVar49 = this.a.a;
                return ceiy.a(akkpVar49.gC(), akkpVar49.gP());
            case 1791:
                akkp akkpVar50 = this.a.a;
                return ceiz.a(akkpVar50.gC(), akkpVar50.gP());
            case 1792:
                akkp akkpVar51 = this.a.a;
                return ceja.a(akkpVar51.gC(), akkpVar51.gP(), akkpVar51.fY());
            case 1793:
                return this.a.a.ec();
            case 1794:
                return this.a.a.fq();
            case 1795:
                return cemj.a(this.a.a.gC(), new cemh());
            case 1796:
                akkp akkpVar52 = this.a.a;
                return cemq.a(akkpVar52.gC(), akkpVar52.gU(), akkpVar52.gS());
            case 1797:
                return new csbt((cryl) this.a.a.GZ.b());
            case 1798:
                akis akisVar8 = this.a;
                fbbf fbbfVar17 = akisVar8.cF;
                akkp akkpVar53 = akisVar8.a;
                return new cryl(akkpVar53.az, akkpVar53.bo(), (axcp) fbbfVar17.b());
            case 1799:
                final fbbf fbbfVar18 = this.a.a.s;
                return new ataa() { // from class: aszg
                    @Override // defpackage.ataa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.restore_temp_sending_failures_as_permanent_failures");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v126, types: [cebg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [avtc, java.lang.Object] */
    private final Object l() {
        int i = this.b;
        switch (i) {
            case 1800:
                final fbbf fbbfVar = this.a.a.s;
                return new asyh() { // from class: asyk
                    @Override // defpackage.asyh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_cms_support_for_rcs_location");
                    }
                };
            case 1801:
                final fbbf fbbfVar2 = this.a.a.s;
                return new aszy() { // from class: aszc
                    @Override // defpackage.aszy
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.optimize_bugle_id_queries_in_cms_messages_factory");
                    }
                };
            case 1802:
                return cdqz.a(this.a.a.gC(), new cdrb());
            case 1803:
                akkp akkpVar = this.a.a;
                return cemw.a(akkpVar.gC(), akkpVar.gV(), akkpVar.gT());
            case 1804:
                return this.a.a.lB();
            case 1805:
                akkp akkpVar2 = this.a.a;
                return cdyo.a(akkpVar2.gC(), akkpVar2.gI());
            case 1806:
                akkp akkpVar3 = this.a.a;
                return cdfk.a(akkpVar3.gC(), akkpVar3.gj());
            case 1807:
                akkp akkpVar4 = this.a.a;
                return ceoq.a(akkpVar4.gC(), akkpVar4.ha());
            case 1808:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                Context context = (Context) this.a.q.b();
                babm babmVar = (babm) this.a.a.wl.b();
                akis akisVar = this.a;
                return new cdgu(ffskVar, context, babmVar, akisVar.a.fQ(), (cqoh) akisVar.cz.b(), (axkm) this.a.a.ck.b());
            case 1809:
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                axwk axwkVar = (axwk) this.a.a.mo.b();
                axwf axwfVar = (axwf) this.a.a.Hm.b();
                akkp akkpVar5 = this.a.a;
                ayag dY = akkpVar5.dY();
                fbbf fbbfVar3 = akkpVar5.ml;
                aydo aydoVar = (aydo) akkpVar5.Hn.b();
                akkp akkpVar6 = this.a.a;
                return new axzh(ffskVar2, cbwjVar, axwkVar, axwfVar, dY, fbbfVar3, aydoVar, akkpVar6.ej, akkpVar6.mj, akkpVar6.al, akkpVar6.Hs);
            case 1810:
                return new axwf((ffhd) this.a.co.b(), (dtuu) this.a.a.ay.b(), (aolr) this.a.a.Z.b());
            case 1811:
                return new aydo(this.a.a.cc);
            case 1812:
                akkp akkpVar7 = this.a.a;
                return new azei(akkpVar7.Hr, (ffsk) akkpVar7.p.b());
            case 1813:
                return new enpx((axzy) this.a.a.Hq.b());
            case 1814:
                akis akisVar2 = this.a;
                akkp akkpVar8 = akisVar2.a;
                fbbf fbbfVar4 = akkpVar8.Ho;
                ffsk ffskVar3 = (ffsk) akkpVar8.p.b();
                akis akisVar3 = this.a;
                akkp akkpVar9 = akisVar3.a;
                return new axzz(fbbfVar4, akisVar2.cz, ffskVar3, akisVar3.p, akkpVar9.Hp);
            case 1815:
                return Long.valueOf(fcyo.a(this.a.a.nJ()));
            case 1816:
                return Long.valueOf(fcyp.a(this.a.a.nJ()));
            case 1817:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                akis akisVar4 = this.a;
                akkp akkpVar10 = akisVar4.a;
                return new axzn(ffskVar4, akkpVar10.mo, akkpVar10.Hu, akkpVar10.Hv, akkpVar10.al, akisVar4.cN, akkpVar10.Hs);
            case 1818:
                return new ayas(this.a.a.cc);
            case 1819:
                return new aydt(this.a.a.cc);
            case 1820:
                return new cepn((cbgf) this.a.a.dA.b(), (dtuu) this.a.a.ay.b(), (errl) this.a.t.b());
            case 1821:
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                akis akisVar5 = this.a;
                akkp akkpVar11 = akisVar5.a;
                return new aydl(ffskVar5, akkpVar11.Hy, akkpVar11.mt, akkpVar11.Hz, akkpVar11.HA, akisVar5.cN, akisVar5.cz, akisVar5.ay, akkpVar11.Hs, akkpVar11.al);
            case 1822:
                return new aydx((aqkp) this.a.a.mu.b(), this.a.cN);
            case 1823:
                return Long.valueOf(fdgr.a(this.a.a.ow()));
            case 1824:
                return Long.valueOf(fdgs.a(this.a.a.ow()));
            case 1825:
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                akis akisVar6 = this.a;
                akkp akkpVar12 = akisVar6.a;
                return new aydq(ffskVar6, akkpVar12.Hy, akkpVar12.mt, akkpVar12.Hz, akkpVar12.HA, akisVar6.ay, akisVar6.cz, akkpVar12.al);
            case 1826:
                return new clvd((ffsk) this.a.a.aq.b(), (cvlf) this.a.a.hG.b(), (azcn) this.a.a.kJ.b(), (azcj) this.a.a.kQ.b(), this.a.a.pV());
            case 1827:
                return new cdgz((ffsk) this.a.a.aq.b(), (Context) this.a.q.b(), (babm) this.a.a.wl.b(), (cqoh) this.a.cz.b(), (axkm) this.a.a.ck.b(), (cdgx) this.a.a.ua.b());
            case 1828:
                return new cgrf((ffsk) this.a.a.q.b(), (cfyt) this.a.a.cf.b());
            case 1829:
                akkp akkpVar13 = this.a.a;
                return new cagt(akkpVar13.sQ, akkpVar13.cv, fbaz.a(akkpVar13.cC), (ffsk) this.a.a.q.b());
            case 1830:
                return new cfks((ffsk) this.a.a.q.b(), enip.q(), (cfkw) this.a.a.HH.b(), (cflm) this.a.a.HI.b());
            case 1831:
                return new cfkw(this.a.a.aT);
            case 1832:
                return new cflm((cfkw) this.a.a.HH.b(), (dtuu) this.a.a.ay.b());
            case 1833:
                cqoh cqohVar = (cqoh) this.a.cz.b();
                errl errlVar = (errl) this.a.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                akkp akkpVar14 = this.a.a;
                return new ceqz(cqohVar, errlVar, errlVar2, akkpVar14.he(), (badw) akkpVar14.HL.b());
            case 1834:
                akis akisVar7 = this.a;
                fbbf fbbfVar5 = akisVar7.cz;
                akkp akkpVar15 = akisVar7.a;
                fbbf fbbfVar6 = akkpVar15.dB;
                fbbf fbbfVar7 = akkpVar15.dn;
                cqoh cqohVar2 = (cqoh) fbbfVar5.b();
                akkp akkpVar16 = this.a.a;
                return new badw(fbbfVar6, fbbfVar7, cqohVar2, akkpVar16.ds, (bbel) akkpVar16.HK.b(), (ayif) this.a.a.ia.b());
            case 1835:
                akkp akkpVar17 = this.a.a;
                return new bbel(akkpVar17.hv, (coxk) akkpVar17.iN.b());
            case 1836:
                ffsk ffskVar7 = (ffsk) this.a.a.aq.b();
                akkp akkpVar18 = this.a.a;
                cmpx ju = akkpVar18.ju();
                cmel cmelVar = (cmel) akkpVar18.vV.b();
                akkp akkpVar19 = this.a.a;
                return new cmpq(ffskVar7, ju, cmelVar, akkpVar19.HO, akkpVar19.HP);
            case 1837:
                Context context2 = (Context) this.a.q.b();
                akis akisVar8 = this.a;
                return cmpw.a(context2, akisVar8.a.mK(), (errl) akisVar8.t.b());
            case 1838:
                ffsk ffskVar8 = (ffsk) this.a.a.aq.b();
                akkp akkpVar20 = this.a.a;
                return new cmqb(ffskVar8, akkpVar20.cN, akkpVar20.bi);
            case 1839:
                final fbbf fbbfVar8 = this.a.a.s;
                return new diws() { // from class: diux
                    @Override // defpackage.diws
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.enable_grpc_to_tycho_for_fi_multi_sync_status");
                    }
                };
            case 1840:
                return new aydd((ffsk) this.a.a.p.b(), (aybz) this.a.a.Ig.b());
            case 1841:
                ffsk ffskVar9 = (ffsk) this.a.a.p.b();
                akis akisVar9 = this.a;
                akkp akkpVar21 = akisVar9.a;
                fbbf fbbfVar9 = akkpVar21.HU;
                fbbf fbbfVar10 = akkpVar21.Ic;
                fbbf fbbfVar11 = akkpVar21.HT;
                fbbf fbbfVar12 = akkpVar21.Ib;
                fbbf fbbfVar13 = akkpVar21.Id;
                ejoc ejocVar = (ejoc) akisVar9.dX.b();
                akis akisVar10 = this.a;
                akkp akkpVar22 = akisVar10.a;
                return new aycd(ffskVar9, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, ejocVar, akkpVar22.Ie, akisVar10.mY, akkpVar22.HR, akkpVar22.If);
            case 1842:
                Executor executor = (Executor) this.a.p.b();
                elbx elbxVar = (elbx) this.a.aJ.b();
                ffsk ffskVar10 = (ffsk) this.a.a.p.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar14 = akisVar11.a.f7do;
                aycf aycfVar = (aycf) akisVar11.mX.b();
                akkp akkpVar23 = this.a.a;
                return new aybd(executor, elbxVar, ffskVar10, fbbfVar14, aycfVar, akkpVar23.HT, akkpVar23.mj);
            case 1843:
                ffhd ffhdVar = (ffhd) this.a.cn.b();
                ffhd ffhdVar2 = (ffhd) this.a.co.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                cbwj cbwjVar2 = (cbwj) this.a.a.kG.b();
                comc comcVar = (comc) this.a.a.HR.b();
                axwk axwkVar2 = (axwk) this.a.a.mo.b();
                axwf axwfVar2 = (axwf) this.a.a.Hm.b();
                akkp akkpVar24 = this.a.a;
                fbbf fbbfVar15 = akkpVar24.ej;
                fbbf fbbfVar16 = akkpVar24.C;
                fbbf fbbfVar17 = akkpVar24.al;
                fbbf fbbfVar18 = akkpVar24.ml;
                fbbf fbbfVar19 = akkpVar24.HS;
                aydo aydoVar2 = (aydo) akkpVar24.Hn.b();
                aydt aydtVar = (aydt) this.a.a.Hv.b();
                akis akisVar12 = this.a;
                return new aybp(ffhdVar, ffhdVar2, cqohVar3, cbwjVar2, comcVar, axwkVar2, axwfVar2, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, aydoVar2, aydtVar, akisVar12.a.mj, akisVar12.ay);
            case 1844:
                return axvy.a(this.a.a.aT);
            case 1845:
                return Long.valueOf(fdgq.a(this.a.a.ow()));
            case 1846:
                Executor executor2 = (Executor) this.a.p.b();
                elbx elbxVar2 = (elbx) this.a.aJ.b();
                ffsk ffskVar11 = (ffsk) this.a.a.p.b();
                akis akisVar13 = this.a;
                fbbf fbbfVar20 = akisVar13.a.f7do;
                aycf aycfVar2 = (aycf) akisVar13.mX.b();
                akkp akkpVar25 = this.a.a;
                return new aych(executor2, elbxVar2, ffskVar11, fbbfVar20, aycfVar2, akkpVar25.Ib, akkpVar25.mj);
            case 1847:
                ffhd ffhdVar3 = (ffhd) this.a.cn.b();
                ffhd ffhdVar4 = (ffhd) this.a.co.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                cbwj cbwjVar3 = (cbwj) this.a.a.kG.b();
                comc comcVar2 = (comc) this.a.a.HR.b();
                axwk axwkVar3 = (axwk) this.a.a.mo.b();
                axwf axwfVar3 = (axwf) this.a.a.Hm.b();
                akkp akkpVar26 = this.a.a;
                return new aycs(ffhdVar3, ffhdVar4, cqohVar4, cbwjVar3, comcVar2, axwkVar3, axwfVar3, akkpVar26.ej, akkpVar26.C, akkpVar26.al, akkpVar26.HY, akkpVar26.HZ, akkpVar26.Ia, akkpVar26.ml, (aydt) akkpVar26.Hv.b(), this.a.ay);
            case 1848:
                ffhd ffhdVar5 = (ffhd) this.a.cn.b();
                cbwj cbwjVar4 = (cbwj) this.a.a.kG.b();
                ayas ayasVar = (ayas) this.a.a.Hu.b();
                comc comcVar3 = (comc) this.a.a.HR.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                akkp akkpVar27 = this.a.a;
                return new axzx(ffhdVar5, cbwjVar4, ayasVar, comcVar3, cqohVar5, akkpVar27.HV, akkpVar27.ml, akkpVar27.HW, akkpVar27.HX, akkpVar27.al);
            case 1849:
                return new aybb(this.a.a.cc);
            case 1850:
                return Long.valueOf(fcyk.a(this.a.a.nJ()));
            case 1851:
                return Long.valueOf(fcyl.a(this.a.a.nJ()));
            case 1852:
                return Boolean.valueOf(fcym.a(this.a.a.nJ()));
            case 1853:
                return Long.valueOf(fcyj.a(this.a.a.nJ()));
            case 1854:
                return new ayde();
            case 1855:
                return Boolean.valueOf(fcyn.a(this.a.a.nJ()));
            case 1856:
                final fbbf fbbfVar21 = this.a.a.s;
                return new atfa() { // from class: ateo
                    @Override // defpackage.atfa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_contacts_sync_worker_key_suffix");
                    }
                };
            case 1857:
                ffsk ffskVar12 = (ffsk) this.a.a.p.b();
                Optional optional = (Optional) this.a.a.Dx.b();
                eixo eixoVar = (eixo) this.a.a.as.b();
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                cgfd cgfdVar = (cgfd) this.a.a.Dy.b();
                akis akisVar14 = this.a;
                akkp akkpVar28 = akisVar14.a;
                return new cgdm(ffskVar12, optional, eixoVar, ejvbVar, cgfdVar, akisVar14.mu, akkpVar28.cf, (asjt) akkpVar28.ch.b());
            case 1858:
                errl errlVar3 = (errl) this.a.t.b();
                errl errlVar4 = (errl) this.a.p.b();
                akkp akkpVar29 = this.a.a;
                fbbf fbbfVar22 = akkpVar29.dn;
                fbbf fbbfVar23 = akkpVar29.wL;
                avkj avkjVar = (avkj) akkpVar29.jf.b();
                avkc avkcVar = (avkc) this.a.a.G.b();
                akis akisVar15 = this.a;
                akkp akkpVar30 = akisVar15.a;
                fbbf fbbfVar24 = akkpVar30.Ij;
                fbbf fbbfVar25 = akkpVar30.Ik;
                avuh avuhVar = (avuh) this.a.hd.b();
                akkp akkpVar31 = this.a.a;
                return new ckyx(errlVar3, errlVar4, fbbfVar22, fbbfVar23, avkjVar, avkcVar, fbbfVar24, fbbfVar25, avuhVar, akkpVar31.AX, akkpVar31.gQ, akkpVar31.Il, akkpVar31.cq());
            case 1859:
                return new ckzn(this.a.a.f);
            case 1860:
                akkp akkpVar32 = this.a.a;
                fbbf fbbfVar26 = akkpVar32.az;
                fazb a = fbaz.a(akkpVar32.eq);
                akkp akkpVar33 = this.a.a;
                return new avld(fbbfVar26, a, akkpVar33.D, (csjk) akkpVar33.fQ.b(), (avkk) this.a.a.cH.b(), (avuh) this.a.hd.b(), (avtu) this.a.lD.b(), (avla) this.a.lC.b());
            case 1861:
                final fbbf fbbfVar27 = this.a.a.s;
                return new atzz() { // from class: atzd
                    @Override // defpackage.atzz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.set_conversation_error_state_when_everyone_leaves");
                    }
                };
            case 1862:
                return new arbo((ffsk) this.a.a.p.b(), this.a.dk());
            case 1863:
                ffsk ffskVar13 = (ffsk) this.a.a.aq.b();
                akkp akkpVar34 = this.a.a;
                return new cqwa(ffskVar13, akkpVar34.kj, akkpVar34.dB, (cins) akkpVar34.jc.b(), this.a.a.bD());
            case 1864:
                ffsk ffskVar14 = (ffsk) this.a.a.q.b();
                akkp akkpVar35 = this.a.a;
                fbbf fbbfVar28 = akkpVar35.dn;
                fbbf fbbfVar29 = akkpVar35.iN;
                fbbf fbbfVar30 = akkpVar35.dB;
                ckwy ckwyVar = (ckwy) akkpVar35.Ip.b();
                akis akisVar16 = this.a;
                akkp akkpVar36 = akisVar16.a;
                return new ckwt(ffskVar14, fbbfVar28, fbbfVar29, fbbfVar30, ckwyVar, akkpVar36.ay, akisVar16.mZ, akkpVar36.xv, akkpVar36.Iq, akkpVar36.Ir, akkpVar36.Is);
            case 1865:
                return new ckwy(this.a.a.cc);
            case 1866:
                return Long.valueOf(fdcy.a(this.a.a.og()));
            case 1867:
                return Long.valueOf(fdcu.a(this.a.a.og()));
            case 1868:
                final fbbf fbbfVar31 = this.a.a.s;
                return new atzm() { // from class: atyd
                    @Override // defpackage.atzm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.decrease_mms_group_upgrade_backup_proto_size");
                    }
                };
            case 1869:
                return new cjgh((ffsk) this.a.a.q.b(), this.a.a.dR(), new atlg());
            case 1870:
                axkm axkmVar = (axkm) this.a.a.ck.b();
                crue crueVar = (crue) this.a.a.Gk.b();
                axdf axdfVar = (axdf) this.a.a.cm.b();
                return new ccaz(axkmVar, crueVar, axdfVar, (errl) this.a.p.b(), (errl) this.a.t.b(), (babm) this.a.a.wl.b(), Optional.empty());
            case 1871:
                Context context3 = (Context) this.a.q.b();
                errl errlVar5 = (errl) this.a.p.b();
                akkp akkpVar37 = this.a.a;
                fbbf fbbfVar32 = akkpVar37.Iw;
                Map map = (Map) akkpVar37.ID.b();
                akis akisVar17 = this.a;
                return new cito(context3, errlVar5, fbbfVar32, map, akisVar17.cf(), (ciwb) akisVar17.a.ah.b(), this.a.a.hY());
            case 1872:
                return Long.valueOf(fddr.a(this.a.a.ok()));
            case 1873:
                akkp akkpVar38 = this.a.a;
                return enhk.m(cixf.NT_INCOMING_MESSAGE, akkpVar38.ia(), cixf.NT_DIRECTOR, akkpVar38.ib());
            case 1874:
                errl errlVar6 = (errl) this.a.aK.b();
                errl errlVar7 = (errl) this.a.p.b();
                akis akisVar18 = this.a;
                akkp akkpVar39 = akisVar18.a;
                return new cjcb(errlVar6, errlVar7, akkpVar39.aT, akkpVar39.Iy, akkpVar39.Iz, akisVar18.cf());
            case 1875:
                akis akisVar19 = this.a;
                return new cjad(akisVar19.a.Ix, akisVar19.t, akisVar19.p, akisVar19.aK);
            case 1876:
                akkp akkpVar40 = this.a.a;
                return new cjbl(akkpVar40.Gv, akkpVar40.dQ, akkpVar40.rq, akkpVar40.vK, akkpVar40.vL, (atky) akkpVar40.rs.b());
            case 1877:
                final fbbf fbbfVar33 = this.a.a.s;
                return new auiu() { // from class: auio
                    @Override // defpackage.auiu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_bundle_extractor_for_saving_state");
                    }
                };
            case 1878:
                return new cirp(this.a.a.cc);
            case 1879:
                return new cixv(this.a.a.al);
            case 1880:
                return new ceoz((errl) this.a.aK.b(), (ckds) this.a.a.dp.b());
            case 1881:
                akis akisVar20 = this.a;
                akkp akkpVar41 = akisVar20.a;
                return new tbm(akkpVar41.dG, (tba) akkpVar41.pi(), (errl) akisVar20.t.b(), (errl) this.a.p.b());
            case 1882:
                akis akisVar21 = this.a;
                akkp akkpVar42 = akisVar21.a;
                return new afab(akkpVar42.IG, akisVar21.na, akkpVar42.IH, akkpVar42.II);
            case 1883:
                return new afag(new aezw(), (cpdg) this.a.a.ap.b());
            case 1884:
                aezw aezwVar = new aezw();
                return new aezq(aezwVar);
            case 1885:
                return new aezl(new aezw(), (cpdg) this.a.a.ap.b());
            case 1886:
                errl errlVar8 = (errl) this.a.aK.b();
                akkp akkpVar43 = this.a.a;
                fbbf fbbfVar34 = akkpVar43.dB;
                dtuu dtuuVar = (dtuu) akkpVar43.ay.b();
                akkp akkpVar44 = this.a.a;
                return new aeza(errlVar8, fbbfVar34, dtuuVar, akkpVar44.IK, akkpVar44.IL);
            case 1887:
                akis akisVar22 = this.a;
                akkp akkpVar45 = akisVar22.a;
                return new aexn(akkpVar45.dF, akkpVar45.dE, new aexz(), akkpVar45.dG, (Executor) akisVar22.p.b());
            case 1888:
                akis akisVar23 = this.a;
                akkp akkpVar46 = akisVar23.a;
                return new aexi(akkpVar46.dF, akkpVar46.dE, new aexz(), akkpVar46.dG, (Executor) akisVar23.p.b());
            case 1889:
                akis akisVar24 = this.a;
                akkp akkpVar47 = akisVar24.a;
                return new tbr(akkpVar47.dG, (tba) akkpVar47.pi(), (errl) akisVar24.t.b(), (errl) this.a.p.b());
            case 1890:
                return new cepf((errl) this.a.aK.b(), (Context) this.a.q.b(), Optional.of((cpdd) this.a.a.jo.b()), (asmj) this.a.a.jD.b(), this.a.a.jF);
            case 1891:
                return new cdwy((axkm) this.a.a.ck.b(), (errl) this.a.p.b(), (akzt) this.a.a.al.b(), (cbwj) this.a.a.kG.b());
            case 1892:
                Context context4 = (Context) this.a.q.b();
                babm babmVar2 = (babm) this.a.a.wl.b();
                axdf axdfVar2 = (axdf) this.a.a.cm.b();
                axkm axkmVar2 = (axkm) this.a.a.ck.b();
                errl errlVar9 = (errl) this.a.t.b();
                errl errlVar10 = (errl) this.a.p.b();
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                akkp akkpVar48 = this.a.a;
                return new ccdm(context4, babmVar2, axdfVar2, axkmVar2, errlVar9, errlVar10, cqohVar6, akkpVar48.al, (albq) akkpVar48.sO.b());
            case 1893:
                return new cddg((cddx) this.a.a.pk());
            case 1894:
                return new cecq((axkm) this.a.a.ck.b(), (babf) this.a.a.pN.b(), (Context) this.a.q.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 1895:
                axkm axkmVar3 = (axkm) this.a.a.ck.b();
                babf babfVar = (babf) this.a.a.pN.b();
                return new cedj(axkmVar3, babfVar, (Context) this.a.q.b(), (errl) this.a.t.b());
            case 1896:
                akkp akkpVar49 = this.a.a;
                return new cdjb((cdit) akkpVar49.pl(), (axkm) akkpVar49.ck.b(), (cdih) this.a.a.FF.b(), (axdf) this.a.a.cm.b(), (errl) this.a.p.b());
            case 1897:
                akkp akkpVar50 = this.a.a;
                ?? pW = akkpVar50.pW();
                axkm axkmVar4 = (axkm) akkpVar50.ck.b();
                return new ceap(pW, axkmVar4, (axdf) this.a.a.cm.b(), (cqoh) this.a.cz.b(), (akzt) this.a.a.al.b());
            case 1898:
                return Boolean.valueOf(fcyf.a(this.a.a.nI()));
            case 1899:
                return new cefq((axdf) this.a.a.cm.b(), (babm) this.a.a.wl.b(), (errl) this.a.t.b(), (Context) this.a.q.b(), this.a.a.fZ());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        Object bamxVar;
        int i = this.b;
        switch (i) {
            case 1900:
                babm babmVar = (babm) this.a.a.wl.b();
                axdf axdfVar = (axdf) this.a.a.cm.b();
                errl errlVar = (errl) this.a.t.b();
                Context context = (Context) this.a.q.b();
                akkp akkpVar = this.a.a;
                return new cefy(babmVar, axdfVar, errlVar, context, akkpVar.fY(), akkpVar.fZ());
            case 1901:
                return new cegg((babm) this.a.a.wl.b(), (errl) this.a.t.b(), (axdf) this.a.a.cm.b(), (Context) this.a.q.b(), this.a.a.fZ());
            case 1902:
                babm babmVar2 = (babm) this.a.a.wl.b();
                Context context2 = (Context) this.a.q.b();
                errl errlVar2 = (errl) this.a.t.b();
                axdf axdfVar2 = (axdf) this.a.a.cm.b();
                akkp akkpVar2 = this.a.a;
                return new cegm(babmVar2, context2, errlVar2, axdfVar2, akkpVar2.fY(), akkpVar2.fZ());
            case 1903:
                babm babmVar3 = (babm) this.a.a.wl.b();
                errl errlVar3 = (errl) this.a.t.b();
                axdf axdfVar3 = (axdf) this.a.a.cm.b();
                Context context3 = (Context) this.a.q.b();
                akkp akkpVar3 = this.a.a;
                return new cejt(babmVar3, errlVar3, axdfVar3, context3, akkpVar3.fY(), akkpVar3.fZ());
            case 1904:
                return new cedw((axkm) this.a.a.ck.b(), (babf) this.a.a.pN.b(), (Context) this.a.q.b(), (errl) this.a.t.b());
            case 1905:
                return new bzob(fbaz.a(this.a.a.uT), fbaz.a(this.a.a.kd), (errl) this.a.p.b(), (errl) this.a.t.b());
            case 1906:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                akkp akkpVar4 = this.a.a;
                return new bzrm(ffskVar, akkpVar4.fe(), akkpVar4.cj());
            case 1907:
                return new bdfo((ffsk) this.a.a.aq.b(), (bcll) this.a.a.Ji.b());
            case 1908:
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar = akkpVar5.fs;
                fbbf fbbfVar2 = akkpVar5.dn;
                dtuu dtuuVar = (dtuu) akkpVar5.ay.b();
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                akkp akkpVar6 = this.a.a;
                return new bclv(fbbfVar, fbbfVar2, dtuuVar, ffhdVar, akkpVar6.Jg, akkpVar6.Jh);
            case 1909:
                final fbbf fbbfVar3 = this.a.a.s;
                return new aucm() { // from class: aucf
                    @Override // defpackage.aucm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.track_refreshed_conversations_in_refresher");
                    }
                };
            case 1910:
                final fbbf fbbfVar4 = this.a.a.s;
                return new auck() { // from class: aucb
                    @Override // defpackage.auck
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.restore_attachment_metadata_in_files");
                    }
                };
            case 1911:
                return new ayfr(this.a.a.jG);
            case 1912:
                Map map = (Map) this.a.a.Jl.b();
                Context context4 = (Context) this.a.q.b();
                errl errlVar4 = (errl) this.a.p.b();
                errl errlVar5 = (errl) this.a.aK.b();
                akis akisVar = this.a;
                akkp akkpVar7 = akisVar.a;
                civj hZ = akkpVar7.hZ();
                cixm cf = akisVar.cf();
                ciwb ciwbVar = (ciwb) akkpVar7.ah.b();
                Map map2 = (Map) this.a.a.ID.b();
                Optional optional = (Optional) this.a.ne.b();
                Optional optional2 = (Optional) this.a.nf.b();
                akis akisVar2 = this.a;
                fbbf fbbfVar5 = akisVar2.cN;
                akkp akkpVar8 = akisVar2.a;
                return new ciun(map, context4, errlVar4, errlVar5, hZ, cf, ciwbVar, map2, optional, optional2, akkpVar8.hY(), akkpVar8.Jo, akkpVar8.Jp, akkpVar8.IC, (ecrj) fbbfVar5.b(), (cqoh) this.a.cz.b(), (ctvs) this.a.aZ.b());
            case 1913:
                return new asua() { // from class: asbg
                };
            case 1914:
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                Context context5 = (Context) this.a.q.b();
                akkp akkpVar9 = this.a.a;
                return new cube(ffskVar2, context5, akkpVar9.ap, akkpVar9.nW);
            case 1915:
                return Long.valueOf(fdds.a(this.a.a.ok()));
            case 1916:
                return Long.valueOf(fddt.a(this.a.a.ok()));
            case 1917:
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                return new amtz(dtuuVar2, this.a.a.Jr);
            case 1918:
                return Boolean.valueOf(aruw.a((ersq) this.a.a.s.b()));
            case 1919:
                return new amqi((ffsk) this.a.a.q.b(), this.a.a.dR(), new atlg());
            case 1920:
                akis akisVar3 = this.a;
                akkp akkpVar10 = akisVar3.a;
                fbbf fbbfVar6 = akkpVar10.az;
                fbbf fbbfVar7 = akkpVar10.Jx;
                errl errlVar6 = (errl) akisVar3.p.b();
                errl errlVar7 = (errl) this.a.t.b();
                akkp akkpVar11 = this.a.a;
                return new bdhy(fbbfVar6, fbbfVar7, errlVar6, errlVar7, akkpVar11.cD, akkpVar11.Jw);
            case 1921:
                return enhk.m(byys.PARTICIPANTS_TABLE_MY_IDENTITY, (bdil) this.a.a.Ju.b(), byys.MY_IDENTITY_FOREIGN_KEY, (bdil) this.a.a.Jv.b());
            case 1922:
                return new aztd((azpl) this.a.a.aH.b(), (dtuu) this.a.a.ay.b(), (ffsk) this.a.a.p.b(), (ffhd) this.a.cP.b(), (ffsk) this.a.a.aq.b());
            case 1923:
                return new azpw((bdii) this.a.a.Jw.b(), (ffsk) this.a.a.p.b(), (ffsk) this.a.a.aq.b());
            case 1924:
                akis akisVar4 = this.a;
                return new bdii(akisVar4.a.qQ(), (errl) akisVar4.p.b(), (errl) this.a.t.b(), enhk.k());
            case 1925:
                Context context6 = (Context) this.a.q.b();
                errl errlVar8 = (errl) this.a.p.b();
                errl errlVar9 = (errl) this.a.t.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                akkp akkpVar12 = this.a.a;
                ceqr hd = akkpVar12.hd();
                cepg hb = akkpVar12.hb();
                ceqm hc = akkpVar12.hc();
                cgri hy = akkpVar12.hy();
                axmw axmwVar = (axmw) akkpVar12.AS.b();
                akkp akkpVar13 = this.a.a;
                fbbf fbbfVar8 = akkpVar13.hv;
                fbbf fbbfVar9 = akkpVar13.AZ;
                fbbf fbbfVar10 = akkpVar13.dn;
                fbbf fbbfVar11 = akkpVar13.dB;
                fbbf fbbfVar12 = akkpVar13.AH;
                akvy akvyVar = (akvy) akkpVar13.DY.b();
                Optional optional3 = (Optional) this.a.a.aQ.b();
                akkp akkpVar14 = this.a.a;
                fbbf fbbfVar13 = akkpVar14.fP;
                fbbf fbbfVar14 = akkpVar14.Jz;
                alrv alrvVar = (alrv) akkpVar14.ej.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                bdvi bdviVar = (bdvi) this.a.a.jh.b();
                akkp akkpVar15 = this.a.a;
                return new ceqb(context6, errlVar8, errlVar9, dtuuVar3, hd, hb, hc, hy, axmwVar, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, akvyVar, optional3, fbbfVar13, fbbfVar14, alrvVar, cbgfVar, bdviVar, akkpVar15.kK(), akkpVar15.DL, akkpVar15.pC, akkpVar15.f22io, akkpVar15.qL, akkpVar15.ck, fbaz.a(akkpVar15.JA));
            case 1926:
                akis akisVar5 = this.a;
                akkp akkpVar16 = akisVar5.a;
                return new aygh(akkpVar16.bi, akkpVar16.dE, akkpVar16.dK, akisVar5.eb, (ffsk) akkpVar16.aq.b());
            case 1927:
                Context context7 = (Context) this.a.q.b();
                akkp akkpVar17 = this.a.a;
                return new cjgb(context7, akkpVar17.il(), akkpVar17.mT, akkpVar17.G, akkpVar17.dn, akkpVar17.uJ, (akzt) akkpVar17.C.b(), (ffsk) this.a.a.q.b());
            case 1928:
                this.a.a.kH();
                return new cqlv((errl) this.a.aK.b());
            case 1929:
                return new ceqj((errl) this.a.aK.b(), (covo) this.a.a.jd.b(), (coxk) this.a.a.iN.b());
            case 1930:
                Context context8 = (Context) this.a.q.b();
                errl errlVar10 = (errl) this.a.p.b();
                errl errlVar11 = (errl) this.a.t.b();
                akkp akkpVar18 = this.a.a;
                fbbf fbbfVar15 = akkpVar18.ej;
                cbut cbutVar = (cbut) this.a.a.qJ.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                axmw axmwVar2 = (axmw) this.a.a.AS.b();
                akkp akkpVar19 = this.a.a;
                return new cgqz(context8, errlVar10, errlVar11, fbbfVar15, cbutVar, akztVar, axmwVar2, akkpVar19.hv, akkpVar19.dB, akkpVar19.pC, akkpVar19.kK(), akkpVar19.fw(), akkpVar19.qG, akkpVar19.pR, akkpVar19.hH);
            case 1931:
                return new cagi(this.a.a.cc);
            case 1932:
                return new ceqo((errl) this.a.aK.b(), (coxk) this.a.a.iN.b());
            case 1933:
                chww chwwVar = (chww) this.a.a.vg.b();
                fazb a = fbaz.a(this.a.a.uZ);
                akis akisVar6 = this.a;
                akkp akkpVar20 = akisVar6.a;
                fbbf fbbfVar16 = akisVar6.ip;
                fazb a2 = fbaz.a(akkpVar20.uV);
                akkp akkpVar21 = this.a.a;
                fbbf fbbfVar17 = akkpVar21.fr;
                fbbf fbbfVar18 = akkpVar21.ka;
                fazb a3 = fbaz.a(akkpVar21.fa);
                chqc chqcVar = (chqc) this.a.a.vh.b();
                akis akisVar7 = this.a;
                fbbf fbbfVar19 = akisVar7.a.f;
                errl errlVar12 = (errl) akisVar7.p.b();
                errl errlVar13 = (errl) this.a.t.b();
                akis akisVar8 = this.a;
                return new cijy(chwwVar, a, fbbfVar16, a2, fbbfVar17, fbbfVar18, a3, chqcVar, fbbfVar19, errlVar12, errlVar13, akisVar8.a.vn, akisVar8.da);
            case 1934:
                chww chwwVar2 = (chww) this.a.a.vg.b();
                fazb a4 = fbaz.a(this.a.a.uZ);
                akis akisVar9 = this.a;
                akkp akkpVar22 = akisVar9.a;
                fbbf fbbfVar20 = akisVar9.ip;
                fazb a5 = fbaz.a(akkpVar22.uV);
                akkp akkpVar23 = this.a.a;
                fbbf fbbfVar21 = akkpVar23.vK;
                fbbf fbbfVar22 = akkpVar23.vG;
                fbbf fbbfVar23 = akkpVar23.vE;
                fbbf fbbfVar24 = akkpVar23.ka;
                fazb a6 = fbaz.a(akkpVar23.fa);
                akis akisVar10 = this.a;
                fbbf fbbfVar25 = akisVar10.a.f;
                errl errlVar14 = (errl) akisVar10.p.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar26 = akisVar11.cz;
                akkp akkpVar24 = akisVar11.a;
                fbbf fbbfVar27 = akkpVar24.rq;
                fbbf fbbfVar28 = akkpVar24.vL;
                fbbf fbbfVar29 = akkpVar24.vM;
                cqoh cqohVar = (cqoh) fbbfVar26.b();
                akis akisVar12 = this.a;
                return new cike(chwwVar2, a4, fbbfVar20, a5, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, a6, fbbfVar25, errlVar14, fbbfVar27, fbbfVar28, fbbfVar29, cqohVar, akisVar12.da, (atky) akisVar12.a.rs.b());
            case 1935:
                chww chwwVar3 = (chww) this.a.a.vg.b();
                fazb a7 = fbaz.a(this.a.a.uZ);
                akis akisVar13 = this.a;
                akkp akkpVar25 = akisVar13.a;
                fbbf fbbfVar30 = akisVar13.ip;
                fazb a8 = fbaz.a(akkpVar25.uV);
                akkp akkpVar26 = this.a.a;
                fbbf fbbfVar31 = akkpVar26.ka;
                fbbf fbbfVar32 = akkpVar26.uU;
                fazb a9 = fbaz.a(akkpVar26.fa);
                akis akisVar14 = this.a;
                return new cikw(chwwVar3, a7, fbbfVar30, a8, fbbfVar31, fbbfVar32, a9, akisVar14.a.f, (errl) akisVar14.p.b(), (errl) this.a.t.b(), this.a.da);
            case 1936:
                akis akisVar15 = this.a;
                akkp akkpVar27 = akisVar15.a;
                fbbf fbbfVar33 = akkpVar27.sR;
                fbbf fbbfVar34 = akkpVar27.dB;
                fbbf fbbfVar35 = akkpVar27.ej;
                fbbf fbbfVar36 = akkpVar27.iP;
                fbbf fbbfVar37 = akkpVar27.JK;
                fbbf fbbfVar38 = akkpVar27.qo;
                fbbf fbbfVar39 = akkpVar27.dR;
                errl errlVar15 = (errl) akisVar15.t.b();
                akis akisVar16 = this.a;
                return new cagv(fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, errlVar15, akisVar16.a.C, akisVar16.iz);
            case 1937:
                return new cahf(this.a.a.cc);
            case 1938:
                Context context9 = (Context) this.a.q.b();
                errl errlVar16 = (errl) this.a.aK.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akkp akkpVar28 = this.a.a;
                return new ceqt(context9, errlVar16, cqohVar2, akkpVar28.fP, (coxk) akkpVar28.iN.b(), (baky) this.a.a.Kd.b(), (axmw) this.a.a.AS.b(), this.a.a.fJ);
            case 1939:
                akkp akkpVar29 = this.a.a;
                fbbf fbbfVar40 = akkpVar29.JQ;
                return new baky(fbbfVar40, akkpVar29.gE, fbbfVar40, fbbfVar40, fbbfVar40, fbbfVar40, fbbfVar40, fbbfVar40);
            case 1940:
                akis akisVar17 = this.a;
                akkp akkpVar30 = akisVar17.a;
                fbbf fbbfVar41 = akisVar17.q;
                fbbf fbbfVar42 = akkpVar30.iM;
                fbbf fbbfVar43 = akkpVar30.ap;
                fbbf fbbfVar44 = akkpVar30.sY;
                fbbf fbbfVar45 = akkpVar30.pY;
                fbbf fbbfVar46 = akkpVar30.jb;
                fbbf fbbfVar47 = akkpVar30.pJ;
                fbbf fbbfVar48 = akkpVar30.fP;
                fbbf fbbfVar49 = akkpVar30.dE;
                fbbf fbbfVar50 = akkpVar30.dB;
                fbbf fbbfVar51 = akkpVar30.dn;
                fbbf fbbfVar52 = akkpVar30.ib;
                fbbf fbbfVar53 = akkpVar30.fs;
                fbbf fbbfVar54 = akkpVar30.ki;
                fbbf fbbfVar55 = akkpVar30.hv;
                fbbf fbbfVar56 = akkpVar30.di;
                fbbf fbbfVar57 = akkpVar30.ty;
                fbbf fbbfVar58 = akkpVar30.tw;
                fbbf fbbfVar59 = akkpVar30.iN;
                fbbf fbbfVar60 = akkpVar30.nj;
                fbbf fbbfVar61 = akkpVar30.aO;
                fbbf fbbfVar62 = akkpVar30.jd;
                fbbf fbbfVar63 = akkpVar30.JM;
                fbbf fbbfVar64 = akkpVar30.JN;
                fbbf fbbfVar65 = akkpVar30.pt;
                fbbf fbbfVar66 = akkpVar30.dA;
                fbbf fbbfVar67 = akkpVar30.jh;
                fbbf fbbfVar68 = akkpVar30.ay;
                fbbf fbbfVar69 = akkpVar30.ue;
                fbbf fbbfVar70 = akkpVar30.JO;
                fbbf fbbfVar71 = akkpVar30.ad;
                fbbf fbbfVar72 = akkpVar30.iK;
                fbbf fbbfVar73 = akkpVar30.fJ;
                fbbf fbbfVar74 = akkpVar30.qJ;
                fbbf fbbfVar75 = akkpVar30.JP;
                fbbf fbbfVar76 = akkpVar30.Bp;
                fbbf fbbfVar77 = akkpVar30.Z;
                fbbf fbbfVar78 = akkpVar30.pg;
                fbbf fbbfVar79 = akkpVar30.ip;
                fbbf fbbfVar80 = akkpVar30.JQ;
                fbbf fbbfVar81 = akkpVar30.p;
                fbbf fbbfVar82 = akkpVar30.q;
                fbbf fbbfVar83 = akkpVar30.ia;
                fbbf fbbfVar84 = akkpVar30.kk;
                fbbf fbbfVar85 = akkpVar30.JR;
                fbbf fbbfVar86 = akkpVar30.cf;
                fbbf a10 = fbbg.a(akkpVar30.JT);
                akis akisVar18 = this.a;
                akkp akkpVar31 = akisVar18.a;
                bamxVar = new bamx(fbbfVar41, akisVar17.cz, fbbfVar42, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar47, fbbfVar48, fbbfVar49, fbbfVar50, fbbfVar51, fbbfVar52, fbbfVar53, fbbfVar54, fbbfVar55, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar59, fbbfVar60, fbbfVar61, fbbfVar62, fbbfVar63, fbbfVar64, fbbfVar65, fbbfVar66, fbbfVar67, fbbfVar68, fbbfVar69, fbbfVar70, fbbfVar71, fbbfVar72, fbbfVar73, fbbfVar74, fbbfVar75, fbbfVar76, fbbfVar77, fbbfVar78, fbbfVar79, fbbfVar80, fbbfVar81, fbbfVar82, akisVar17.co, akisVar17.cP, fbbfVar83, fbbfVar84, fbbfVar85, fbbfVar86, a10, akkpVar31.uF, akisVar18.cN, akkpVar31.kt, akkpVar31.pC, akkpVar31.pQ, akkpVar31.rr, akkpVar31.c, akisVar18.lS, akkpVar31.lV, akisVar18.jT, akkpVar31.ku, akkpVar31.iL, akkpVar31.pB, akisVar18.gW, akkpVar31.hw, akkpVar31.pA, akkpVar31.hT, akkpVar31.JU, akkpVar31.JV, akkpVar31.JW, akkpVar31.br, akkpVar31.gE, akkpVar31.JX, akkpVar31.JZ, akkpVar31.mu, akkpVar31.yI, akkpVar31.py, akkpVar31.Ka, akkpVar31.Kc, akkpVar31.Kb);
                break;
            case 1941:
                crji crjiVar = (crji) this.a.a.ab.b();
                akkp akkpVar32 = this.a.a;
                return new baam(crjiVar, akkpVar32.dn, (dtuu) akkpVar32.ay.b());
            case 1942:
                return new covp((Context) this.a.q.b(), (cqoh) this.a.cz.b(), (ctyx) this.a.aU.b(), (csrv) this.a.a.iK.b());
            case 1943:
                Context context10 = (Context) this.a.q.b();
                akkp akkpVar33 = this.a.a;
                return new baim(context10, akkpVar33.dB, akkpVar33.iN, (Optional) akkpVar33.pg.b());
            case 1944:
                return new cncp(this.a.a.jF());
            case 1945:
                return new ckuy((akyb) this.a.a.bi.b());
            case 1946:
                akkp akkpVar34 = this.a.a;
                sgd h = akkpVar34.h();
                shh j = akkpVar34.j();
                bdns bdnsVar = (bdns) akkpVar34.uj.b();
                akis akisVar19 = this.a;
                akkp akkpVar35 = akisVar19.a;
                akkp akkpVar36 = akisVar19.a;
                return enip.v(h, j, bdnsVar, akkpVar36.k(), akkpVar36.jy(), akkpVar36.aq(), akkpVar35.lz(), this.a.a.n(), this.a.a.hs(), this.a.a.jC());
            case 1947:
                Context context11 = (Context) this.a.q.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                akis akisVar20 = this.a;
                return new cutp(context11, ffskVar3, ffhdVar2, akisVar20.ni, (atwp) akisVar20.a.Eb.b(), this.a.a.C);
            case 1948:
                final fbbf fbbfVar87 = this.a.a.s;
                return new auab() { // from class: atzh
                    @Override // defpackage.auab
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.update_transaction_id_for_merged_mms");
                    }
                };
            case 1949:
                final fbbf fbbfVar88 = this.a.a.s;
                return new atzu() { // from class: atyt
                    @Override // defpackage.atzu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.merge_mms_only_to_valid_rcs_groups");
                    }
                };
            case 1950:
                final fbbf fbbfVar89 = this.a.a.s;
                return new atzv() { // from class: atyv
                    @Override // defpackage.atzv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.merge_mms_when_sub_id_temporarily_lost_rcs");
                    }
                };
            case 1951:
                return Long.valueOf(fdde.a(this.a.a.oh()));
            case 1952:
                akkp akkpVar37 = this.a.a;
                return new azei(akkpVar37.JY, (ffsk) akkpVar37.p.b());
            case 1953:
                return new enpx(this.a.a.jn());
            case 1954:
                final fbbf fbbfVar90 = this.a.a.s;
                return new atzw() { // from class: atyx
                    @Override // defpackage.atzw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.mms_merging_refactoring");
                    }
                };
            case 1955:
                akis akisVar21 = this.a;
                fbbf fbbfVar91 = akisVar21.cz;
                akkp akkpVar38 = akisVar21.a;
                return new bbgp(akkpVar38.hT, akkpVar38.JV, akkpVar38.JW, akkpVar38.ia, akkpVar38.JR, akkpVar38.br, akkpVar38.Kb, akkpVar38.JX, (cqoh) fbbfVar91.b());
            case 1956:
                return new bbgj((coxk) this.a.a.iN.b(), this.a.a.Z);
            case 1957:
                return new sgo((ffsk) this.a.a.q.b(), this.a.a.i());
            case 1958:
                Context context12 = (Context) this.a.q.b();
                errl errlVar17 = (errl) this.a.p.b();
                errl errlVar18 = (errl) this.a.t.b();
                errl errlVar19 = (errl) this.a.aK.b();
                akkp akkpVar39 = this.a.a;
                fbbf fbbfVar92 = akkpVar39.sY;
                fbbf fbbfVar93 = akkpVar39.dB;
                fbbf fbbfVar94 = akkpVar39.fs;
                fbbf fbbfVar95 = akkpVar39.kj;
                fbbf fbbfVar96 = akkpVar39.co;
                fbbf fbbfVar97 = akkpVar39.BB;
                fbbf fbbfVar98 = akkpVar39.ay;
                fbbf fbbfVar99 = akkpVar39.dA;
                crab kP = akkpVar39.kP();
                bzxq fg = akkpVar39.fg();
                bbgg bbggVar = (bbgg) akkpVar39.iE.b();
                akkp akkpVar40 = this.a.a;
                fbbf fbbfVar100 = akkpVar40.pC;
                fbbf fbbfVar101 = akkpVar40.dw;
                fbbf fbbfVar102 = akkpVar40.Ki;
                fbbf fbbfVar103 = akkpVar40.gp;
                fbbf fbbfVar104 = akkpVar40.cH;
                cqvy cqvyVar = (cqvy) this.a.a.oP.b();
                akis akisVar22 = this.a;
                return new cqxi(context12, errlVar17, errlVar18, errlVar19, fbbfVar92, fbbfVar93, fbbfVar94, fbbfVar95, fbbfVar96, fbbfVar97, fbbfVar98, fbbfVar99, kP, fg, bbggVar, fbbfVar100, fbbfVar101, fbbfVar102, fbbfVar103, fbbfVar104, cqvyVar, akisVar22.a.dl(), (bbfo) akisVar22.jU.b(), this.a.a.Eb);
            case 1959:
                akkp akkpVar41 = this.a.a;
                return enip.v(akkpVar41.h(), akkpVar41.j(), akkpVar41.F(), akkpVar41.qc(), akkpVar41.k(), akkpVar41.jA(), this.a.a.lz(), this.a.a.n());
            case 1960:
                akkp akkpVar42 = this.a.a;
                fbbf fbbfVar105 = akkpVar42.iQ;
                ffsk ffskVar4 = (ffsk) akkpVar42.q.b();
                akkp akkpVar43 = this.a.a;
                return new cgof(fbbfVar105, ffskVar4, akkpVar43.hk(), (dqze) akkpVar43.un.b());
            case 1961:
                return cfte.a((Context) this.a.q.b(), (ffsk) this.a.a.q.b());
            case 1962:
                return Boolean.valueOf(fdbh.a(this.a.a.nZ()));
            case 1963:
                errl errlVar20 = (errl) this.a.p.b();
                errl errlVar21 = (errl) this.a.t.b();
                akkp akkpVar44 = this.a.a;
                fbbf fbbfVar106 = akkpVar44.dB;
                akkp akkpVar45 = this.a.a;
                crab kP2 = akkpVar45.kP();
                Optional optional4 = (Optional) akkpVar45.pg.b();
                akkp akkpVar46 = this.a.a;
                return new cqxu(errlVar20, errlVar21, fbbfVar106, kP2, optional4, akkpVar46.oP, akkpVar46.dw(), akkpVar46.Kl);
            case 1964:
                return Long.valueOf(fdbi.a(this.a.a.nZ()));
            case 1965:
                cins cinsVar = (cins) this.a.a.jc.b();
                errl errlVar22 = (errl) this.a.t.b();
                avya avyaVar = (avya) this.a.a.op.b();
                cqqb cqqbVar = (cqqb) this.a.a.pc.b();
                akkp akkpVar47 = this.a.a;
                return new avxz(cinsVar, errlVar22, avyaVar, cqqbVar, akkpVar47.kO(), (cqps) akkpVar47.oL.b());
            case 1966:
                return new cqxl(this.a.a.cc);
            case 1967:
                return new cray(this.a.a.cc);
            case 1968:
                ffsk ffskVar5 = (ffsk) this.a.a.q.b();
                akkp akkpVar48 = this.a.a;
                return new avzo(ffskVar5, akkpVar48.m165do(), (cins) akkpVar48.jc.b(), this.a.a.pe);
            case 1969:
                crcc crccVar = (crcc) this.a.a.oK.b();
                errl errlVar23 = (errl) this.a.t.b();
                errl errlVar24 = (errl) this.a.p.b();
                cins cinsVar2 = (cins) this.a.a.jc.b();
                cqqb cqqbVar2 = (cqqb) this.a.a.pc.b();
                cqps cqpsVar = (cqps) this.a.a.oL.b();
                crbq crbqVar = (crbq) this.a.a.pk.b();
                akis akisVar23 = this.a;
                akkp akkpVar49 = akisVar23.a;
                fbbf fbbfVar107 = akisVar23.jQ;
                crga crgaVar = (crga) akkpVar49.pd.b();
                akis akisVar24 = this.a;
                akkp akkpVar50 = akisVar24.a;
                fbbf fbbfVar108 = akkpVar50.dB;
                fbbf fbbfVar109 = akkpVar50.Kr;
                fbbf fbbfVar110 = akkpVar50.nY;
                fbbf fbbfVar111 = akkpVar50.gt;
                return new crcq(crccVar, errlVar23, errlVar24, cinsVar2, cqqbVar2, cqpsVar, crbqVar, fbbfVar107, crgaVar, fbbfVar108, fbbfVar109, fbbfVar110, fbbfVar111);
            case 1970:
                akkp akkpVar51 = this.a.a;
                return new axbz(akkpVar51.Bv, akkpVar51.Bw, akkpVar51.Bx, new axbm());
            case 1971:
                Context context13 = (Context) this.a.q.b();
                akkp akkpVar52 = this.a.a;
                return new cpyn(context13, akkpVar52.jc, akkpVar52.Ky);
            case 1972:
                errl errlVar25 = (errl) this.a.t.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar53 = this.a.a;
                fbbf fbbfVar112 = akkpVar53.ej;
                fbbf fbbfVar113 = akkpVar53.iN;
                fbbf fbbfVar114 = akkpVar53.Kw;
                fbbf fbbfVar115 = akkpVar53.Er;
                fbbf fbbfVar116 = akkpVar53.u;
                fbbf fbbfVar117 = akkpVar53.fJ;
                fbbf fbbfVar118 = akkpVar53.Ek;
                fbbf fbbfVar119 = akkpVar53.Kx;
                fbbf fbbfVar120 = akkpVar53.jO;
                fbbf fbbfVar121 = akkpVar53.jP;
                cozl cozlVar = (cozl) akkpVar53.kr.b();
                cbgf cbgfVar2 = (cbgf) this.a.a.dA.b();
                akis akisVar25 = this.a;
                akkp akkpVar54 = akisVar25.a;
                return new cpyk(errlVar25, ctyxVar, cqohVar3, fbbfVar112, fbbfVar113, fbbfVar114, fbbfVar115, fbbfVar116, fbbfVar117, fbbfVar118, fbbfVar119, fbbfVar120, fbbfVar121, cozlVar, cbgfVar2, akkpVar54.f, akkpVar54.Z, akkpVar54.Eo, akisVar25.cT, akkpVar54.Es);
            case 1973:
                akis akisVar26 = this.a;
                akkp akkpVar55 = akisVar26.a;
                bamxVar = new cqbj(akkpVar55.yx, akkpVar55.jd, akkpVar55.ib, akkpVar55.dn, akkpVar55.fs, akkpVar55.jk, akkpVar55.ki, akkpVar55.hv, akkpVar55.iN, akkpVar55.kr, akkpVar55.dA, akkpVar55.tF, akkpVar55.iy, akkpVar55.ay, akisVar26.q, akkpVar55.fJ, akisVar26.cT, akkpVar55.c, akkpVar55.pQ, akkpVar55.f, akkpVar55.ia, akkpVar55.kt, akkpVar55.Z, akkpVar55.ky, akisVar26.no, akkpVar55.Kt, akkpVar55.dB, akkpVar55.Ku, akkpVar55.Kv, akisVar26.cN, akkpVar55.ks, akkpVar55.AK, akisVar26.cv, akkpVar55.C, akkpVar55.qj);
                break;
            case 1974:
                return new cpxc(this.a.a.az);
            case 1975:
                return new ayfv((ayfi) this.a.a.jG.b(), (cqoh) this.a.cz.b());
            case 1976:
                return new asob() { // from class: arta
                };
            case 1977:
                return new cqbo((cqbu) this.a.a.pA());
            case 1978:
                akis akisVar27 = this.a;
                akkp akkpVar56 = akisVar27.a;
                return new caia(akisVar27.cz, akkpVar56.cx, akkpVar56.uq, akkpVar56.br, akkpVar56.bF, akkpVar56.C, (ffsk) akkpVar56.p.b(), (ffhd) this.a.cP.b(), (ffhd) this.a.co.b());
            case 1979:
                Context context14 = (Context) this.a.q.b();
                akkp akkpVar57 = this.a.a;
                return new cabh(context14, akkpVar57.fo(), akkpVar57.KB, (cins) akkpVar57.jc.b(), this.a.a.G);
            case 1980:
                cafn cafnVar = (cafn) this.a.a.sP.b();
                akkp akkpVar58 = this.a.a;
                fbbf fbbfVar122 = akkpVar58.sQ;
                cafi cafiVar = (cafi) akkpVar58.cv.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                akkp akkpVar59 = this.a.a;
                fbbf fbbfVar123 = akkpVar59.fr;
                fbbf fbbfVar124 = akkpVar59.ib;
                fbbf fbbfVar125 = akkpVar59.dB;
                caen caenVar = (caen) akkpVar59.qu.b();
                errl errlVar26 = (errl) this.a.t.b();
                bbfo bbfoVar = (bbfo) this.a.jU.b();
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                fazb a11 = fbaz.a(this.a.a.cC);
                akkp akkpVar60 = this.a.a;
                fbbf fbbfVar126 = akkpVar60.f;
                return new cabg(cafnVar, fbbfVar122, cafiVar, cqohVar4, fbbfVar123, fbbfVar124, fbbfVar125, caenVar, errlVar26, bbfoVar, dtuuVar4, a11, fbbfVar126, (awtm) this.a.iz.b());
            case 1981:
                akis akisVar28 = this.a;
                clja ji = akisVar28.a.ji();
                ctzw ctzwVar = (ctzw) akisVar28.dI.b();
                akkp akkpVar61 = this.a.a;
                BiFunction rJ = akkpVar61.rJ();
                clhd clhdVar = (clhd) akkpVar61.BV.b();
                akis akisVar29 = this.a;
                clna jm = akisVar29.a.jm();
                errl errlVar27 = (errl) akisVar29.t.b();
                errl errlVar28 = (errl) this.a.aK.b();
                errl errlVar29 = (errl) this.a.p.b();
                akkp akkpVar62 = this.a.a;
                return new clmw(ji, ctzwVar, rJ, clhdVar, jm, errlVar27, errlVar28, errlVar29, akkpVar62.jg(), akkpVar62.jl(), (akvz) akkpVar62.dE.b(), (cqoh) this.a.cz.b(), this.a.a.dn);
            case 1982:
                akkp akkpVar63 = this.a.a;
                return new cjhh(akkpVar63.in(), (ffsk) akkpVar63.p.b(), this.a.a.im());
            case 1983:
                return new ckop((cbgf) this.a.a.dA.b());
            case 1984:
                return new ckpb((errm) this.a.t.b(), (errl) this.a.p.b(), (ckju) this.a.a.ky.b(), (dtuu) this.a.a.ay.b());
            case 1985:
                cbpl cbplVar = (cbpl) this.a.a.sr.b();
                akis akisVar30 = this.a;
                return new cbtn(cbplVar, akisVar30.bK(), (errl) akisVar30.p.b(), (errl) this.a.t.b(), (cbtp) this.a.a.KI.b(), (cbta) this.a.a.KH.b());
            case 1986:
                return new cbtp((cbta) this.a.a.KH.b());
            case 1987:
                akis akisVar31 = this.a;
                akkp akkpVar64 = akisVar31.a;
                return new cbta(akkpVar64.fP, akkpVar64.az, (errl) akisVar31.t.b());
            case 1988:
                errl errlVar30 = (errl) this.a.t.b();
                errl errlVar31 = (errl) this.a.p.b();
                fazb a12 = fbaz.a(this.a.a.tT);
                fbaz.a(this.a.a.tU);
                akkp akkpVar65 = this.a.a;
                fbbf fbbfVar127 = akkpVar65.tV;
                cbpl cbplVar2 = (cbpl) akkpVar65.sr.b();
                akis akisVar32 = this.a;
                return new cbua(errlVar30, errlVar31, a12, fbbfVar127, cbplVar2, akisVar32.bK(), (cbtp) akisVar32.a.KI.b());
            case 1989:
                fazb a13 = fbaz.a(this.a.a.tT);
                akis akisVar33 = this.a;
                return new cbue(a13, akisVar33.a.tV, (errl) akisVar33.p.b());
            case 1990:
                akkp akkpVar66 = this.a.a;
                return new awpn(akkpVar66.dK(), (akvz) akkpVar66.dE.b(), (ffsk) this.a.a.p.b(), (azfv) this.a.a.kI.b(), (akzt) this.a.a.C.b(), this.a.a.KM);
            case 1991:
                return Boolean.valueOf(fdbp.a(this.a.a.ob()));
            case 1992:
                Object b = this.a.a.BJ.b();
                avgr avgrVar = (avgr) this.a.a.BQ.b();
                errl errlVar32 = (errl) this.a.p.b();
                return awqa.a(b, avgrVar, errlVar32);
            case 1993:
                Context context15 = (Context) this.a.q.b();
                errm errmVar = (errm) this.a.t.b();
                errl errlVar33 = (errl) this.a.p.b();
                ckju ckjuVar = (ckju) this.a.a.ky.b();
                dtuu dtuuVar5 = (dtuu) this.a.a.ay.b();
                akkp akkpVar67 = this.a.a;
                fbbf fbbfVar128 = akkpVar67.ib;
                fbbf fbbfVar129 = akkpVar67.dB;
                fbbf fbbfVar130 = akkpVar67.fs;
                cbfs cbfsVar = (cbfs) akkpVar67.er.b();
                akis akisVar34 = this.a;
                fbbf fbbfVar131 = akisVar34.cz;
                akkp akkpVar68 = akisVar34.a;
                fbbf fbbfVar132 = akkpVar68.pJ;
                fbbf fbbfVar133 = akkpVar68.ip;
                cqoh cqohVar5 = (cqoh) fbbfVar131.b();
                akis akisVar35 = this.a;
                return new ckpp(context15, errmVar, errlVar33, ckjuVar, dtuuVar5, fbbfVar128, fbbfVar129, fbbfVar130, cbfsVar, fbbfVar132, fbbfVar133, cqohVar5, akisVar35.kk, (ckds) akisVar35.a.dp.b());
            case 1994:
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                akis akisVar36 = this.a;
                return new cptm(ffskVar6, akisVar36.a.kz(), (cqoh) akisVar36.cz.b());
            case 1995:
                errl errlVar34 = (errl) this.a.t.b();
                errl errlVar35 = (errl) this.a.aK.b();
                errl errlVar36 = (errl) this.a.p.b();
                akkp akkpVar69 = this.a.a;
                fbbf fbbfVar134 = akkpVar69.dn;
                ayfy ayfyVar = (ayfy) this.a.a.mF.b();
                bdvi bdviVar2 = (bdvi) this.a.a.jh.b();
                avkj avkjVar = (avkj) this.a.a.jf.b();
                avkc avkcVar = (avkc) this.a.a.G.b();
                akkp akkpVar70 = this.a.a;
                fbbf fbbfVar135 = akkpVar70.wL;
                akkp akkpVar71 = this.a.a;
                fbbf fbbfVar136 = akkpVar71.gQ;
                avkh avkhVar = (avkh) akkpVar71.kh.b();
                akkp akkpVar72 = this.a.a;
                fbbf fbbfVar137 = akkpVar72.xA;
                return new ckqe(errlVar34, errlVar35, errlVar36, fbbfVar134, ayfyVar, bdviVar2, avkjVar, avkcVar, fbbfVar135, fbbfVar136, avkhVar, fbbfVar137);
            case 1996:
                akis akisVar37 = this.a;
                akkp akkpVar73 = akisVar37.a;
                fbbf fbbfVar138 = akkpVar73.KS;
                fbbf fbbfVar139 = akkpVar73.fg;
                fbbf fbbfVar140 = akkpVar73.KV;
                errl errlVar37 = (errl) akisVar37.t.b();
                akis akisVar38 = this.a;
                return new cglc(fbbfVar138, fbbfVar139, fbbfVar140, errlVar37, akisVar38.a.aG(), (ecrj) akisVar38.cN.b());
            case 1997:
                Context context16 = (Context) this.a.q.b();
                Optional optional5 = (Optional) this.a.a.KW.b();
                dzht dzhtVar = (dzht) this.a.a.KX.b();
                dzhq dzhqVar = (dzhq) this.a.a.KY.b();
                akkp akkpVar74 = this.a.a;
                return cgjl.a(context16, optional5, dzhtVar, dzhqVar, akkpVar74.hu(), akkpVar74.KZ, akkpVar74.hv(), akkpVar74.Jr);
            case 1998:
                return Optional.of((cgjp) this.a.a.KV.b());
            case 1999:
                Context context17 = (Context) this.a.q.b();
                akis akisVar39 = this.a;
                akkp akkpVar75 = akisVar39.a;
                return new cgkc(context17, akkpVar75.au, akkpVar75.as, akkpVar75.KS, akkpVar75.KU, (errl) akisVar39.p.b());
            default:
                throw new AssertionError(i);
        }
        return bamxVar;
    }

    private final Object n() {
        int i = this.b;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                akis akisVar = this.a;
                return cnrw.a(akisVar.a.mK(), cnrv.a(), (Context) akisVar.q.b());
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                final fbbf fbbfVar = this.a.a.s;
                return new ausa() { // from class: aurt
                    @Override // defpackage.ausa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_manual_satellite_connection_feature");
                    }
                };
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                akis akisVar2 = this.a;
                return new cspb(akisVar2.du, akisVar2.t, akisVar2.ds, akisVar2.a.bT);
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                final fbbf fbbfVar2 = this.a.a.s;
                return new atqv() { // from class: atnj
                    @Override // defpackage.atqv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_fix_rcs_network_connectivity_check");
                    }
                };
            case 204:
                akkp akkpVar = this.a.a;
                return azpy.a(akkpVar.er(), akkpVar.NZ);
            case 205:
                final fbbf fbbfVar3 = this.a.a.s;
                return new auie() { // from class: auhw
                    @Override // defpackage.auie
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.get_from_delegate_when_miss_cache");
                    }
                };
            case 206:
                final fbbf fbbfVar4 = this.a.a.s;
                return new asna() { // from class: arri
                    @Override // defpackage.asna
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_receive_sms_pipeline");
                    }
                };
            case 207:
                return new asnb() { // from class: arrg
                };
            case 208:
                akkp akkpVar2 = this.a.a;
                return new azlv(akkpVar2.aH, akkpVar2.c, (azei) akkpVar2.OS.b(), (aolr) this.a.a.Z.b(), (ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b());
            case 209:
                akkp akkpVar3 = this.a.a;
                return new azei(akkpVar3.OR, (ffsk) akkpVar3.p.b());
            case 210:
                akkp akkpVar4 = this.a.a;
                return enip.r(akkpVar4.em(), akkpVar4.eq());
            case 211:
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar5 = akkpVar5.cd;
                dtuu dtuuVar = (dtuu) akkpVar5.ay.b();
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                errl errlVar = (errl) this.a.t.b();
                ceyw ceywVar = (ceyw) this.a.a.ON.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akkp akkpVar6 = this.a.a;
                return new cevt(fbbfVar5, dtuuVar, ffskVar, ffskVar2, errlVar, ceywVar, cqohVar, akkpVar6.hf(), Optional.of(akkpVar6.qC()), (cfjc) this.a.a.OH.b(), (cfbt) this.a.a.OD.b(), fbaz.a(this.a.a.OO));
            case 212:
                akis akisVar3 = this.a;
                return new cewx(akisVar3.a.OB, akisVar3.nN);
            case 213:
                akkp akkpVar7 = this.a.a;
                enhd h = enhk.h(206);
                h.k("backup_self_participant", akkpVar7.Gp);
                h.k("block_on_telephony_sync", this.a.a.Gq);
                h.k("cms_backfill_missing_field_work_handler", this.a.a.Gr);
                h.k("cms_backup_validation_work_handler", this.a.a.Gs);
                h.k("cms_batch_backup_foreground", this.a.a.Gt);
                h.k("disable_multi_device_on_server_when_enable_bnr", this.a.a.Gu);
                h.k("cms_local_media_restore", this.a.a.Gw);
                h.k("cms_local_media_restore_requiring_charging", this.a.a.Gx);
                h.k("cms_local_media_restore_requiring_wifi", this.a.a.Gy);
                h.k("cms_local_media_restore_requiring_wifi_and_charging", this.a.a.Gz);
                h.k("cms_local_media_restore_requiring_battery_not_low", this.a.a.GA);
                h.k("cms_local_media_restore_requiring_wifi_and_battery_not_low", this.a.a.GB);
                h.k("cms_media_download_queuer_work_handler", this.a.a.GC);
                h.k("cms_media_upload_queuer_work_handler", this.a.a.GG);
                h.k("cms_initial_sync_media_upload_requiring_battery_not_low", this.a.a.GH);
                h.k("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low", this.a.a.GI);
                h.k("cms_initial_sync_media_upload_requiring_wifi", this.a.a.GJ);
                h.k("cms_initial_sync_media_upload", this.a.a.GK);
                h.k("cms_initial_sync_media_upload_foreground", this.a.a.GL);
                h.k("cms_initial_sync_media_upload_requiring_battery_not_low_foreground", this.a.a.GM);
                h.k("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground", this.a.a.GN);
                h.k("cms_initial_sync_media_upload_requiring_wifi_foreground", this.a.a.GO);
                h.k("cms_incremental_sync_media_upload", this.a.a.GP);
                h.k("cms_incremental_sync_media_upload_requiring_wifi", this.a.a.GQ);
                h.k("cms_set_feature_enabled_on_server", this.a.a.GR);
                h.k("cms_set_initial_sync_status_on_server", this.a.a.GS);
                h.k("cms_restore_page", this.a.a.GT);
                h.k("cms_restore_page_background", this.a.a.GU);
                h.k("cms_restore_page_foreground", this.a.a.GV);
                h.k("conversation_deduping_work", this.a.a.GW);
                h.k("IdentityVerificationPendingMessageHandler", this.a.a.GX);
                h.k("finish_cms_restore_after_message_insertion", this.a.a.GY);
                h.k("insert_new_message_from_cms", this.a.a.He);
                h.k("refresh_cms_server_storage_info", this.a.a.Hf);
                h.k("remove_to_be_delivered_label", this.a.a.Hg);
                h.k("StarAnalyticsWorkerHandler", this.a.a.Hh);
                h.k("turn_on_bnr", this.a.a.Hi);
                h.k("upload_previous_cms_session_ids", this.a.a.Hj);
                h.k("__UNHANDLED_HANDLER", this.a.mW);
                h.k("cms_restore_validation_work_handler", this.a.a.Hk);
                h.k("backup_now_incremental_work_handler", this.a.a.Hl);
                h.k("batch_contacts_import", this.a.a.Ht);
                h.k("batch_deleted_contacts_sync", this.a.a.Hw);
                h.k("clear_session_ids", this.a.a.Hx);
                h.k("contact_recipient_change_sync", this.a.a.HB);
                h.k("contact_recipient_deleted_sync", this.a.a.HC);
                h.k("conversation_latcher", this.a.a.HD);
                h.k("delayed_incremental_work_handler", this.a.a.HE);
                h.k("delete_part_cms_attachment", this.a.a.HF);
                h.k("encrypted_message_delete", this.a.a.HG);
                h.k("end_heavy_work", this.a.a.HJ);
                h.k("expire_wap_push_si_message", this.a.a.HM);
                h.k("fi_multi_sync_grpc", this.a.a.HQ);
                h.k("force_contacts_sync", this.a.a.Ih);
                h.k("gaia_auth_check_result", this.a.a.Ii);
                h.k("add_members_to_rcs_conversation", this.a.a.Im);
                h.k("ari_work_handler", this.a.a.In);
                h.k("attachment_to_telephony_sync", this.a.a.Io);
                h.k("backup_upgraded_mms_group", this.a.a.It);
                h.k("bard_deletion_sender", this.a.a.Iu);
                h.k("block_on_initial_backup_preconditions", this.a.a.Iv);
                h.k("cancel_notification", this.a.a.IE);
                h.k("cancel_rcs_file_transfer", this.a.a.IF);
                h.k("CLASSIFY_MISSING_MESSAGES", this.a.a.IN);
                h.k("CLASSIFY_SPECIFIC_MESSAGES", this.a.a.IO);
                h.k("cleanup_part_uri_handler", this.a.a.IP);
                h.k("cms_back_fill_bnr_state_for_fi_md", this.a.a.IQ);
                h.k("cms_backup", this.a.a.IR);
                h.k("cms_batch_backup", this.a.a.IS);
                h.k("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", this.a.a.IT);
                h.k("cms_check_missing_restore_work_on_app_upgrade", this.a.a.IU);
                h.k("cms_key_sync", this.a.a.IV);
                h.k("cms_multi_device_opt_out", this.a.a.IX);
                h.k("cms_restore_backup_key", this.a.a.IY);
                h.k("cms_restore_conversations", this.a.a.IZ);
                h.k("cms_restore_encryption_key", this.a.a.Ja);
                h.k("cms_restore_messages", this.a.a.Jb);
                h.k("cms_restore_participants", this.a.a.Jc);
                h.k("cms_sync_stale_status_on_app_upgrade", this.a.a.Jd);
                h.k("connect_to_tachyon_anonymously", this.a.a.Je);
                h.k("contact_keys_loader_handler", this.a.a.Jf);
                h.k("conversation_metadata_full_sync", this.a.a.Jj);
                h.k("conversation_thread_id_updater_worker", this.a.a.Jk);
                h.k("create_notification", this.a.a.Jq);
                h.k("create_or_update_lighter_conversation", this.a.a.Js);
                h.k("custom_themes_sender", this.a.a.Jt);
                h.k("data_upgrade", this.a.a.Jy);
                h.k("delete_conversation_handler", this.a.a.JB);
                h.k("delete_parts_work_item", this.a.a.JC);
                h.k("delete_message_from_telephony", this.a.a.JD);
                h.k("delete_message", this.a.a.JF);
                h.k("delete_thread_from_telephony", this.a.a.JG);
                h.k("spam_recheck_handler", this.a.ng);
                h.k("ditto_conversation_retry_handler", this.a.a.JH);
                h.k("ditto_message_retry_handler", this.a.a.JI);
                h.k("ditto_retry_handler", this.a.a.JJ);
                h.k("downgrade_on_unencrypted_message", this.a.a.JL);
                h.k("download_mms", this.a.a.Ke);
                h.k("file_audio_levels", this.a.a.Kf);
                h.k("file_download_completed", this.a.a.Kk);
                h.k("file_download_failed", this.a.a.Km);
                h.k("file_download", this.a.a.Kp);
                h.k("file_transfer_processor", this.a.a.Kq);
                h.k("messaging_file_upload", this.a.a.Ks);
                h.k("forward_sync_batch", this.a.a.Kz);
                h.k("ftd_data_clean_up_work", this.a.a.KA);
                h.k("FtdHandlerWorkItem", this.a.a.KC);
                h.k("rcs_engine_get_single_message", this.a.a.KD);
                h.k("google_photos_api_callback", this.a.a.KE);
                h.k("group_session_start_failed", this.a.a.KF);
                h.k("group_session_started", this.a.a.KG);
                h.k("icing_index_rebuild_handler", this.a.a.KJ);
                h.k("icing_index_rebuild_single_work_handler", this.a.a.KK);
                h.k("icing_index_update_handler", this.a.a.KL);
                h.k("chatapi_incoming_group_notification_list_message", this.a.a.KN);
                h.k("incoming_rbm_message_handler", this.a.a.KO);
                h.k("incoming_rcs_group_invitation", this.a.a.KP);
                h.k("IncrementalReverseSyncWorkItemHandler", this.a.a.KQ);
                h.k("leave_rcs_group_conversation", this.a.a.KR);
                h.k("lighter_incremental_sync", this.a.a.La);
                h.k("log_message_sent_or_received", this.a.a.DO);
                h.k("magic_compose_send_clicked_log_handler", this.a.a.Ld);
                h.k("mark_all_rcs_groups_as_left", this.a.a.Le);
                h.k("mark_as_notified", this.a.a.Lg);
                h.k("mark_failures_as_notified", this.a.a.Lh);
                h.k("MessagesRestoreWorkItemHandler", this.a.a.LP);
                h.k("on_add_user_to_group_chat_complete", this.a.a.LQ);
                h.k("on_create_group_chat_complete", this.a.a.LR);
                h.k("on_remove_user_from_group_chat_complete", this.a.a.LS);
                h.k("on_trigger_chat_group_full_state_update_complete", this.a.nw);
                h.k("PARTICIPANT_BASED_QUICK_CLASSIFICATION", this.a.a.LT);
                h.k("participant_contact_sync", this.a.a.LU);
                h.k("persist_ios_reaction", this.a.a.LV);
                h.k("persist_thumbnail", this.a.a.LW);
                h.k("pipeline_work_handler", this.a.a.LX);
                h.k("post_incoming_message_to_chat_api", this.a.a.Ma);
                h.k("ditto_process_user_alert", this.a.a.Mb);
                h.k("forward_sync_engine", this.a.a.Md);
                h.k("rcs_group_identifiers_telephony_migration", this.a.a.Me);
                h.k("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", this.a.a.Mf);
                h.k("refresh_incoming_message_notifications", this.a.a.Mg);
                h.k("refresh_message_failure_notification", this.a.a.Mh);
                h.k("remote_user_identity_key_change_handler", this.a.a.Mi);
                h.k("remove_members_from_rcs_conversation", this.a.a.Mj);
                h.k("resizing", this.a.a.Mk);
                h.k("retry_manager", this.a.a.uQ);
                h.k("run_analyze", this.a.a.Ml);
                h.k("chatapi_send_chat_message_response", this.a.a.Bz);
                h.k("smarts_send_message_listener_handler", this.a.a.Mm);
                h.k("soda_file_transcription", this.a.a.Mo);
                h.k("spam_reclassification_handler", this.a.a.Mp);
                h.k("spot_sync", this.a.a.Mq);
                h.k("sync_rcs_groups", this.a.a.Ms);
                h.k("tachygram_add_user_to_group", this.a.a.Mu);
                h.k("tachygram_create_group", this.a.a.Mv);
                h.k("tachygram_get_group_info", this.a.a.Mw);
                h.k("tachygram_inbox_message_retry", this.a.a.Mz);
                h.k("tachygram_remove_user_from_group", this.a.a.MA);
                h.k("tachygram_revoke_message", this.a.a.MB);
                h.k("tachygram_send_message", this.a.a.CG);
                h.k("tachygram_update_group", this.a.a.MC);
                h.k("thumbnail_download_completed", this.a.a.MD);
                h.k("tombstone_manager_on_rcs_group_e2ee_status_change", this.a.a.ME);
                h.k("undelivered_message_fallback", this.a.a.MF);
                h.k("unregister_google_rcs_call", this.a.a.MG);
                h.k("UPDATE_ARCHIVE_STATUS", this.a.a.MH);
                h.k("update_conversation_encryption_status", this.a.a.MI);
                h.k("update_timestamp_in_telephony", this.a.a.MJ);
                h.k("update_unread_counter", this.a.nB);
                h.k("upload_attachments_to_blobstore", this.a.a.MK);
                h.k("vendor_ims_call", this.a.a.ML);
                h.k("EmotifyReactionDatabaseUpdateHandler", this.a.a.MM);
                h.k("TelephonyDatabaseUpdateWorkItemHandler", this.a.a.MP);
                h.k("chatapi_incoming_group_chat_notification_message", this.a.a.Nd);
                h.k("incremental_contacts_import", this.a.a.Ne);
                h.k("load_paged_conversation_timeout_fallback", this.a.a.Np);
                h.k("low_storage", this.a.a.Nr);
                h.k("mark_messages_as_read_handler", this.a.a.Ns);
                h.k("mark_rcs_messages_in_telephony", this.a.a.Nt);
                h.k("otp_deletion_handler", this.a.a.Nx);
                h.k("p13n_work", this.a.a.Ny);
                h.k("parent_allowlist_update", this.a.a.NA);
                h.k("penpal_bot_recipient_restore", this.a.a.NB);
                h.k("penpal_conversation_auto_generate", this.a.a.NC);
                h.k("process_rcs_group_notify", this.a.a.ND);
                h.k("rbm_business_info_retrieval", this.a.a.NE);
                h.k("rbm_chatbot_directory_welcome_message", this.a.a.NF);
                h.k("recover_disabled_rcs_group", this.a.a.NG);
                h.k("request_link_preview", this.a.a.NH);
                h.k("request_smart_suggestions", this.a.a.NI);
                h.k("retrieve_questionnaire", this.a.a.NL);
                h.k("ReverseTelephonySync", this.a.a.NM);
                h.k("chatapi_revoke_chat_message_response", this.a.a.NN);
                h.k("rich_card_media_uri_cleanup", this.a.a.NO);
                h.k("satellite_network_state_updater", this.a.a.NQ);
                h.k("schedule_contacts_import", this.a.a.NR);
                h.k("schedule_delete_and_import_contacts", this.a.a.NT);
                h.k("sim_state_update", this.a.a.On);
                h.k("start_heavy_work", this.a.a.Oo);
                h.k("sync_conversation_data_to_wearable", this.a.a.Or);
                h.k("sync_data_to_wearable_app", this.a.a.Os);
                h.k("sync_group_then_encryption_status", this.a.a.Ov);
                h.k("UPDATE_MARK_UNREAD", this.a.a.Ow);
                h.k("update_rcs_group_name", this.a.a.Ox);
                h.k("CopyFileTelephonyPartHandler", this.a.a.Oy);
                h.k("cms_drop_unscheduled_item_to_dlq", this.a.a.OA);
                return h.h();
            case 214:
                akkp akkpVar8 = this.a.a;
                Object pb = akkpVar8.pb();
                cdwi gC = akkpVar8.gC();
                akkpVar8.si();
                return ccak.a(pb, gC);
            case 215:
                akis akisVar4 = this.a;
                fbbf fbbfVar6 = akisVar4.cz;
                fbbf fbbfVar7 = akisVar4.a.aT;
                cqoh cqohVar2 = (cqoh) fbbfVar6.b();
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                errl errlVar2 = (errl) this.a.p.b();
                errl errlVar3 = (errl) this.a.t.b();
                errl errlVar4 = (errl) this.a.aK.b();
                akis akisVar5 = this.a;
                Set ru = akisVar5.a.ru();
                akisVar5.bC();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                akis akisVar6 = this.a;
                fbbf fbbfVar8 = akisVar6.a.ay;
                axkw axkwVar = (axkw) akisVar6.dz.b();
                akkp akkpVar9 = this.a.a;
                return new axkm(fbbfVar7, cqohVar2, ejvbVar, errlVar2, errlVar3, errlVar4, ru, ejvpVar, fbbfVar8, axkwVar, akkpVar9.bn(), akkpVar9.cg, (asjt) akkpVar9.ch.b(), (AtomicReference) this.a.a.cj.b(), (asyf) this.a.a.ci.b(), (AtomicReference) this.a.dA.b());
            case 216:
                return new cbto(this.a.a.cc);
            case 217:
                return Optional.of((ceww) this.a.a.cd.b());
            case 218:
                return Optional.of((cfyt) this.a.a.cf.b());
            case 219:
                final fbbf fbbfVar9 = this.a.a.s;
                return new asjt() { // from class: arlw
                    @Override // defpackage.asjt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_cms_feedback_logger");
                    }
                };
            case 220:
                return axeg.a(this.a.a.ci);
            case 221:
                final fbbf fbbfVar10 = this.a.a.s;
                return new asyf() { // from class: asyd
                    @Override // defpackage.asyf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_cloud_sync_status_in_metrics");
                    }
                };
            case 222:
                final fbbf fbbfVar11 = this.a.a.s;
                return new asif() { // from class: arjb
                    @Override // defpackage.asif
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_initial_sync_counts_in_clearcut_events");
                    }
                };
            case 223:
                csiy csiyVar = (csiy) this.a.aN.b();
                akkp akkpVar10 = this.a.a;
                fbbf fbbfVar12 = akkpVar10.az;
                axkm axkmVar = (axkm) akkpVar10.ck.b();
                asif asifVar = (asif) this.a.a.cl.b();
                akis akisVar7 = this.a;
                akkp akkpVar11 = akisVar7.a;
                return new axdf(csiyVar, fbbfVar12, axkmVar, asifVar, akkpVar11.bq(), akkpVar11.bl(), akkpVar11.br(), akkpVar11.bn(), (errl) akisVar7.p.b(), (errl) this.a.t.b());
            case 224:
                akis akisVar8 = this.a;
                akkp akkpVar12 = akisVar8.a;
                return new crzd(akisVar8.cE, akkpVar12.ka, (dtuu) akkpVar12.ay.b());
            case 225:
                Context context = (Context) this.a.q.b();
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                crpr crprVar = (crpr) this.a.a.cn.b();
                ctap ctapVar = (ctap) this.a.a.co.b();
                fazb a = fbaz.a(this.a.a.jV);
                fazb a2 = fbaz.a(this.a.a.Fx);
                fazb a3 = fbaz.a(this.a.a.Fy);
                bdxe bdxeVar = new bdxe();
                Optional of = Optional.of(this.a.a.lI());
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar13 = this.a.a;
                fbbf fbbfVar13 = akkpVar13.vR;
                bctx bctxVar = (bctx) akkpVar13.Fz.b();
                csjk csjkVar = (csjk) this.a.a.el.b();
                csuu csuuVar = (csuu) this.a.iL.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                ckds ckdsVar = (ckds) this.a.a.dp.b();
                akkp akkpVar14 = this.a.a;
                fbbf fbbfVar14 = akkpVar14.br;
                fbbf fbbfVar15 = akkpVar14.t;
                ctwb ctwbVar = (ctwb) akkpVar14.c.b();
                csjk csjkVar2 = (csjk) this.a.a.fQ.b();
                bzgd bzgdVar = (bzgd) this.a.a.fa.b();
                alzc alzcVar = (alzc) this.a.a.wj.b();
                akkp akkpVar15 = this.a.a;
                akkpVar15.z();
                cpbw cpbwVar = (cpbw) akkpVar15.fw.b();
                akis akisVar9 = this.a;
                chho bY = akisVar9.bY();
                cubo ll = akisVar9.a.ll();
                Optional of2 = Optional.of(akisVar9.eX());
                aqvh aqvhVar = (aqvh) this.a.a.gN.b();
                ahor ahorVar = (ahor) this.a.a.ii.b();
                Optional of3 = Optional.of(this.a.a.FB);
                fazb a4 = fbaz.a(this.a.a.ap);
                bzqa bzqaVar = (bzqa) this.a.cI.b();
                akkp akkpVar16 = this.a.a;
                fbbf fbbfVar16 = akkpVar16.be;
                azaw azawVar = (azaw) akkpVar16.gA.b();
                akis akisVar10 = this.a;
                akkp akkpVar17 = akisVar10.a;
                return new cgzv(context, errlVar5, errlVar6, crprVar, ctapVar, a, a2, a3, bdxeVar, of, cqohVar3, fbbfVar13, bctxVar, csjkVar, csuuVar, ctyxVar, ckdsVar, fbbfVar14, fbbfVar15, ctwbVar, csjkVar2, bzgdVar, alzcVar, cpbwVar, bY, ll, of2, aqvhVar, ahorVar, of3, a4, bzqaVar, fbbfVar16, azawVar, akkpVar17.rA, akkpVar17.Q, akisVar10.cy, akkpVar17.FC, akkpVar17.bA(), akkpVar17.uM, akkpVar17.zP, akkpVar17.aO, akkpVar17.dE, akkpVar17.bJ(), akkpVar17.bB(), akkpVar17.An, akkpVar17.iA, akkpVar17.cg(), akkpVar17.FD);
            case 226:
                return new crpr((Context) this.a.q.b(), (cbbu) this.a.dB.b(), (crji) this.a.a.ab.b(), this.a.a.r);
            case 227:
                errl errlVar7 = (errl) this.a.t.b();
                errl errlVar8 = (errl) this.a.p.b();
                errl errlVar9 = (errl) this.a.aK.b();
                chrv chrvVar = (chrv) this.a.a.bN.b();
                chga chgaVar = (chga) this.a.a.cp.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar17 = akisVar11.cz;
                fbbf fbbfVar18 = akisVar11.a.cq;
                cqoh cqohVar4 = (cqoh) fbbfVar17.b();
                akkp akkpVar18 = this.a.a;
                chrz hI = akkpVar18.hI();
                Optional optional = (Optional) akkpVar18.Fs.b();
                fazb a5 = fbaz.a(this.a.a.Ft);
                akkp akkpVar19 = this.a.a;
                return new cgwk(errlVar7, errlVar8, errlVar9, chrvVar, chgaVar, fbbfVar18, cqohVar4, hI, optional, a5, akkpVar19.Fu, (chhg) akkpVar19.cA.b());
            case 228:
                return new chmx((comy) this.a.a.aT.b(), (ctyx) this.a.aU.b());
            case 229:
                akis akisVar12 = this.a;
                fbbf fbbfVar19 = akisVar12.t;
                akkp akkpVar20 = akisVar12.a;
                return new chyd(fbbfVar19, akkpVar20.Fq, akkpVar20.cA);
            case 230:
                akis akisVar13 = this.a;
                fbbf fbbfVar20 = akisVar13.q;
                akkp akkpVar21 = akisVar13.a;
                return new chzf(fbbfVar20, akisVar13.cz, akkpVar21.cr, akkpVar21.ct, akkpVar21.Fm, akkpVar21.Fn, akkpVar21.Fp, akisVar13.mN, akisVar13.aK, akisVar13.p, akkpVar21.cu);
            case 231:
                Context context2 = (Context) this.a.q.b();
                errl errlVar10 = (errl) this.a.aK.b();
                akis akisVar14 = this.a;
                return new cfwc(context2, errlVar10, akisVar14.dE, akisVar14.a.al);
            case 232:
                return Optional.of((chkp) this.a.a.cs.b());
            case 233:
                return new chkp((Context) this.a.q.b(), (dfpi) this.a.dF.b(), (dfzs) this.a.dG.b(), (akzt) this.a.a.f.b());
            case 234:
                cibj cibjVar = new cibj();
                akkp akkpVar22 = this.a.a;
                return enip.t(cibjVar, akkpVar22.hC(), akkpVar22.fu(), akkpVar22.kw());
            case 235:
                return new areq() { // from class: arfm
                };
            case 236:
                return new cadw((cafi) this.a.a.cv.b(), (bzvx) this.a.a.sQ.b(), (errl) this.a.t.b(), fbaz.a(this.a.a.cC));
            case 237:
                akis akisVar15 = this.a;
                return new cafi(akisVar15.a.az, (errl) akisVar15.t.b());
            case 238:
                akkp akkpVar23 = this.a.a;
                fbbf fbbfVar21 = akkpVar23.cw;
                chhg chhgVar = (chhg) akkpVar23.cA.b();
                caga cagaVar = (caga) this.a.a.cB.b();
                fazb a6 = fbaz.a(this.a.a.cC);
                cafi cafiVar = (cafi) this.a.a.cv.b();
                cagg caggVar = (cagg) this.a.a.cF.b();
                errl errlVar11 = (errl) this.a.t.b();
                errl errlVar12 = (errl) this.a.aK.b();
                akis akisVar16 = this.a;
                return new bzvx(fbbfVar21, chhgVar, cagaVar, a6, cafiVar, caggVar, errlVar11, errlVar12, akisVar16.a.cx, (cadx) akisVar16.dH.b(), (chpz) this.a.a.cz.b(), this.a.a.cG);
            case 239:
                final fbbf fbbfVar22 = this.a.a.s;
                return new atqu() { // from class: atnh
                    @Override // defpackage.atqu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_fix_crypto_v2_provider_data_loss_handling");
                    }
                };
            case 240:
                akis akisVar17 = this.a;
                akkp akkpVar24 = akisVar17.a;
                return new chhg(akkpVar24.cz, akkpVar24.cq, (errl) akisVar17.t.b());
            case 241:
                akkp akkpVar25 = this.a.a;
                fbbf fbbfVar23 = akkpVar25.aT;
                fbbf a7 = fbbg.a(akkpVar25.cy);
                akis akisVar18 = this.a;
                akkp akkpVar26 = akisVar18.a;
                return new chpz(fbbfVar23, a7, akkpVar26.az, akkpVar26.f, akkpVar26.u, akisVar18.p, akkpVar26.G);
            case 242:
                akis akisVar19 = this.a;
                return enip.r(akisVar19.dd(), (cije) akisVar19.a.cx.b());
            case 243:
                return new caga((chpz) this.a.a.cz.b(), this.a.a.aT);
            case 244:
                return new cafj((akzt) this.a.a.f.b());
            case 245:
                akkp akkpVar27 = this.a.a;
                return new cagg(akkpVar27.cD, akkpVar27.cE);
            case 246:
                return new cagh(this.a.a.cD);
            case 247:
                akkp akkpVar28 = this.a.a;
                Map qI = akkpVar28.qI();
                fbbf fbbfVar24 = akkpVar28.gE;
                fbbf fbbfVar25 = akkpVar28.G;
                djrk djrkVar = (djrk) akkpVar28.bF.b();
                akkp akkpVar29 = this.a.a;
                return new crgn(qI, fbbfVar24, fbbfVar25, djrkVar, akkpVar29.Fg, akkpVar29.Fk, (ffsk) akkpVar29.aq.b());
            case 248:
                akis akisVar20 = this.a;
                fbbf fbbfVar26 = akisVar20.dI;
                akkp akkpVar30 = akisVar20.a;
                return new ckly(fbbfVar26, akkpVar30.rI(), akkpVar30.f, akisVar20.cU(), (errl) akisVar20.p.b());
            case 249:
                Context context3 = (Context) this.a.q.b();
                akis akisVar21 = this.a;
                ehxp mp = akisVar21.a.mp();
                cokv cokvVar = (cokv) akisVar21.dJ.b();
                csjk csjkVar3 = (csjk) this.a.a.fQ.b();
                akis akisVar22 = this.a;
                return new coku(context3, mp, cokvVar, csjkVar3, akisVar22.a.cI, (ctud) akisVar22.cT.b(), this.a.a.EC);
            case 250:
                akis akisVar23 = this.a;
                return new algy(akisVar23.aO, akisVar23.a.az);
            case 251:
                return new avkk(this.a.a.cG);
            case 252:
                return new csjm(fbaz.a(this.a.a.Fc));
            case 253:
                Context context4 = (Context) this.a.q.b();
                akis akisVar24 = this.a;
                fbbf fbbfVar27 = akisVar24.aX;
                fbbf fbbfVar28 = akisVar24.a.cT;
                cfuu cfuuVar = (cfuu) fbbfVar27.b();
                akis akisVar25 = this.a;
                return ckfd.a(context4, fbbfVar28, cfuuVar, akisVar25.a.ET, (errl) akisVar25.aK.b(), this.a.a.Fb, new cslx());
            case 254:
                Context context5 = (Context) this.a.q.b();
                fazb a8 = fbaz.a(this.a.dM);
                akkp akkpVar31 = this.a.a;
                return new cfud(context5, a8, akkpVar31.cR, akkpVar31.EG);
            case PrivateKeyType.INVALID /* 255 */:
                return new csjm(fbaz.a(this.a.a.cQ));
            case 256:
                return cuad.a(this.a.a.pr());
            case 257:
                djrf lS = this.a.a.lS();
                ckan ckanVar = new ckan();
                return new cuas(lS, ckanVar, (errl) this.a.aK.b());
            case 258:
                return new djiy((Context) this.a.q.b(), (dked) this.a.a.cL.b());
            case 259:
                akis akisVar26 = this.a;
                return new dked(akisVar26.dO, akisVar26.aQ, (cguo) akisVar26.a.cK.b(), (cort) this.a.a.bj.b());
            case 260:
                akis akisVar27 = this.a;
                return new cguj(akisVar27.a.cJ, (errl) akisVar27.aK.b());
            case 261:
                return Optional.of(this.a.a.lX());
            case 262:
                return new dijt((cort) this.a.a.bj.b(), (errl) this.a.t.b(), this.a.dk);
            case 263:
                return new cuak(this.a.a.az);
            case 264:
                errl errlVar13 = (errl) this.a.aK.b();
                fazb a9 = fbaz.a(this.a.a.EE);
                akis akisVar28 = this.a;
                return new cftw(errlVar13, a9, akisVar28.mL, akisVar28.aZ, (Context) akisVar28.q.b(), this.a.a.EF);
            case 265:
                akkp akkpVar32 = this.a.a;
                Object pg = akkpVar32.pg();
                cfug cfugVar = (cfug) akkpVar32.cG.b();
                akis akisVar29 = this.a;
                akkp akkpVar33 = akisVar29.a;
                Object ps = akkpVar33.ps();
                adnm J = akkpVar33.J();
                cfug cfugVar2 = (cfug) akisVar29.dR.b();
                cfug cfugVar3 = (cfug) this.a.a.cZ.b();
                akis akisVar30 = this.a;
                return enip.v(pg, cfugVar, ps, J, cfugVar2, cfugVar3, this.a.a.u(), (cfug) this.a.dK.b(), (cfug) this.a.dL.b(), (cfug) this.a.a.dc.b(), akisVar30.a.rN(), (cfug) akisVar30.dS.b(), this.a.a.iI(), (ckds) this.a.a.dp.b(), this.a.a.jT());
            case 266:
                return new dikg((djix) this.a.a.cM.b(), (dkpp) this.a.aQ.b(), cmnc.a(), (errl) this.a.aK.b(), (dijt) this.a.a.cN.b());
            case 267:
                return new bdij(this.a.a.cc);
            case 268:
                return Boolean.valueOf(fczl.a(this.a.a.nO()));
            case 269:
                return new atmw() { // from class: atms
                };
            case 270:
                akis akisVar31 = this.a;
                comc jV = akisVar31.a.jV();
                return new bzhl(jV, (errl) this.a.p.b(), (ejvp) this.a.aR.b());
            case 271:
                errl errlVar14 = (errl) this.a.t.b();
                akis akisVar32 = this.a;
                return new csvb(errlVar14, akisVar32.a.db, (cfuu) akisVar32.aX.b());
            case 272:
                akis akisVar33 = this.a;
                akkp akkpVar34 = akisVar33.a;
                return new cssv(akisVar33.aO, akisVar33.aU, akkpVar34.cY, akkpVar34.da);
            case 273:
                return Boolean.valueOf(fcwm.a(this.a.a.nB()));
            case 274:
                return new enpx((cssw) this.a.a.cZ.b());
            case 275:
                return new bdrw(this.a.a.aI);
            case 276:
                return Optional.of(this.a.a.iJ());
            case 277:
                return Long.valueOf(fdfj.a(this.a.a.or()));
            case 278:
                return Boolean.valueOf(fdfi.a(this.a.a.or()));
            case 279:
                return Boolean.valueOf(fdfl.a(this.a.a.or()));
            case 280:
                akis akisVar34 = this.a;
                fbbf fbbfVar29 = akisVar34.a.dh;
                Context context6 = (Context) akisVar34.q.b();
                akis akisVar35 = this.a;
                akkp akkpVar35 = akisVar35.a;
                fbbf fbbfVar30 = akkpVar35.di;
                fbbf fbbfVar31 = akkpVar35.f;
                fbbf fbbfVar32 = akkpVar35.c;
                fbbf fbbfVar33 = akkpVar35.dk;
                fbbf fbbfVar34 = akkpVar35.dl;
                fbbf fbbfVar35 = akkpVar35.sg;
                csjk csjkVar4 = (csjk) akkpVar35.el.b();
                akis akisVar36 = this.a;
                akkp akkpVar36 = akisVar36.a;
                fbbf fbbfVar36 = akkpVar36.u;
                fbbf fbbfVar37 = akkpVar36.Ec;
                fbbf fbbfVar38 = akkpVar36.dn;
                fbbf fbbfVar39 = akkpVar36.dB;
                fbbf fbbfVar40 = akkpVar36.AH;
                fbbf fbbfVar41 = akkpVar36.fQ;
                fbbf fbbfVar42 = akkpVar36.iN;
                fbbf fbbfVar43 = akkpVar36.EB;
                fbbf fbbfVar44 = akkpVar36.pH;
                fbbf fbbfVar45 = akkpVar36.aO;
                fbbf fbbfVar46 = akkpVar36.iK;
                fbbf fbbfVar47 = akkpVar36.ay;
                fbbf fbbfVar48 = akkpVar36.iA;
                fbbf fbbfVar49 = akkpVar36.hc;
                fbbf fbbfVar50 = akkpVar36.Z;
                fbbf fbbfVar51 = akkpVar36.wU;
                cxao cxaoVar = (cxao) akkpVar36.fv.b();
                akis akisVar37 = this.a;
                fbbf fbbfVar52 = akisVar37.cN;
                fbbf fbbfVar53 = akisVar37.mK;
                fbbf fbbfVar54 = akisVar37.a.D;
                ecrj ecrjVar = (ecrj) fbbfVar52.b();
                akis akisVar38 = this.a;
                akkp akkpVar37 = akisVar38.a;
                fbbf fbbfVar55 = akkpVar37.bC;
                fbbf fbbfVar56 = akkpVar37.wi;
                fbbf fbbfVar57 = akkpVar37.gE;
                fbbf fbbfVar58 = akkpVar37.bF;
                fbbf fbbfVar59 = akkpVar37.EC;
                fbbf fbbfVar60 = akkpVar37.br;
                fbbf fbbfVar61 = akkpVar37.G;
                fbbf fbbfVar62 = akkpVar37.pD;
                fbbf fbbfVar63 = akkpVar37.ED;
                atlx atlxVar = (atlx) akkpVar37.kv.b();
                asne asneVar = (asne) this.a.a.AK.b();
                return new ckem(fbbfVar29, context6, fbbfVar30, fbbfVar31, akisVar35.cT, akisVar35.aU, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, csjkVar4, akisVar36.ct, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, fbbfVar40, fbbfVar41, fbbfVar42, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar47, fbbfVar48, fbbfVar49, fbbfVar50, fbbfVar51, cxaoVar, fbbfVar53, fbbfVar54, ecrjVar, akisVar38.cv, fbbfVar55, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar59, fbbfVar60, fbbfVar61, fbbfVar62, fbbfVar63, atlxVar, asneVar);
            case 281:
                return new atra() { // from class: atnt
                };
            case 282:
                akis akisVar39 = this.a;
                return alai.a(akisVar39.a.f, akisVar39.ae());
            case 283:
                return colm.a((colj) this.a.a.dj.b());
            case 284:
                return colq.a((colj) this.a.a.dj.b());
            case 285:
                akkp akkpVar38 = this.a.a;
                return avlr.a(akkpVar38.cV(), (akkb) akkpVar38.EA.b());
            case 286:
                ContactsService contactsService = (ContactsService) this.a.a.dm.b();
                albq albqVar = (albq) this.a.a.di.b();
                return new cokp(contactsService, albqVar);
            case 287:
                return colk.a((colj) this.a.a.dj.b());
            case 288:
                akkp akkpVar39 = this.a.a;
                return new cvlf(akkpVar39.dn, (altk) akkpVar39.fP.b(), (cbgf) this.a.a.dA.b(), (dtuu) this.a.a.ay.b(), (cqoh) this.a.cz.b(), (errl) this.a.t.b());
            case 289:
                akkp akkpVar40 = this.a.a;
                return new bdga(akkpVar40.f, akkpVar40.jq);
            case 290:
                akkp akkpVar41 = this.a.a;
                return new bazb(akkpVar41.fJ, akkpVar41.iP, akkpVar41.hv, akkpVar41.ds, akkpVar41.jt, akkpVar41.pt, akkpVar41.kl, akkpVar41.az, akkpVar41.Ex);
            case 291:
                akkp akkpVar42 = this.a.a;
                return cqds.a(akkpVar42.Eu, akkpVar42.Ew);
            case 292:
                akis akisVar40 = this.a;
                cqoh cqohVar5 = (cqoh) akisVar40.cz.b();
                akis akisVar41 = this.a;
                akkp akkpVar43 = akisVar41.a;
                fbbf fbbfVar64 = akkpVar43.ds;
                fbbf fbbfVar65 = akkpVar43.Eg;
                Context context7 = (Context) akisVar41.q.b();
                fazb a10 = fbaz.a(this.a.a.AA);
                fazb a11 = fbaz.a(this.a.a.Ei);
                errl errlVar15 = (errl) this.a.p.b();
                errl errlVar16 = (errl) this.a.t.b();
                akis akisVar42 = this.a;
                akkp akkpVar44 = akisVar42.a;
                return new cozj(akisVar40.aZ, akisVar40.cC, akisVar40.aV, cqohVar5, fbbfVar64, fbbfVar65, akisVar41.cT, context7, a10, a11, errlVar15, errlVar16, akisVar42.aK, akkpVar44.jM, akkpVar44.jN, akkpVar44.Et);
            case 293:
                Context context8 = (Context) this.a.q.b();
                akis akisVar43 = this.a;
                akkp akkpVar45 = akisVar43.a;
                return new covw(context8, akkpVar45.dn, akkpVar45.iN, akkpVar45.f, akkpVar45.Ef, akkpVar45.jG, akisVar43.mE, akkpVar45.L);
            case 294:
                Context context9 = (Context) this.a.q.b();
                ejtr ejtrVar = (ejtr) this.a.a.f7do.b();
                akis akisVar44 = this.a;
                cqoh cqohVar6 = (cqoh) akisVar44.cz.b();
                akis akisVar45 = this.a;
                akkp akkpVar46 = akisVar45.a;
                fbbf fbbfVar66 = akkpVar46.c;
                fbbf fbbfVar67 = akkpVar46.di;
                fbbf fbbfVar68 = akkpVar46.dp;
                fbbf fbbfVar69 = akkpVar46.kj;
                fbbf fbbfVar70 = akkpVar46.ds;
                fbbf fbbfVar71 = akkpVar46.iM;
                fbbf fbbfVar72 = akkpVar46.em;
                fbbf fbbfVar73 = akkpVar46.u;
                fbbf fbbfVar74 = akkpVar46.ap;
                fbbf fbbfVar75 = akkpVar46.Bt;
                fbbf fbbfVar76 = akisVar45.mD;
                fbbf fbbfVar77 = akkpVar46.ib;
                fbbf fbbfVar78 = akkpVar46.dw;
                fbbf fbbfVar79 = akkpVar46.dB;
                fbbf fbbfVar80 = akkpVar46.fs;
                fbbf fbbfVar81 = akkpVar46.iP;
                fbbf fbbfVar82 = akkpVar46.AH;
                fbbf fbbfVar83 = akkpVar46.iK;
                fbbf fbbfVar84 = akkpVar46.AL;
                fbbf fbbfVar85 = akkpVar46.ay;
                fbbf fbbfVar86 = akkpVar46.dv;
                fbbf fbbfVar87 = akkpVar46.Ec;
                fbbf fbbfVar88 = akkpVar46.f;
                fbbf fbbfVar89 = akkpVar46.Ed;
                Optional optional2 = (Optional) akkpVar46.jp.b();
                akis akisVar46 = this.a;
                fbbf fbbfVar90 = akisVar46.a.jF;
                errl errlVar17 = (errl) akisVar46.t.b();
                errl errlVar18 = (errl) this.a.aK.b();
                akis akisVar47 = this.a;
                akkp akkpVar47 = akisVar47.a;
                fbbf fbbfVar91 = akkpVar47.Z;
                fbbf fbbfVar92 = akkpVar47.aO;
                fbbf fbbfVar93 = akisVar47.mE;
                fbbf fbbfVar94 = akkpVar47.cf;
                fbbf fbbfVar95 = akkpVar47.L;
                fbbf fbbfVar96 = akkpVar47.Ee;
                fbbf fbbfVar97 = akisVar47.lT;
                asmj asmjVar = (asmj) akkpVar47.jD.b();
                return new coym(context9, ejtrVar, akisVar44.cT, cqohVar6, fbbfVar66, fbbfVar67, fbbfVar68, akisVar45.cv, fbbfVar69, fbbfVar70, fbbfVar71, fbbfVar72, fbbfVar73, fbbfVar74, fbbfVar75, fbbfVar76, fbbfVar77, fbbfVar78, fbbfVar79, fbbfVar80, fbbfVar81, fbbfVar82, fbbfVar83, fbbfVar84, fbbfVar85, fbbfVar86, fbbfVar87, fbbfVar88, fbbfVar89, optional2, fbbfVar90, akisVar46.cu, errlVar17, errlVar18, fbbfVar91, fbbfVar92, fbbfVar93, fbbfVar94, fbbfVar95, fbbfVar96, fbbfVar97, asmjVar);
            case 295:
                akis akisVar48 = this.a;
                return new ejtr(akisVar48.ep(), (Context) akisVar48.q.b(), (ejvp) this.a.aR.b(), (errl) this.a.aK.b(), (dlpw) this.a.l.b(), (elbx) this.a.aJ.b(), (Executor) this.a.a.m.b());
            case 296:
                Context context10 = (Context) this.a.q.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akis akisVar49 = this.a;
                akkp akkpVar48 = akisVar49.a;
                fbbf fbbfVar98 = akkpVar48.dp;
                csum csumVar = (csum) akkpVar48.dr.b();
                akis akisVar50 = this.a;
                akkp akkpVar49 = akisVar50.a;
                fbbf fbbfVar99 = akkpVar49.dv;
                fbbf fbbfVar100 = akkpVar49.dw;
                fbbf fbbfVar101 = akkpVar49.dB;
                fbbf fbbfVar102 = akkpVar49.fs;
                fbbf fbbfVar103 = akkpVar49.iP;
                fbbf fbbfVar104 = akkpVar49.iN;
                fbbf fbbfVar105 = akkpVar49.di;
                fbbf fbbfVar106 = akisVar50.mB;
                fbbf fbbfVar107 = akkpVar49.iy;
                Optional optional3 = (Optional) akkpVar49.jp.b();
                Optional optional4 = (Optional) this.a.a.pg.b();
                errl errlVar19 = (errl) this.a.aK.b();
                akis akisVar51 = this.a;
                fbbf fbbfVar108 = akisVar51.a.pQ;
                ckeq ckeqVar = (ckeq) akisVar51.mC.b();
                akis akisVar52 = this.a;
                akkp akkpVar50 = akisVar52.a;
                fbbf fbbfVar109 = akkpVar50.D;
                fbbf fbbfVar110 = akkpVar50.Z;
                fbbf fbbfVar111 = akkpVar50.ds;
                fbbf fbbfVar112 = akkpVar50.tE;
                fbbf fbbfVar113 = akkpVar50.Ea;
                fbbf fbbfVar114 = akkpVar50.Eb;
                errl errlVar20 = (errl) akisVar52.p.b();
                akkp akkpVar51 = this.a.a;
                aslp bD = akkpVar51.bD();
                asmj asmjVar2 = (asmj) akkpVar51.jD.b();
                akkp akkpVar52 = this.a.a;
                return new ckdm(context10, dtuuVar2, fbbfVar98, akisVar49.cv, csumVar, fbbfVar99, fbbfVar100, fbbfVar101, fbbfVar102, fbbfVar103, fbbfVar104, fbbfVar105, fbbfVar106, fbbfVar107, optional3, optional4, errlVar19, fbbfVar108, ckeqVar, akisVar52.ct, fbbfVar109, fbbfVar110, fbbfVar111, fbbfVar112, fbbfVar113, fbbfVar114, errlVar20, bD, asmjVar2, akkpVar52.jF, akkpVar52.cp());
            case 297:
                cqoh cqohVar7 = (cqoh) this.a.cz.b();
                akis akisVar53 = this.a;
                return new csum(cqohVar7, akisVar53.dY, akisVar53.a.dq);
            case 298:
                final fbbf fbbfVar115 = this.a.a.s;
                return new auhb() { // from class: auhc
                    @Override // defpackage.auhb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.allow_sharing_file_provider_not_be_marked_private");
                    }
                };
            case 299:
                return new cgtc((Context) this.a.q.b(), (albq) this.a.a.di.b(), (cqoh) this.a.cz.b(), (covs) this.a.a.ds.b(), (cpdg) this.a.a.ap.b(), this.a.a.du);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        int i = this.b;
        switch (i) {
            case 2000:
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new adkv(ffhdVar, ffskVar, akisVar.mv, akkpVar.C, akkpVar.au, akkpVar.as, akkpVar.KT);
            case 2001:
                final fbbf fbbfVar = this.a.a.s;
                return new atxv() { // from class: atxn
                    @Override // defpackage.atxv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_capability_refactor");
                    }
                };
            case 2002:
                return new dzhw((ecdc) this.a.a.ei.b());
            case 2003:
                return new dzhv((ecdc) this.a.a.ei.b());
            case 2004:
                return Boolean.valueOf(aruu.a((ersq) this.a.a.s.b()));
            case 2005:
                return Boolean.valueOf(arvd.a((ersq) this.a.a.s.b()));
            case 2006:
                return new wmq((ffsk) this.a.a.aq.b(), this.a.a.Lc);
            case 2007:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akis akisVar2 = this.a;
                akkp akkpVar2 = akisVar2.a;
                return new wmn(ffskVar2, akkpVar2.az, akisVar2.nq, akisVar2.nr, akkpVar2.Lb, akkpVar2.dt);
            case 2008:
                return wnq.a(this.a.a.aT);
            case 2009:
                errl errlVar = (errl) this.a.t.b();
                akis akisVar3 = this.a;
                return new ckqp(errlVar, akisVar3.a.dn, (cqoh) akisVar3.cz.b(), (bdtd) this.a.a.aO.b(), (cbvt) this.a.a.pJ.b(), (dtuu) this.a.a.ay.b(), (cbgf) this.a.a.dA.b(), (akzt) this.a.a.C.b());
            case 2010:
                errl errlVar2 = (errl) this.a.aK.b();
                Context context = (Context) this.a.q.b();
                cins cinsVar = (cins) this.a.a.jc.b();
                akkp akkpVar3 = this.a.a;
                return new cirm(errlVar2, context, cinsVar, akkpVar3.AZ, akkpVar3.AH, akkpVar3.hx, akkpVar3.hw, (cbgf) akkpVar3.dA.b(), (axmw) this.a.a.AS.b(), (cqoh) this.a.cz.b(), (cipm) this.a.a.ix.b(), (dtuu) this.a.a.ay.b(), this.a.a.Lf);
            case 2011:
                return new cjcr((ciwj) this.a.a.pw.b(), this.a.a.ii());
            case 2012:
                akis akisVar4 = this.a;
                akkp akkpVar4 = akisVar4.a;
                return new cirr(akkpVar4.dB, akkpVar4.hw, (errl) akisVar4.t.b());
            case 2013:
                return new akdh((ffsk) this.a.a.p.b(), (ajys) this.a.a.LL.b(), (azei) this.a.a.LO.b(), this.a.a.Ji);
            case 2014:
                akkp akkpVar5 = this.a.a;
                Map qS = akkpVar5.qS();
                long longValue = ((Long) akkpVar5.LK.b()).longValue();
                akkp akkpVar6 = this.a.a;
                return akbs.a(qS, longValue, akkpVar6.aa(), akkpVar6.ct(), akkpVar6.LJ);
            case 2015:
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                akis akisVar5 = this.a;
                fbbf fbbfVar2 = akisVar5.cz;
                fbbf fbbfVar3 = akisVar5.a.ay;
                cqoh cqohVar = (cqoh) fbbfVar2.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                Context context2 = (Context) this.a.q.b();
                akkp akkpVar7 = this.a.a;
                return new ajyr(ffhdVar2, fbbfVar3, cqohVar, ffskVar3, context2, akkpVar7.Li, akkpVar7.Lj, akkpVar7.Lk, (ffsk) akkpVar7.aq.b(), (azac) this.a.ns.b(), this.a.a.Jh);
            case 2016:
                return Long.valueOf(fcxd.a(this.a.a.nF()));
            case 2017:
                return Long.valueOf(fcxi.a(this.a.a.nF()));
            case 2018:
                return Long.valueOf(fcxe.a(this.a.a.nF()));
            case 2019:
                return new akdc((cevh) this.a.a.cc.b());
            case 2020:
                Context context3 = (Context) this.a.q.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akkp akkpVar8 = this.a.a;
                return new ajwa(context3, cqohVar2, akkpVar8.Ll, akkpVar8.Ln, akkpVar8.Lo, akkpVar8.Lp, akkpVar8.ay);
            case 2021:
                final fbbf fbbfVar4 = this.a.a.s;
                return new aspb() { // from class: arup
                    @Override // defpackage.aspb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.require_app_update_for_d2d_restore");
                    }
                };
            case 2022:
                return new ajwh((azac) this.a.nt.b(), this.a.a.Ll);
            case 2023:
                return Long.valueOf(fcxg.a(this.a.a.nF()));
            case 2024:
                akkp akkpVar9 = this.a.a;
                bcmc eN = akkpVar9.eN();
                bcmd.a(akkpVar9.eM());
                return eN;
            case 2025:
                return new baiv(this.a.a.fy);
            case 2026:
                akis akisVar6 = this.a;
                akkp akkpVar10 = akisVar6.a;
                return new bcnb(akkpVar10.aq, akkpVar10.Ji, akisVar6.nu, akkpVar10.Ls, akkpVar10.Jh, akkpVar10.Lt, akkpVar10.Lu);
            case 2027:
                return new atju() { // from class: atjn
                };
            case 2028:
                return Long.valueOf(fcxf.a(this.a.a.nF()));
            case 2029:
                final fbbf fbbfVar5 = this.a.a.s;
                return new aucl() { // from class: aucd
                    @Override // defpackage.aucl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.restore_message_captions");
                    }
                };
            case 2030:
                akis akisVar7 = this.a;
                fbbf fbbfVar6 = akisVar7.cz;
                akkp akkpVar11 = akisVar7.a;
                return new bbii(akkpVar11.Lx, akkpVar11.Ly, (cqoh) fbbfVar6.b());
            case 2031:
                return new dttm(this.a.a.Lw);
            case 2032:
                return Long.valueOf(fcxc.a(this.a.a.nF()));
            case 2033:
                return Long.valueOf(fcxh.a(this.a.a.nF()));
            case 2034:
                return Long.valueOf(fcxk.a(this.a.a.nF()));
            case 2035:
                return Long.valueOf(fcxj.a(this.a.a.nF()));
            case 2036:
                akis akisVar8 = this.a;
                return new ajyw(akisVar8.a.LF, (cqoh) akisVar8.cz.b(), (ffsk) this.a.a.q.b());
            case 2037:
                akkp akkpVar12 = this.a.a;
                return new ajza(akkpVar12.dt, akkpVar12.qf, (ffsk) akkpVar12.q.b(), this.a.a.LE);
            case 2038:
                final fbbf fbbfVar7 = this.a.a.s;
                return new aucj() { // from class: aubz
                    @Override // defpackage.aucj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.local_bnr_pseudonymous_logging");
                    }
                };
            case 2039:
                return new akaj(this.a.a.Ll);
            case 2040:
                akis akisVar9 = this.a;
                fbbf fbbfVar8 = akisVar9.cP;
                akkp akkpVar13 = akisVar9.a;
                fbbf fbbfVar9 = akkpVar13.Ll;
                fbbf fbbfVar10 = akkpVar13.Lm;
                fbbf fbbfVar11 = akkpVar13.Lq;
                fbbf fbbfVar12 = akkpVar13.LD;
                fbbf fbbfVar13 = akkpVar13.kG;
                ffhd ffhdVar3 = (ffhd) fbbfVar8.b();
                akkp akkpVar14 = this.a.a;
                fbbf fbbfVar14 = akkpVar14.Ln;
                fbbf fbbfVar15 = akkpVar14.LG;
                ffsk ffskVar4 = (ffsk) akkpVar14.q.b();
                akbq akbqVar = new akbq();
                akis akisVar10 = this.a;
                akkp akkpVar15 = akisVar10.a;
                return new akbo(fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, ffhdVar3, fbbfVar14, fbbfVar15, ffskVar4, akbqVar, akkpVar15.LH, akkpVar15.Lo, akisVar10.aI(), akkpVar15.LI);
            case 2041:
                return Long.valueOf(fcxm.a(this.a.a.nF()));
            case 2042:
                return Long.valueOf(fcxl.a(this.a.a.nF()));
            case 2043:
                akkp akkpVar16 = this.a.a;
                return new azei(akkpVar16.LN, (ffsk) akkpVar16.p.b());
            case 2044:
                akkp akkpVar17 = this.a.a;
                return enip.s(akkpVar17.ab(), akkpVar17.ac(), akkpVar17.ad());
            case 2045:
                return new cptk((cevh) this.a.a.cc.b());
            case 2046:
                return new awgp((cknc) this.a.a.wL.b());
            case 2047:
                ckju ckjuVar = (ckju) this.a.a.ky.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                akkp akkpVar18 = this.a.a;
                avlc cU = akkpVar18.cU();
                fbbf fbbfVar16 = akkpVar18.Ik;
                dtuu dtuuVar = (dtuu) akkpVar18.ay.b();
                akkp akkpVar19 = this.a.a;
                fbbf fbbfVar17 = akkpVar19.wL;
                return new awgs(ckjuVar, cbgfVar, cU, fbbfVar16, dtuuVar, fbbfVar17);
            case 2048:
                return new awgu((cknc) this.a.a.wL.b());
            case 2049:
                akkp akkpVar20 = this.a.a;
                fbbf fbbfVar18 = akkpVar20.dG;
                fbbf fbbfVar19 = akkpVar20.IM;
                Object pi = akkpVar20.pi();
                return new tcl(fbbfVar18, fbbfVar19, (tba) pi, (errl) this.a.t.b(), (errl) this.a.p.b());
            case 2050:
                akis akisVar11 = this.a;
                akkp akkpVar21 = akisVar11.a;
                return new aqpu(akkpVar21.p, akisVar11.cP, akkpVar21.mq, akkpVar21.Dj);
            case 2051:
                akkp akkpVar22 = this.a.a;
                return new cnel(akkpVar22.jH(), (ffsk) akkpVar22.q.b());
            case 2052:
                errl errlVar3 = (errl) this.a.p.b();
                errl errlVar4 = (errl) this.a.t.b();
                akkp akkpVar23 = this.a.a;
                return new craf(errlVar3, errlVar4, akkpVar23.kP(), (cray) akkpVar23.Ko.b());
            case 2053:
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                akis akisVar12 = this.a;
                akkp akkpVar24 = akisVar12.a;
                return new cjkj(ffskVar5, akkpVar24.ir(), akisVar12.cj(), akkpVar24.ip(), akkpVar24.iq());
            case 2054:
                avkh avkhVar = (avkh) this.a.a.kh.b();
                akkp akkpVar25 = this.a.a;
                return new clmy(avkhVar, akkpVar25.LY, akkpVar25.LZ, (ffsk) akkpVar25.aq.b(), this.a.a.jg());
            case 2055:
                return Long.valueOf(fdhx.a(this.a.a.oB()));
            case 2056:
                return Long.valueOf(fdhy.a(this.a.a.oB()));
            case 2057:
                Context context4 = (Context) this.a.q.b();
                akkp akkpVar26 = this.a.a;
                return new bzox(context4, akkpVar26.Av, akkpVar26.eZ(), (bzgd) akkpVar26.fa.b(), (akzt) this.a.a.f.b(), (errl) this.a.t.b(), (errl) this.a.p.b(), this.a.da);
            case 2058:
                akis akisVar13 = this.a;
                fbbf fbbfVar20 = akisVar13.cz;
                akkp akkpVar27 = akisVar13.a;
                return new cqfc(akkpVar27.Ev, akkpVar27.Mc, akkpVar27.jc, (cqoh) fbbfVar20.b(), (cqew) this.a.a.jK.b(), (ffsk) this.a.a.q.b(), (Context) this.a.q.b());
            case 2059:
                akis akisVar14 = this.a;
                fbbf fbbfVar21 = akisVar14.cz;
                akkp akkpVar28 = akisVar14.a;
                fbbf fbbfVar22 = akkpVar28.Er;
                fbbf fbbfVar23 = akkpVar28.fJ;
                fbbf fbbfVar24 = akkpVar28.kr;
                fbbf fbbfVar25 = akkpVar28.Ky;
                fbbf fbbfVar26 = akkpVar28.Kw;
                fbbf fbbfVar27 = akkpVar28.dA;
                fbbf fbbfVar28 = akkpVar28.jJ;
                fbbf fbbfVar29 = akkpVar28.Kx;
                cqoh cqohVar3 = (cqoh) fbbfVar21.b();
                ecrj ecrjVar = (ecrj) this.a.cN.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                akis akisVar15 = this.a;
                akkp akkpVar29 = akisVar15.a;
                return new cqev(fbbfVar22, fbbfVar23, fbbfVar24, akisVar14.aZ, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, cqohVar3, ecrjVar, coxkVar, akkpVar29.Eo, akisVar15.cT, akkpVar29.Es);
            case 2060:
                return new ckoh((errl) this.a.p.b(), (errl) this.a.t.b(), this.a.a.iO());
            case 2061:
                return new clae((errl) this.a.p.b(), (errl) this.a.t.b(), (cbgf) this.a.a.dA.b(), (akzt) this.a.a.f.b());
            case 2062:
                akis akisVar16 = this.a;
                return new cisc(akisVar16.a.jc, (csxu) akisVar16.aO.b(), (errl) this.a.aK.b(), this.a.cT);
            case 2063:
                akis akisVar17 = this.a;
                return new cisk(akisVar17.a.jc, (csxu) akisVar17.aO.b(), (errl) this.a.aK.b());
            case 2064:
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                akkp akkpVar30 = this.a.a;
                return new bzrj(ffskVar6, akkpVar30.C, akkpVar30.dn);
            case 2065:
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                akkp akkpVar31 = this.a.a;
                fbbf fbbfVar30 = akkpVar31.dn;
                fbbf fbbfVar31 = akkpVar31.wL;
                avkj avkjVar = (avkj) akkpVar31.jf.b();
                akkp akkpVar32 = this.a.a;
                return new ckzj(errlVar5, errlVar6, fbbfVar30, fbbfVar31, avkjVar, akkpVar32.nJ, akkpVar32.Z, akkpVar32.ib);
            case 2066:
                return new cbio((cbit) this.a.a.Bb.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 2067:
                return new cesc((errl) this.a.t.b(), this.a.a.cD);
            case 2068:
                ffsk ffskVar7 = (ffsk) this.a.a.aq.b();
                akkp akkpVar33 = this.a.a;
                return new anzf(ffskVar7, akkpVar33.nE, akkpVar33.nf);
            case 2069:
                return new slv((ffsk) this.a.a.q.b(), this.a.a.t());
            case 2070:
                return new slf((Context) this.a.q.b(), (ffhd) this.a.a.rZ.b(), (ffhd) this.a.cn.b(), fbaz.a(this.a.ks), fbaz.a(this.a.kt));
            case 2071:
                akkp akkpVar34 = this.a.a;
                return new cuso(akkpVar34.tu, (ffsk) akkpVar34.q.b());
            case 2072:
                return new cpzo((cqoh) this.a.cz.b(), (cqel) this.a.a.Mc.b(), (albq) this.a.a.sO.b(), (ffsk) this.a.a.aq.b());
            case 2073:
                cpip cpipVar = (cpip) this.a.a.kN.b();
                akkp akkpVar35 = this.a.a;
                return new cppa(cpipVar, akkpVar35.gx, (ffsk) akkpVar35.q.b(), this.a.a.Mr);
            case 2074:
                return Long.valueOf(fdbq.a(this.a.a.ob()));
            case 2075:
                akkp akkpVar36 = this.a.a;
                return new cpjd((cpnb) akkpVar36.qu(), akkpVar36.jc);
            case 2076:
                return cpim.a(this.a.a.kM.b(), (errl) this.a.p.b());
            case 2077:
                akkp akkpVar37 = this.a.a;
                return new cpjn((cpnb) akkpVar37.qv(), akkpVar37.jc);
            case 2078:
                akkp akkpVar38 = this.a.a;
                return new cpkm((cpnb) akkpVar38.qz(), akkpVar38.jc);
            case 2079:
                akkp akkpVar39 = this.a.a;
                return new cplr(akkpVar39.qV(), akkpVar39.Mx, akkpVar39.My, (ffsk) akkpVar39.p.b());
            case 2080:
                return Long.valueOf(fdil.a(this.a.a.oE()));
            case 2081:
                return Long.valueOf(fdim.a(this.a.a.oE()));
            case 2082:
                akkp akkpVar40 = this.a.a;
                return new cpnj((cpnb) akkpVar40.qw(), akkpVar40.jc);
            case 2083:
                akkp akkpVar41 = this.a.a;
                return new cpno((cpnb) akkpVar41.qx(), akkpVar41.jc);
            case 2084:
                akkp akkpVar42 = this.a.a;
                return new cpoo((cpnb) akkpVar42.qA(), akkpVar42.jc);
            case 2085:
                errl errlVar7 = (errl) this.a.p.b();
                errl errlVar8 = (errl) this.a.t.b();
                akkp akkpVar43 = this.a.a;
                crab kP = akkpVar43.kP();
                bbfw bbfwVar = (bbfw) akkpVar43.pt.b();
                akkp akkpVar44 = this.a.a;
                fbbf fbbfVar32 = akkpVar44.dB;
                fbbf fbbfVar33 = akkpVar44.dw;
                fbbf fbbfVar34 = akkpVar44.fs;
                fbbf fbbfVar35 = akkpVar44.gp;
                ckch ckchVar = (ckch) akkpVar44.kj.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akkp akkpVar45 = this.a.a;
                bzxq fg = akkpVar45.fg();
                cqvy cqvyVar = (cqvy) akkpVar45.oP.b();
                akkp akkpVar46 = this.a.a;
                return new crav(errlVar7, errlVar8, kP, bbfwVar, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, ckchVar, dtuuVar2, fg, cqvyVar, akkpVar46.aw, akkpVar46.Eb);
            case 2086:
                ffsk ffskVar8 = (ffsk) this.a.a.aq.b();
                akkp akkpVar47 = this.a.a;
                return new caqf(ffskVar8, akkpVar47.qJ, akkpVar47.sY);
            case 2087:
                akis akisVar18 = this.a;
                akkp akkpVar48 = akisVar18.a;
                return new cahc(akkpVar48.qq, akkpVar48.qo, akisVar18.t, akkpVar48.hK);
            case 2088:
                errl errlVar9 = (errl) this.a.p.b();
                akkp akkpVar49 = this.a.a;
                return new cmqh(errlVar9, akkpVar49.ql, (chco) akkpVar49.wU.b());
            case 2089:
                akis akisVar19 = this.a;
                return new cesf(akisVar19.a.AH, (errl) akisVar19.aK.b());
            case 2090:
                return new bzra(this.a.a.sU);
            case 2091:
                return new cesr((errl) this.a.p.b(), (ejtr) this.a.a.f7do.b(), this.a.a.f);
            case 2092:
                akis akisVar20 = this.a;
                akkp akkpVar50 = akisVar20.a;
                return new bzpf(akkpVar50.vF, akkpVar50.vK, (errl) akisVar20.p.b(), (errl) this.a.t.b(), (bcsq) this.a.a.rq.b(), (bigl) this.a.ki.b(), (chdj) this.a.a.uR.b(), fbaz.a(this.a.a.eY), (atky) this.a.a.rs.b());
            case 2093:
                errm errmVar = (errm) this.a.p.b();
                akis akisVar21 = this.a;
                return new ajov(errmVar, akisVar21.a.rK(), (ctzw) akisVar21.dI.b(), this.a.a.lS());
            case 2094:
                return new adac((ffsk) this.a.a.q.b(), this.a.a.H());
            case 2095:
                ffsk ffskVar9 = (ffsk) this.a.a.q.b();
                akkp akkpVar51 = this.a.a;
                return new cqmo(ffskVar9, akkpVar51.kI(), akkpVar51.MN, akkpVar51.MO);
            case 2096:
                return new cqog(this.a.a.aT);
            case 2097:
                final fbbf fbbfVar36 = this.a.a.s;
                return new auxa() { // from class: auws
                    @Override // defpackage.auxa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.run_database_update_for_messages_in_thread_zero");
                    }
                };
            case 2098:
                errl errlVar10 = (errl) this.a.p.b();
                errl errlVar11 = (errl) this.a.t.b();
                akkp akkpVar52 = this.a.a;
                fbbf fbbfVar37 = akkpVar52.cG;
                awmi dI = akkpVar52.dI();
                akkpVar52.rZ();
                akkp akkpVar53 = this.a.a;
                fbbf fbbfVar38 = akkpVar53.MT;
                fbbf fbbfVar39 = akkpVar53.MU;
                fbbf fbbfVar40 = akkpVar53.MZ;
                bdtd bdtdVar = (bdtd) akkpVar53.aO.b();
                cbfs cbfsVar = (cbfs) this.a.a.er.b();
                akis akisVar22 = this.a;
                fbbf fbbfVar41 = akisVar22.cz;
                fbbf fbbfVar42 = akisVar22.a.pJ;
                cqoh cqohVar4 = (cqoh) fbbfVar41.b();
                akkp akkpVar54 = this.a.a;
                fbbf fbbfVar43 = akkpVar54.ib;
                fbbf fbbfVar44 = akkpVar54.yU;
                fbbf fbbfVar45 = akkpVar54.br;
                fbbf fbbfVar46 = akkpVar54.Na;
                fbbf fbbfVar47 = akkpVar54.Nc;
                return new awpj(errlVar10, errlVar11, fbbfVar37, dI, fbbfVar38, fbbfVar39, fbbfVar40, bdtdVar, cbfsVar, fbbfVar42, cqohVar4, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar47);
            case 2099:
                return Boolean.valueOf(fddb.a(this.a.a.og()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        Object cnsmVar;
        int i = this.b;
        switch (i) {
            case 2100:
                final fbbf fbbfVar = this.a.a.s;
                return new atzy() { // from class: atzb
                    @Override // defpackage.atzy
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.process_incoming_group_icon_update");
                    }
                };
            case 2101:
                awhv awhvVar = new awhv();
                akis akisVar = this.a;
                return new awlh(awhvVar, akisVar.a.ry(), (errl) akisVar.p.b(), (errl) this.a.t.b());
            case 2102:
                final fbbf fbbfVar2 = this.a.a.s;
                return new atzr() { // from class: atyn
                    @Override // defpackage.atzr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.ignore_name_change_capability_on_group_full_state");
                    }
                };
            case 2103:
                awit awitVar = new awit();
                akis akisVar2 = this.a;
                return new awlh(awitVar, akisVar2.a.rx(), (errl) akisVar2.p.b(), (errl) this.a.t.b());
            case 2104:
                akis akisVar3 = this.a;
                akkp akkpVar = akisVar3.a;
                Object ph = akkpVar.ph();
                Object pv = akkpVar.pv();
                Object pX = akkpVar.pX();
                Object qq = akkpVar.qq();
                awlk dH = akkpVar.dH();
                Object ql = akkpVar.ql();
                errl errlVar = (errl) akisVar3.p.b();
                akis akisVar4 = this.a;
                akkp akkpVar2 = akisVar4.a;
                Object pw = akkpVar2.pw();
                awkf awkfVar = (awkf) pw;
                return new awkq((awjs) ph, (awju) pv, (awmr) pX, (awnd) qq, dH, (awna) ql, errlVar, awkfVar, (awnf) akisVar4.fC(), akkpVar2.MR);
            case 2105:
                akkp akkpVar3 = this.a.a;
                return enip.r(akkpVar3.ft(), akkpVar3.hr());
            case 2106:
                final fbbf fbbfVar3 = this.a.a.s;
                return new atzq() { // from class: atyl
                    @Override // defpackage.atzq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_ignore_telephony_group_rename_for_empty_thread_id");
                    }
                };
            case 2107:
                return new bctg((Context) this.a.q.b(), (cuxh) this.a.a.ae.b(), this.a.kk);
            case 2108:
                return new bdvl((ckac) this.a.a.gQ.b(), (aolr) this.a.a.Z.b());
            case 2109:
                akkp akkpVar4 = this.a.a;
                fbbf fbbfVar4 = akkpVar4.dt;
                fbbf fbbfVar5 = akkpVar4.br;
                fbbf fbbfVar6 = akkpVar4.G;
                aqvh aqvhVar = (aqvh) akkpVar4.gN.b();
                akkp akkpVar5 = this.a.a;
                return new cknb(fbbfVar4, fbbfVar5, fbbfVar6, aqvhVar, akkpVar5.dn, (ffsk) akkpVar5.q.b());
            case 2110:
                akkp akkpVar6 = this.a.a;
                return new azei(akkpVar6.Nb, (ffsk) akkpVar6.p.b());
            case 2111:
                return new enpx(this.a.a.lo());
            case 2112:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                comc comcVar = (comc) this.a.a.HR.b();
                aybz aybzVar = (aybz) this.a.a.Ig.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akis akisVar5 = this.a;
                akkp akkpVar7 = akisVar5.a;
                return new ayaf(ffskVar, comcVar, aybzVar, cqohVar, akkpVar7.mj, akisVar5.cN, akkpVar7.al, akkpVar7.Hs, akkpVar7.ml);
            case 2113:
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                akis akisVar6 = this.a;
                fbbf fbbfVar7 = akisVar6.nC;
                akkp akkpVar8 = akisVar6.a;
                return new degf(ffskVar2, fbbfVar7, akkpVar8.Nm, akkpVar8.Ng, akkpVar8.No, akkpVar8.Nk);
            case 2114:
                akis akisVar7 = this.a;
                fbbf fbbfVar8 = akisVar7.cn;
                akkp akkpVar9 = akisVar7.a;
                fbbf fbbfVar9 = akkpVar9.Nj;
                fbbf fbbfVar10 = akkpVar9.Nk;
                ffhd ffhdVar = (ffhd) fbbfVar8.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                akkp akkpVar10 = this.a.a;
                return new degd(fbbfVar9, fbbfVar10, ffhdVar, ffskVar3, akkpVar10.Nl, akkpVar10.Ng);
            case 2115:
                akis akisVar8 = this.a;
                fbbf fbbfVar11 = akisVar8.co;
                fbbf fbbfVar12 = akisVar8.a.Z;
                ffhd ffhdVar2 = (ffhd) fbbfVar11.b();
                ffhd ffhdVar3 = (ffhd) this.a.cn.b();
                akis akisVar9 = this.a;
                akkp akkpVar11 = akisVar9.a;
                return new defp(fbbfVar12, akisVar8.cz, ffhdVar2, ffhdVar3, akkpVar11.Ng, akkpVar11.Ni, akisVar9.q, akkpVar11.ko, (bdfp) akkpVar11.uM.b(), this.a.a.Q);
            case 2116:
                akkp akkpVar12 = this.a.a;
                return new cvhp(akkpVar12.Nf, akkpVar12.wf, akkpVar12.lJ());
            case 2117:
                return Boolean.valueOf(asga.a((ersq) this.a.a.s.b()));
            case 2118:
                bcsf bcsfVar = (bcsf) this.a.a.vK.b();
                akis akisVar10 = this.a;
                akkp akkpVar13 = akisVar10.a;
                return new cvgy(bcsfVar, akkpVar13.dQ, akkpVar13.lv(), akkpVar13.lw(), akisVar10.dB, akkpVar13.rq, akkpVar13.vL, akkpVar13.Z, akkpVar13.uM, akkpVar13.Nh, (atky) akkpVar13.rs.b());
            case 2119:
                final fbbf fbbfVar13 = this.a.a.s;
                return new avcg() { // from class: avbu
                    @Override // defpackage.avcg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.sync_reaction_message_to_wear");
                    }
                };
            case 2120:
                return new defd(this.a.a.f);
            case 2121:
                return new degg(this.a.a.cc);
            case 2122:
                akkp akkpVar14 = this.a.a;
                return new dego(akkpVar14.Nn, akkpVar14.ka(), (ffsk) akkpVar14.p.b(), (ffsk) this.a.a.q.b(), (cqoh) this.a.cz.b());
            case 2123:
                return Long.valueOf(fdjm.a(this.a.a.oL()));
            case 2124:
                return new cerf((coxb) this.a.a.Nq.b(), (errl) this.a.aK.b());
            case 2125:
                return new coxb((cqoh) this.a.cz.b(), (coxk) this.a.a.iN.b(), this.a.a.fJ);
            case 2126:
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                Context context = (Context) this.a.q.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.p.b();
                errl errlVar4 = (errl) this.a.aK.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                akkp akkpVar15 = this.a.a;
                return new amcp(ctvbVar, context, cbgfVar, errlVar2, errlVar3, errlVar4, coxkVar, akkpVar15.AZ, akkpVar15.dB, (cbek) akkpVar15.AH.b(), (axmw) this.a.a.AS.b(), (bbgg) this.a.a.iE.b(), (cish) this.a.a.hx.b(), (cisl) this.a.a.hw.b());
            case 2127:
                return new clxk((ffhd) this.a.co.b(), (ffsk) this.a.a.p.b(), (ejtr) this.a.a.f7do.b(), (akzt) this.a.a.f.b());
            case 2128:
                errl errlVar5 = (errl) this.a.t.b();
                cgrq cgrqVar = (cgrq) this.a.a.pS.b();
                aitz aitzVar = (aitz) this.a.a.Nu.b();
                akkp akkpVar16 = this.a.a;
                fbbf fbbfVar14 = akkpVar16.f;
                fbbf fbbfVar15 = akkpVar16.Nw;
                aiuv aiuvVar = (aiuv) akkpVar16.Nv.b();
                akkp akkpVar17 = this.a.a;
                return new aitg(errlVar5, cgrqVar, aitzVar, fbbfVar14, fbbfVar15, aiuvVar, akkpVar17.dB, (asix) akkpVar17.pR.b());
            case 2129:
                errl errlVar6 = (errl) this.a.p.b();
                errl errlVar7 = (errl) this.a.t.b();
                effy effyVar = (effy) this.a.nD.b();
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                akkp akkpVar18 = this.a.a;
                return new aiuj(errlVar6, errlVar7, effyVar, ejvbVar, ejvpVar, akkpVar18.Nv, akkpVar18.cu());
            case 2130:
                aitz aitzVar2 = (aitz) this.a.a.Nu.b();
                akis akisVar11 = this.a;
                return new aiuv(aitzVar2, akisVar11.a.dF, new aexz(), (Executor) akisVar11.p.b());
            case 2131:
                akis akisVar12 = this.a;
                akkp akkpVar19 = akisVar12.a;
                return new aewk(akkpVar19.dF, akkpVar19.dE, new aexz(), (Executor) akisVar12.p.b());
            case 2132:
                return new aixi((errm) this.a.p.b(), this.a.a.P());
            case 2133:
                akis akisVar13 = this.a;
                akkp akkpVar20 = akisVar13.a;
                fbbf fbbfVar16 = akkpVar20.p;
                fbbf fbbfVar17 = akkpVar20.Z;
                fbbf fbbfVar18 = akkpVar20.lV;
                cggu cgguVar = (cggu) akisVar13.gW.b();
                akis akisVar14 = this.a;
                fbbf fbbfVar19 = akisVar14.aR;
                akkp akkpVar21 = akisVar14.a;
                fbbf fbbfVar20 = akkpVar21.ay;
                fbbf fbbfVar21 = akisVar14.jT;
                fbbf fbbfVar22 = akkpVar21.dA;
                fbbf fbbfVar23 = akkpVar21.uy;
                fbbf fbbfVar24 = akkpVar21.eW;
                ejvp ejvpVar2 = (ejvp) fbbfVar19.b();
                akis akisVar15 = this.a;
                fbbf fbbfVar25 = akisVar15.cN;
                return new cghv(fbbfVar16, akisVar13.cP, fbbfVar17, fbbfVar18, cgguVar, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, ejvpVar2, akisVar15.a.pC, (ecrj) fbbfVar25.b(), fbaz.a(this.a.a.Nz));
            case 2134:
                return new enpx(this.a.a.hq());
            case 2135:
                return new ajhh((ffsk) this.a.a.p.b(), (aqkp) this.a.a.mu.b(), (alxl) this.a.a.mx.b(), (aolr) this.a.a.Z.b(), this.a.cs);
            case 2136:
                ffsk ffskVar4 = (ffsk) this.a.a.q.b();
                akis akisVar16 = this.a;
                akkp akkpVar22 = akisVar16.a;
                return new ajco(ffskVar4, akkpVar22.my, akkpVar22.sX, Optional.empty(), akkpVar22.Z, akkpVar22.mu, akkpVar22.mx, akkpVar22.gN, akkpVar22.wz, akisVar16.aZ);
            case 2137:
                errl errlVar8 = (errl) this.a.p.b();
                errl errlVar9 = (errl) this.a.t.b();
                ckju ckjuVar = (ckju) this.a.a.ky.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akis akisVar17 = this.a;
                fbbf fbbfVar26 = akisVar17.cz;
                akkp akkpVar23 = akisVar17.a;
                fbbf fbbfVar27 = akkpVar23.ib;
                fbbf fbbfVar28 = akkpVar23.dn;
                cqoh cqohVar2 = (cqoh) fbbfVar26.b();
                cbfs cbfsVar = (cbfs) this.a.a.er.b();
                cbvt cbvtVar = (cbvt) this.a.a.pJ.b();
                bdtd bdtdVar = (bdtd) this.a.a.aO.b();
                akkp akkpVar24 = this.a.a;
                return new ckxo(errlVar8, errlVar9, ckjuVar, dtuuVar, fbbfVar27, fbbfVar28, cqohVar2, cbfsVar, cbvtVar, bdtdVar, akkpVar24.iS(), (cbgf) akkpVar24.dA.b(), (akzt) this.a.a.f.b(), this.a.kk);
            case 2138:
                return new cern((avgr) this.a.a.BQ.b());
            case 2139:
                byzp byzpVar = (byzp) this.a.a.iy.b();
                bavs bavsVar = (bavs) this.a.a.tF.b();
                akkp akkpVar25 = this.a.a;
                fbbf fbbfVar29 = akkpVar25.ib;
                fbbf fbbfVar30 = akkpVar25.pQ;
                fbbf fbbfVar31 = akkpVar25.BF;
                dtuu dtuuVar2 = (dtuu) akkpVar25.ay.b();
                akis akisVar18 = this.a;
                akkp akkpVar26 = akisVar18.a;
                fbbf fbbfVar32 = akkpVar26.dA;
                fbbf fbbfVar33 = akkpVar26.dp;
                fbbf fbbfVar34 = akisVar18.iz;
                return new cerv(byzpVar, bavsVar, fbbfVar29, fbbfVar30, fbbfVar31, dtuuVar2, akisVar18.aR, fbbfVar32, fbbfVar33, fbbfVar34, (cqoh) this.a.cz.b());
            case 2140:
                errl errlVar10 = (errl) this.a.t.b();
                errl errlVar11 = (errl) this.a.p.b();
                avkj avkjVar = (avkj) this.a.a.jf.b();
                akkp akkpVar27 = this.a.a;
                return new clan(errlVar10, errlVar11, avkjVar, akkpVar27.G, (clbd) akkpVar27.kl.b(), (akzt) this.a.a.f.b());
            case 2141:
                errl errlVar12 = (errl) this.a.t.b();
                akkp akkpVar28 = this.a.a;
                return new bdwz(errlVar12, akkpVar28.rm, akkpVar28.dB, (bdwr) akkpVar28.rn.b(), (cbvt) this.a.a.pJ.b(), (bdtd) this.a.a.aO.b(), (cqoh) this.a.cz.b(), (cbgf) this.a.a.dA.b(), (bdvi) this.a.a.jh.b(), (ahor) this.a.a.ii.b(), (ecrj) this.a.cN.b());
            case 2142:
                bauu bauuVar = (bauu) this.a.a.ud.b();
                barw barwVar = (barw) this.a.a.tQ.b();
                akis akisVar19 = this.a;
                fbbf fbbfVar35 = akisVar19.a.nj;
                errm errmVar = (errm) akisVar19.t.b();
                akis akisVar20 = this.a;
                fbbf fbbfVar36 = akisVar20.cz;
                akkp akkpVar29 = akisVar20.a;
                return new ctss(bauuVar, barwVar, fbbfVar35, errmVar, akkpVar29.dB, akkpVar29.nr, (cqoh) fbbfVar36.b());
            case 2143:
                ffsk ffskVar5 = (ffsk) this.a.a.q.b();
                cnnh cnnhVar = (cnnh) this.a.a.bQ.b();
                bdjr bdjrVar = (bdjr) this.a.a.pQ.b();
                akkp akkpVar30 = this.a.a;
                cnro jP = akkpVar30.jP();
                cnqv jO = akkpVar30.jO();
                bdtd bdtdVar2 = (bdtd) akkpVar30.aO.b();
                akkp akkpVar31 = this.a.a;
                cnvr jS = akkpVar31.jS();
                Optional of = Optional.of((cpdd) akkpVar31.jo.b());
                akkp akkpVar32 = this.a.a;
                fbbf fbbfVar37 = akkpVar32.fP;
                fbbf fbbfVar38 = akkpVar32.NJ;
                fbbf fbbfVar39 = akkpVar32.NK;
                cnnv jM = akkpVar32.jM();
                aolr aolrVar = (aolr) akkpVar32.Z.b();
                cnvc cnvcVar = (cnvc) this.a.a.mH.b();
                akkp akkpVar33 = this.a.a;
                cnsmVar = new cnsm(ffskVar5, cnnhVar, bdjrVar, jP, jO, bdtdVar2, jS, of, fbbfVar37, fbbfVar38, fbbfVar39, jM, aolrVar, cnvcVar, akkpVar33.ay, akkpVar33.jR(), akkpVar33.fs, (asmj) akkpVar33.jD.b(), this.a.a.jF);
                break;
            case 2144:
                return Long.valueOf(fdhg.a(this.a.a.oy()));
            case 2145:
                return Long.valueOf(fdhh.a(this.a.a.oy()));
            case 2146:
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar34 = this.a.a;
                return new cpwc(cqohVar3, akkpVar34.kz(), (cins) akkpVar34.jc.b(), (errm) this.a.p.b(), this.a.a.cf);
            case 2147:
                akkp akkpVar35 = this.a.a;
                return new awqv(akkpVar35.eD(), (cfyt) akkpVar35.cf.b());
            case 2148:
                return new cblv((errl) this.a.t.b(), (cbgf) this.a.a.dA.b());
            case 2149:
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                akkp akkpVar36 = this.a.a;
                return new cspl(ffskVar6, akkpVar36.kY(), (csjk) akkpVar36.el.b());
            case 2150:
                return new akkc(this);
            case 2151:
                ffsk ffskVar7 = (ffsk) this.a.a.p.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                comc comcVar2 = (comc) this.a.a.HR.b();
                axwk axwkVar = (axwk) this.a.a.mo.b();
                akkp akkpVar37 = this.a.a;
                axzk dX = akkpVar37.dX();
                aybz aybzVar2 = (aybz) akkpVar37.Ig.b();
                akkp akkpVar38 = this.a.a;
                return new ayar(ffskVar7, cbwjVar, comcVar2, axwkVar, dX, aybzVar2, akkpVar38.ej, akkpVar38.al, akkpVar38.mj, akkpVar38.ml, akkpVar38.Hs);
            case 2152:
                ffsk ffskVar8 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar4 = (ffhd) this.a.cP.b();
                cbwj cbwjVar2 = (cbwj) this.a.a.kG.b();
                comc comcVar3 = (comc) this.a.a.HR.b();
                akis akisVar21 = this.a;
                akkp akkpVar39 = akisVar21.a;
                return new ayba(ffskVar8, ffhdVar4, cbwjVar2, comcVar3, akkpVar39.NS, akkpVar39.al, akisVar21.cN, akkpVar39.Hu, akkpVar39.Hs, akkpVar39.mn);
            case 2153:
                return new axzq(this.a.a.cc);
            case 2154:
                ffsk ffskVar9 = (ffsk) this.a.a.aq.b();
                akkp akkpVar40 = this.a.a;
                return new cord(ffskVar9, akkpVar40.Om, akkpVar40.NX, akkpVar40.f());
            case 2155:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar10 = (ffsk) this.a.a.q.b();
                ffsk ffskVar11 = (ffsk) this.a.a.aq.b();
                akis akisVar22 = this.a;
                fbbf fbbfVar40 = akisVar22.di;
                akkp akkpVar41 = akisVar22.a;
                fbbf fbbfVar41 = akkpVar41.c;
                fbbf fbbfVar42 = akkpVar41.u;
                fbbf fbbfVar43 = akkpVar41.bj;
                fbbf fbbfVar44 = akisVar22.dX;
                fbbf fbbfVar45 = akkpVar41.NU;
                fbbf fbbfVar46 = akkpVar41.bk;
                coqb coqbVar = (coqb) fbbfVar40.b();
                akis akisVar23 = this.a;
                akkp akkpVar42 = akisVar23.a;
                cnsmVar = new coqo(context2, ffskVar10, ffskVar11, fbbfVar41, akisVar22.aU, fbbfVar42, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, coqbVar, akkpVar42.bl, akkpVar42.EJ, akkpVar42.EK, akkpVar42.NV, akkpVar42.bo, akisVar23.aQ, akkpVar42.NW, akkpVar42.NX, akkpVar42.Og, akkpVar42.Oh, akkpVar42.Oi, akkpVar42.Oj, akkpVar42.cC(), akkpVar42.cB(), akkpVar42.Ok, akkpVar42.Ol);
                break;
            case 2156:
                return Long.valueOf(fdeq.a(this.a.a.ol()));
            case 2157:
                return new asqw() { // from class: arxl
                };
            case 2158:
                final fbbf fbbfVar47 = this.a.a.s;
                return new dixc() { // from class: divn
                    @Override // defpackage.dixc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.enable_all_subscriptions_as_verified");
                    }
                };
            case 2159:
                return new cosh(this.a.a.al);
            case 2160:
                copj copjVar = (copj) this.a.a.NY.b();
                akkp akkpVar43 = this.a.a;
                return enip.u(copjVar, akkpVar43.kj(), akkpVar43.ep(), (copj) akkpVar43.Oa.b(), (copj) this.a.a.Of.b());
            case 2161:
                ffsk ffskVar12 = (ffsk) this.a.a.p.b();
                akis akisVar24 = this.a;
                akkp akkpVar44 = akisVar24.a;
                return new csqc(ffskVar12, akkpVar44.bR, akisVar24.dq, akkpVar44.bS, akkpVar44.c);
            case 2162:
                Context context3 = (Context) this.a.q.b();
                akkp akkpVar45 = this.a.a;
                return new copt(context3, akkpVar45.cT, akkpVar45.fQ, akkpVar45.Oe, akkpVar45.bj, (ffsk) akkpVar45.p.b());
            case 2163:
                akis akisVar25 = this.a;
                akkp akkpVar46 = akisVar25.a;
                return new cguc(akkpVar46.qN(), akkpVar46.cJ, (Context) akisVar25.q.b(), this.a.a.bj);
            case 2164:
                return new cguq(this.a.a.CE);
            case 2165:
                akis akisVar26 = this.a;
                akkp akkpVar47 = akisVar26.a;
                return new cguv(akkpVar47.cK, akisVar26.nH, akkpVar47.Oc, (errl) akisVar26.p.b());
            case 2166:
                return new azei(fbbh.a(), (ffsk) this.a.a.p.b());
            case 2167:
                final fbbf fbbfVar48 = this.a.a.s;
                return new auno() { // from class: aumx
                    @Override // defpackage.auno
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_subscription_manager_for_msisdn_from_sim");
                    }
                };
            case 2168:
                final fbbf fbbfVar49 = this.a.a.s;
                return new aunf() { // from class: aumf
                    @Override // defpackage.aunf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_entire_sim_subscription_info");
                    }
                };
            case 2169:
                return new aslo() { // from class: aroz
                };
            case 2170:
                final fbbf fbbfVar50 = this.a.a.s;
                return new auuc() { // from class: auua
                    @Override // defpackage.auuc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_sim_removed_listener");
                    }
                };
            case 2171:
                final fbbf fbbfVar51 = this.a.a.s;
                return new asgg() { // from class: arft
                    @Override // defpackage.asgg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.broadcast_sim_removal_for_inactive_sims_flag");
                    }
                };
            case 2172:
                return new cflt((ffsk) this.a.a.q.b(), enip.q(), (cfkw) this.a.a.HH.b(), (cflm) this.a.a.HI.b(), (ceww) this.a.a.cd.b(), (cbwj) this.a.a.kG.b(), (cevh) this.a.a.cc.b());
            case 2173:
                akis akisVar27 = this.a;
                fbbf fbbfVar52 = akisVar27.a.No;
                dhzj dhzjVar = (dhzj) akisVar27.nI.b();
                ffsk ffskVar13 = (ffsk) this.a.a.aq.b();
                ffhd ffhdVar5 = (ffhd) this.a.cP.b();
                akkp akkpVar48 = this.a.a;
                return new dehq(fbbfVar52, dhzjVar, ffskVar13, ffhdVar5, akkpVar48.Op, akkpVar48.Oq);
            case 2174:
                akkp akkpVar49 = this.a.a;
                return new cvhl(akkpVar49.az, akkpVar49.C);
            case 2175:
                final fbbf fbbfVar53 = this.a.a.s;
                return new avcf() { // from class: avbs
                    @Override // defpackage.avcf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.data_item_set_urgent");
                    }
                };
            case 2176:
                Context context4 = (Context) this.a.q.b();
                dhzj dhzjVar2 = (dhzj) this.a.nI.b();
                akis akisVar28 = this.a;
                akkp akkpVar50 = akisVar28.a;
                fbbf fbbfVar54 = akkpVar50.Ni;
                fbbf fbbfVar55 = akkpVar50.dQ;
                fbbf fbbfVar56 = akkpVar50.ft;
                fbbf fbbfVar57 = akkpVar50.u;
                fbbf fbbfVar58 = akkpVar50.No;
                errl errlVar13 = (errl) akisVar28.t.b();
                errl errlVar14 = (errl) this.a.p.b();
                akis akisVar29 = this.a;
                akkp akkpVar51 = akisVar29.a;
                return new deig(context4, dhzjVar2, fbbfVar54, fbbfVar55, akisVar28.cT, fbbfVar56, fbbfVar57, fbbfVar58, errlVar13, errlVar14, akkpVar51.Nm, akisVar29.nJ, akkpVar51.al, akisVar29.cN, akkpVar51.Q, akkpVar51.Oq);
            case 2177:
                akis akisVar30 = this.a;
                akkp akkpVar52 = akisVar30.a;
                return new cain(akkpVar52.kN, akkpVar52.sU, akkpVar52.ib, akkpVar52.dn, akkpVar52.gx, akkpVar52.Ou, akkpVar52.Z, akisVar30.cz, (ffsk) akkpVar52.aq.b(), (ffsk) this.a.a.q.b());
            case 2178:
                akke akkeVar = (akke) this.a.a.gq.b();
                akis akisVar31 = this.a;
                akkp akkpVar53 = akisVar31.a;
                return cpri.a(akkeVar, akkpVar53.mH(), akkpVar53.kJ(), (Optional) akisVar31.nA.b());
            case 2179:
                akkp akkpVar54 = this.a.a;
                return new cpsm(akkpVar54.rX(), (ffsk) akkpVar54.aq.b(), (ffhd) this.a.cP.b());
            case 2180:
                return cpre.a(this.a.a.hF());
            case 2181:
                akis akisVar32 = this.a;
                return new cesm(akisVar32.a.dn, (errl) akisVar32.t.b(), (cbgf) this.a.a.dA.b());
            case 2182:
                return new ckst(this.a.a.iU());
            case 2183:
                akis akisVar33 = this.a;
                return new cqlt(akisVar33.a.kH(), (errl) akisVar33.aK.b());
            case 2184:
                ffsk ffskVar14 = (ffsk) this.a.a.q.b();
                ffhd ffhdVar6 = (ffhd) this.a.co.b();
                axkm axkmVar = (axkm) this.a.a.ck.b();
                babm babmVar = (babm) this.a.a.wl.b();
                akkp akkpVar55 = this.a.a;
                return new cdfh(ffskVar14, ffhdVar6, axkmVar, babmVar, akkpVar55.gi(), Optional.empty(), (axdf) akkpVar55.cm.b(), (akzt) this.a.a.f.b());
            case 2185:
                crud crudVar = (crud) this.a.mQ.b();
                akis akisVar34 = this.a;
                return new crua(crudVar, akisVar34.a.kU(), (ecrj) akisVar34.cN.b());
            case 2186:
                ceza cezaVar = (ceza) this.a.a.OF.b();
                akkp akkpVar56 = this.a.a;
                return new ceyf(cezaVar, akkpVar56.OG, (cexi) akkpVar56.OM.b(), (ffsk) this.a.a.q.b());
            case 2187:
                Context context5 = (Context) this.a.q.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                errl errlVar15 = (errl) this.a.t.b();
                errl errlVar16 = (errl) this.a.aK.b();
                akkp akkpVar57 = this.a.a;
                return new ceza(context5, cqohVar4, errlVar15, errlVar16, akkpVar57.OC, akkpVar57.cd, akkpVar57.hg(), akkpVar57.bW(), akkpVar57.cQ());
            case 2188:
                return new cexg((cqoh) this.a.cz.b(), (ceww) this.a.a.cd.b());
            case 2189:
                akis akisVar35 = this.a;
                return new cfhx(akisVar35.a.cd, (errl) akisVar35.aK.b(), (errm) this.a.aK.b(), (dtuu) this.a.a.ay.b(), fbaz.a(this.a.a.cc), (cexg) this.a.a.OC.b(), (cqoh) this.a.cz.b(), (cfyt) this.a.a.cf.b(), (albq) this.a.a.di.b(), (cfbt) this.a.a.OD.b(), this.a.a.cO());
            case 2190:
                return new cfbt((ffsk) this.a.a.q.b());
            case 2191:
                cbwj cbwjVar3 = (cbwj) this.a.a.kG.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                ceww cewwVar = (ceww) this.a.a.cd.b();
                akis akisVar36 = this.a;
                ejoc ejocVar = (ejoc) akisVar36.dX.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                cfdt cfdtVar = (cfdt) this.a.a.OL.b();
                cetc cetcVar = (cetc) this.a.a.yh.b();
                akkp akkpVar58 = this.a.a;
                fbbf fbbfVar59 = akkpVar58.C;
                ffsk ffskVar15 = (ffsk) akkpVar58.q.b();
                ffsk ffskVar16 = (ffsk) this.a.a.aq.b();
                akis akisVar37 = this.a;
                akkp akkpVar59 = akisVar36.a;
                fbbf fbbfVar60 = akkpVar59.OI;
                fbbf fbbfVar61 = akkpVar59.OK;
                akkp akkpVar60 = akisVar37.a;
                return new cfdp(cbwjVar3, cqohVar5, cewwVar, fbbfVar60, fbbfVar61, ejocVar, dtuuVar3, cfdtVar, cetcVar, fbbfVar59, ffskVar15, ffskVar16, akkpVar60.bW(), akkpVar60.cN());
            case 2192:
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                akkp akkpVar61 = this.a.a;
                cfki hh = akkpVar61.hh();
                cfjc cfjcVar = (cfjc) akkpVar61.OH.b();
                cetc cetcVar2 = (cetc) this.a.a.yh.b();
                akkp akkpVar62 = this.a.a;
                return new cfim(cqohVar6, hh, cfjcVar, cetcVar2, akkpVar62.cN(), (ffsk) akkpVar62.q.b());
            case 2193:
                return new cfjc((cfbt) this.a.a.OD.b(), (cqoh) this.a.cz.b(), this.a.a.C);
            case 2194:
                return new cewk((ceyo) this.a.a.OJ.b(), (Context) this.a.q.b(), (ffsk) this.a.a.aq.b());
            case 2195:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.dq.b();
                akkp akkpVar63 = this.a.a;
                return new ceyo(connectivityManager, akkpVar63.cP(), (ffsk) akkpVar63.aq.b());
            case 2196:
                return new cfdt((ffsk) this.a.a.q.b());
            case 2197:
                akkp akkpVar64 = this.a.a;
                return new ceyc(akkpVar64.OB, akkpVar64.aT, (ffsk) akkpVar64.q.b(), (ffsk) this.a.a.aq.b());
            case 2198:
                return new cewf((dtuu) this.a.a.ay.b(), (cfgy) this.a.a.OE.b(), (cfbt) this.a.a.OD.b(), (cfjc) this.a.a.OH.b(), (ejoc) this.a.dX.b(), (cfhx) this.a.a.OE.b(), (ceww) this.a.a.cd.b(), (ffsk) this.a.a.q.b(), (ffsk) this.a.a.aq.b());
            case 2199:
                return azfg.a(azho.a(), this.a.a.mB());
            default:
                throw new AssertionError(i);
        }
        return cnsmVar;
    }

    private final Object q() {
        int i = this.b;
        switch (i) {
            case 2200:
                return (eyev) ((ekck) this.a.a.ob().a.b()).a("com.google.android.apps.messaging.auto 45669289").c();
            case 2201:
                akkp akkpVar = this.a.a;
                return new azei(akkpVar.OZ, (ffsk) akkpVar.p.b());
            case 2202:
                cnoz cnozVar = (cnoz) this.a.a.hj.b();
                akkp akkpVar2 = this.a.a;
                bzhu bzhuVar = new bzhu((ffsk) akkpVar2.aq.b(), (bbfs) akkpVar2.vy.b(), (aslq) akkpVar2.eV.b(), fbaz.a(akkpVar2.uV));
                akkp akkpVar3 = this.a.a;
                return enip.v(cnozVar, bzhuVar, new cqpm((errl) akkpVar3.a.aK.b(), akkpVar3.nY, akkpVar3.a.jU), (cnoz) this.a.a.OV.b(), (cnoz) this.a.a.OX.b(), (cnoz) this.a.a.OY.b(), new cnoz[0]);
            case 2203:
                akkp akkpVar4 = this.a.a;
                final fbbf fbbfVar = akkpVar4.s;
                return new cnpp(akkpVar4.OU, new attf() { // from class: atsu
                    @Override // defpackage.attf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_period_pull_messages_under_satellite_connection");
                    }
                });
            case 2204:
                ejoc ejocVar = (ejoc) this.a.dX.b();
                Object b = this.a.a.OT.b();
                b.getClass();
                Duration ofMinutes = Duration.ofMinutes(((Number) b).longValue());
                ofMinutes.getClass();
                return new cnpr(ejocVar, ofMinutes);
            case 2205:
                return Long.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45673327").b());
            case 2206:
                return new cnpc(this.a.a.OW);
            case 2207:
                return new cnoj((akyb) this.a.a.bi.b());
            case 2208:
                return new cspm(new cspp(this.a.a.cc));
            case 2209:
                return new ausd() { // from class: aury
                };
            case 2210:
                akis akisVar = this.a;
                akkp akkpVar5 = akisVar.a;
                return new chya(akkpVar5.Fq, akkpVar5.cA, akisVar.aK, akkpVar5.wq, akkpVar5.cz, akkpVar5.Z, akkpVar5.f, akkpVar5.cu, akkpVar5.bC, akkpVar5.bF, akkpVar5.Pc, akkpVar5.aV, akkpVar5.Pd);
            case 2211:
                final fbbf fbbfVar2 = this.a.a.s;
                return new asns() { // from class: arsj
                    @Override // defpackage.asns
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.skip_pcscf_address_check_in_ims_configuration_during_register_device");
                    }
                };
            case 2212:
                akkp akkpVar6 = this.a.a;
                return new cibe(akkpVar6.cA, akkpVar6.q);
            case 2213:
                akis akisVar2 = this.a;
                akkp akkpVar7 = akisVar2.a;
                return new chxi(akkpVar7.Fr, akkpVar7.cz, akkpVar7.wq, akkpVar7.Z, akkpVar7.G, akkpVar7.cu, akkpVar7.aV, akisVar2.p, akkpVar7.Pd);
            case 2214:
                return new akkd(this);
            case 2215:
                return new enpx((bzpy) this.a.a.gR.b());
            case 2216:
                akkp akkpVar8 = this.a.a;
                return new cslk(akkpVar8.ae, akkpVar8.Pi);
            case 2217:
                final fbbf fbbfVar3 = this.a.a.s;
                return new autu() { // from class: autv
                    @Override // defpackage.autu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_groups_to_share_sheet");
                    }
                };
            case 2218:
                akkp akkpVar9 = this.a.a;
                return new bczv(akkpVar9.ay, akkpVar9.Pk, (ffsk) akkpVar9.p.b());
            case 2219:
                akkp akkpVar10 = this.a.a;
                bzqy bzqyVar = new bzqy(akkpVar10.sW, (ffsk) akkpVar10.aq.b(), akkpVar10.dn);
                akkp akkpVar11 = this.a.a;
                return enip.r(bzqyVar, new cgig(akkpVar11.lV, (ffsk) akkpVar11.aq.b(), akkpVar11.a.jT, (aqkp) akkpVar11.mu.b()));
            case 2220:
                final fbbf fbbfVar4 = this.a.a.s;
                return new atfk() { // from class: atfh
                    @Override // defpackage.atfk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_fix_set_is_enterprise");
                    }
                };
            case 2221:
                return new cbfr((Context) this.a.q.b(), this.a.a.ej);
            case 2222:
                return new asuc() { // from class: asbk
                };
            case 2223:
                return new asnm() { // from class: arsb
                };
            case 2224:
                akkp akkpVar12 = this.a.a;
                return new axuq(akkpVar12.ej, akkpVar12.f);
            case 2225:
                akkp akkpVar13 = this.a.a;
                azmm er = akkpVar13.er();
                fbbf fbbfVar5 = akkpVar13.NZ;
                fbbfVar5.getClass();
                return er.a(fbbfVar5, fbbfVar5);
            case 2226:
                akis akisVar3 = this.a;
                akkp akkpVar14 = akisVar3.a;
                return new sfy(akisVar3.q, akkpVar14.nk, akkpVar14.dr, akisVar3.nR);
            case 2227:
                return new clzh((cmel) this.a.a.vV.b(), (errl) this.a.t.b(), (dkpp) this.a.aQ.b(), (cqoh) this.a.cz.b());
            case 2228:
                return new ciom((Context) this.a.q.b(), (ciqn) this.a.a.aN.b());
            case 2229:
                return new cior();
            case 2230:
                return new ciot((Context) this.a.q.b(), (ayfg) this.a.a.nW.b(), (ciqn) this.a.a.aN.b());
            case 2231:
                return new cipp((Context) this.a.q.b(), (ciqn) this.a.a.aN.b(), (cthp) this.a.a.an.b());
            case 2232:
                akis akisVar4 = this.a;
                fbbf fbbfVar6 = akisVar4.q;
                akkp akkpVar15 = akisVar4.a;
                return new cipd(fbbfVar6, akkpVar15.aM, akkpVar15.iG, akkpVar15.sY, akkpVar15.fr, akkpVar15.f, akisVar4.cz, akkpVar15.nW, akkpVar15.RM, akisVar4.cM, akkpVar15.rq, akkpVar15.pD, akkpVar15.dn, akkpVar15.rs);
            case 2233:
                return new cipe((Context) this.a.q.b(), (ayfg) this.a.a.nW.b(), (cnmx) this.a.a.RL.b());
            case 2234:
                Context context = (Context) this.a.q.b();
                akis akisVar5 = this.a;
                return new ajvm(context, akisVar5.a.RK, akisVar5.nX);
            case 2235:
                Context context2 = (Context) this.a.q.b();
                crjx crjxVar = (crjx) this.a.a.r.b();
                akis akisVar6 = this.a;
                return new adza(context2, crjxVar, fbaz.a(akisVar6.a.RJ), akisVar6.cU);
            case 2236:
                akis akisVar7 = this.a;
                return new cgag(akisVar7.a.qY(), (errl) akisVar7.p.b(), this.a.a.cl());
            case 2237:
                return new ekmc((Context) this.a.q.b(), (errl) this.a.t.b(), (ekmg) this.a.a.PD.b());
            case 2238:
                return (ekmg) emxc.j((ekmg) this.a.a.cZ.b()).e(new ekmh());
            case 2239:
                akkp akkpVar16 = this.a.a;
                ersq ersqVar = (ersq) akkpVar16.s.b();
                Map map = (Map) akkpVar16.a.nT.b();
                enhd h = enhk.h(63);
                h.k("ContactsSyncFeature__enable_contacts_delete_kill_switch", akkpVar16.PF);
                h.k("ContactsSyncFeature__contacts_delete_max_limit", akkpVar16.PG);
                h.k("ContactsSyncFeature__enable_contacts_sync_catch_sqlite_exception", akkpVar16.PH);
                h.k("ContactsSyncFeature__contacts_sync_pwq_max_attempt_count", akkpVar16.PJ);
                h.k("ContactsSyncFeature__contacts_sync_pwq_retry_delay_ms", akkpVar16.PL);
                h.k("ContactsSyncFeature__cp2_query_batch_size", akkpVar16.PN);
                h.k("ContactsSyncFeature__contacts_import_batch_size", akkpVar16.PP);
                h.k("ContactsSyncFeature__contacts_delete_batch_size", akkpVar16.PR);
                h.k("ContactsSyncFeature__enable_retry_on_exceptions", akkpVar16.PT);
                h.k("ContactsSyncFeature__enable_retry_on_subset_exceptions", akkpVar16.PV);
                h.k("ContactsSyncFeature__enable_batch_contacts_delete", akkpVar16.PX);
                h.k("ContactsSyncFeature__periodic_contacts_import_interval_hrs", akkpVar16.PZ);
                h.k("ContactsSyncFeature__contacts_import_init_timeout_min", akkpVar16.Qa);
                h.k("ContactsSyncFeature__contacts_import_scheduled_timeout_min", akkpVar16.Qb);
                h.k("ContactsSyncFeature__import_future_autoset_threshold_seconds", akkpVar16.Qc);
                h.k("ContactsSyncFeature__import_result_default_timeout_seconds", akkpVar16.Qd);
                h.k("DoubleTapFeature__double_tap_to_react_reaction", akkpVar16.Qf);
                h.k("MmsGroupUpgradeFeature__active_upgrade_max_retries", akkpVar16.Qg);
                h.k("MmsGroupUpgradeFeature__active_upgrade_min_required_battery_percentage", akkpVar16.Qi);
                h.k("MmsGroupUpgradeFeature__active_upgrade_synclet_interval_minutes", akkpVar16.Qk);
                h.k("MmsGroupUpgradeFeature__backup_to_telephony_batch_size", akkpVar16.Ql);
                h.k("MmsGroupUpgradeFeature__enable_mms_group_upgrade_passive_upgrader", akkpVar16.Qn);
                h.k("MmsGroupUpgradeFeature__enable_mms_group_upgrade_ui_home_screen", akkpVar16.Qp);
                h.k("MmsGroupUpgradeFeature__enable_mms_group_upgrade_ui_conversation_screen", akkpVar16.Qr);
                h.k("MmsGroupUpgradeFeature__last_message_sent_or_received_max_days", akkpVar16.Qs);
                h.k("MmsGroupUpgradeFeature__max_cache_staleness_for_capabilities_refresh_in_minutes", akkpVar16.Qt);
                h.k("MmsGroupUpgradeFeature__max_number_not_upgrade_capable_participants", akkpVar16.Qu);
                h.k("MmsGroupUpgradeFeature__max_number_of_retries_for_backup_batch", akkpVar16.Qv);
                h.k("MmsGroupUpgradeFeature__max_number_participants_in_mms_group_eligible_for_upgrade", akkpVar16.Qw);
                h.k("MmsGroupUpgradeFeature__min_version_supports_mms_group_upgrade", akkpVar16.Qx);
                h.k("MmsGroupUpgradeFeature__passive_upgrade_only_upgrade_when_flag_is_set_in_group_notification", akkpVar16.Qy);
                h.k("MmsGroupUpgradeFeature__synclet_peak_hour_start", akkpVar16.QA);
                h.k("MmsGroupUpgradeFeature__synclet_peak_hour_end", akkpVar16.QC);
                h.k("MmsMergingFeature__group_staleness_threshold_days", akkpVar16.QD);
                h.k("PenpalFeature__enforce_checks_on_any_build", akkpVar16.QF);
                h.k("PenpalFeature__magic_rewrite_next_distance_threshold", akkpVar16.QH);
                h.k("PenpalFeature__suggested_text_next_distance_threshold", akkpVar16.QJ);
                h.k("PenpalFeature__enable_magic_compose_sensitive_classifier", akkpVar16.QL);
                h.k("PenpalFeature__enable_magic_compose_output_sensitive_classifier", akkpVar16.QN);
                h.k("PenpalFeature__magic_compose_classifier_mdd_group", akkpVar16.QP);
                h.k("PenpalFeature__magic_compose_classifier_mdd_id", akkpVar16.QR);
                h.k("PenpalFeature__magic_compose_classifier_task_name", akkpVar16.QT);
                h.k("PenpalFeature__magic_compose_classifier_num_predictions", akkpVar16.QV);
                h.k("PenpalFeature__magic_compose_classifier_num_messages", akkpVar16.QX);
                h.k("PenpalFeature__magic_compose_classifier_confidence_threshold", akkpVar16.QZ);
                h.k("PenpalFeature__magic_compose_classifier_block_on_error", akkpVar16.Rb);
                h.k("PenpalFeature__magic_compose_tokenizer_mdd_file_id", akkpVar16.Rd);
                h.k("PenpalFeature__magic_compose_try_downloading_sensitive_classifier_if_not_present", akkpVar16.Rf);
                h.k("PenpalFeature__magic_compose_log_input_token_bucket", akkpVar16.Rh);
                h.k("PenpalFeature__magic_compose_additional_input_token_count", akkpVar16.Rj);
                h.k("PenpalFeature__magic_compose_enable_ai_core_bind_waive_priority", akkpVar16.Rl);
                h.k("PenpalFeature__magic_compose_max_input_token_count", akkpVar16.Rn);
                h.k("PenpalFeature__magic_compose_min_context_message_count", akkpVar16.Rp);
                h.k("PenpalFeature__magic_compose_suggested_text_prompt_token_count", akkpVar16.Rr);
                h.k("PenpalFeature__magic_compose_use_aicore_token_info_api", akkpVar16.Rt);
                h.k("PenpalFeature__magic_compose_use_aicore_token_info_api_timeout_ms", akkpVar16.Rv);
                h.k("RecipientSyncFeature__enable_contact_recipient_incremental_sync", akkpVar16.Rw);
                h.k("RecipientSyncFeature__recipient_sync_pwq_max_attempt_count", akkpVar16.Rx);
                h.k("RecipientSyncFeature__recipient_sync_pwq_retry_backoff_ms", akkpVar16.Ry);
                h.k("RecipientSyncFeature__recipient_change_sync_pwq_batch_size", akkpVar16.Rz);
                h.k("RecipientSyncFeature__recipient_sync_destinations_changed_log_threshold", akkpVar16.RA);
                h.k("RecipientSyncFeature__work_profile_recipient_sync_period_hrs", akkpVar16.RC);
                h.k("RecipientSyncFeature__work_profile_recipient_full_sync_period_hrs", akkpVar16.RE);
                return new cfus(new ertc(ersqVar, map, h.c()));
            case 2240:
                fbbf fbbfVar7 = this.a.a.HZ;
                fbbfVar7.getClass();
                Object b2 = fbbfVar7.b();
                b2.getClass();
                return b2;
            case 2241:
                fbbf fbbfVar8 = this.a.a.Ia;
                fbbfVar8.getClass();
                Object b3 = fbbfVar8.b();
                b3.getClass();
                return b3;
            case 2242:
                fbbf fbbfVar9 = this.a.a.Ie;
                fbbfVar9.getClass();
                Object b4 = fbbfVar9.b();
                b4.getClass();
                return b4;
            case 2243:
                Object b5 = this.a.a.PI.b();
                b5.getClass();
                return b5;
            case 2244:
                return Long.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615649").b());
            case 2245:
                Object b6 = this.a.a.PK.b();
                b6.getClass();
                return b6;
            case 2246:
                return Long.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615650").b());
            case 2247:
                Object b7 = this.a.a.PM.b();
                b7.getClass();
                return b7;
            case 2248:
                return Long.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615637").b());
            case 2249:
                Object b8 = this.a.a.PO.b();
                b8.getClass();
                return b8;
            case 2250:
                return Long.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615651").b());
            case 2251:
                Object b9 = this.a.a.PQ.b();
                b9.getClass();
                return b9;
            case 2252:
                return Long.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615652").b());
            case 2253:
                Object b10 = this.a.a.PS.b();
                b10.getClass();
                return b10;
            case 2254:
                return Boolean.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615653").e());
            case 2255:
                Object b11 = this.a.a.PU.b();
                b11.getClass();
                return b11;
            case 2256:
                return Boolean.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615654").e());
            case 2257:
                Object b12 = this.a.a.PW.b();
                b12.getClass();
                return b12;
            case 2258:
                return Boolean.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45615655").e());
            case 2259:
                Object b13 = this.a.a.PY.b();
                b13.getClass();
                return b13;
            case 2260:
                return Long.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45621161").b());
            case 2261:
                fbbf fbbfVar10 = this.a.a.HW;
                fbbfVar10.getClass();
                Object b14 = fbbfVar10.b();
                b14.getClass();
                return b14;
            case 2262:
                fbbf fbbfVar11 = this.a.a.HX;
                fbbfVar11.getClass();
                Object b15 = fbbfVar11.b();
                b15.getClass();
                return b15;
            case 2263:
                fbbf fbbfVar12 = this.a.a.Ho;
                fbbfVar12.getClass();
                Object b16 = fbbfVar12.b();
                b16.getClass();
                return b16;
            case 2264:
                fbbf fbbfVar13 = this.a.a.Hp;
                fbbfVar13.getClass();
                Object b17 = fbbfVar13.b();
                b17.getClass();
                return b17;
            case 2265:
                Object b18 = this.a.a.Qe.b();
                b18.getClass();
                return b18;
            case 2266:
                return Long.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45459897").b());
            case 2267:
                fbbf fbbfVar14 = this.a.a.xp;
                fbbfVar14.getClass();
                Object b19 = fbbfVar14.b();
                b19.getClass();
                return b19;
            case 2268:
                Object b20 = this.a.a.Qh.b();
                b20.getClass();
                return b20;
            case 2269:
                return Long.valueOf(((ekck) this.a.a.og().a.b()).a("com.google.android.apps.messaging.auto 45627670").b());
            case 2270:
                Object b21 = this.a.a.Qj.b();
                b21.getClass();
                return b21;
            case 2271:
                return Long.valueOf(((ekck) this.a.a.og().a.b()).a("com.google.android.apps.messaging.auto 45629875").b());
            case 2272:
                fbbf fbbfVar15 = this.a.a.Ir;
                fbbfVar15.getClass();
                Object b22 = fbbfVar15.b();
                b22.getClass();
                return b22;
            case 2273:
                Object b23 = this.a.a.Qm.b();
                b23.getClass();
                return b23;
            case 2274:
                return Boolean.valueOf(((ekck) this.a.a.og().a.b()).a("com.google.android.apps.messaging.auto 45637545").e());
            case 2275:
                Object b24 = this.a.a.Qo.b();
                b24.getClass();
                return b24;
            case 2276:
                return Boolean.valueOf(((ekck) this.a.a.og().a.b()).a("com.google.android.apps.messaging.auto 45637546").e());
            case 2277:
                Object b25 = this.a.a.Qq.b();
                b25.getClass();
                return b25;
            case 2278:
                return Boolean.valueOf(((ekck) this.a.a.og().a.b()).a("com.google.android.apps.messaging.auto 45641894").e());
            case 2279:
                fbbf fbbfVar16 = this.a.a.xr;
                fbbfVar16.getClass();
                Object b26 = fbbfVar16.b();
                b26.getClass();
                return b26;
            case 2280:
                fbbf fbbfVar17 = this.a.a.xu;
                fbbfVar17.getClass();
                Object b27 = fbbfVar17.b();
                b27.getClass();
                return b27;
            case 2281:
                fbbf fbbfVar18 = this.a.a.xs;
                fbbfVar18.getClass();
                Object b28 = fbbfVar18.b();
                b28.getClass();
                return b28;
            case 2282:
                fbbf fbbfVar19 = this.a.a.Iq;
                fbbfVar19.getClass();
                Object b29 = fbbfVar19.b();
                b29.getClass();
                return b29;
            case 2283:
                fbbf fbbfVar20 = this.a.a.xt;
                fbbfVar20.getClass();
                Object b30 = fbbfVar20.b();
                b30.getClass();
                return b30;
            case 2284:
                fbbf fbbfVar21 = this.a.a.wH;
                fbbfVar21.getClass();
                Object b31 = fbbfVar21.b();
                b31.getClass();
                return b31;
            case 2285:
                fbbf fbbfVar22 = this.a.a.MQ;
                fbbfVar22.getClass();
                Object b32 = fbbfVar22.b();
                b32.getClass();
                return b32;
            case 2286:
                Object b33 = this.a.a.Qz.b();
                b33.getClass();
                return b33;
            case 2287:
                return Long.valueOf(((ekck) this.a.a.og().a.b()).a("com.google.android.apps.messaging.auto 45642387").b());
            case 2288:
                Object b34 = this.a.a.QB.b();
                b34.getClass();
                return b34;
            case 2289:
                return Long.valueOf(((ekck) this.a.a.og().a.b()).a("com.google.android.apps.messaging.auto 45642388").b());
            case 2290:
                fbbf fbbfVar23 = this.a.a.JX;
                fbbfVar23.getClass();
                Object b35 = fbbfVar23.b();
                b35.getClass();
                return b35;
            case 2291:
                Object b36 = this.a.a.QE.b();
                b36.getClass();
                return b36;
            case 2292:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45412123").e());
            case 2293:
                Object b37 = this.a.a.QG.b();
                b37.getClass();
                return b37;
            case 2294:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45532305").b());
            case 2295:
                Object b38 = this.a.a.QI.b();
                b38.getClass();
                return b38;
            case 2296:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45532306").b());
            case 2297:
                Object b39 = this.a.a.QK.b();
                b39.getClass();
                return b39;
            case 2298:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45571947").e());
            case 2299:
                Object b40 = this.a.a.QM.b();
                b40.getClass();
                return b40;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object r() {
        int i = this.b;
        switch (i) {
            case 2300:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45614153").e());
            case 2301:
                return aiyo.a(this.a.a.QO);
            case 2302:
                return ((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45572037").d();
            case 2303:
                return aiyp.a(this.a.a.QQ);
            case 2304:
                return ((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45572038").d();
            case 2305:
                return aiys.a(this.a.a.QS);
            case 2306:
                return ((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45572039").d();
            case 2307:
                return aiyr.a(this.a.a.QU);
            case 2308:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45572040").b());
            case 2309:
                return aiyq.a(this.a.a.QW);
            case 2310:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45572041").b());
            case 2311:
                return aiyn.a(this.a.a.QY);
            case 2312:
                return Double.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45572042").a());
            case 2313:
                return aiym.a(this.a.a.Ra);
            case 2314:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45612627").e());
            case 2315:
                return aiyt.a(this.a.a.Rc);
            case 2316:
                return ((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45614830").d();
            case 2317:
                return aiyx.a(this.a.a.Re);
            case 2318:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45616836").e());
            case 2319:
                return aiza.a(this.a.a.Rg);
            case 2320:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45615216").e());
            case 2321:
                return aiyk.a(this.a.a.Ri);
            case 2322:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45617891").b());
            case 2323:
                return aiyl.a(this.a.a.Rk);
            case 2324:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45625107").e());
            case 2325:
                return aiyu.a(this.a.a.Rm);
            case 2326:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45631613").b());
            case 2327:
                return aiyv.a(this.a.a.Ro);
            case 2328:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45631614").b());
            case 2329:
                return aiyw.a(this.a.a.Rq);
            case 2330:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45631912").b());
            case 2331:
                return aiyy.a(this.a.a.Rs);
            case 2332:
                return Boolean.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45655746").e());
            case 2333:
                return aiyz.a(this.a.a.Ru);
            case 2334:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45656735").b());
            case 2335:
                fbbf fbbfVar = this.a.a.ml;
                fbbfVar.getClass();
                Object b = fbbfVar.b();
                b.getClass();
                return b;
            case 2336:
                fbbf fbbfVar2 = this.a.a.Hz;
                fbbfVar2.getClass();
                Object b2 = fbbfVar2.b();
                b2.getClass();
                return b2;
            case 2337:
                fbbf fbbfVar3 = this.a.a.HA;
                fbbfVar3.getClass();
                Object b3 = fbbfVar3.b();
                b3.getClass();
                return b3;
            case 2338:
                fbbf fbbfVar4 = this.a.a.HS;
                fbbfVar4.getClass();
                Object b4 = fbbfVar4.b();
                b4.getClass();
                return b4;
            case 2339:
                fbbf fbbfVar5 = this.a.a.mi;
                fbbfVar5.getClass();
                Object b5 = fbbfVar5.b();
                b5.getClass();
                return b5;
            case 2340:
                Object b6 = this.a.a.RB.b();
                b6.getClass();
                return b6;
            case 2341:
                return Long.valueOf(((ekck) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto 45669223").b());
            case 2342:
                Object b7 = this.a.a.RD.b();
                b7.getClass();
                return b7;
            case 2343:
                return Long.valueOf(((ekck) this.a.a.ow().a.b()).a("com.google.android.apps.messaging.auto 45669224").b());
            case 2344:
                return new cokk((effy) this.a.nU.b(), (errl) this.a.p.b(), (cqoh) this.a.cz.b(), this.a.a.RG);
            case 2345:
                final fbbf fbbfVar6 = this.a.a.s;
                return new avem() { // from class: aveg
                    @Override // defpackage.avem
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_feedback_logging");
                    }
                };
            case 2346:
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new ckmm(akkpVar.bj, akkpVar.br, akkpVar.cG, akkpVar.gQ, akisVar.cT, akkpVar.c);
            case 2347:
                return Optional.of(this.a.a.qf());
            case 2348:
                Context context = (Context) this.a.q.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                akis akisVar2 = this.a;
                return new cthz(context, ctyxVar, akisVar2.cQ(), (ctcy) akisVar2.nZ.b(), (AudioManager) this.a.nY.b(), (cqoh) this.a.cz.b(), (errm) this.a.p.b());
            case 2349:
                return Optional.of((cnla) this.a.a.RP.b());
            case 2350:
                Context context2 = (Context) this.a.q.b();
                akis akisVar3 = this.a;
                akkp akkpVar2 = akisVar3.a;
                fbbf fbbfVar7 = akkpVar2.dB;
                fbbf fbbfVar8 = akkpVar2.IB;
                errl errlVar = (errl) akisVar3.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                akis akisVar4 = this.a;
                fazb a = fbaz.a(akisVar4.a.jc);
                akis akisVar5 = this.a;
                akkp akkpVar3 = akisVar5.a;
                return new ddcy(context2, fbbfVar7, fbbfVar8, errlVar, errlVar2, akisVar4.cz, a, akkpVar3.fP, akkpVar3.az, akkpVar3.dE, akkpVar3.nW, akisVar5.oa, akkpVar3.dA, akisVar5.ob, akisVar5.oc, Optional.of(akisVar5.od));
            case 2351:
                Map map = (Map) this.a.a.RT.b();
                Optional.of(this.a.a.lF());
                return new cwmm(map);
            case 2352:
                fbbf fbbfVar9 = this.a.oh;
                cwmn cwmnVar = cwmn.c;
                cwmo cwmoVar = (cwmo) fbbfVar9.b();
                fbbf fbbfVar10 = this.a.a.RS;
                return enhk.o(cwmnVar, cwmoVar, cwmn.a, (cwmo) fbbfVar10.b(), cwmn.b, (cwmo) this.a.oi.b(), cwmn.d, (cwmo) this.a.oj.b());
            case 2353:
                return new cwmy(this.a.a.RR);
            case 2354:
                final fbbf fbbfVar11 = this.a.a.s;
                return new auxx() { // from class: auxh
                    @Override // defpackage.auxx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_cool_ranch_phase1");
                    }
                };
            case 2355:
                return new auxz() { // from class: auxj
                };
            case 2356:
                Context context3 = (Context) this.a.q.b();
                fazb a2 = fbaz.a(this.a.a.aN);
                akkp akkpVar4 = this.a.a;
                return new ciop(context3, a2, fbaz.a(akkpVar4.RM), fbaz.a(akkpVar4.an), (Optional) ((fbbb) this.a.aV).a);
            case 2357:
                return new ciqf((Context) this.a.q.b(), (cthp) this.a.a.an.b(), (cnmx) this.a.a.RL.b(), (ciqn) this.a.a.aN.b());
            case 2358:
                return new cimv((Context) this.a.q.b(), (ciqn) this.a.a.aN.b(), (cthp) this.a.a.an.b(), (cins) this.a.a.jc.b(), (crji) this.a.a.ab.b(), (crpr) this.a.a.cn.b(), (ciph) this.a.a.Py.b(), this.a.a.Z);
            case 2359:
                akis akisVar6 = this.a;
                fbbf fbbfVar12 = akisVar6.q;
                akkp akkpVar5 = akisVar6.a;
                return new ciqx(fbbfVar12, akkpVar5.aM, akkpVar5.fr, akkpVar5.Gv, akkpVar5.RM, akkpVar5.Sa, akkpVar5.RL, akkpVar5.an, akkpVar5.pD, akkpVar5.Sb);
            case 2360:
                akis akisVar7 = this.a;
                return new alsi(akisVar7.a.az, akisVar7.eb);
            case 2361:
                return new cirg(this.a.a.hj);
            case 2362:
                return new tpc((Context) this.a.q.b(), (Optional) this.a.mO.b(), (ayfg) this.a.a.nW.b(), (ciqn) this.a.a.aN.b());
            case 2363:
                return new tpe((Context) this.a.q.b(), (Optional) this.a.mO.b(), (ayfg) this.a.a.nW.b(), (ciqn) this.a.a.aN.b());
            case 2364:
                return new toy((Context) this.a.q.b(), (Optional) this.a.mO.b(), (ciqn) this.a.a.aN.b());
            case 2365:
                return new ciok((Context) this.a.q.b(), fbaz.a(this.a.a.aN), fbaz.a(this.a.a.an), this.a.a.nW);
            case 2366:
                return new tpa((Context) this.a.q.b(), (ciqn) this.a.a.aN.b());
            case 2367:
                akis akisVar8 = this.a;
                akkp akkpVar6 = akisVar8.a;
                return new cipv(akisVar8.q, akkpVar6.aM, akkpVar6.nW, akkpVar6.dn, akkpVar6.an, akkpVar6.f, akkpVar6.ix, akkpVar6.pD);
            case 2368:
                akis akisVar9 = this.a;
                akkp akkpVar7 = akisVar9.a;
                return new cipy(akisVar9.q, akkpVar7.aM, akkpVar7.nW, akkpVar7.dn, akkpVar7.C, akkpVar7.ix, akkpVar7.pD, akkpVar7.Sb);
            case 2369:
                return new cidi((Context) this.a.q.b(), Optional.of((dbvq) this.a.a.zM.b()), (ciqn) this.a.a.aN.b());
            case 2370:
                return Boolean.valueOf(((ekck) this.a.a.nB().a.b()).a("com.google.android.apps.messaging.auto 45368758").e());
            case 2371:
                final fbbf fbbfVar13 = this.a.a.s;
                return new ashp() { // from class: aria
                    @Override // defpackage.ashp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.do_not_report_cms_item_not_found_errors");
                    }
                };
            case 2372:
                return new bcqb();
            case 2373:
                akis akisVar10 = this.a;
                akkp akkpVar8 = akisVar10.a;
                return new cojg(akisVar10.on, akisVar10.q, akkpVar8.al, (ffsk) akkpVar8.p.b());
            case 2374:
                final fbbf fbbfVar14 = this.a.a.s;
                return new atwo() { // from class: atvb
                    @Override // defpackage.atwo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.create_content_uri_for_notifications");
                    }
                };
            case 2375:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                akkp akkpVar9 = this.a.a;
                fbbf fbbfVar15 = akkpVar9.C;
                fbbf fbbfVar16 = akkpVar9.dB;
                fbbf fbbfVar17 = akkpVar9.ib;
                fazb a3 = fbaz.a(akkpVar9.rd);
                akkp akkpVar10 = this.a.a;
                return new curi(ffskVar, ffhdVar, fbbfVar15, fbbfVar16, fbbfVar17, a3, akkpVar10.ih, akkpVar10.ig);
            case 2376:
                final fbbf fbbfVar18 = this.a.a.s;
                return new auis() { // from class: auik
                    @Override // defpackage.auis
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.clear_old_notification_channels");
                    }
                };
            case 2377:
                return Optional.of(this.a.a.Sw);
            case 2378:
                return new cpem((Context) this.a.q.b(), (ciqn) this.a.a.aN.b(), (cins) this.a.a.jc.b(), (cnmx) this.a.a.RL.b());
            case 2379:
                cfuu cfuuVar = (cfuu) this.a.aX.b();
                akkp akkpVar11 = this.a.a;
                return new caru(cfuuVar, akkpVar11.SM, akkpVar11.SR);
            case 2380:
                akis akisVar11 = this.a;
                fbbf fbbfVar19 = akisVar11.q;
                akkp akkpVar12 = akisVar11.a;
                return new cauz(fbbfVar19, akkpVar12.Sy, akkpVar12.SL, akisVar11.cz);
            case 2381:
                return new enpx(this.a.a.fK());
            case 2382:
                return enip.v((bqab) this.a.a.Sz.b(), (bqab) this.a.a.SB.b(), (bqab) this.a.a.SG.b(), (bqab) this.a.a.SH.b(), (bqab) this.a.a.SI.b(), (bqab) this.a.a.jQ.b(), (bqab) this.a.a.SJ.b(), (bqab) this.a.a.SK.b(), (bqab) this.a.ov.b());
            case 2383:
                return new cfku((cfkw) this.a.a.HH.b(), (cflm) this.a.a.HI.b(), (cevh) this.a.a.cc.b(), (ceww) this.a.a.cd.b());
            case 2384:
                return new cbds(this.a.a.SA);
            case 2385:
                return new cbuf(this.a.a.cc);
            case 2386:
                this.a.a.lK();
                return new degy(this.a.a.SF);
            case 2387:
                return new deii(this.a.a.cc);
            case 2388:
                return new dehr(this.a.a.cc);
            case 2389:
                return new cbdu(this.a.a.SE);
            case 2390:
                return new asvx() { // from class: asel
                };
            case 2391:
                return new afcb((aeyq) this.a.a.IM.b(), (errl) this.a.p.b());
            case 2392:
                akkp akkpVar13 = this.a.a;
                return new afbi(akkpVar13.x(), akkpVar13.ay);
            case 2393:
                akkp akkpVar14 = this.a.a;
                return new afci(akkpVar14.ad, akkpVar14.ay);
            case 2394:
                akkp akkpVar15 = this.a.a;
                return new aito(new aith(akkpVar15.cc), (aiuv) akkpVar15.Nv.b());
            case 2395:
                enhd h = enhk.h(17);
                h.k(1, new carq());
                h.k(19, (cavm) this.a.a.SN.b());
                h.k(15, (cavm) this.a.ow.b());
                h.k(17, (cavm) this.a.nV.b());
                h.k(14, new cavy());
                h.k(13, this.a.a.fB());
                h.k(10, akis.je());
                akkp akkpVar16 = this.a.a;
                h.k(18, new cawy((cqoh) akkpVar16.a.cz.b(), new atkf(akkpVar16.s)));
                h.k(6, new caxl(this.a.a.f));
                h.k(16, (cavm) this.a.ox.b());
                h.k(8, new caxq());
                h.k(11, new caxr());
                h.k(3, new caxs(this.a.a.f));
                akkp akkpVar17 = this.a.a;
                fbbf fbbfVar20 = akkpVar17.Sx;
                fbbf fbbfVar21 = akkpVar17.f;
                Optional optional = (Optional) fbbfVar20.b();
                h.k(4, new caxu(fbbfVar21, optional));
                h.k(7, this.a.bG());
                akkp akkpVar18 = this.a.a;
                h.k(5, new cazi((cqoh) akkpVar18.a.cz.b(), (akzt) akkpVar18.f.b()));
                akkp akkpVar19 = this.a.a;
                h.k(12, new cazm((errm) akkpVar19.a.aK.b(), new arog(akkpVar19.s), (cqoh) akkpVar19.a.cz.b(), fbaz.a(akkpVar19.a.oz)));
                return h.c();
            case 2396:
                akis akisVar12 = this.a;
                return new cavj(akisVar12.a.cD, (alba) akisVar12.le.b(), this.a.a.cd());
            case 2397:
                final fbbf fbbfVar22 = this.a.a.s;
                return new asnj() { // from class: arrv
                    @Override // defpackage.asnj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_table_size_logging");
                    }
                };
            case 2398:
                final fbbf fbbfVar23 = this.a.a.s;
                return new asme() { // from class: arpr
                    @Override // defpackage.asme
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_io_logging");
                    }
                };
            case 2399:
                return Long.valueOf(((ekck) this.a.a.nM().a.b()).a("com.google.android.apps.messaging.auto 45426404").b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        int i = this.b;
        switch (i) {
            case 2400:
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new becd(akkpVar.ST, akkpVar.fJ, akisVar.oA, akkpVar.dn, akkpVar.Sv, akisVar.no, fbbd.a);
            case 2401:
                Context context = (Context) this.a.q.b();
                akis akisVar2 = this.a;
                fbbf fbbfVar = akisVar2.cT;
                fbbf fbbfVar2 = akisVar2.a.fJ;
                ctud ctudVar = (ctud) fbbfVar.b();
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar3 = akkpVar2.ib;
                fbbf fbbfVar4 = akkpVar2.dn;
                fbbf fbbfVar5 = akkpVar2.dB;
                ckds ckdsVar = (ckds) akkpVar2.dp.b();
                ckdn ckdnVar = (ckdn) this.a.cv.b();
                akis akisVar3 = this.a;
                fbbf fbbfVar6 = akisVar3.ct;
                fbbf fbbfVar7 = akisVar3.a.kj;
                cuwz cuwzVar = (cuwz) fbbfVar6.b();
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar8 = akkpVar3.iN;
                albq albqVar = (albq) akkpVar3.di.b();
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                akkp akkpVar4 = this.a.a;
                bavx eF = akkpVar4.eF();
                azze azzeVar = (azze) akkpVar4.fx.b();
                bbfd bbfdVar = (bbfd) this.a.a.iF.b();
                akkp akkpVar5 = this.a.a;
                return new CustomUpgradeSteps(context, fbbfVar2, ctudVar, fbbfVar3, fbbfVar4, fbbfVar5, ckdsVar, ckdnVar, fbbfVar7, cuwzVar, fbbfVar8, albqVar, ctvbVar, eF, azzeVar, bbfdVar, akkpVar5.jo(), akkpVar5.gD(), (aqky) akkpVar5.kp.b());
            case 2402:
                return new dttv(this.a.a.qZ());
            case 2403:
                return new atkx() { // from class: atkn
                };
            case 2404:
                return ((cbcj) this.a.a.Lw.b()).a(bwlk.a());
            case 2405:
                return new asvp() { // from class: asdy
                };
            case 2406:
                return new cvdc((cvbr) this.a.a.fe.b(), (cvcg) this.a.a.Ta.b(), (errl) this.a.t.b());
            case 2407:
                return new cvcg((errl) this.a.t.b(), (errl) this.a.p.b(), (Context) this.a.q.b(), (cqoh) this.a.cz.b(), (cfyt) this.a.a.cf.b());
            case 2408:
                return new cuyi((ctwb) this.a.a.c.b(), (Context) this.a.q.b());
            case 2409:
                cvdc cvdcVar = (cvdc) this.a.a.Tb.b();
                akis akisVar4 = this.a;
                return new cuyu(cvdcVar, akisVar4.a.hH(), (cqoh) akisVar4.cz.b(), (ctwb) this.a.a.c.b(), (Context) this.a.q.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 2410:
                return new enpx((djru) this.a.a.cG.b());
            case 2411:
                akkp akkpVar6 = this.a.a;
                return enip.r(akkpVar6.lL(), akkpVar6.pU());
            case 2412:
                akis akisVar5 = this.a;
                fbbf fbbfVar9 = akisVar5.cP;
                comc kh = akisVar5.a.kh();
                ffhd ffhdVar = (ffhd) fbbfVar9.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar6 = this.a;
                return new cvki(kh, ffhdVar, ffskVar, akisVar6.cz, akisVar6.a.pM);
            case 2413:
                return Long.valueOf(((ekck) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto 45645967").b());
            case 2414:
                final fbbf fbbfVar10 = this.a.a.s;
                return new avdi() { // from class: avcz
                    @Override // defpackage.avdi
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_verify_for_new_rcs_numbers_only");
                    }
                };
            case 2415:
                return Optional.of((djrx) this.a.a.Tl.b());
            case 2416:
                akkp akkpVar7 = this.a.a;
                return new cmog(akkpVar7.br, akkpVar7.Tk);
            case 2417:
                final fbbf fbbfVar11 = this.a.a.s;
                return new asgn() { // from class: argd
                    @Override // defpackage.asgn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.cache_only_if_configuration_is_present");
                    }
                };
            case 2418:
                return Boolean.valueOf(((asqs) this.a.a.bo.b()).a());
            case 2419:
                return new enpx(this.a.a.eo());
            case 2420:
                return Boolean.valueOf(this.a.a.lR().a());
            case 2421:
                return new ctam(fbaz.a(this.a.a.lF), fbaz.a(this.a.a.GD));
            case 2422:
                return new cjic(this.a.a.cf);
            case 2423:
                return new bcwq(this.a.a.Tt);
            case 2424:
                return Long.valueOf(new fcyc(this.a.a.j).a());
            case 2425:
                return tsw.a(this.a.a.B());
            case 2426:
                return alwr.a(this.a.a.Ty);
            case 2427:
                akis akisVar7 = this.a;
                fbbf fbbfVar12 = akisVar7.jZ;
                akkp akkpVar8 = akisVar7.a;
                return new alwq(fbbfVar12, akkpVar8.at(), (ffsk) akkpVar8.q.b());
            case 2428:
                return ayxr.a(this.a.a.ea());
            case 2429:
                return new ayxz();
            case 2430:
                return cpxb.a(this.a.a.TC);
            case 2431:
                coxk coxkVar = (coxk) this.a.a.iN.b();
                akkp akkpVar9 = this.a.a;
                return new cpwz(coxkVar, akkpVar9.az, (ffsk) akkpVar9.q.b());
            case 2432:
                return cggh.a(this.a.a.TE);
            case 2433:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akis akisVar8 = this.a;
                akkp akkpVar10 = akisVar8.a;
                return new cggg(ffskVar2, akkpVar10.as, akkpVar10.Dy, akisVar8.dy);
            case 2434:
                return aker.a(this.a.a.ae());
            case 2435:
                return ckuw.a(this.a.a.TI);
            case 2436:
                ffsk ffskVar3 = (ffsk) this.a.a.q.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                csiy csiyVar = (csiy) this.a.aN.b();
                cktd cktdVar = (cktd) this.a.a.TH.b();
                akis akisVar9 = this.a;
                Context context2 = (Context) akisVar9.q.b();
                akzt akztVar = (akzt) this.a.a.C.b();
                ctvs ctvsVar = (ctvs) this.a.aZ.b();
                aqvh aqvhVar = (aqvh) this.a.a.gN.b();
                effy effyVar = (effy) this.a.oM.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akkp akkpVar11 = this.a.a;
                return new ckut(ffskVar3, ffhdVar2, csiyVar, cktdVar, akisVar9.a.Qh, context2, akztVar, ctvsVar, aqvhVar, effyVar, cqohVar, akkpVar11.Qj, akkpVar11.Qz, akkpVar11.QB);
            case 2437:
                return new cktd((ffsk) this.a.a.q.b(), (alxl) this.a.a.mx.b(), (cktz) this.a.mZ.b());
            case 2438:
                return ajcm.a(this.a.a.TK);
            case 2439:
                ffsk ffskVar4 = (ffsk) this.a.a.q.b();
                akkp akkpVar12 = this.a.a;
                return new ajcl(ffskVar4, akkpVar12.my, akkpVar12.Z, akkpVar12.mu, akkpVar12.mx);
            case 2440:
                return bzlc.a(this.a.a.TM);
            case 2441:
                ffsk ffskVar5 = (ffsk) this.a.a.q.b();
                akis akisVar10 = this.a;
                akkp akkpVar13 = akisVar10.a;
                return new bzla(ffskVar5, akkpVar13.fa, akkpVar13.jZ, akisVar10.ly);
            case 2442:
                return ckwm.a(this.a.a.TR);
            case 2443:
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                ffhd ffhdVar3 = (ffhd) this.a.cP.b();
                csiy csiyVar2 = (csiy) this.a.aN.b();
                Context context3 = (Context) this.a.q.b();
                akzt akztVar2 = (akzt) this.a.a.C.b();
                ctvs ctvsVar2 = (ctvs) this.a.aZ.b();
                akkp akkpVar14 = this.a.a;
                fbbf fbbfVar13 = akkpVar14.dB;
                fbbf fbbfVar14 = akkpVar14.dn;
                fbbf fbbfVar15 = akkpVar14.jk;
                fbbf fbbfVar16 = akkpVar14.ib;
                coxk coxkVar2 = (coxk) akkpVar14.iN.b();
                aolr aolrVar = (aolr) this.a.a.Z.b();
                ayif ayifVar = (ayif) this.a.a.ia.b();
                bdtd bdtdVar = (bdtd) this.a.a.aO.b();
                aqvh aqvhVar2 = (aqvh) this.a.a.gN.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar17 = akisVar11.oN;
                akkp akkpVar15 = akisVar11.a;
                return new ckwi(ffskVar6, ffhdVar3, csiyVar2, context3, akztVar2, ctvsVar2, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, coxkVar2, aolrVar, ayifVar, bdtdVar, aqvhVar2, dtuuVar, akkpVar15.TO, akkpVar15.TP, (effy) fbbfVar17.b(), (cqoh) this.a.cz.b(), this.a.a.TQ);
            case 2444:
                return Long.valueOf(((ekck) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto 45662037").b());
            case 2445:
                return Long.valueOf(((ekck) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto 45662036").b());
            case 2446:
                return (eyev) ((ekck) this.a.a.ox().a.b()).a("com.google.android.apps.messaging.auto 45663559").c();
            case 2447:
                return cpxq.a(this.a.a.kE());
            case 2448:
                akkp akkpVar16 = this.a.a;
                return new cpxm(akkpVar16.f7do, akkpVar16.K, akkpVar16.az, akkpVar16.jv, (ffsk) akkpVar16.q.b());
            case 2449:
                return culm.a(this.a.a.TV);
            case 2450:
                akkp akkpVar17 = this.a.a;
                return new culk(akkpVar17.iq, akkpVar17.ie, (ffsk) akkpVar17.aq.b());
            case 2451:
                return ctts.a(this.a.a.lh());
            case 2452:
                akkp akkpVar18 = this.a.a;
                return cprp.a(akkpVar18.ky(), akkpVar18.TZ, akkpVar18.Ua);
            case 2453:
                final fbbf fbbfVar18 = this.a.a.s;
                return new atsk() { // from class: atqk
                    @Override // defpackage.atsk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_blocking_executor_for_accessing_chat_endpoints_in_tachygram_pull_messages_synclet");
                    }
                };
            case 2454:
                return Long.valueOf(((ekck) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto 45424306").b());
            case 2455:
                return Boolean.valueOf(((ekck) this.a.a.oG().a.b()).a("com.google.android.apps.messaging.auto 45424308").e());
            case 2456:
                return cumz.a((cumx) this.a.a.tc.b());
            case 2457:
                fbbf fbbfVar19 = this.a.a.Ue;
                int i2 = ekrp.b;
                ekro ekroVar = new ekro();
                ekroVar.a = ekrl.a("TikTokAccountWipeoutSynclet");
                ekroVar.c = fbbfVar19;
                ekrg ekrgVar = new ekrg();
                ekrgVar.c(3L, TimeUnit.DAYS);
                ekri ekriVar = new ekri();
                ekriVar.a = ekrk.ON_CHARGER;
                ekriVar.b(4L, TimeUnit.DAYS);
                ekrgVar.b(ekriVar.a());
                ekroVar.b = ekrgVar.a();
                return ekroVar.a();
            case 2458:
                dlpw dlpwVar = (dlpw) this.a.l.b();
                eiyk eiykVar = (eiyk) this.a.a.o.b();
                eiyx eiyxVar = (eiyx) this.a.a.Ud.b();
                akis akisVar12 = this.a;
                eiyh mv = akisVar12.a.mv();
                errl errlVar = (errl) akisVar12.p.b();
                errl errlVar2 = (errl) this.a.t.b();
                akis akisVar13 = this.a;
                return new ejfc(dlpwVar, eiykVar, eiyxVar, mv, errlVar, errlVar2, akisVar13.el(), (erqa) akisVar13.pi.b());
            case 2459:
                akis akisVar14 = this.a;
                eiyk eiykVar2 = (eiyk) akisVar14.a.o.b();
                effy effyVar2 = (effy) this.a.pg.b();
                dlpw dlpwVar2 = (dlpw) this.a.l.b();
                akis akisVar15 = this.a;
                int N = akisVar15.N();
                Executor executor = (Executor) akisVar15.p.b();
                return new eiyx(akisVar14.pf, eiykVar2, effyVar2, dlpwVar2, akisVar15.ph, N, executor);
            case 2460:
                return enip.o(this.a.a.rj());
            case 2461:
                return new ekvw((Context) this.a.q.b(), Boolean.valueOf(this.a.a.rO()), (eknr) this.a.pm.b());
            case 2462:
                akkp akkpVar19 = this.a.a;
                enin i3 = enip.i(6);
                i3.c(akkpVar19.ms());
                i3.c(this.a.a.mt());
                i3.j(this.a.a.rm());
                i3.c(this.a.eh());
                i3.c(this.a.a.mn());
                i3.c((cvjo) this.a.a.Tg.b());
                return i3.g();
            case 2463:
                return new ejgc((Context) this.a.q.b(), (effy) this.a.pr.b(), (eiyk) this.a.a.o.b(), emux.a);
            case 2464:
                akkp akkpVar20 = this.a.a;
                return new eivk((eiuo) akkpVar20.oW(), (errl) akkpVar20.m.b());
            case 2465:
                akkp akkpVar21 = this.a.a;
                enin i4 = enip.i(7);
                i4.j(akkpVar21.rl());
                i4.c(this.a.eg());
                i4.c(this.a.a.eu());
                i4.c(this.a.a.eV());
                i4.c(this.a.a.mw());
                i4.c(this.a.a.ht());
                i4.c(this.a.a.iH());
                return i4.g();
            case 2466:
                return new ejqc((eiyk) this.a.a.o.b(), (Executor) this.a.t.b(), (ejpq) this.a.dX.b());
            case 2467:
                return Optional.of((cvjo) this.a.a.Tg.b());
            case 2468:
                return new enpx(this.a.a.mu());
            case 2469:
                return new eiyj((eiyk) this.a.a.o.b(), (eiyx) this.a.a.Ud.b());
            case 2470:
                akis akisVar16 = this.a;
                emxc emxcVar = (emxc) ((fbbb) akisVar16.bJ).a;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) akisVar16.p.b();
                ekbo ekboVar = (ekbo) this.a.a.bb.b();
                ekbo ekboVar2 = (ekbo) this.a.a.aZ.b();
                Map map = (Map) this.a.bO.b();
                ecxc ecxcVar = (ecxc) this.a.bH.b();
                akis akisVar17 = this.a;
                return new ekcn(emxcVar, scheduledExecutorService, ekboVar, ekboVar2, map, ecxcVar, akisVar17.ey(), (ecvo) akisVar17.bK.b());
            case 2471:
                return new ekai(akkp.rU(), enpd.a);
            case 2472:
                return new ekai(akkp.rV(), enpd.a);
            case 2473:
                return new ekai(akkp.rW(), enpd.a);
            case 2474:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45617644").e());
            case 2475:
                return Boolean.valueOf(this.a.a.nP().a());
            case 2476:
                return Boolean.valueOf(this.a.a.nP().b());
            case 2477:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45628095").e());
            case 2478:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45623323").e());
            case 2479:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45635030").e());
            case 2480:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45615956").e());
            case 2481:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45648789").e());
            case 2482:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45545839").e());
            case 2483:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45531446").e());
            case 2484:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45619942").e());
            case 2485:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45618342").e());
            case 2486:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45649824").e());
            case 2487:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45631609").e());
            case 2488:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45623340").e());
            case 2489:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45618384").e());
            case 2490:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45619321").e());
            case 2491:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45619301").e());
            case 2492:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45626586").e());
            case 2493:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45618727").e());
            case 2494:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45623330").e());
            case 2495:
                return Boolean.valueOf(this.a.a.mQ().a());
            case 2496:
                return Boolean.valueOf(((ekck) this.a.a.om().a.b()).a("com.google.android.apps.messaging.auto 45623894").e());
            case 2497:
                return Boolean.valueOf(this.a.a.mM().a());
            case 2498:
                return Boolean.valueOf(this.a.a.mS().a());
            case 2499:
                return Boolean.valueOf(this.a.a.mU().a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object t() {
        int i = this.b;
        switch (i) {
            case 2500:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45656240").e());
            case 2501:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45670657").e());
            case 2502:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45660656").e());
            case 2503:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45673837").e());
            case 2504:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45679858").e());
            case 2505:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45667260").e());
            case 2506:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45670994").e());
            case 2507:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45671887").e());
            case 2508:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45671328").e());
            case 2509:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45650675").e());
            case 2510:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45669176").e());
            case 2511:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45646636").e());
            case 2512:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45671592").e());
            case 2513:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45675821").e());
            case 2514:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45680291").e());
            case 2515:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45679270").e());
            case 2516:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45679434").e());
            case 2517:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45477388").e());
            case 2518:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45678966").e());
            case 2519:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45679825").e());
            case 2520:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45675264").e());
            case 2521:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45643135").e());
            case 2522:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45676816").e());
            case 2523:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45670277").e());
            case 2524:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45671488").e());
            case 2525:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45613922").e());
            case 2526:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45668311").e());
            case 2527:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45665611").e());
            case 2528:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45676781").e());
            case 2529:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45679859").e());
            case 2530:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45417414").e());
            case 2531:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45669167").e());
            case 2532:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45680441").e());
            case 2533:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45669813").e());
            case 2534:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45670228").e());
            case 2535:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45671150").e());
            case 2536:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45679860").e());
            case 2537:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45417770").e());
            case 2538:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45656241").e());
            case 2539:
                Boolean bool = (Boolean) ((cfup) aref.e.get()).e();
                bool.booleanValue();
                return bool;
            case 2540:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45651278").e());
            case 2541:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45647922").e());
            case 2542:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45620492").e());
            case 2543:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45639777").e());
            case 2544:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45674383").e());
            case 2545:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45679385").e());
            case 2546:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45631008").e());
            case 2547:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45676766").e());
            case 2548:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45671558").e());
            case 2549:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45670978").e());
            case 2550:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45665283").e());
            case 2551:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45659346").e());
            case 2552:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45679933").e());
            case 2553:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45660562").e());
            case 2554:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45654022").e());
            case 2555:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45617442").e());
            case 2556:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45669571").e());
            case 2557:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45668450").e());
            case 2558:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45673134").e());
            case 2559:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45672466").e());
            case 2560:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45668394").e());
            case 2561:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45647347").e());
            case 2562:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45667989").e());
            case 2563:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45670098").e());
            case 2564:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45615184").e());
            case 2565:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45651443").e());
            case 2566:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45367769").e());
            case 2567:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45669177").e());
            case 2568:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45667824").e());
            case 2569:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45672752").e());
            case 2570:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45671139").e());
            case 2571:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45665877").e());
            case 2572:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45650724").e());
            case 2573:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45659333").e());
            case 2574:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45680317").e());
            case 2575:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45677653").e());
            case 2576:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45673961").e());
            case 2577:
                return Boolean.valueOf(((ekck) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto 45675863").e());
            case 2578:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45666676").e());
            case 2579:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45666677").e());
            case 2580:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45668328").e());
            case 2581:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45669583").e());
            case 2582:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45679526").e());
            case 2583:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45674597").e());
            case 2584:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45673491").e());
            case 2585:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45679841").e());
            case 2586:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45676516").e());
            case 2587:
                return Boolean.valueOf(((ekck) this.a.a.nU().a.b()).a("com.google.android.apps.messaging.auto 45666897").e());
            case 2588:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45646330").e());
            case 2589:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45664524").e());
            case 2590:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45672228").e());
            case 2591:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45664461").e());
            case 2592:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45679435").e());
            case 2593:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45671840").e());
            case 2594:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45666667").e());
            case 2595:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45665074").e());
            case 2596:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45673397").e());
            case 2597:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45531299").e());
            case 2598:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45677249").e());
            case 2599:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45673236").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object u() {
        int i = this.b;
        switch (i) {
            case 2600:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45572216").e());
            case 2601:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45677347").e());
            case 2602:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45680519").e());
            case 2603:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45380126").e());
            case 2604:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45668290").e());
            case 2605:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45674409").e());
            case 2606:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45672408").e());
            case 2607:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45670760").e());
            case 2608:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45669609").e());
            case 2609:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45625340").e());
            case 2610:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45672976").e());
            case 2611:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45675829").e());
            case 2612:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45671760").e());
            case 2613:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45678627").e());
            case 2614:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45671756").e());
            case 2615:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45672599").e());
            case 2616:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45659173").e());
            case 2617:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45673991").e());
            case 2618:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45667188").e());
            case 2619:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45678173").e());
            case 2620:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45678099").e());
            case 2621:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45672194").e());
            case 2622:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45672169").e());
            case 2623:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45672818").e());
            case 2624:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45673771").e());
            case 2625:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45673077").e());
            case 2626:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45673058").e());
            case 2627:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45678156").e());
            case 2628:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45657134").e());
            case 2629:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45667857").e());
            case 2630:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45673222").e());
            case 2631:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45676702").e());
            case 2632:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45674448").e());
            case 2633:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45373834").e());
            case 2634:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45366677").e());
            case 2635:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45658328").e());
            case 2636:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45629547").e());
            case 2637:
                return Boolean.valueOf(((ekck) this.a.a.oI().a.b()).a("com.google.android.apps.messaging.auto 45668436").e());
            case 2638:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45670674").e());
            case 2639:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45408222").e());
            case 2640:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45530918").e());
            case 2641:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45412459").e());
            case 2642:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45673539").e());
            case 2643:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45672304").e());
            case 2644:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45677747").e());
            case 2645:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45425786").e());
            case 2646:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45637161").e());
            case 2647:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45625714").e());
            case 2648:
                Boolean bool = (Boolean) ((cfup) aref.a.get()).e();
                bool.booleanValue();
                return bool;
            case 2649:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45641569").e());
            case 2650:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45667585").e());
            case 2651:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45413293").e());
            case 2652:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45585468").e());
            case 2653:
                Boolean bool2 = (Boolean) ((cfup) aref.b.get()).e();
                bool2.booleanValue();
                return bool2;
            case 2654:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45639178").e());
            case 2655:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45377331").e());
            case 2656:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45409239").e());
            case 2657:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45409240").e());
            case 2658:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45631084").e());
            case 2659:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45631085").e());
            case 2660:
                return Boolean.valueOf(((ekck) this.a.a.ot().a.b()).a("com.google.android.apps.messaging.auto 45651987").e());
            case 2661:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45387853").e());
            case 2662:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45649734").e());
            case 2663:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45622153").e());
            case 2664:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45669842").e());
            case 2665:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45642293").e());
            case 2666:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45637162").e());
            case 2667:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45637163").e());
            case 2668:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45637164").e());
            case 2669:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45673467").e());
            case 2670:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45676568").e());
            case 2671:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45671629").e());
            case 2672:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45625479").e());
            case 2673:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45650212").e());
            case 2674:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45670675").e());
            case 2675:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45673871").e());
            case 2676:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45665075").e());
            case 2677:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45678556").e());
            case 2678:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45670335").e());
            case 2679:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45668900").e());
            case 2680:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45676032").e());
            case 2681:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45680276").e());
            case 2682:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45632215").e());
            case 2683:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45675289").e());
            case 2684:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45633417").e());
            case 2685:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45677793").e());
            case 2686:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45650344").e());
            case 2687:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45675359").e());
            case 2688:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45676065").e());
            case 2689:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45674598").e());
            case 2690:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45415847").e());
            case 2691:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45675125").e());
            case 2692:
                return Boolean.valueOf(((ekck) this.a.a.nJ().a.b()).a("com.google.android.apps.messaging.auto 45637903").e());
            case 2693:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45669775").e());
            case 2694:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45650919").e());
            case 2695:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45658762").e());
            case 2696:
                return Boolean.valueOf(((ekck) this.a.a.op().a.b()).a("com.google.android.apps.messaging.auto 45427640").e());
            case 2697:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45680080").e());
            case 2698:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45676314").e());
            case 2699:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45657345").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object v() {
        int i = this.b;
        switch (i) {
            case 2700:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45678190").e());
            case 2701:
                Boolean bool = (Boolean) ((cfup) aref.c.get()).e();
                bool.booleanValue();
                return bool;
            case 2702:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45643593").e());
            case 2703:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45667825").e());
            case 2704:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45667935").e());
            case 2705:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45677329").e());
            case 2706:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45665837").e());
            case 2707:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45664271").e());
            case 2708:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45679842").e());
            case 2709:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45632928").e());
            case 2710:
                return Boolean.valueOf(((ekck) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto 45662039").e());
            case 2711:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45675840").e());
            case 2712:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45676182").e());
            case 2713:
                return Boolean.valueOf(((ekck) this.a.a.nU().a.b()).a("com.google.android.apps.messaging.auto 45666895").e());
            case 2714:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45674751").e());
            case 2715:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45673295").e());
            case 2716:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45673296").e());
            case 2717:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45675089").e());
            case 2718:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45678651").e());
            case 2719:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45677112").e());
            case 2720:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45623236").e());
            case 2721:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45667771").e());
            case 2722:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45678015").e());
            case 2723:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45598663").e());
            case 2724:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45630027").e());
            case 2725:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45663034").e());
            case 2726:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45531190").e());
            case 2727:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45670676").e());
            case 2728:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45679640").e());
            case 2729:
                return Boolean.valueOf(((ekck) this.a.a.nU().a.b()).a("com.google.android.apps.messaging.auto 45666892").e());
            case 2730:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45675313").e());
            case 2731:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45628146").e());
            case 2732:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45676260").e());
            case 2733:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45667897").e());
            case 2734:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45669880").e());
            case 2735:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45669008").e());
            case 2736:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45665076").e());
            case 2737:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45669210").e());
            case 2738:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45637166").e());
            case 2739:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45676517").e());
            case 2740:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45669572").e());
            case 2741:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45667515").e());
            case 2742:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45670748").e());
            case 2743:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45411113").e());
            case 2744:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45670447").e());
            case 2745:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45679695").e());
            case 2746:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45672198").e());
            case 2747:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45668167").e());
            case 2748:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45679248").e());
            case 2749:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45673619").e());
            case 2750:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45632014").e());
            case 2751:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45673481").e());
            case 2752:
                return Boolean.valueOf(((ekck) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto 45678431").e());
            case 2753:
                return Boolean.valueOf(((ekck) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto 45670383").e());
            case 2754:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45666529").e());
            case 2755:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45669196").e());
            case 2756:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45667586").e());
            case 2757:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45425915").e());
            case 2758:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45673297").e());
            case 2759:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45676066").e());
            case 2760:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45676836").e());
            case 2761:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45671766").e());
            case 2762:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45674530").e());
            case 2763:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45680277").e());
            case 2764:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45680205").e());
            case 2765:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45670995").e());
            case 2766:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45626130").e());
            case 2767:
                return Boolean.valueOf(((ekck) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto 45662038").e());
            case 2768:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45614170").e());
            case 2769:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45662880").e());
            case 2770:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45676261").e());
            case 2771:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45677610").e());
            case 2772:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45679634").e());
            case 2773:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45665077").e());
            case 2774:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45665260").e());
            case 2775:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45673674").e());
            case 2776:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45668451").e());
            case 2777:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45669129").e());
            case 2778:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45637319").e());
            case 2779:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45388704").e());
            case 2780:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45386372").e());
            case 2781:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45386391").e());
            case 2782:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45644014").e());
            case 2783:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45673670").e());
            case 2784:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45620536").e());
            case 2785:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45669899").e());
            case 2786:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45646206").e());
            case 2787:
                return Boolean.valueOf(((ekck) this.a.a.nU().a.b()).a("com.google.android.apps.messaging.auto 45666893").e());
            case 2788:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45675581").e());
            case 2789:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45632970").e());
            case 2790:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45665812").e());
            case 2791:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45650933").e());
            case 2792:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45670915").e());
            case 2793:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45675980").e());
            case 2794:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45677790").e());
            case 2795:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45669814").e());
            case 2796:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45648824").e());
            case 2797:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45668567").e());
            case 2798:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45678602").e());
            case 2799:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45674662").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object w() {
        int i = this.b;
        switch (i) {
            case 2800:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45676934").e());
            case 2801:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45668223").e());
            case 2802:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45673847").e());
            case 2803:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45680165").e());
            case 2804:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45680349").e());
            case 2805:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45674599").e());
            case 2806:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45637169").e());
            case 2807:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45637170").e());
            case 2808:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45637171").e());
            case 2809:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45637172").e());
            case 2810:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45637173").e());
            case 2811:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45637176").e());
            case 2812:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45637177").e());
            case 2813:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45637179").e());
            case 2814:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45637180").e());
            case 2815:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45670278").e());
            case 2816:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45637181").e());
            case 2817:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45637182").e());
            case 2818:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45637183").e());
            case 2819:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45637184").e());
            case 2820:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45637185").e());
            case 2821:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45637186").e());
            case 2822:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45637187").e());
            case 2823:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45639142").e());
            case 2824:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45637189").e());
            case 2825:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45637190").e());
            case 2826:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45637191").e());
            case 2827:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45637192").e());
            case 2828:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45637193").e());
            case 2829:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45637194").e());
            case 2830:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45637195").e());
            case 2831:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45637196").e());
            case 2832:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45637197").e());
            case 2833:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45637198").e());
            case 2834:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45637199").e());
            case 2835:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45637200").e());
            case 2836:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45637201").e());
            case 2837:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45637202").e());
            case 2838:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45637203").e());
            case 2839:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45637204").e());
            case 2840:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45637205").e());
            case 2841:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45637206").e());
            case 2842:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45637207").e());
            case 2843:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45637209").e());
            case 2844:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45637210").e());
            case 2845:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45637211").e());
            case 2846:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45637212").e());
            case 2847:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45637213").e());
            case 2848:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45637214").e());
            case 2849:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45637215").e());
            case 2850:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45637216").e());
            case 2851:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45637217").e());
            case 2852:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45637218").e());
            case 2853:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45637219").e());
            case 2854:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45637220").e());
            case 2855:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45637221").e());
            case 2856:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45637222").e());
            case 2857:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45637223").e());
            case 2858:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45665284").e());
            case 2859:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45657550").e());
            case 2860:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45672438").e());
            case 2861:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45637463").e());
            case 2862:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45665261").e());
            case 2863:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45678238").e());
            case 2864:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45638756").e());
            case 2865:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45545840").e());
            case 2866:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45623810").e());
            case 2867:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45680061").e());
            case 2868:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45679055").e());
            case 2869:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45680318").e());
            case 2870:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45668705").e());
            case 2871:
                return Boolean.valueOf(((ekck) this.a.a.mS().a.b()).a("com.google.android.apps.messaging.auto 45676749").e());
            case 2872:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45673124").e());
            case 2873:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45666005").e());
            case 2874:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45629100").e());
            case 2875:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45669274").e());
            case 2876:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45679793").e());
            case 2877:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45631629").e());
            case 2878:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45407071").e());
            case 2879:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45407072").e());
            case 2880:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45667566").e());
            case 2881:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45653572").e());
            case 2882:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45673444").e());
            case 2883:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45644997").e());
            case 2884:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45423910").e());
            case 2885:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45412125").e());
            case 2886:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45674615").e());
            case 2887:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45680267").e());
            case 2888:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45388670").e());
            case 2889:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45648889").e());
            case 2890:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45679561").e());
            case 2891:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45676993").e());
            case 2892:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45667567").e());
            case 2893:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45669015").e());
            case 2894:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45678937").e());
            case 2895:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45673269").e());
            case 2896:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45672747").e());
            case 2897:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45407073").e());
            case 2898:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45407074").e());
            case 2899:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45627533").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object x() {
        int i = this.b;
        switch (i) {
            case 2900:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45674160").e());
            case 2901:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45668168").e());
            case 2902:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45673898").e());
            case 2903:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45673306").e());
            case 2904:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45646169").e());
            case 2905:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45675090").e());
            case 2906:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45670448").e());
            case 2907:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45638737").e());
            case 2908:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45622462").e());
            case 2909:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45678296").e());
            case 2910:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45662114").e());
            case 2911:
                return Boolean.valueOf(((ekck) this.a.a.ot().a.b()).a("com.google.android.apps.messaging.auto 45669879").e());
            case 2912:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45672090").e());
            case 2913:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45677104").e());
            case 2914:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45653428").e());
            case 2915:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45666678").e());
            case 2916:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45462082").e());
            case 2917:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45667952").e());
            case 2918:
                return Boolean.valueOf(((ekck) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto 45662474").e());
            case 2919:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45678990").e());
            case 2920:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45679904").e());
            case 2921:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45379664").e());
            case 2922:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45644502").e());
            case 2923:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45669582").e());
            case 2924:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45668975").e());
            case 2925:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45665774").e());
            case 2926:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45618049").e());
            case 2927:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45627732").e());
            case 2928:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45659810").e());
            case 2929:
                return Boolean.valueOf(((ekck) this.a.a.op().a.b()).a("com.google.android.apps.messaging.auto 45428247").e());
            case 2930:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45676817").e());
            case 2931:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45623684").e());
            case 2932:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45676458").e());
            case 2933:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45679861").e());
            case 2934:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45673734").e());
            case 2935:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45664093").e());
            case 2936:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45665079").e());
            case 2937:
                return Boolean.valueOf(((ekck) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto 45613647").e());
            case 2938:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45665080").e());
            case 2939:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45668358").e());
            case 2940:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45425484").e());
            case 2941:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45671288").e());
            case 2942:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45672003").e());
            case 2943:
                return Boolean.valueOf(((ekck) this.a.a.oD().a.b()).a("com.google.android.apps.messaging.auto 45667516").e());
            case 2944:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45664102").e());
            case 2945:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45410370").e());
            case 2946:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45672579").e());
            case 2947:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45677603").e());
            case 2948:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45657009").e());
            case 2949:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45677156").e());
            case 2950:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45665599").e());
            case 2951:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45678473").e());
            case 2952:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45679698").e());
            case 2953:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45658569").e());
            case 2954:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45670749").e());
            case 2955:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45667740").e());
            case 2956:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45670979").e());
            case 2957:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45673270").e());
            case 2958:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45646392").e());
            case 2959:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45660331").e());
            case 2960:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45675904").e());
            case 2961:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45677768").e());
            case 2962:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45671637").e());
            case 2963:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45618379").e());
            case 2964:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45428068").e());
            case 2965:
                return Boolean.valueOf(((ekck) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto 45662040").e());
            case 2966:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45674086").e());
            case 2967:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45665468").e());
            case 2968:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45675827").e());
            case 2969:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45676196").e());
            case 2970:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45660070").e());
            case 2971:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45679436").e());
            case 2972:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45675315").e());
            case 2973:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45674372").e());
            case 2974:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45642142").e());
            case 2975:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45668715").e());
            case 2976:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45668716").e());
            case 2977:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45679176").e());
            case 2978:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45667156").e());
            case 2979:
                return Boolean.valueOf(((ekck) this.a.a.mN().a.b()).a("com.google.android.apps.messaging.auto 45673675").e());
            case 2980:
                return Boolean.valueOf(((ekck) this.a.a.mX().a.b()).a("com.google.android.apps.messaging.auto 45680292").e());
            case 2981:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45674616").e());
            case 2982:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45677151").e());
            case 2983:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45663191").e());
            case 2984:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45637227").e());
            case 2985:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45619199").e());
            case 2986:
                return Boolean.valueOf(((ekck) this.a.a.nb().a.b()).a("com.google.android.apps.messaging.auto 45672427").e());
            case 2987:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45625433").e());
            case 2988:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45672580").e());
            case 2989:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45428137").e());
            case 2990:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45429377").e());
            case 2991:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45677241").e());
            case 2992:
                return Boolean.valueOf(((ekck) this.a.a.oK().a.b()).a("com.google.android.apps.messaging.auto 45656945").e());
            case 2993:
                return Boolean.valueOf(((ekck) this.a.a.oK().a.b()).a("com.google.android.apps.messaging.auto 45664258").e());
            case 2994:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45679204").e());
            case 2995:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45672845").e());
            case 2996:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45631851").e());
            case 2997:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45671684").e());
            case 2998:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45678504").e());
            case 2999:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45669815").e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object y() {
        int i = this.b;
        switch (i) {
            case 300:
                akkp akkpVar = this.a.a;
                return new cpaf(akkpVar.dt, (ffsk) akkpVar.q.b());
            case 301:
                akis akisVar = this.a;
                Object ff = akisVar.ff();
                Context context = (Context) akisVar.q.b();
                emyl emylVar = (emyl) this.a.dj.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akkp akkpVar2 = this.a.a;
                return akyq.a(ff, context, emylVar, cqohVar, akkpVar2.be, (albl) akkpVar2.bh.b(), (Executor) this.a.p.b());
            case 302:
                akis akisVar2 = this.a;
                akkp akkpVar3 = akisVar2.a;
                return new bdpt(akisVar2.q, akkpVar3.ad, akkpVar3.dy, akkpVar3.dA, akkpVar3.ay);
            case 303:
                akkp akkpVar4 = this.a.a;
                return new azei(akkpVar4.dx, (ffsk) akkpVar4.p.b());
            case 304:
                akkp akkpVar5 = this.a.a;
                return enip.r(akkpVar5.pp(), akkpVar5.G());
            case 305:
                Context context2 = (Context) this.a.q.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                Optional of = Optional.of(this.a.a.aP);
                akis akisVar3 = this.a;
                fbbf fbbfVar = akisVar3.aK;
                return new cbgf(context2, dtuuVar, ejvpVar, of, akisVar3.a.dz, akisVar3.da, (errl) fbbfVar.b(), (errl) this.a.p.b());
            case 306:
                return new cesz(this.a.a.cc);
            case 307:
                Context context3 = (Context) this.a.q.b();
                akkp akkpVar6 = this.a.a;
                fbbf fbbfVar2 = akkpVar6.aO;
                dtuu dtuuVar2 = (dtuu) akkpVar6.ay.b();
                akis akisVar4 = this.a;
                fbbf fbbfVar3 = akisVar4.cz;
                akkp akkpVar7 = akisVar4.a;
                fbbf fbbfVar4 = akkpVar7.id;
                fbbf fbbfVar5 = akkpVar7.dB;
                fbbf fbbfVar6 = akkpVar7.dn;
                fbbf fbbfVar7 = akkpVar7.DZ;
                cqoh cqohVar2 = (cqoh) fbbfVar3.b();
                cbgf cbgfVar = (cbgf) this.a.a.dA.b();
                akkp akkpVar8 = this.a.a;
                return new bdfl(context3, fbbfVar2, dtuuVar2, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, cqohVar2, cbgfVar, akkpVar8.by(), akkpVar8.bA());
            case 308:
                akkp akkpVar9 = this.a.a;
                fbbf fbbfVar8 = akkpVar9.dn;
                fbbf fbbfVar9 = akkpVar9.dD;
                fbbf fbbfVar10 = akkpVar9.dL;
                cbgf cbgfVar2 = (cbgf) akkpVar9.dA.b();
                bbfd bbfdVar = (bbfd) this.a.a.iF.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                akkp akkpVar10 = this.a.a;
                return new croe(fbbfVar8, fbbfVar9, fbbfVar10, cbgfVar2, bbfdVar, dtuuVar3, akkpVar10.pC, (akvy) akkpVar10.DY.b(), this.a.a.lk());
            case 309:
                akkp akkpVar11 = this.a.a;
                return new bdgh(akkpVar11.dn, (dtuu) akkpVar11.ay.b(), this.a.a.dC);
            case 310:
                return new cesi(this.a.a.cc);
            case 311:
                akis akisVar5 = this.a;
                akkp akkpVar12 = akisVar5.a;
                return new crog(akkpVar12.bi, akkpVar12.dE, akkpVar12.dK, akisVar5.eb, (ffsk) akkpVar12.aq.b());
            case 312:
                akis akisVar6 = this.a;
                return new akvz(akisVar6.dZ, akisVar6.ea);
            case 313:
                return Optional.of(this.a.a.qr());
            case 314:
                errl errlVar = (errl) this.a.p.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akis akisVar7 = this.a;
                comc kf = akisVar7.a.kf();
                ejvb ejvbVar = (ejvb) akisVar7.dy.b();
                ejvp ejvpVar2 = (ejvp) this.a.aR.b();
                akis akisVar8 = this.a;
                return new ahjj(errlVar, ffskVar, ffskVar2, kf, ejvbVar, ejvpVar2, akisVar8.a.dH, (cqoh) akisVar8.cz.b(), (afar) this.a.a.dJ.b());
            case 315:
                akis akisVar9 = this.a;
                fbbf fbbfVar11 = akisVar9.a.dF;
                aexz aexzVar = new aexz();
                Executor executor = (Executor) akisVar9.p.b();
                return new aexe(fbbfVar11, aexzVar, executor);
            case 316:
                akis akisVar10 = this.a;
                return new alhj(akisVar10.a.az, (csxu) akisVar10.aO.b());
            case 317:
                akis akisVar11 = this.a;
                akkp akkpVar13 = akisVar11.a;
                return new afar(akkpVar13.dI, akkpVar13.dG, akisVar11.eR(), (errl) akisVar11.p.b());
            case 318:
                akis akisVar12 = this.a;
                return new aexq(akisVar12.a.dF, new aexz(), (Executor) akisVar12.p.b());
            case 319:
                akis akisVar13 = this.a;
                fbbf fbbfVar12 = akisVar13.q;
                akkp akkpVar14 = akisVar13.a;
                return new baih(fbbfVar12, akisVar13.cz, akkpVar14.u, akkpVar14.f, akkpVar14.fP, akkpVar14.iN, akkpVar14.ay, akkpVar14.ap, akkpVar14.AS, akkpVar14.AH, akkpVar14.ix, akkpVar14.fr, akkpVar14.dn, akkpVar14.BF, akkpVar14.pC, akkpVar14.az, akkpVar14.dE, akkpVar14.aO, akkpVar14.DX);
            case 320:
                akis akisVar14 = this.a;
                akkp akkpVar15 = akisVar14.a;
                fbbf fbbfVar13 = akkpVar15.dM;
                fbbf fbbfVar14 = akkpVar15.bF;
                Context context4 = (Context) akisVar14.q.b();
                akis akisVar15 = this.a;
                akkp akkpVar16 = akisVar15.a;
                fbbf fbbfVar15 = akkpVar16.dN;
                fbbf fbbfVar16 = akisVar15.ec;
                fbbf fbbfVar17 = akkpVar16.dP;
                fbbf fbbfVar18 = akkpVar16.dn;
                fbbf fbbfVar19 = akkpVar16.dR;
                fbbf fbbfVar20 = akkpVar16.dB;
                fbbf fbbfVar21 = akkpVar16.Z;
                fbbf fbbfVar22 = akkpVar16.az;
                fbbf fbbfVar23 = akkpVar16.bi;
                fbbf fbbfVar24 = akkpVar16.dT;
                fbbf fbbfVar25 = akkpVar16.f;
                fbbf fbbfVar26 = akkpVar16.ek;
                fbbf fbbfVar27 = akisVar15.fM;
                fbbf fbbfVar28 = akkpVar16.ej;
                fbbf fbbfVar29 = akkpVar16.dE;
                fbbf fbbfVar30 = akkpVar16.eo;
                fazb a = fbaz.a(akkpVar16.eq);
                akis akisVar16 = this.a;
                akkp akkpVar17 = akisVar16.a;
                fazb a2 = fbaz.a(akisVar16.aV);
                fbbf fbbfVar31 = akkpVar17.nC;
                fbbf fbbfVar32 = akkpVar17.nj;
                fbbf fbbfVar33 = akkpVar17.aO;
                fazb a3 = fbaz.a(akkpVar17.il);
                akis akisVar17 = this.a;
                fbbf fbbfVar34 = akisVar17.cz;
                fbbf fbbfVar35 = akisVar17.a.dp;
                cqoh cqohVar3 = (cqoh) fbbfVar34.b();
                akis akisVar18 = this.a;
                fbbf fbbfVar36 = akisVar18.a.Dp;
                fazb a4 = fbaz.a(akisVar18.ms);
                fazb a5 = fbaz.a(this.a.a.Dr);
                fazb a6 = fbaz.a(this.a.a.Dt);
                errl errlVar2 = (errl) this.a.aK.b();
                errl errlVar3 = (errl) this.a.p.b();
                elbx elbxVar = (elbx) this.a.aJ.b();
                fazb a7 = fbaz.a(this.a.a.Du);
                akkp akkpVar18 = this.a.a;
                fbbf fbbfVar37 = akkpVar18.dK;
                avkk avkkVar = (avkk) akkpVar18.cH.b();
                akis akisVar19 = this.a;
                akkp akkpVar19 = akisVar19.a;
                fbbf fbbfVar38 = akkpVar19.Dy;
                fbbf fbbfVar39 = akkpVar19.DM;
                bczc eP = akkpVar19.eP();
                fbbf fbbfVar40 = akisVar19.eb;
                alwb alwbVar = (alwb) akisVar19.mg.b();
                akkp akkpVar20 = this.a.a;
                fbbf fbbfVar41 = akkpVar20.br;
                asvn asvnVar = (asvn) akkpVar20.Q.b();
                akkp akkpVar21 = this.a.a;
                fbbf fbbfVar42 = akkpVar21.DN;
                fbbf fbbfVar43 = akkpVar21.cG;
                fbbf fbbfVar44 = akkpVar21.DO;
                fbbf fbbfVar45 = akkpVar21.yh;
                fbbf fbbfVar46 = akkpVar21.bC;
                fbbf fbbfVar47 = akkpVar21.DQ;
                return new alvq(fbbfVar13, fbbfVar14, context4, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, akisVar15.aU, fbbfVar27, fbbfVar28, fbbfVar29, fbbfVar30, a, a2, fbbfVar31, fbbfVar32, fbbfVar33, akisVar16.cp, a3, fbbfVar35, cqohVar3, fbbfVar36, a4, a5, a6, errlVar2, errlVar3, elbxVar, a7, fbbfVar37, avkkVar, fbbfVar38, fbbfVar39, eP, fbbfVar40, alwbVar, fbbfVar41, asvnVar, fbbfVar42, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar47, akkpVar21.DV, akkpVar21.DW);
            case 321:
                final fbbf fbbfVar48 = this.a.a.s;
                return new atqy() { // from class: atnp
                    @Override // defpackage.atqy
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_log_tachyon_url");
                    }
                };
            case 322:
                final fbbf fbbfVar49 = this.a.a.s;
                return new atrh() { // from class: atoh
                    @Override // defpackage.atrh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_rcs_utils_is_rcs_provisioning_sub_id");
                    }
                };
            case 323:
                return caqt.a(this.a.a.dO);
            case 324:
                return new bdeo(this.a.a.dQ);
            case 325:
                akis akisVar20 = this.a;
                akkp akkpVar22 = akisVar20.a;
                return new akwn(akisVar20.aT, akkpVar22.c, akkpVar22.dn, akisVar20.aQ, akisVar20.aP, akisVar20.aZ, akkpVar22.bj, akkpVar22.dS);
            case 326:
                final fbbf fbbfVar50 = this.a.a.s;
                return new dixf() { // from class: divs
                    @Override // defpackage.dixf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.enable_lookup_by_sim_subscription_info_retriever");
                    }
                };
            case 327:
                akis akisVar21 = this.a;
                return new alsa(akisVar21.a.ej, akisVar21.as);
            case 328:
                return new alrv((ecdc) this.a.a.ei.b());
            case 329:
                ecdc ecdcVar = (ecdc) this.a.a.eh.b();
                eccy.a(ecdcVar);
                return ecdcVar;
            case 330:
                akis akisVar22 = this.a;
                return eccz.a(akisVar22.a.eg, akisVar22.F);
            case 331:
                ecdn ecdnVar = (ecdn) this.a.ad.b();
                akis akisVar23 = this.a;
                akkp akkpVar23 = akisVar23.a;
                fbbf fbbfVar51 = akkpVar23.ee;
                fbbf fbbfVar52 = akkpVar23.eb;
                fbbf fbbfVar53 = akisVar23.fC;
                return new ecde(ecdnVar, fbbfVar51, fbbfVar52, fbbfVar53, fbbfVar53, akkpVar23.ef, akisVar23.cN, akisVar23.ay, akkpVar23.mo());
            case 332:
                akis akisVar24 = this.a;
                enin i2 = enip.i(14);
                i2.j(akisVar24.fY());
                i2.j(this.a.fT());
                i2.j(this.a.a.rh());
                i2.j(akis.iM());
                i2.j(this.a.fX());
                i2.j(this.a.a.ri());
                i2.j(this.a.a.rk());
                i2.j(akis.iL());
                i2.j(this.a.gb());
                i2.j(this.a.gc());
                i2.j(this.a.gd());
                i2.c(this.a.dW());
                i2.c((ecje) this.a.fC.b());
                i2.c(this.a.fy());
                return i2.g();
            case 333:
                return alji.a(Optional.of((echu) this.a.a.bs.b()));
            case 334:
                ecjd ecjdVar = (ecjd) this.a.am.b();
                Context context5 = (Context) this.a.q.b();
                ecgx ecgxVar = (ecgx) this.a.I.b();
                ecgt ecgtVar = (ecgt) this.a.ei.b();
                errm errmVar = (errm) this.a.E.b();
                fazb a8 = fbaz.a(this.a.a.dV);
                akis akisVar25 = this.a;
                akkp akkpVar24 = akisVar25.a;
                return new echx(ecjdVar, context5, ecgxVar, ecgtVar, errmVar, a8, (ecij) akisVar25.fz(), akkpVar24.dW, akisVar25.eK, (Executor) akisVar25.L.b());
            case 335:
                return eccq.a(emxc.j(this.a.a.dU));
            case 336:
                String str = (String) this.a.V.b();
                akis akisVar26 = this.a;
                Object fB = akisVar26.fB();
                dlpw dlpwVar = (dlpw) akisVar26.ae.b();
                akis akisVar27 = this.a;
                fbbf fbbfVar54 = akisVar27.a.dV;
                return new echq(str, (ecik) fB, dlpwVar, fbbfVar54);
            case 337:
                return aljj.a(Optional.of((akxg) this.a.a.bs.b()));
            case 338:
                ecjd ecjdVar2 = (ecjd) this.a.am.b();
                Executor executor2 = (Executor) this.a.L.b();
                fazb a9 = fbaz.a(this.a.a.dZ);
                emxc j = emxc.j(this.a.eZ);
                ecgx ecgxVar2 = (ecgx) this.a.I.b();
                ecgt ecgtVar2 = (ecgt) this.a.ei.b();
                akis akisVar28 = this.a;
                akkp akkpVar25 = akisVar28.a;
                ecst dY = akisVar28.dY();
                fbbf fbbfVar55 = akisVar28.fa;
                fbbf fbbfVar56 = akisVar28.fb;
                fbbf fbbfVar57 = akisVar28.fc;
                Object pq = akkpVar25.pq();
                Object fk = akisVar28.fk();
                emxc j2 = emxc.j((ecga) akisVar28.aa.b());
                akis akisVar29 = this.a;
                return new ecky(ecjdVar2, executor2, a9, j, ecgxVar2, ecgtVar2, dY, fbbfVar55, fbbfVar56, fbbfVar57, (eckl) pq, (ecks) fk, j2, akisVar29.fe, akisVar29.ff);
            case 339:
                return eccr.a(emxc.j(this.a.a.dY));
            case 340:
                ecjd ecjdVar3 = (ecjd) this.a.am.b();
                Context context6 = (Context) this.a.q.b();
                ecgt ecgtVar3 = (ecgt) this.a.ei.b();
                errm errmVar2 = (errm) this.a.E.b();
                fazb a10 = fbaz.a(this.a.a.eb);
                fazb a11 = fbaz.a(this.a.a.ec);
                akis akisVar30 = this.a;
                return new ecpc(ecjdVar3, context6, ecgtVar3, errmVar2, a10, a11, akisVar30.fg, (Executor) akisVar30.L.b(), (echj) this.a.fd.b());
            case 341:
                return eccs.a(emxc.j(this.a.a.bt));
            case 342:
                return new ecov(this.a.a.eb);
            case 343:
                emxc.j(this.a.a.dU);
                return ecih.a(this.a.a.dX);
            case 344:
                emxc.j(this.a.a.bt);
                return ecpe.a(this.a.a.ed);
            case 345:
                Context context7 = (Context) this.a.q.b();
                csjk csjkVar = (csjk) this.a.a.el.b();
                akkp akkpVar26 = this.a.a;
                return new aljq(context7, csjkVar, akkpVar26.em, akkpVar26.c, akkpVar26.en);
            case 346:
                akkp akkpVar27 = this.a.a;
                return new cpaw(akkpVar27.u, akkpVar27.c);
            case 347:
                final fbbf fbbfVar58 = this.a.a.s;
                return new asxi() { // from class: asxg
                    @Override // defpackage.asxi
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.log_network_metered");
                    }
                };
            case 348:
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                dkpp dkppVar = (dkpp) this.a.aQ.b();
                akis akisVar31 = this.a;
                return new akyw(ctwbVar, dkppVar, akisVar31.T(), (cort) akisVar31.a.bj.b(), this.a.a.ep);
            case 349:
                final fbbf fbbfVar59 = this.a.a.s;
                return new atrq() { // from class: atoy
                    @Override // defpackage.atrq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_get_mvno_by_sub_id");
                    }
                };
            case 350:
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akis akisVar32 = this.a;
                akkp akkpVar28 = akisVar32.a;
                return new ctoo(ffhdVar, akisVar32.cz, akkpVar28.dB, akkpVar28.ib, akisVar32.aO, akkpVar28.nr, akkpVar28.Do);
            case 351:
                akkp akkpVar29 = this.a.a;
                fbbf fbbfVar60 = akkpVar29.er;
                Optional of2 = Optional.of(akkpVar29.fp);
                Optional of3 = Optional.of(this.a.a.me);
                akis akisVar33 = this.a;
                akkp akkpVar30 = akisVar33.a;
                aswk bU = akkpVar30.bU();
                fbbf fbbfVar61 = akkpVar30.ap;
                fbbf fbbfVar62 = akkpVar30.aO;
                fbbf fbbfVar63 = akkpVar30.mf;
                fbbf fbbfVar64 = akkpVar30.ay;
                fbbf fbbfVar65 = akisVar33.mr;
                fbbf fbbfVar66 = akkpVar30.aA;
                fbbf fbbfVar67 = akkpVar30.md;
                fbbf fbbfVar68 = akkpVar30.dA;
                fbbf fbbfVar69 = akkpVar30.L;
                fbbf fbbfVar70 = akkpVar30.Dl;
                azzp azzpVar = (azzp) akkpVar30.aI.b();
                akkp akkpVar31 = this.a.a;
                return new bdrr(fbbfVar60, of2, of3, bU, fbbfVar61, fbbfVar62, fbbfVar63, fbbfVar64, fbbfVar65, fbbfVar66, fbbfVar67, fbbfVar68, fbbfVar69, fbbfVar70, azzpVar, akkpVar31.hV, akkpVar31.Dm, akkpVar31.mq);
            case 352:
                errl errlVar4 = (errl) this.a.t.b();
                akis akisVar34 = this.a;
                akkp akkpVar32 = akisVar34.a;
                return new cvft(errlVar4, akkpVar32.f, akkpVar32.u, akisVar34.fO, akisVar34.fQ, akkpVar32.az, akkpVar32.fo, akkpVar32.Z);
            case 353:
                return new adsd((dvbm) this.a.a.fn.b());
            case 354:
                return new dvbm((String) this.a.fR.b(), fbaz.a(this.a.a.fl));
            case 355:
                fazb a12 = fbaz.a(this.a.a.fk);
                String str2 = (String) this.a.fR.b();
                akis akisVar35 = this.a;
                fbbf fbbfVar71 = akisVar35.gY;
                dvmq dvmqVar = (dvmq) akisVar35.fV.b();
                errl errlVar5 = (errl) this.a.fY.b();
                fazb a13 = fbaz.a(this.a.gl);
                akis akisVar36 = this.a;
                akisVar36.dU();
                return new dvfs(a12, str2, fbbfVar71, dvmqVar, errlVar5, a13);
            case 356:
                dvib dvibVar = (dvib) this.a.a.fj.b();
                dvic.a(dvibVar);
                return dvibVar;
            case 357:
                akis akisVar37 = this.a;
                dvix mh = akisVar37.a.mh();
                dlpw dlpwVar2 = (dlpw) akisVar37.l.b();
                akis akisVar38 = this.a;
                akisVar38.dU();
                return new dvib(mh, dlpwVar2, fbaz.a(akisVar38.gl), (String) this.a.fR.b());
            case 358:
                Context context8 = (Context) this.a.q.b();
                String str3 = (String) this.a.fR.b();
                eafv eafvVar = (eafv) this.a.gd.b();
                dvcp dvcpVar = (dvcp) this.a.gx.b();
                akis akisVar39 = this.a;
                akkp akkpVar33 = akisVar39.a;
                fbbf fbbfVar72 = akisVar39.gz;
                Set rz = akkpVar33.rz();
                dvpl dvplVar = (dvpl) akkpVar33.eM.b();
                akis akisVar40 = this.a;
                akisVar40.dU();
                return new dvrs(context8, str3, eafvVar, dvcpVar, fbbfVar72, rz, dvplVar, (errl) akisVar40.fY.b(), this.a.a.rQ());
            case 359:
                Context context9 = (Context) this.a.q.b();
                ListenableFuture listenableFuture = (ListenableFuture) this.a.gi.b();
                errl errlVar6 = (errl) this.a.fY.b();
                eafv eafvVar2 = (eafv) this.a.gd.b();
                eafv eafvVar3 = (eafv) this.a.fT.b();
                dvjd dvjdVar = (dvjd) this.a.a.eB.b();
                akis akisVar41 = this.a;
                dvbv mg = akisVar41.a.mg();
                String str4 = (String) akisVar41.fR.b();
                emxc emxcVar = (emxc) this.a.gF.b();
                emxc emxcVar2 = (emxc) this.a.gG.b();
                akis akisVar42 = this.a;
                easq iE = akisVar42.iE();
                dlpw dlpwVar3 = (dlpw) akisVar42.l.b();
                akis akisVar43 = this.a;
                akkp akkpVar34 = akisVar43.a;
                Map rd = akkpVar34.rd();
                Set fZ = akisVar43.fZ();
                akisVar43.dU();
                emxc j3 = emxc.j(akkpVar34.rR());
                akis akisVar44 = this.a;
                fbbf fbbfVar73 = akisVar44.gE;
                fazb a14 = fbaz.a(akisVar44.gl);
                this.a.a.sn();
                return new dvqg(context9, listenableFuture, errlVar6, eafvVar2, eafvVar3, dvjdVar, mg, str4, emxcVar, emxcVar2, iE, dlpwVar3, rd, fZ, j3, fbbfVar73, a14);
            case 360:
                errl errlVar7 = (errl) this.a.gA.b();
                eaov eaovVar = (eaov) this.a.a.ex.b();
                akis akisVar45 = this.a;
                eagn a15 = adsb.a();
                eapp dR = akisVar45.dR();
                eapp eappVar = (eapp) akisVar45.gu.b();
                akis akisVar46 = this.a;
                eanl iC = akisVar46.iC();
                eafv eafvVar4 = (eafv) akisVar46.ge.b();
                akis akisVar47 = this.a;
                akisVar47.dU();
                ealz ealzVar = (ealz) akisVar47.gq.b();
                easc eascVar = (easc) this.a.a.ez.b();
                akis akisVar48 = this.a;
                return new dvjl(errlVar7, eaovVar, a15, dR, eappVar, iC, eafvVar4, ealzVar, eascVar, akisVar48.gE, (String) akisVar48.fR.b(), fbaz.a(this.a.gl), (dvcp) this.a.gx.b());
            case 361:
                akis akisVar49 = this.a;
                akkp akkpVar35 = akisVar49.a;
                eajg mj = akkpVar35.mj();
                eagn a16 = adsb.a();
                String fD = akisVar49.fD();
                eaku eakuVar = (eaku) akkpVar35.ev.b();
                Context context10 = (Context) this.a.q.b();
                akis akisVar50 = this.a;
                return new eapm(mj, a16, fD, eakuVar, context10, akisVar50.fE(), (ffhd) akisVar50.cP.b(), (ffsk) this.a.a.p.b());
            case 362:
                return new eaux((evah) this.a.a.es.b());
            case 363:
                return evav.a((errl) this.a.p.b(), (errl) this.a.t.b(), (errl) this.a.aK.b(), this.a.a.bu, enip.q());
            case 364:
                return new eala((Context) this.a.q.b(), (dlpw) this.a.l.b(), (ffsk) this.a.a.aq.b());
            case 365:
                Context context11 = (Context) this.a.q.b();
                akkp akkpVar36 = this.a.a;
                eagn a17 = adsb.a();
                emxc mG = akkpVar36.mG();
                emxc j4 = emxc.j(akkpVar36.rT());
                akis akisVar51 = this.a;
                return new easn(context11, a17, mG, j4, akisVar51.dQ(), (errl) akisVar51.gD.b(), this.a.gE);
            case 366:
                akis akisVar52 = this.a;
                return new dvvp(akisVar52.a.mg(), (ffhd) akisVar52.cn.b());
            case 367:
                return new dvsf((Context) this.a.q.b(), (eauy) this.a.a.eE.b());
            case 368:
                return new eauy((ekmz) this.a.gH.b(), (eall) this.a.a.eD.b());
            case 369:
                errl errlVar8 = (errl) this.a.gA.b();
                return new ealp(errlVar8);
            case 370:
                return new eakv((eaku) this.a.a.ev.b(), (ffsk) this.a.a.p.b());
            case 371:
                emxc j5 = emxc.j((eatm) this.a.a.ey.b());
                emxc j6 = emxc.j(new adsh());
                earw earwVar = (earw) this.a.gL.b();
                akis akisVar53 = this.a;
                akkp akkpVar37 = akisVar53.a;
                eaqc dS = akisVar53.dS();
                eans mm = akkpVar37.mm();
                ealz ealzVar2 = (ealz) akisVar53.gq.b();
                ffhd ffhdVar2 = (ffhd) this.a.co.b();
                akis akisVar54 = this.a;
                akkp akkpVar38 = akisVar54.a;
                eanl iC2 = akisVar54.iC();
                eanl iD = akisVar54.iD();
                eama eamaVar = (eama) akkpVar38.eH.b();
                ealb ealbVar = (ealb) this.a.a.eL.b();
                ealf ealfVar = (ealf) this.a.gP.b();
                eann eannVar = (eann) this.a.gN.b();
                akis akisVar55 = this.a;
                eanv dP = akisVar55.dP();
                dlpw dlpwVar4 = (dlpw) akisVar55.l.b();
                akis akisVar56 = this.a;
                eagn a18 = adsb.a();
                fbbf fbbfVar74 = akisVar56.gM;
                ealr ealrVar = (ealr) akisVar56.gp.b();
                Context context12 = (Context) this.a.q.b();
                ears earsVar = (ears) this.a.gl.b();
                akis akisVar57 = this.a;
                return new eanc(j5, j6, earwVar, dS, mm, ealzVar2, ffhdVar2, iC2, iD, eamaVar, ealbVar, ealfVar, eannVar, dP, dlpwVar4, a18, fbbfVar74, ealrVar, context12, earsVar, akisVar57.a.ml(), akisVar57.gE, akisVar57.gQ);
            case 372:
                eaov eaovVar2 = (eaov) this.a.a.ex.b();
                akis akisVar58 = this.a;
                fbbf fbbfVar75 = akisVar58.cn;
                return new eamp(eaovVar2, akisVar58.dS(), akisVar58.iC(), akisVar58.iD(), (ffhd) fbbfVar75.b(), (ffhd) this.a.co.b(), (ears) this.a.gl.b(), (Context) this.a.q.b(), (dlpw) this.a.l.b(), emxc.h(), this.a.gM);
            case 373:
                eama eamaVar2 = (eama) this.a.a.eH.b();
                eapp eappVar2 = (eapp) this.a.gu.b();
                ffhd ffhdVar3 = (ffhd) this.a.co.b();
                eann eannVar2 = (eann) this.a.gN.b();
                akis akisVar59 = this.a;
                akkp akkpVar39 = akisVar59.a;
                eanl iC3 = akisVar59.iC();
                eans mm2 = akkpVar39.mm();
                ears earsVar2 = (ears) akisVar59.gl.b();
                Context context13 = (Context) this.a.q.b();
                akis akisVar60 = this.a;
                eanv dP2 = akisVar60.dP();
                ealr ealrVar2 = (ealr) akisVar60.gp.b();
                ealz ealzVar3 = (ealz) this.a.gq.b();
                ealf ealfVar2 = (ealf) this.a.gP.b();
                akkp akkpVar40 = this.a.a;
                return new eanj(eamaVar2, eappVar2, ffhdVar3, eannVar2, iC3, mm2, earsVar2, context13, dP2, ealrVar2, ealzVar3, ealfVar2, akkpVar40.mk(), adsb.a(), akkpVar40.ml());
            case 374:
                eamd eamdVar = (eamd) this.a.a.eI.b();
                ffhd ffhdVar4 = (ffhd) this.a.co.b();
                akis akisVar61 = this.a;
                return new eauf(eamdVar, ffhdVar4, akisVar61.iC(), (Context) akisVar61.q.b(), new easv(), ((Boolean) this.a.gQ.b()).booleanValue(), this.a.gE);
            case 375:
                return new eajz((dlpw) this.a.l.b(), adsb.a(), (eaki) this.a.gr.b(), (eaox) this.a.gT.b(), (easc) this.a.a.ez.b());
            case 376:
                akkp akkpVar41 = this.a.a;
                return new dvre(akkpVar41.rE(), (dvqr) akkpVar41.eQ.b());
            case 377:
                return dvrb.a((dvqo) this.a.a.eP.b(), (ffsk) this.a.a.p.b());
            case 378:
                return new dvri((ffhd) this.a.co.b(), fbaz.a(this.a.gl), (String) this.a.fR.b(), (dvdy) this.a.gh.b(), (dvcp) this.a.gx.b(), (dvqv) this.a.a.eO.b(), this.a.gz);
            case 379:
                akis akisVar62 = this.a;
                return new dvht(akisVar62.a.qL(), akisVar62.gz, (errl) akisVar62.fY.b(), this.a.dU());
            case 380:
                aviv avivVar = (aviv) this.a.a.eS.b();
                errl errlVar9 = (errl) this.a.p.b();
                avjf avjfVar = (avjf) this.a.a.eT.b();
                akis akisVar63 = this.a;
                return new avja(avivVar, errlVar9, avjfVar, akisVar63.aT, (ctvb) akisVar63.a.u.b());
            case 381:
                return new aviv(this.a.a.aT);
            case 382:
                akis akisVar64 = this.a;
                return new avjf(akisVar64.a.az, (errl) akisVar64.t.b(), (akzt) this.a.a.f.b());
            case 383:
                akkp akkpVar42 = this.a.a;
                return enip.r(akkpVar42.eW(), akkpVar42.hp());
            case 384:
                final fbbf fbbfVar76 = this.a.a.s;
                return new aslq() { // from class: arpd
                    @Override // defpackage.aslq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.block_ditto_for_dune_satellite");
                    }
                };
            case 385:
                return new cghm((cggu) this.a.gW.b(), (cghg) this.a.a.eW.b());
            case 386:
                return new cghg((ffhd) this.a.cP.b(), this.a.a.kg());
            case 387:
                return Optional.of(this.a.a.K());
            case 388:
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                akis akisVar65 = this.a;
                fbbf fbbfVar77 = akisVar65.a.dA;
                fbbf fbbfVar78 = akisVar65.gX;
                errl errlVar10 = (errl) akisVar65.t.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                ejar ejarVar = (ejar) this.a.a.au.b();
                akis akisVar66 = this.a;
                return new bzgd(cqohVar4, fbbfVar77, fbbfVar78, errlVar10, ctyxVar, ejarVar, akisVar66.da, akisVar66.a.eZ);
            case 389:
                return Long.valueOf(fczn.a(this.a.a.nO()));
            case 390:
                return Boolean.valueOf(fczq.a(this.a.a.nO()));
            case 391:
                return Boolean.valueOf(fczp.a(this.a.a.nO()));
            case 392:
                ctyx ctyxVar2 = (ctyx) this.a.aU.b();
                Context context14 = (Context) this.a.q.b();
                Optional optional = (Optional) this.a.aV.b();
                cvbr cvbrVar = (cvbr) this.a.a.fe.b();
                return new cuyh(ctyxVar2, context14, optional, cvbrVar);
            case 393:
                akis akisVar67 = this.a;
                comc jY = akisVar67.a.jY();
                return new cgkv(jY, (errl) this.a.p.b());
            case 394:
                return new dvrx((dvqo) this.a.a.eP.b(), (ffsk) this.a.a.q.b(), (dvqv) this.a.a.eO.b());
            case 395:
                dgea dgeaVar = (dgea) this.a.fP.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akis akisVar68 = this.a;
                fbbf fbbfVar79 = akisVar68.cz;
                akkp akkpVar43 = akisVar68.a;
                fbbf fbbfVar80 = akkpVar43.Dh;
                fbbf fbbfVar81 = akkpVar43.Z;
                fbbf fbbfVar82 = akisVar68.fO;
                cqoh cqohVar5 = (cqoh) fbbfVar79.b();
                akkp akkpVar44 = this.a.a;
                return new cvdy(dgeaVar, ffskVar3, fbbfVar80, fbbfVar81, fbbfVar82, cqohVar5, akkpVar44.bU(), akkpVar44.bV(), akkpVar44.nr, akkpVar44.dB);
            case 396:
                return new cveb((bdtd) this.a.a.aO.b(), (cqoh) this.a.cz.b(), this.a.a.pJ);
            case 397:
                akkp akkpVar45 = this.a.a;
                fbbf fbbfVar83 = akkpVar45.fr;
                fbbf fbbfVar84 = akkpVar45.dn;
                fbbf fbbfVar85 = akkpVar45.dB;
                fbbf fbbfVar86 = akkpVar45.fs;
                cpbw cpbwVar = (cpbw) akkpVar45.fw.b();
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                akkp akkpVar46 = this.a.a;
                fbbf fbbfVar87 = akkpVar46.aO;
                cbgf cbgfVar3 = (cbgf) akkpVar46.dA.b();
                azze azzeVar = (azze) this.a.a.fx.b();
                bdvi bdviVar = (bdvi) this.a.a.jh.b();
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                Optional of4 = Optional.of((cbvu) this.a.a.Dg.b());
                akis akisVar69 = this.a;
                akkp akkpVar47 = akisVar69.a;
                return new cbvt(fbbfVar83, fbbfVar84, fbbfVar85, fbbfVar86, cpbwVar, cqohVar6, akztVar, fbbfVar87, cbgfVar3, azzeVar, bdviVar, dtuuVar4, byzpVar, of4, akkpVar47.pQ, akisVar69.kk, akkpVar47.hv, akkpVar47.gN, akkpVar47.Z, akkpVar47.hJ, (errl) akisVar69.t.b());
            case 398:
                akkp akkpVar48 = this.a.a;
                fbbf fbbfVar88 = akkpVar48.dR;
                fbbf fbbfVar89 = akkpVar48.fq;
                return new azwh(fbbfVar88, fbbfVar89);
            case 399:
                return new askt() { // from class: arno
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object z() {
        int i = this.b;
        switch (i) {
            case 3000:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45673004").e());
            case 3001:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45663480").e());
            case 3002:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45671383").e());
            case 3003:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45430415").e());
            case 3004:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45666479").e());
            case 3005:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45373730").e());
            case 3006:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45676994").e());
            case 3007:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45670298").e());
            case 3008:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45666516").e());
            case 3009:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45665372").e());
            case 3010:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45670249").e());
            case 3011:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45671209").e());
            case 3012:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45670916").e());
            case 3013:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45389828").e());
            case 3014:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45621680").e());
            case 3015:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45628053").e());
            case 3016:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45673962").e());
            case 3017:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45676995").e());
            case 3018:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45665263").e());
            case 3019:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45667003").e());
            case 3020:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45667794").e());
            case 3021:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45676518").e());
            case 3022:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45369535").e());
            case 3023:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45669573").e());
            case 3024:
                return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45673893").e());
            case 3025:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45678902").e());
            case 3026:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45675727").e());
            case 3027:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45674646").e());
            case 3028:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45661093").e());
            case 3029:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45672828").e());
            case 3030:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45671502").e());
            case 3031:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45647062").e());
            case 3032:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45626837").e());
            case 3033:
                return Boolean.valueOf(((ekck) this.a.a.nq().a.b()).a("com.google.android.apps.messaging.auto 45410067").e());
            case 3034:
                return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45647273").e());
            case 3035:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45653953").e());
            case 3036:
                return Boolean.valueOf(((ekck) this.a.a.nr().a.b()).a("com.google.android.apps.messaging.auto 45674413").e());
            case 3037:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45680329").e());
            case 3038:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45658496").e());
            case 3039:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45412126").e());
            case 3040:
                return Boolean.valueOf(((ekck) this.a.a.ng().a.b()).a("com.google.android.apps.messaging.auto 45651123").e());
            case 3041:
                return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45387588").e());
            case 3042:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45639551").e());
            case 3043:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45646586").e());
            case 3044:
                return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45641542").e());
            case 3045:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45676480").e());
            case 3046:
                return Boolean.valueOf(((ekck) this.a.a.nt().a.b()).a("com.google.android.apps.messaging.auto 45670449").e());
            case 3047:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45665083").e());
            case 3048:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45679888").e());
            case 3049:
                return Boolean.valueOf(((ekck) this.a.a.nd().a.b()).a("com.google.android.apps.messaging.auto 45675360").e());
            case 3050:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45677045").e());
            case 3051:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45672364").e());
            case 3052:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45667587").e());
            case 3053:
                return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45657037").e());
            case 3054:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45667786").e());
            case 3055:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45680081").e());
            case 3056:
                return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45679437").e());
            case 3057:
                return Boolean.valueOf(((ekck) this.a.a.nw().a.b()).a("com.google.android.apps.messaging.auto 45630852").e());
            case 3058:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45662267").e());
            case 3059:
                return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45637320").e());
            case 3060:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45647937").e());
            case 3061:
                return Boolean.valueOf(((ekck) this.a.a.mQ().a.b()).a("com.google.android.apps.messaging.auto 45672439").e());
            case 3062:
                return Boolean.valueOf(((ekck) this.a.a.nc().a.b()).a("com.google.android.apps.messaging.auto 45420870").e());
            case 3063:
                return Boolean.valueOf(((ekck) this.a.a.mO().a.b()).a("com.google.android.apps.messaging.auto 45624116").e());
            case 3064:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45671490").e());
            case 3065:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45374940").e());
            case 3066:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45640044").e());
            case 3067:
                return Boolean.valueOf(((ekck) this.a.a.nh().a.b()).a("com.google.android.apps.messaging.auto 45477573").e());
            case 3068:
                return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45641443").e());
            case 3069:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45614658").e());
            case 3070:
                return Boolean.valueOf(((ekck) this.a.a.nk().a.b()).a("com.google.android.apps.messaging.auto 45663926").e());
            case 3071:
                return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45430727").e());
            case 3072:
                return Boolean.valueOf(((ekck) this.a.a.mV().a.b()).a("com.google.android.apps.messaging.auto 45632736").e());
            case 3073:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45638682").e());
            case 3074:
                return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45677882").e());
            case 3075:
                return Boolean.valueOf(((ekck) this.a.a.nx().a.b()).a("com.google.android.apps.messaging.auto 45621103").e());
            case 3076:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45638776").e());
            case 3077:
                return Boolean.valueOf(((ekck) this.a.a.ns().a.b()).a("com.google.android.apps.messaging.auto 45664344").e());
            case 3078:
                return Boolean.valueOf(((ekck) this.a.a.np().a.b()).a("com.google.android.apps.messaging.auto 45427318").e());
            case 3079:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45671055").e());
            case 3080:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45373456").e());
            case 3081:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45673036").e());
            case 3082:
                return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45676435").e());
            case 3083:
                return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45669009").e());
            case 3084:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45669681").e());
            case 3085:
                return Boolean.valueOf(((ekck) this.a.a.nm().a.b()).a("com.google.android.apps.messaging.auto 45673271").e());
            case 3086:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45658950").e());
            case 3087:
                return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45624249").e());
            case 3088:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45656492").e());
            case 3089:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45675561").e());
            case 3090:
                return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45671841").e());
            case 3091:
                return Boolean.valueOf(((ekck) this.a.a.mP().a.b()).a("com.google.android.apps.messaging.auto 45613587").e());
            case 3092:
                return Boolean.valueOf(((ekck) this.a.a.mZ().a.b()).a("com.google.android.apps.messaging.auto 45668475").e());
            case 3093:
                return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45641987").e());
            case 3094:
                return Boolean.valueOf(((ekck) this.a.a.j.b()).a("com.google.android.apps.messaging.auto 45409040").e());
            case 3095:
                return Boolean.valueOf(((ekck) this.a.a.nf().a.b()).a("com.google.android.apps.messaging.auto 45680491").e());
            case 3096:
                return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45401271").e());
            case 3097:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45644705").e());
            case 3098:
                return Boolean.valueOf(((ekck) this.a.a.nz().a.b()).a("com.google.android.apps.messaging.auto 45650579").e());
            case 3099:
                return Boolean.valueOf(((ekck) this.a.a.mU().a.b()).a("com.google.android.apps.messaging.auto 45665678").e());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return c();
            case 2:
                return n();
            case 3:
                return y();
            case 4:
                return C();
            case 5:
                return D();
            case 6:
                return E();
            case 7:
                return F();
            case 8:
                return G();
            case 9:
                return H();
            case 10:
                return d();
            case 11:
                return e();
            case 12:
                return f();
            case 13:
                return g();
            case 14:
                return h();
            case 15:
                return i();
            case 16:
                return j();
            case 17:
                return k();
            case 18:
                return l();
            case 19:
                return m();
            case 20:
                return o();
            case 21:
                return p();
            case 22:
                return q();
            case 23:
                return r();
            case 24:
                return s();
            case 25:
                return t();
            case 26:
                return u();
            case 27:
                return v();
            case 28:
                return w();
            case 29:
                return x();
            case 30:
                return z();
            case 31:
                return A();
            case 32:
                return B();
            default:
                switch (i) {
                    case 3300:
                        return Boolean.valueOf(((ekck) this.a.a.na().a.b()).a("com.google.android.apps.messaging.auto 45678474").e());
                    case 3301:
                        return Boolean.valueOf(((ekck) this.a.a.mR().a.b()).a("com.google.android.apps.messaging.auto 45424772").e());
                    case 3302:
                        return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45621709").e());
                    case 3303:
                        return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45671296").e());
                    case 3304:
                        return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45667852").e());
                    case 3305:
                        return Boolean.valueOf(((ekck) this.a.a.nn().a.b()).a("com.google.android.apps.messaging.auto 45678234").e());
                    case 3306:
                        return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45620978").e());
                    case 3307:
                        return Boolean.valueOf(((ekck) this.a.a.nP().a.b()).a("com.google.android.apps.messaging.auto 45618162").e());
                    case 3308:
                        return Boolean.valueOf(((ekck) this.a.a.mM().a.b()).a("com.google.android.apps.messaging.auto 45678951").e());
                    case 3309:
                        return Boolean.valueOf(((ekck) this.a.a.oa().a.b()).a("com.google.android.apps.messaging.auto 45670381").e());
                    case 3310:
                        return Boolean.valueOf(((ekck) this.a.a.ne().a.b()).a("com.google.android.apps.messaging.auto 45477628").e());
                    case 3311:
                        return Boolean.valueOf(((ekck) this.a.a.ni().a.b()).a("com.google.android.apps.messaging.auto 45680443").e());
                    case 3312:
                        return Boolean.valueOf(((ekck) this.a.a.nj().a.b()).a("com.google.android.apps.messaging.auto 45359738").e());
                    case 3313:
                        return Boolean.valueOf(((ekck) this.a.a.mW().a.b()).a("com.google.android.apps.messaging.auto 45669576").e());
                    case 3314:
                        return Boolean.valueOf(((ekck) this.a.a.nu().a.b()).a("com.google.android.apps.messaging.auto 45491577").e());
                    case 3315:
                        return Boolean.valueOf(((ekck) this.a.a.mT().a.b()).a("com.google.android.apps.messaging.auto 45491578").e());
                    case 3316:
                        return Boolean.valueOf(((ekck) this.a.a.nv().a.b()).a("com.google.android.apps.messaging.auto 45491579").e());
                    case 3317:
                        return Boolean.valueOf(((ekck) this.a.a.ny().a.b()).a("com.google.android.apps.messaging.auto 45491580").e());
                    case 3318:
                        return Boolean.valueOf(((ekck) this.a.a.no().a.b()).a("com.google.android.apps.messaging.auto 45491581").e());
                    case 3319:
                        return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45491582").e());
                    case 3320:
                        return Boolean.valueOf(((ekck) this.a.a.mY().a.b()).a("com.google.android.apps.messaging.auto 45644544").e());
                    case 3321:
                        return Boolean.valueOf(((ekck) this.a.a.nl().a.b()).a("com.google.android.apps.messaging.auto 45400774").e());
                    case 3322:
                        return new ersv(Optional.empty(), Optional.empty(), this.a.a.qH());
                    case 3323:
                        return new erta();
                    case 3324:
                        return new asto() { // from class: asaq
                        };
                    case 3325:
                        return (fdad) ((ekck) this.a.a.nQ().a.b()).a("com.google.android.apps.messaging.auto 45667529").c();
                    case 3326:
                        final fbbf fbbfVar = this.a.a.s;
                        return new auka() { // from class: aujp
                            @Override // defpackage.auka
                            public final boolean a() {
                                return ((ersq) ffbr.this.b()).a("bugle.messaging_identity_detailed_types");
                            }
                        };
                    case 3327:
                        ffsk ffskVar = (ffsk) this.a.a.p.b();
                        akkp akkpVar = this.a.a;
                        cpcf cpcfVar = (cpcf) akkpVar.DD.b();
                        cpcd cpcdVar = (cpcd) akkpVar.DC.b();
                        cpcl cpclVar = (cpcl) akkpVar.DE.b();
                        cpce cpceVar = new cpce(new cpbi((ctwb) akkpVar.c.b()));
                        cpca cpcaVar = (cpca) akkpVar.DH.b();
                        cpcfVar.getClass();
                        cpcdVar.getClass();
                        cpclVar.getClass();
                        cpcaVar.getClass();
                        int i2 = engw.d;
                        engr engrVar = new engr();
                        engrVar.j(ffdx.g(cpcfVar, cpcdVar, cpclVar));
                        if (!cpcaVar.a()) {
                            engrVar.h(cpceVar);
                        }
                        engw g = engrVar.g();
                        g.getClass();
                        akkp akkpVar2 = this.a.a;
                        return new cpbf(ffskVar, g, new cpck((cguo) akkpVar2.cK.b(), (cpbu) akkpVar2.DI.b(), (cort) akkpVar2.bj.b(), (ffsk) akkpVar2.aq.b(), (ffsk) akkpVar2.q.b()), (cpca) this.a.a.DH.b());
                    case 3328:
                        return new son((Context) this.a.q.b(), (errl) this.a.t.b(), this.a.a.v());
                    case 3329:
                        return new ctvj();
                    case 3330:
                        akkp akkpVar3 = this.a.a;
                        ctwv ctwvVar = new ctwv(akkpVar3.c, akkpVar3.wQ, akkpVar3.e, akkpVar3.H, akkpVar3.akX);
                        Object b = this.a.a.alc.b();
                        Object b2 = this.a.a.ale.b();
                        Object b3 = this.a.a.alf.b();
                        akkp akkpVar4 = this.a.a;
                        return ctwl.a(ctwvVar, b, b2, b3, new ctxp(akkpVar4.alg, akkpVar4.a.q));
                    case 3331:
                        akkp akkpVar5 = this.a.a;
                        return new ctvw(akkpVar5.H, akkpVar5.c, akkpVar5.wQ);
                    case 3332:
                        akis akisVar = this.a;
                        return new ctxf(akisVar.a.alb, akisVar.du, akisVar.q);
                    case 3333:
                        akis akisVar2 = this.a;
                        akkp akkpVar6 = akisVar2.a;
                        return new ctxc(akkpVar6.akZ, akkpVar6.ala, akkpVar6.c, akisVar2.du, akisVar2.q);
                    case 3334:
                        akis akisVar3 = this.a;
                        return new ctxa(akisVar3.q, akisVar3.a.akY, akisVar3.du);
                    case 3335:
                        return new ctvx();
                    case 3336:
                        return new ctwh((Context) this.a.q.b(), (ctud) this.a.cT.b());
                    case 3337:
                        akis akisVar4 = this.a;
                        return new ctxj(akisVar4.a.ald, akisVar4.du, akisVar4.q);
                    case 3338:
                        akis akisVar5 = this.a;
                        return new ctxh(akisVar5.a.alc, akisVar5.du);
                    case 3339:
                        akkp akkpVar7 = this.a.a;
                        return new ctxl(akkpVar7.ale, akkpVar7.c);
                    case 3340:
                        akis akisVar6 = this.a;
                        akkp akkpVar8 = akisVar6.a;
                        return new ctxn(akkpVar8.alf, akkpVar8.c, akisVar6.du);
                    case 3341:
                        return new cskx((dfpi) this.a.dF.b());
                    case 3342:
                        return new djrf((Context) this.a.q.b(), this.a.a.lQ());
                    case 3343:
                        akis akisVar7 = this.a;
                        return new eavb(akisVar7.a.rS(), (errl) akisVar7.gD.b());
                    case 3344:
                        return new cles((clha) this.a.a.pL());
                    case 3345:
                        return new clev((clha) this.a.a.pM());
                    case 3346:
                        return new clhl((clha) this.a.a.pN());
                    case 3347:
                        return new clhp((clha) this.a.a.pO());
                    case 3348:
                        akis akisVar8 = this.a;
                        akkp akkpVar9 = akisVar8.a;
                        Object pP = akkpVar9.pP();
                        clie jg = akkpVar9.jg();
                        return new clhx((clha) pP, jg, (errl) this.a.p.b());
                    case 3349:
                        return new clia((clha) this.a.a.pQ());
                    case 3350:
                        return new clid((clha) this.a.a.pR());
                    case 3351:
                        cafi cafiVar = (cafi) this.a.a.cv.b();
                        this.a.a.fs();
                        akkp akkpVar10 = this.a.a;
                        return new bzze(cafiVar, akkpVar10.ur, (akzt) akkpVar10.f.b(), this.a.a.yl);
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
